package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.cs.eng2.orders.product_management.api.ProductsApi;
import uk.ac.york.cs.eng2.orders.product_management.model.OrderRequestDTO;
import uk.ac.york.cs.eng2.orders.product_management.model.OrderResponseDTO;
import uk.ac.york.cs.eng2.orders.product_management.model.ProductPriceDTO;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Orders;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.dto.OrderCreateDTO;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrdersRepository;

import java.math.BigDecimal;
import java.util.*;

@Controller("/orders")
public class OrdersController {
    @Inject
    private CustomerRepository customersRepo;

    @Inject
    private OrdersRepository ordersRepo;

    @Inject
    private ProductsApi productsApi;

    @ExecuteOn(TaskExecutors.BLOCKING)
    @Transactional
    @Post
    public Orders createOrder(@Body OrderCreateDTO orderCreateDTO) {
        Optional<Customer> optCustomer = customersRepo.findById(orderCreateDTO.getCustomerId());
        if (optCustomer.isEmpty()) {
            throw new HttpStatusException(HttpStatus.BAD_REQUEST, "Customer not found");
        }

        Map<String, Long> productQuantities = orderCreateDTO.getProductQuantities();
        OrderRequestDTO orderRequestDTO = new OrderRequestDTO();
        orderRequestDTO.setProductQuantities(productQuantities);
        OrderResponseDTO orderResponseDTO = productsApi.calculateOrder(orderRequestDTO);

        Orders orders = new Orders();
        List<OrderItem> orderItems = new ArrayList<>();
        BigDecimal totalAmount = BigDecimal.ZERO;

        for (ProductPriceDTO productPrice : orderResponseDTO.getProductPrices()) {
            OrderItem item = new OrderItem();
            item.setProductId(productPrice.getProductId());
            item.setUnitPrice(productPrice.getUnitPrice());
            item.setQuantity(productQuantities.get(productPrice.getProductName()));
            totalAmount = totalAmount.add(productPrice.getUnitPrice());
            item.setOrders(orders);
            orderItems.add(item);
        }
        orders.setCustomer(optCustomer.get());
        orders.setAddress(orderCreateDTO.getAddress());
        orders.setDateCreated(new Date());
        orders.setTotalAmount(totalAmount);
        orders.setOrderItems(orderItems);

        return ordersRepo.save(orders);
    }
}
