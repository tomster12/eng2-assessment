package uk.ac.york.eng2.products.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Serdeable
@Entity
public class Tag {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true, length = 255)
    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "tags")
    private Set<Product> products = new HashSet<>();
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
