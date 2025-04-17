package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.dto.CustomerCreateDTO;
import uk.ac.york.eng2.orders.dto.CustomerUpdateDTO;
import uk.ac.york.eng2.orders.dto.OrderCreateDTO;
import uk.ac.york.eng2.orders.dto.OrderUpdateDTO;

import java.util.List;
import java.util.Optional;

@Client(CustomerController.PREFIX)
public interface CustomerClient {
    @Get
    List<Customer> getCustomers();

    @Get("/{id}")
    HttpResponse<Customer> getCustomer(@PathVariable Long id);

    @Post
    HttpResponse<Customer> createCustomer(@Body CustomerCreateDTO customerCreateDTO);

    @Put("/{id}")
    HttpResponse<Customer> updateCustomer(@PathVariable Long id, @Body CustomerUpdateDTO customerUpdateDTO);

    @Delete("/{id}")
    HttpResponse<Void> deleteCustomer(@PathVariable Long id);
}
