package uk.ac.york.eng2.orders.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class CustomerUpdateDTO {
    private String firstName;
    private String familyName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
