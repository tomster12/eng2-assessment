package uk.ac.york.eng2.products.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.util.Map;

@Serdeable
public class OrderPriceRequestDTO {
    private Map<String, Long> productQuantities;

    public Map<String, Long> getProductQuantities() {
        return productQuantities;
    }

    public void setProductQuantities(Map<String, Long> productQuantities) {
        this.productQuantities = productQuantities;
    }
}
