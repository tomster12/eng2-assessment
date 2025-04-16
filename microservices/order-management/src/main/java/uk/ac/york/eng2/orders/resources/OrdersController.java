package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.cs.eng2.orders.product_management.api.ProductsApi;
import uk.ac.york.cs.eng2.orders.product_management.model.OrderPriceRequestDTO;
import uk.ac.york.cs.eng2.orders.product_management.model.OrderPriceResponseDTO;
import uk.ac.york.cs.eng2.orders.product_management.model.ProductPriceDTO;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.dto.OrderCreateDTO;
import uk.ac.york.eng2.orders.dto.OrderUpdateDTO;
import uk.ac.york.eng2.orders.events.ProductOrderProducer;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrdersRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

@Controller("/orders")
public class OrdersController {
    @Inject
    private CustomerRepository customersRepo;

    @Inject
    private OrdersRepository ordersRepo;

    @Inject
    private ProductsApi productsApi;

    @Inject
    private ProductOrderProducer productOrderProducer;

    @Get
    public List<Order> getOrders() {
        return ordersRepo.findAll();
    }

    @Get("/{id}")
    public Order getOrder(@PathVariable Long id) {
        Optional<Order> optOrder = ordersRepo.findById(id);
        if (optOrder.isPresent()) return optOrder.get();
        throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order not found");
    }

    @ExecuteOn(TaskExecutors.BLOCKING)
    @Transactional
    @Post
    public Order createOrder(@Body OrderCreateDTO orderCreateDTO) {
        Optional<Customer> optCustomer = customersRepo.findById(orderCreateDTO.getCustomerId());
        if (optCustomer.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found");
        }

        Order order = new Order();
        order.setCustomer(optCustomer.get());
        order.setDateCreated(LocalDate.now());
        order.setAddress(orderCreateDTO.getAddress());
        priceAndPopulateOrderItems(orderCreateDTO.getProductQuantities(), order);
        productOrderProducer.produceProductOrderEvents(order);

        return ordersRepo.save(order);
    }

    @ExecuteOn(TaskExecutors.BLOCKING)
    @Transactional
    @Post("/{id}")
    public Order updateOrder(@Body OrderUpdateDTO orderUpdateDTO, @PathVariable Long id) {
        Optional<Order> optOrder = ordersRepo.findById(id);
        if (optOrder.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order not found");
        }

        Order order = optOrder.get();
        order.setAddress(orderUpdateDTO.getAddress());
        priceAndPopulateOrderItems(orderUpdateDTO.getProductQuantities(), order);
        productOrderProducer.produceProductOrderEvents(order);

        return ordersRepo.save(order);
    }

    @Delete("/{id}")
    public HttpResponse<Void> deleteOrder(@PathVariable Long id) {
        if (!ordersRepo.existsById(id)) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order not found");
        }
        ordersRepo.deleteById(id);
        return HttpResponse.noContent();
    }

    private void priceAndPopulateOrderItems(Map<String, Long> productQuantities, Order order) {
        OrderPriceRequestDTO orderRequestDTO = new OrderPriceRequestDTO();
        orderRequestDTO.setProductQuantities(productQuantities);
        OrderPriceResponseDTO orderResponseDTO = productsApi.priceOrder(orderRequestDTO);

        List<OrderItem> orderItems = new ArrayList<>();
        BigDecimal totalAmount = BigDecimal.ZERO;

        for (ProductPriceDTO productPrice : orderResponseDTO.getProductPrices()) {
            Long quantity = productQuantities.get(productPrice.getProductName());
            if (quantity == null) {
                throw new HttpStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Pricing service returned invalid product");
            }

            OrderItem item = new OrderItem();
            item.setProductId(productPrice.getProductId());
            item.setUnitPrice(productPrice.getUnitPrice());
            item.setQuantity(quantity);
            item.setOrder(order);

            totalAmount = totalAmount.add(productPrice.getUnitPrice().multiply(BigDecimal.valueOf(quantity)));
            orderItems.add(item);
        }

        order.setOrderItems(orderItems);
        order.setTotalAmount(totalAmount);
    }
}
