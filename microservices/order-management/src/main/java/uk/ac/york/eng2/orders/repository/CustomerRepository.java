package uk.ac.york.eng2.orders.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;
import uk.ac.york.eng2.orders.domain.Customer;

@Repository
public interface CustomerRepository extends PageableRepository<Customer, Long> {
    boolean existsByEmail(String email);
}
