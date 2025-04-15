package uk.ac.york.eng2.products.domain;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;

import java.time.LocalDate;

@Serdeable
@Entity
public class OrdersByDay {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(optional = false)
    private Product product;

    @Column(nullable = false)
    private LocalDate day;

    @Column(nullable = false)
    private Long count = 0L;

    public Long getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
