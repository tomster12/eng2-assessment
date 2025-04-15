package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.dto.CustomerCreateDTO;
import uk.ac.york.eng2.orders.dto.CustomerUpdateDTO;
import uk.ac.york.eng2.orders.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Controller("/customer")
public class CustomerController {
    @Inject
    CustomerRepository repo;

    @Get
    public List<Customer> getCustomers() {
        return repo.findAll();
    }

    @Get("/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        Optional<Customer> optCustomer = repo.findById(id);
        if (optCustomer.isPresent()) return optCustomer.get();
        throw new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found");
    }

    @Transactional
    @Post
    public Customer createCustomer(@Body CustomerCreateDTO customerCreateDTO) {
        if (repo.existsByEmail(customerCreateDTO.getEmail())) {
            throw new HttpStatusException(HttpStatus.CONFLICT, "Customer name already exists");
        }

        Customer customer = new Customer();
        customer.setEmail(customerCreateDTO.getEmail());
        customer.setFirstName(customerCreateDTO.getFirstName());
        customer.setFamilyName(customerCreateDTO.getFamilyName());
        return repo.save(customer);
    }

    @Transactional
    @Put("/{id}")
    public Customer updateCustomer(@Body CustomerUpdateDTO customerUpdateDTO, @PathVariable Long id) {
        Optional<Customer> optCustomer = repo.findById(id);
        if (optCustomer.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found");
        }

        Customer customer = optCustomer.get();
        customer.setFirstName(customerUpdateDTO.getFirstName());
        customer.setFamilyName(customerUpdateDTO.getFamilyName());
        return repo.save(customer);
    }

    @Delete("/{id}")
    public HttpResponse<Void> deleteCustomer(@PathVariable Long id) {
        if (!repo.existsById(id)) {
            return HttpResponse.status(HttpStatus.NOT_FOUND);
        }

        repo.deleteById(id);
        return HttpResponse.noContent();
    }
}
