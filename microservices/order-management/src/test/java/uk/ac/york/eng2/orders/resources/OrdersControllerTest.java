package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MockBean;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.cs.eng2.orders.product_management.api.ProductsApi;
import uk.ac.york.cs.eng2.orders.product_management.model.OrderPriceResponseDTO;
import uk.ac.york.cs.eng2.orders.product_management.model.ProductPriceDTO;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.dto.OrderCreateDTO;
import uk.ac.york.eng2.orders.dto.OrderUpdateDTO;
import uk.ac.york.eng2.orders.events.ProductOrderProducer;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrdersRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@MicronautTest(transactional = false)
public class OrdersControllerTest {
    @Inject
    private OrdersClient ordersClient;

    @Inject
    CustomerRepository customerRepository;

    @Inject
    OrderItemRepository orderItemRepository;

    @Inject
    OrdersRepository ordersRepository;

    @Inject
    private ProductOrderProducer productOrderProducer;

    @BeforeEach
    public void setup() {
        customerRepository.deleteAll();
        orderItemRepository.deleteAll();
        ordersRepository.deleteAll();
    }

    @Test
    public void createOrderAndCheckProducesSuccess() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john@example.com");
        customerRepository.save(customer);

        OrderCreateDTO orderCreateDTO = new OrderCreateDTO();
        orderCreateDTO.setCustomerId(customer.getId());
        orderCreateDTO.setAddress("Johns house");
        Map<String, Long> productQuantities = new HashMap<>();
        productQuantities.put("Banana", 1L);
        productQuantities.put("Orange", 5L);
        orderCreateDTO.setProductQuantities(productQuantities);

        HttpResponse<Order> orderCreateResponse = ordersClient.createOrder(orderCreateDTO);
        assertEquals(HttpStatus.CREATED, orderCreateResponse.getStatus());

        HttpResponse<Order> orderGetResponse = ordersClient.getOrder(orderCreateResponse.body().getId());
        assertEquals(HttpStatus.OK, orderGetResponse.getStatus());
        Order order = orderGetResponse.body();

        assertEquals(1, ordersClient.getOrders().size());

