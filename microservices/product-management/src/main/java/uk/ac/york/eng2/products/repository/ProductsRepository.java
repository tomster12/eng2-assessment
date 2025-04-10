package uk.ac.york.eng2.products.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;
import uk.ac.york.eng2.products.domain.Product;

import java.util.Optional;

@Repository
public interface ProductsRepository extends PageableRepository<Product, Long> {
    Optional<Product> findByName(String name);

    boolean existsByName(String name);
}
