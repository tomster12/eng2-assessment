package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.*;

import java.util.*;

@Client(ProductsController.PREFIX)
public interface ProductsClient {
    @Get
    List<Product> getProducts();

    @Get("/{id}")
    HttpResponse<Product> getProduct(@PathVariable Long id);

    @Post("/daily/{id}")
    HttpResponse<OrdersByDay> getProductDailyOrders(@PathVariable Long id, @Body OrdersByDayRequestDTO ordersByDayRequestDTO);

    @Post
    HttpResponse<Product> createProduct(@Body ProductCreateDTO productCreateDTO);

    @Put("/{id}")
    HttpResponse<Product> updateProduct(@PathVariable Long id, @Body ProductUpdateDTO productUpdateDTO);

    @Delete("/{id}")
    HttpResponse<Void> deleteProduct(@PathVariable Long id);

    @Put("/order")
    HttpResponse<OrderPriceResponseDTO> priceOrder(@Body OrderPriceRequestDTO priceRequestDTO);
}