        verify(productOrderProducer).produceProductOrderEvents(any());
        assertEquals(customer.getId(), order.getCustomer().getId());
        assertFalse(order.getOrderItems().isEmpty());
    }

    @Test
    public void createOrderAndUpdateSuccess() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john@example.com");
        customerRepository.save(customer);

        OrderCreateDTO orderCreateDTO = new OrderCreateDTO();
        orderCreateDTO.setCustomerId(customer.getId());
        orderCreateDTO.setAddress("Johns house");
        Map<String, Long> productQuantities = new HashMap<>();
        productQuantities.put("Banana", 1L);
        productQuantities.put("Orange", 5L);
        orderCreateDTO.setProductQuantities(productQuantities);

        HttpResponse<Order> orderCreateResponse = ordersClient.createOrder(orderCreateDTO);
        assertEquals(HttpStatus.CREATED, orderCreateResponse.getStatus());
        Order createdOrder = orderCreateResponse.body();

        assertFalse(createdOrder.isPaid());
        assertFalse(createdOrder.isDelivered());

        OrderUpdateDTO orderUpdateDTO = new OrderUpdateDTO();
        orderUpdateDTO.setPaid(true);
        orderUpdateDTO.setDelivered(true);

        HttpResponse<Order> orderUpdateResponse = ordersClient.updateOrder(createdOrder.getId(), orderUpdateDTO);
        assertEquals(HttpStatus.OK, orderUpdateResponse.getStatus());
        Order updatedOrder = orderUpdateResponse.body();

        assertTrue(updatedOrder.isPaid());
        assertTrue(updatedOrder.isDelivered());
    }

    @Test
    public void createOrderAndDeleteSuccess() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john@example.com");
        customerRepository.save(customer);

        OrderCreateDTO orderCreateDTO = new OrderCreateDTO();
        orderCreateDTO.setCustomerId(customer.getId());
        orderCreateDTO.setAddress("Johns house");
        Map<String, Long> productQuantities = new HashMap<>();
        productQuantities.put("Banana", 1L);
        productQuantities.put("Orange", 5L);
        orderCreateDTO.setProductQuantities(productQuantities);

        HttpResponse<Order> orderCreateResponse = ordersClient.createOrder(orderCreateDTO);
        assertEquals(HttpStatus.CREATED, orderCreateResponse.getStatus());
        Order createdOrder = orderCreateResponse.body();

        assertEquals(1, ordersClient.getOrders().size());

        HttpResponse<Void> orderDeleteResponse = ordersClient.deleteOrder(createdOrder.getId());
        assertEquals(HttpStatus.NO_CONTENT, orderDeleteResponse.getStatus());

        assertEquals(0, ordersClient.getOrders().size());
    }

    @Test
    public void createOrderNonExistentCustomerFail() {
        OrderCreateDTO orderCreateDTO = new OrderCreateDTO();
        orderCreateDTO.setCustomerId(1L);
        orderCreateDTO.setAddress("Johns house");
        Map<String, Long> productQuantities = new HashMap<>();
        productQuantities.put("Banana", 1L);
        productQuantities.put("Orange", 5L);
        orderCreateDTO.setProductQuantities(productQuantities);

        HttpResponse<Order> orderCreateResponse = ordersClient.createOrder(orderCreateDTO);
        assertEquals(HttpStatus.NOT_FOUND, orderCreateResponse.getStatus());

        verifyNoInteractions(productOrderProducer);
    }

    @Test
    public void getNonExistentOrderFail() {
        HttpResponse<Order> orderGetResponse = ordersClient.getOrder(1L);
        assertEquals(HttpStatus.NOT_FOUND, orderGetResponse.getStatus());
    }

    @Test
    public void updateNonExistentOrderFail() {
        OrderUpdateDTO orderUpdateDTO = new OrderUpdateDTO();
        orderUpdateDTO.setPaid(true);
        orderUpdateDTO.setDelivered(true);

        HttpResponse<Order> orderUpdateResponse = ordersClient.updateOrder(1L, orderUpdateDTO);
        assertEquals(HttpStatus.NOT_FOUND, orderUpdateResponse.getStatus());
    }

    @Test
    public void deleteNonExistentOrderFail() {
        HttpResponse<Void> orderDeleteResponse = ordersClient.deleteOrder(1L);
        assertEquals(HttpStatus.NOT_FOUND, orderDeleteResponse.getStatus());
    }

    @MockBean(ProductsApi.class)
    public ProductsApi getProductsApi() {
        ProductsApi mock = mock(ProductsApi.class);

        OrderPriceResponseDTO orderPriceResponse = new OrderPriceResponseDTO();
        orderPriceResponse.setTotalPrice(new BigDecimal("10.0"));
        orderPriceResponse.setProductPrices(getFakeProductPrices());

        when(mock.priceOrder(any())).thenReturn(orderPriceResponse);
        return mock;
    }

    private static List<ProductPriceDTO> getFakeProductPrices() {
        List<ProductPriceDTO> productPriceDTOs = new ArrayList<>();
        ProductPriceDTO product0 = new ProductPriceDTO();
        product0.setProductId(1L);
        product0.setProductName("Banana");
        product0.setUnitPrice(BigDecimal.ONE);
        productPriceDTOs.add(product0);
        ProductPriceDTO product1 = new ProductPriceDTO();
        product1.setProductId(2L);
        product1.setProductName("Orange");
        product1.setUnitPrice(BigDecimal.ONE);
        productPriceDTOs.add(product1);
        return productPriceDTOs;
    }

    @MockBean(ProductOrderProducer.class)
    public ProductOrderProducer getProductOrderProducer() {
        return mock(ProductOrderProducer.class);
    }
}
