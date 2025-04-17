package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.*;
import uk.ac.york.eng2.products.repository.ProductsRepository;
import uk.ac.york.eng2.products.repository.TagsRepository;

import java.math.BigDecimal;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest(transactional = false)
public class ProductsControllerTest {
    @Inject
    private ProductsClient productsClient;

    @Inject
    private ProductsRepository productsRepo;

    @Inject
    private TagsRepository tagsRepo;

    @BeforeEach
    public void setup() {
        productsRepo.deleteAll();
        tagsRepo.deleteAll();
    }

    @Test
    public void getNone() {
        assertEquals(0, productsClient.getProducts().size());
    }

    @Test
    public void createOneGetOneSuccess() {
        ProductCreateDTO productCreateDTO = new ProductCreateDTO();
        productCreateDTO.setName("Test");
        productCreateDTO.setUnitPrice(new BigDecimal("0.2"));
        productCreateDTO.setTags(new HashSet<>());

        HttpResponse<Product> createResponse = productsClient.createProduct(productCreateDTO);
        assertEquals(HttpStatus.CREATED, createResponse.getStatus());
        Product createdProduct = createResponse.body();
        assertEquals(productCreateDTO.getName(), createdProduct.getName());

        List<Product> allProducts = productsClient.getProducts();
        assertEquals(1, allProducts.size());
        assertEquals(createdProduct.getId(), allProducts.get(0).getId());

        HttpResponse<Product> getResponse = productsClient.getProduct(createdProduct.getId());
        Assertions.assertEquals(HttpStatus.OK, getResponse.getStatus());
        Product specificProduct = getResponse.body();
        assertEquals(createdProduct.getId(), specificProduct.getId());
    }

    @Test
    public void createThenDeleteSuccess() {
        ProductCreateDTO productCreateDTO = new ProductCreateDTO();
        productCreateDTO.setName("Test");
        productCreateDTO.setUnitPrice(new BigDecimal("0.2"));
        productCreateDTO.setTags(new HashSet<>());

        HttpResponse<Product> createResponse = productsClient.createProduct(productCreateDTO);
        assertEquals(HttpStatus.CREATED, createResponse.getStatus());
        Product createdProduct = createResponse.body();

        HttpResponse<Void> deleteResponse = productsClient.deleteProduct(createdProduct.getId());
        assertEquals(HttpStatus.NO_CONTENT, deleteResponse.getStatus());

        HttpResponse<Product> getResponse = productsClient.getProduct(createdProduct.getId());
        Assertions.assertEquals(HttpStatus.NOT_FOUND, getResponse.getStatus());
    }

    @Test
    public void createThenUpdateSuccess() {
        ProductCreateDTO productCreateDTO = new ProductCreateDTO();
        productCreateDTO.setName("Test");
        productCreateDTO.setUnitPrice(new BigDecimal("0.2"));
        productCreateDTO.setTags(new HashSet<>());

        HttpResponse<Product> createResponse = productsClient.createProduct(productCreateDTO);
        assertEquals(HttpStatus.CREATED, createResponse.getStatus());
        Product createdProduct = createResponse.body();

        assertEquals(0, productCreateDTO.getUnitPrice().compareTo(createdProduct.getUnitPrice()));

        ProductUpdateDTO productUpdateDTO = new ProductUpdateDTO();
        productUpdateDTO.setUnitPrice(new BigDecimal("0.4"));
        productUpdateDTO.setTags(new HashSet<>());

        HttpResponse<Product> updateResponse = productsClient.updateProduct(createdProduct.getId(), productUpdateDTO);
        assertEquals(HttpStatus.OK, updateResponse.getStatus());
        Product updatedProduct = updateResponse.body();

        assertEquals(createdProduct.getName(), updatedProduct.getName());
        assertEquals(0, productUpdateDTO.getUnitPrice().compareTo(updatedProduct.getUnitPrice()));
        assertNotEquals(0, productCreateDTO.getUnitPrice().compareTo(updatedProduct.getUnitPrice()));
    }

    @Test
    public void createWithTagsSuccess() {
        ProductCreateDTO productCreateDTO = new ProductCreateDTO();
        productCreateDTO.setName("Test");
        productCreateDTO.setUnitPrice(new BigDecimal("0.2"));
        Set<String> createTags = Set.of("tag1", "tag2");
        productCreateDTO.setTags(createTags);

        HttpResponse<Product> createResponse = productsClient.createProduct(productCreateDTO);
        assertEquals(HttpStatus.CREATED, createResponse.getStatus());

        List<Tag> allTags = tagsRepo.findAll();
        assertEquals(2, allTags.size());

        for (String tagName : createTags) {
            assertTrue(allTags.stream().anyMatch(tag -> tag.getName().equals(tagName)));
        }

        ProductCreateDTO product2CreateDTO = new ProductCreateDTO();
        product2CreateDTO.setName("Test2");
        product2CreateDTO.setUnitPrice(new BigDecimal("0.2"));
        product2CreateDTO.setTags(Set.of("tag1", "tag2"));

        HttpResponse<Product> createResponse2 = productsClient.createProduct(product2CreateDTO);
        assertEquals(HttpStatus.CREATED, createResponse2.getStatus());

        List<Tag> allTags2 = tagsRepo.findAll();
        assertEquals(2, allTags2.size());
    }

