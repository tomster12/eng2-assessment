package uk.ac.york.eng2.products.offers.impl.condition;

import uk.ac.york.eng2.products.offers.OfferContext;
import uk.ac.york.eng2.products.offers.OfferRuleCondition;

public class MinimumTotalOrderCondition implements OfferRuleCondition {
    private final double total;

    public MinimumTotalOrderCondition(double total) {
        this.total = total;
    }

    public boolean matches(OfferContext ctx) {
        return ctx.totalPrice.doubleValue() >= total;
    }
}
