package uk.ac.york.eng2.orders.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;
import uk.ac.york.eng2.orders.domain.OrderItem;

@Repository
public interface OrderItemRepository extends PageableRepository<OrderItem, Long> {
}