    @Test
    public void price2ProductsOrderSuccess() {
        ProductCreateDTO product1CreateDTO = new ProductCreateDTO();
        product1CreateDTO.setName("Test 1");
        product1CreateDTO.setUnitPrice(new BigDecimal("0.2"));
        product1CreateDTO.setTags(new HashSet<>());
        productsClient.createProduct(product1CreateDTO);

        ProductCreateDTO product2CreateDTO = new ProductCreateDTO();
        product2CreateDTO.setName("Test 2");
        product2CreateDTO.setUnitPrice(new BigDecimal("0.6"));
        product2CreateDTO.setTags(new HashSet<>());
        productsClient.createProduct(product2CreateDTO);

        OrderPriceRequestDTO priceRequestDTO = new OrderPriceRequestDTO();
        Map<String, Long> productQuantities = new HashMap<>();
        productQuantities.put("Test 1", 3L);
        productQuantities.put("Test 2", 12L);
        priceRequestDTO.setProductQuantities(productQuantities);

        HttpResponse<OrderPriceResponseDTO> priceResponse = productsClient.priceOrder(priceRequestDTO);
        assertEquals(HttpStatus.OK, priceResponse.getStatus());
        OrderPriceResponseDTO priceResponseDTO = priceResponse.body();

        List<ProductPriceDTO> productPriceDTOs = priceResponseDTO.getProductPrices();
        Map<String, BigDecimal> productPrices = new HashMap<>();
        for (ProductPriceDTO productPriceDTO : productPriceDTOs) {
            productPrices.put(productPriceDTO.getProductName(), productPriceDTO.getUnitPrice());
        }

        BigDecimal total = priceResponseDTO.getTotalPrice();
        assertTrue(productPrices.containsKey("Test 1"));
        assertTrue(productPrices.containsKey("Test 2"));
        assertEquals(0, productPrices.get("Test 1").compareTo(new BigDecimal("0.2")));
        assertEquals(0, productPrices.get("Test 2").compareTo(new BigDecimal("0.6")));
        assertEquals(0, total.compareTo(new BigDecimal("7.8")));
    }

    @Test
    public void createExistingFail() {
        ProductCreateDTO productCreateDTO = new ProductCreateDTO();
        productCreateDTO.setName("Test");
        productCreateDTO.setUnitPrice(new BigDecimal("0.2"));
        productCreateDTO.setTags(new HashSet<>());

        productsClient.createProduct(productCreateDTO);

        ProductCreateDTO product2CreateDTO = new ProductCreateDTO();
        product2CreateDTO.setName("Test");
        product2CreateDTO.setUnitPrice(new BigDecimal("0.6"));
        product2CreateDTO.setTags(new HashSet<>());

        HttpClientResponseException exception = Assertions.assertThrows(HttpClientResponseException.class, () -> productsClient.createProduct(product2CreateDTO));
        assertEquals(HttpStatus.CONFLICT, exception.getStatus());
    }

    @Test
    public void updateNonExistentProductFail() {
        ProductUpdateDTO productUpdateDTO = new ProductUpdateDTO();
        productUpdateDTO.setUnitPrice(new BigDecimal("0.5"));
        productUpdateDTO.setTags(new HashSet<>());

        HttpResponse<Product> updateResponse = productsClient.updateProduct(0L, productUpdateDTO);
        assertEquals(HttpStatus.NOT_FOUND, updateResponse.getStatus());
    }

    @Test
    public void deleteNonExistentProductFail() {
        HttpResponse<Void> deleteResponse = productsClient.deleteProduct(0L);
        assertEquals(HttpStatus.NOT_FOUND, deleteResponse.getStatus());
    }

    @Test
    public void priceNonExistentProductsOrderFail() {
        OrderPriceRequestDTO priceRequestDTO = new OrderPriceRequestDTO();
        Map<String, Long> productQuantities = new HashMap<>();
        productQuantities.put("Nope", 3L);
        priceRequestDTO.setProductQuantities(productQuantities);

        HttpResponse<OrderPriceResponseDTO> priceResponse = productsClient.priceOrder(priceRequestDTO);
        assertEquals(HttpStatus.NOT_FOUND, priceResponse.getStatus());
    }
}
