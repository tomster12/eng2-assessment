package uk.ac.york.eng2.integration;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import uk.ac.york.cs.eng2.integration.order_management.api.CustomersApi;
import uk.ac.york.cs.eng2.integration.order_management.api.OrdersApi;
import uk.ac.york.cs.eng2.integration.order_management.model.*;
import uk.ac.york.cs.eng2.integration.product_management.api.ProductsApi;
import uk.ac.york.cs.eng2.integration.product_management.model.OrdersByDay;
import uk.ac.york.cs.eng2.integration.product_management.model.OrdersByDayRequestDTO;
import uk.ac.york.cs.eng2.integration.product_management.model.Product;
import uk.ac.york.cs.eng2.integration.product_management.model.ProductCreateDTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class OrderWorkflowTest {
    @Inject
    private ProductsApi productsApi;

    @Inject
    private CustomersApi customersApi;

    @Inject
    private OrdersApi ordersApi;

    @Test
    public void placeOrderForCustomerForProductSuccess() {
        // Create the products
        Product bananaProduct = addProduct("Banana", List.of("Fruit", "Yellow"), 0.75);
        addProduct("Pizza", List.of("Pizza"), 12.50);
        addProduct("Bakewell Tart", List.of("Sweet"), 1.50);
        addProduct("Large Pizza", List.of("Large", "Pizza"), 15.00);
        addProduct("Large Ice Cream", List.of("Large", "Ice Cream"), 5.50);

        // Create a customer
        CustomerCreateDTO customerCreateDTO = new CustomerCreateDTO();
        customerCreateDTO.setEmail("bob@gmail.com");
        customerCreateDTO.setFirstName("Bob");
        customerCreateDTO.setFamilyName("Smith");
        HttpResponse<Customer> customerCreateResponse = customersApi.createCustomer(customerCreateDTO);
        assertEquals(HttpStatus.CREATED, customerCreateResponse.status());
        Customer customer = customerCreateResponse.body();

        // Place an order for some products for the customer
        OrderCreateDTO orderCreateDTO = new OrderCreateDTO();
        orderCreateDTO.setCustomerId(customer.getId());
        orderCreateDTO.setAddress("Bobs House");
        Map<String, Long> productQuantities = new HashMap<>();

        productQuantities.put("Banana", 3L);
        productQuantities.put("Bakewell Tart", 3L);
        productQuantities.put("Large Pizza", 2L);
        productQuantities.put("Large Ice Cream", 3L);

        orderCreateDTO.setProductQuantities(productQuantities);
        HttpResponse<Order> orderCreateResponse = ordersApi.createOrder(orderCreateDTO);
        assertEquals(HttpStatus.CREATED, orderCreateResponse.status());
        Order order = orderCreateResponse.body();

        System.out.println("E2E Order placed, total price: " + order.getTotalAmount());
        assertEquals(0, order.getTotalAmount().compareTo(new BigDecimal("27.30")));

        // Update the order to say it is finished
        OrderUpdateDTO orderUpdateDTO = new OrderUpdateDTO();
        orderUpdateDTO.setDelivered(true);
        orderUpdateDTO.setPaid(true);
        HttpResponse<Order> orderUpdateResponse = ordersApi.updateOrder(order.getId(), orderUpdateDTO);
        assertEquals(HttpStatus.OK, orderUpdateResponse.status());

        System.out.println("Checking daily order for '" + bananaProduct.getName() + "' with ID '" + bananaProduct.getId() + "'");

        // Check the daily orders for bananas
        OrdersByDayRequestDTO ordersByDayRequestDTO = new OrdersByDayRequestDTO();
        ordersByDayRequestDTO.setDay(order.getDateCreated());
        HttpResponse<OrdersByDay> ordersByDayResponse = productsApi.getProductDailyOrders(bananaProduct.getId(), ordersByDayRequestDTO);
        assertEquals(HttpStatus.OK, ordersByDayResponse.status());
        OrdersByDay ordersByDay = ordersByDayResponse.body();
        assertEquals(1L, ordersByDay.getCount());
    }

    private Product addProduct(String name, List<String> tags, double price) {
        ProductCreateDTO productCreateDTO = new ProductCreateDTO();
        productCreateDTO.setName(name);
        productCreateDTO.setTags(tags);
        productCreateDTO.setUnitPrice(new BigDecimal(price));

        HttpResponse<Product> productCreateResponse = productsApi.createProduct(productCreateDTO);
        assertEquals(HttpStatus.CREATED, productCreateResponse.status());
        return productCreateResponse.body();
    }
}
