package uk.ac.york.eng2.orders.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;

import java.util.List;

@Serdeable
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(nullable = false, length = 255)
    private String firstName;

    @Column(nullable = false, length = 255)
    private String familyName;

    @JsonIgnore
    @OneToMany(mappedBy = "customer")
    private List<Orders> orders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String name) {
        this.email = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String address) {
        this.firstName = address;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String phone) {
        this.familyName = phone;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}
