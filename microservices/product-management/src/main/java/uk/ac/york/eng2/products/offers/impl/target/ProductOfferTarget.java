package uk.ac.york.eng2.products.offers.impl.target;

import uk.ac.york.eng2.products.offers.OfferContext;
import uk.ac.york.eng2.products.offers.OfferTarget;

import java.util.ArrayList;
import java.util.List;

public class ProductOfferTarget implements OfferTarget {
    private final String productName;

    public ProductOfferTarget(String productName) {
        this.productName = productName;
    }

    public List<OfferContext.IndividualProductOrder> resolve(OfferContext ctx) {
        List<OfferContext.IndividualProductOrder> productOrders = new ArrayList<>();

        for (OfferContext.IndividualProductOrder productOrder : ctx.individualProductOrders) {
            if (productOrder.product.getName().equals(productName)) {
                productOrders.add(productOrder);
            }
        }

        return productOrders;
    }

    public String toString() {
        return "Product Name: " + productName;
    }
}
