package uk.ac.york.eng2.products.offers.impl.target;

import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.offers.OfferContext;
import uk.ac.york.eng2.products.offers.OfferTarget;

import java.util.ArrayList;
import java.util.List;


public class ProductWithTagOfferTarget implements OfferTarget {
    private final List<String> tagNames;

    public ProductWithTagOfferTarget(List<String> tagNames) {
        this.tagNames = tagNames;
    }

    @Override
    public List<OfferContext.ProductOrder> resolve(OfferContext context) {
        List<OfferContext.ProductOrder> result = new ArrayList<>();

        for (OfferContext.ProductOrder order : context.productOrders) {
            boolean hasAll = true;

            for (String tagName : tagNames) {
                if (order.product.getTags().stream().noneMatch(tag -> tag.getName().equals(tagName))) {
                    hasAll = false;
                    break;
                }
            }

            if (hasAll) result.add(order);
        }

        return result;
    }

    public String toString() {
        return "Tags: [" + String.join(", ", tagNames) + "]";
    }
}
