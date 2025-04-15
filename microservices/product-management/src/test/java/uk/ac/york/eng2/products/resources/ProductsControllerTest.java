package uk.ac.york.eng2.products.resources;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.repository.ProductsRepository;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest(transactional = false)
public class ProductsControllerTest {
    @Inject
    private ProductsClient productsClient;

    @Inject
    private ProductsRepository productsRepo;

    @BeforeEach
    public void setup() {
        productsRepo.deleteAll();
    }

    @Test
    public void getNone() {
        assertEquals(0, productsClient.getProducts().size());
    }

    @Test
    public void createOneGetOne() {
        ProductCreateDTO productCreateDTO = new ProductCreateDTO();
        productCreateDTO.setName("Test");
        productCreateDTO.setUnitPrice(new BigDecimal("0.2"));
        productCreateDTO.setTags(new HashSet<>());

        Product returnedProduct = productsClient.createProduct(productCreateDTO);

        List<Product> allProducts = productsClient.getProducts();
        assertEquals(1, allProducts.size());
        assertEquals(returnedProduct.getId(), allProducts.get(0).getId());

        Product specificProduct = productsClient.getProduct(returnedProduct.getId());
        assertNotNull(specificProduct);
        assertEquals(returnedProduct.getName(), specificProduct.getName());

        assertEquals(productCreateDTO.getName(), specificProduct.getName());
        assertEquals(0, productCreateDTO.getUnitPrice().compareTo(specificProduct.getUnitPrice()));
    }

    public void createThenDelete() {
        ProductCreateDTO productCreateDTO = new ProductCreateDTO();
        productCreateDTO.setName("Test");
        productCreateDTO.setUnitPrice(new BigDecimal("0.2"));
        productCreateDTO.setTags(new HashSet<>());

        Product returnedProduct = productsClient.createProduct(productCreateDTO);
        assertEquals(1, productsClient.getProducts().size());
        assertNotNull(returnedProduct);

        productsClient.deleteProduct(returnedProduct.getId());
        assertEquals(0, productsClient.getProducts().size());

        Product specificProduct = productsClient.getProduct(returnedProduct.getId());
        assertNull(specificProduct);
    }
}
