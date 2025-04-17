package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.dto.CustomerCreateDTO;
import uk.ac.york.eng2.orders.dto.CustomerUpdateDTO;
import uk.ac.york.eng2.orders.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Controller(CustomerController.PREFIX)
public class CustomerController {
    public static final String PREFIX = "/customer";

    @Inject
    CustomerRepository repo;

    @Get
    public List<Customer> getCustomers() {
        return repo.findAll();
    }

    @Get("/{id}")
    public HttpResponse<Customer> getCustomer(@PathVariable Long id) {
        Optional<Customer> optCustomer = repo.findById(id);
        if (optCustomer.isEmpty()) return HttpResponse.notFound();
        return HttpResponse.ok(optCustomer.get());
    }

    @Transactional
    @Post
    public HttpResponse<Customer> createCustomer(@Body CustomerCreateDTO customerCreateDTO) {
        if (repo.existsByEmail(customerCreateDTO.getEmail())) {
            return HttpResponse.status(HttpStatus.CONFLICT, "Email address already in use");
        }

        Customer customer = new Customer();
        customer.setEmail(customerCreateDTO.getEmail());
        customer.setFirstName(customerCreateDTO.getFirstName());
        customer.setFamilyName(customerCreateDTO.getFamilyName());
        customer = repo.save(customer);

        return HttpResponse.created(customer);
    }

    @Transactional
    @Put("/{id}")
    public HttpResponse<Customer> updateCustomer(@PathVariable Long id, @Body CustomerUpdateDTO customerUpdateDTO) {
        Optional<Customer> optCustomer = repo.findById(id);
        if (optCustomer.isEmpty()) return HttpResponse.notFound();
        Customer customer = optCustomer.get();

        customer.setFirstName(customerUpdateDTO.getFirstName());
        customer.setFamilyName(customerUpdateDTO.getFamilyName());
        customer = repo.save(customer);

        return HttpResponse.ok(customer);
    }

    @Delete("/{id}")
    public HttpResponse<Void> deleteCustomer(@PathVariable Long id) {
        if (!repo.existsById(id)) return HttpResponse.notFound();
        repo.deleteById(id);
        return HttpResponse.noContent();
    }
}
