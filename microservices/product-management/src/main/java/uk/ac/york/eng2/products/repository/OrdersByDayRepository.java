package uk.ac.york.eng2.products.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface OrdersByDayRepository extends PageableRepository<OrdersByDay, Long> {
    Optional<OrdersByDay> findByProductAndDay(Product product, LocalDate day);
}
