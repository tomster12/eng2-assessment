package uk.ac.york.eng2.products.events;

import io.micronaut.serde.annotation.Serdeable;

import java.time.LocalDate;

@Serdeable
public record ProductOrderEvent(long productId, LocalDate date) {
}
