package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.*;

import java.util.*;

@Client(ProductsController.PREFIX)
public interface ProductsClient {
    @Get
    List<Product> getProducts();

    @Get("/{id}")
    Product getProduct(@PathVariable Long id);

    @Post
    Product createProduct(@Body ProductCreateDTO productCreateDTO);

    @Put("/{id}")
    Product updateProduct(@Body ProductUpdateDTO productUpdateDTO, @PathVariable Long id);

    @Delete("/{id}")
    HttpResponse<Void> deleteProduct(@PathVariable Long id);

    @Put("/order")
    OrderPriceResponseDTO priceOrder(@Body OrderPriceRequestDTO priceRequestDTO);
}
