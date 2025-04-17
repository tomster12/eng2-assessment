package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;

import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.dto.OrderCreateDTO;
import uk.ac.york.eng2.orders.dto.OrderUpdateDTO;

import java.util.List;

@Client(OrdersController.PREFIX)
public interface OrdersClient {
    @Get
    List<Order> getOrders();

    @Get("/{id}")
    HttpResponse<Order> getOrder(@PathVariable Long id);

    @Post
    HttpResponse<Order> createOrder(@Body OrderCreateDTO orderCreateDTO);

    @Post("/{id}")
    HttpResponse<Order> updateOrder(@PathVariable Long id, @Body OrderUpdateDTO orderUpdateDTO);

    @Delete("/{id}")
    HttpResponse<Void> deleteOrder(@PathVariable Long id);
}
