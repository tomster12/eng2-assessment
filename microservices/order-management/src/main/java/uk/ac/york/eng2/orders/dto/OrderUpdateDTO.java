package uk.ac.york.eng2.orders.dto;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;

import java.util.HashMap;
import java.util.Map;

@Serdeable
public class OrderUpdateDTO {
    private boolean paid;

    private boolean delivered;

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }
}
