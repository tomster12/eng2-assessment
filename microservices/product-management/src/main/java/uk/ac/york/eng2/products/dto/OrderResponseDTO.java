package uk.ac.york.eng2.products.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.math.BigDecimal;
import java.util.Map;

@Serdeable
public class OrderResponseDTO {
    private Map<Long, BigDecimal> itemPrices;
    private BigDecimal totalPrice;

    public Map<Long, BigDecimal> getItemPrices() {
        return itemPrices;
    }

    public void setItemPrices(Map<Long, BigDecimal> itemPrices) {
        this.itemPrices = itemPrices;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
