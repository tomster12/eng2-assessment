package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.exceptions.HttpClientErrorDecoder;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.dto.CustomerCreateDTO;
import uk.ac.york.eng2.orders.dto.CustomerUpdateDTO;
import uk.ac.york.eng2.orders.repository.CustomerRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@MicronautTest(transactional = false)
public class CustomerControllerTest {
    @Inject
    private CustomerClient customerClient;

    @Inject
    private CustomerRepository customerRepository;

    @BeforeEach
    public void setup() {
        customerRepository.deleteAll();
    }

    @Test
    public void createCustomerSuccess() {
        CustomerCreateDTO customerCreateDTO = new CustomerCreateDTO();
        customerCreateDTO.setEmail("john.smith@gmail.com");
        customerCreateDTO.setFirstName("John");
        customerCreateDTO.setFamilyName("Smith");

        HttpResponse<Customer> createCustomerResponse = customerClient.createCustomer(customerCreateDTO);
        assertEquals(HttpStatus.CREATED, createCustomerResponse.getStatus());

        HttpResponse<Customer> getCustomerResponse = customerClient.getCustomer(createCustomerResponse.body().getId());
        assertEquals(HttpStatus.OK, getCustomerResponse.getStatus());
        Customer customer = getCustomerResponse.body();

        assertEquals(customerCreateDTO.getFirstName(), customer.getFirstName());
        assertEquals(customerCreateDTO.getFamilyName(), customer.getFamilyName());
        assertEquals(customerCreateDTO.getEmail(), customer.getEmail());
    }

    @Test
    public void updateCustomerSuccess() {
        CustomerCreateDTO customerCreateDTO = new CustomerCreateDTO();
        customerCreateDTO.setEmail("john.smith@gmail.com");
        customerCreateDTO.setFirstName("John");
        customerCreateDTO.setFamilyName("Smith");

        HttpResponse<Customer> createCustomerResponse = customerClient.createCustomer(customerCreateDTO);
        assertEquals(HttpStatus.CREATED, createCustomerResponse.getStatus());

        assertEquals(customerCreateDTO.getFirstName(), createCustomerResponse.body().getFirstName());
        assertEquals(customerCreateDTO.getFamilyName(), createCustomerResponse.body().getFamilyName());

        CustomerUpdateDTO customerUpdateDTO = new CustomerUpdateDTO();
        customerUpdateDTO.setFirstName("John");
        customerUpdateDTO.setFamilyName("Daily");

        HttpResponse<Customer> updateCustomerResponse = customerClient.updateCustomer(createCustomerResponse.body().getId(), customerUpdateDTO);
        assertEquals(HttpStatus.OK, updateCustomerResponse.getStatus());

        assertEquals(customerUpdateDTO.getFirstName(), updateCustomerResponse.body().getFirstName());
        assertEquals(customerUpdateDTO.getFamilyName(), updateCustomerResponse.body().getFamilyName());
    }

    @Test
    public void deleteCustomerSuccess() {
        CustomerCreateDTO customerCreateDTO = new CustomerCreateDTO();
        customerCreateDTO.setEmail("john.smith@gmail.com");
        customerCreateDTO.setFirstName("John");
        customerCreateDTO.setFamilyName("Smith");

        HttpResponse<Customer> createCustomerResponse = customerClient.createCustomer(customerCreateDTO);
        assertEquals(HttpStatus.CREATED, createCustomerResponse.getStatus());

        assertEquals(1, customerClient.getCustomers().size());

        HttpResponse<Void> deleteCustomerResponse = customerClient.deleteCustomer(createCustomerResponse.body().getId());
        assertEquals(HttpStatus.NO_CONTENT, deleteCustomerResponse.getStatus());

        assertEquals(0, customerClient.getCustomers().size());
    }

    @Test
    public void createConflictingCustomerFail() {
        CustomerCreateDTO customerCreateDTO = new CustomerCreateDTO();
        customerCreateDTO.setEmail("john.smith@gmail.com");
        customerCreateDTO.setFirstName("John");
        customerCreateDTO.setFamilyName("Smith");

        HttpResponse<Customer> createCustomerResponse = customerClient.createCustomer(customerCreateDTO);
        assertEquals(HttpStatus.CREATED, createCustomerResponse.getStatus());

        CustomerCreateDTO customerCreateDTO1 = new CustomerCreateDTO();
        customerCreateDTO1.setEmail("john.smith@gmail.com");
        customerCreateDTO1.setFirstName("John");
        customerCreateDTO1.setFamilyName("Smith");

        HttpClientResponseException exc = assertThrows(HttpClientResponseException.class, () -> customerClient.createCustomer(customerCreateDTO1));
        assertEquals(HttpStatus.CONFLICT, exc.getStatus());
    }

    @Test
    public void updateNonExistingCustomerFail() {
        CustomerUpdateDTO customerUpdateDTO = new CustomerUpdateDTO();
        customerUpdateDTO.setFirstName("John");
        customerUpdateDTO.setFamilyName("Smith");

        HttpResponse<Customer> updateCustomerResponse = customerClient.updateCustomer(1L, customerUpdateDTO);
        assertEquals(HttpStatus.NOT_FOUND, updateCustomerResponse.getStatus());
    }

    @Test
    public void deleteNonExistingCustomerFail() {
        HttpResponse<Void> deleteCustomerResponse = customerClient.deleteCustomer(1L);
        assertEquals(HttpStatus.NOT_FOUND, deleteCustomerResponse.getStatus());
    }
}
