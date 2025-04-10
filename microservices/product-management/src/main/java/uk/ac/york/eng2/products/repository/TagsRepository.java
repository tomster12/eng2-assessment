package uk.ac.york.eng2.products.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;
import uk.ac.york.eng2.products.domain.Tag;

import java.util.Optional;

@Repository
public interface TagsRepository extends PageableRepository<Tag, Long> {
    Optional<Tag> findByName(String name);
}
