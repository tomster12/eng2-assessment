package uk.ac.york.eng2.products.offers.userimpl;

import uk.ac.york.eng2.products.offers.OfferContext;
import uk.ac.york.eng2.products.offers.OfferRuleCondition;

public class OrderedThreeBananasCondition implements OfferRuleCondition {

    public OrderedThreeBananasCondition() {}

    @Override
    public boolean matches(OfferContext ctx) {
        Long actualCount = ctx.getTodaysOrderCount("Banana");
        return actualCount == 3;
    }
}
