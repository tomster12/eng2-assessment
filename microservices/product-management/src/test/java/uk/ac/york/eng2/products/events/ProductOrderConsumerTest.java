package uk.ac.york.eng2.products.events;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.OrdersByDayRequestDTO;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductsRepository;
import uk.ac.york.eng2.products.resources.ProductsClient;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest(transactional = false)
public class ProductOrderConsumerTest {
    @Inject
    private ProductOrderConsumer productOrderConsumer;

    @Inject
    ProductsClient productsClient;

    @Inject
    ProductsRepository productsRepository;

    @Inject
    OrdersByDayRepository ordersByDayRepository;

    @BeforeEach
    public void setup() {
        ordersByDayRepository.deleteAll();
        productsRepository.deleteAll();
    }

    @Test
    public void orderProductAndCheckDailySuccess() {
        ProductCreateDTO productCreateDTO = new ProductCreateDTO();
        productCreateDTO.setName("Test");
        productCreateDTO.setTags(new HashSet<>());
        productCreateDTO.setUnitPrice(new BigDecimal("0.5"));

        HttpResponse<Product> createResponse = productsClient.createProduct(productCreateDTO);
        assertEquals(HttpStatus.CREATED, createResponse.status());
        Product product = createResponse.body();

        LocalDate correctDay = LocalDate.of(2022, 6, 2);

        ProductOrderEvent productOrderEvent1 = new ProductOrderEvent(product.getId(), correctDay);
        Assertions.assertDoesNotThrow(() -> productOrderConsumer.orderPlaced(product.getId(), productOrderEvent1));

        ProductOrderEvent productOrderEvent2 = new ProductOrderEvent(product.getId(), correctDay);
        Assertions.assertDoesNotThrow(() -> productOrderConsumer.orderPlaced(product.getId(), productOrderEvent2));

        OrdersByDayRequestDTO correctOrdersByDayRequestDTO = new OrdersByDayRequestDTO();
        correctOrdersByDayRequestDTO.setDay(correctDay);
        HttpResponse<OrdersByDay> correctDailyOrdersResponse = productsClient.getProductDailyOrders(product.getId(), correctOrdersByDayRequestDTO);
        Assertions.assertEquals(HttpStatus.OK, correctDailyOrdersResponse.status());
        OrdersByDay ordersByDay = correctDailyOrdersResponse.body();

        assertEquals(2L, ordersByDay.getCount());
    }

    @Test
    public void orderProductAndCheckMissingRowFail() {
        ProductCreateDTO productCreateDTO = new ProductCreateDTO();
        productCreateDTO.setName("Test");
        productCreateDTO.setTags(new HashSet<>());
        productCreateDTO.setUnitPrice(new BigDecimal("0.5"));

        HttpResponse<Product> createResponse = productsClient.createProduct(productCreateDTO);
        assertEquals(HttpStatus.CREATED, createResponse.status());
        Product product = createResponse.body();

        LocalDate correctDay = LocalDate.of(2022, 6, 2);
        ProductOrderEvent productOrderEvent = new ProductOrderEvent(product.getId(), correctDay);
        Assertions.assertDoesNotThrow(() -> productOrderConsumer.orderPlaced(product.getId(), productOrderEvent));

        LocalDate wrongDay = LocalDate.of(2022, 6, 3);
        OrdersByDayRequestDTO wrongOrdersByDayRequestDTO = new OrdersByDayRequestDTO();
        wrongOrdersByDayRequestDTO.setDay(wrongDay);
        HttpResponse<OrdersByDay> wrongDailyOrdersResponse1 = productsClient.getProductDailyOrders(product.getId(), wrongOrdersByDayRequestDTO);
        Assertions.assertEquals(HttpStatus.NOT_FOUND, wrongDailyOrdersResponse1.status());

        Long wrongProductId = product.getId() + 1;
        OrdersByDayRequestDTO correctOrdersByDayRequestDTO = new OrdersByDayRequestDTO();
        wrongOrdersByDayRequestDTO.setDay(correctDay);
        HttpResponse<OrdersByDay> wrongDailyOrdersResponse2 = productsClient.getProductDailyOrders(wrongProductId, correctOrdersByDayRequestDTO);
        Assertions.assertEquals(HttpStatus.NOT_FOUND, wrongDailyOrdersResponse2.status());
    }

    @Test
    public void orderMissingProductFail() {
        LocalDate day = LocalDate.of(2022, 6, 2);
        ProductOrderEvent productOrderEvent = new ProductOrderEvent(0L, day);
        Assertions.assertThrows(IllegalArgumentException.class, () -> productOrderConsumer.orderPlaced(0L, productOrderEvent));
    }
}
