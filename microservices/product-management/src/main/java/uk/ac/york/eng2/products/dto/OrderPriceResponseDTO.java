package uk.ac.york.eng2.products.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.math.BigDecimal;
import java.util.List;

@Serdeable
public class OrderPriceResponseDTO {

    private List<ProductPriceDTO> productPrices;
    private BigDecimal totalPrice;

    public List<ProductPriceDTO> getProductPrices() {
        return productPrices;
    }

    public void setProductPrices(List<ProductPriceDTO> productPrices) {
        this.productPrices = productPrices;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
