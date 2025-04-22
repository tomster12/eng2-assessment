package uk.ac.york.eng2.integration;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import uk.ac.york.cs.eng2.integration.order_management.api.CustomersApi;
import uk.ac.york.cs.eng2.integration.order_management.api.OrdersApi;
import uk.ac.york.cs.eng2.integration.order_management.model.Customer;
import uk.ac.york.cs.eng2.integration.order_management.model.CustomerCreateDTO;
import uk.ac.york.cs.eng2.integration.order_management.model.Order;
import uk.ac.york.cs.eng2.integration.order_management.model.OrderCreateDTO;
import uk.ac.york.cs.eng2.integration.product_management.api.ProductsApi;
import uk.ac.york.cs.eng2.integration.product_management.model.Product;
import uk.ac.york.cs.eng2.integration.product_management.model.ProductCreateDTO;

import java.math.BigDecimal;
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
        ProductCreateDTO productCreateDTO = new ProductCreateDTO();
        productCreateDTO.setName("banana");
        productCreateDTO.setTags(List.of("fruit", "yellow"));
        productCreateDTO.setUnitPrice(new BigDecimal("0.75"));

        HttpResponse<Product> productCreateResponse = productsApi.createProduct(productCreateDTO);
        assertEquals(HttpStatus.CREATED, productCreateResponse.status());
        Product product = productCreateResponse.body();

        CustomerCreateDTO customerCreateDTO = new CustomerCreateDTO();
        customerCreateDTO.setEmail("bob@gmail.com");
        customerCreateDTO.setFirstName("Bob");
        customerCreateDTO.setFamilyName("Smith");

        HttpResponse<Customer> customerCreateResponse = customersApi.createCustomer(customerCreateDTO);
        assertEquals(HttpStatus.CREATED, customerCreateResponse.status());
        Customer customer = customerCreateResponse.body();

        OrderCreateDTO orderCreateDTO = new OrderCreateDTO();
        orderCreateDTO.setCustomerId(customer.getId());
        orderCreateDTO.setAddress("Bobs House");
        Map<String, Long> productQuantities = new HashMap<>();
        productQuantities.put("banana", 10L);
        orderCreateDTO.setProductQuantities(productQuantities);

        HttpResponse<Order> orderCreateResponse = ordersApi.createOrder(orderCreateDTO);
        assertEquals(HttpStatus.CREATED, orderCreateResponse.status());
        Order order = orderCreateResponse.body();
    }
}
