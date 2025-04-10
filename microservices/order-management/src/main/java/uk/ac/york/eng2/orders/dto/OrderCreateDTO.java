package uk.ac.york.eng2.orders.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.util.Map;

@Serdeable
public class OrderCreateDTO {
    private Long customerId;

    private String address;

    private Map<String, Long> productQuantities;

    public String getAddress() {
        return address;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<String, Long> getProductQuantities() {
        return productQuantities;
    }

    public void setProductQuantities(Map<String, Long> productQuantities) {
        this.productQuantities = productQuantities;
    }
}
