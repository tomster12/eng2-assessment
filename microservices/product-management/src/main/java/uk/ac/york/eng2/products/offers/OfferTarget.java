package uk.ac.york.eng2.products.offers;

import java.util.List;

public interface OfferTarget {
    List<OfferContext.ProductOrder> resolve(OfferContext ctx);
}
