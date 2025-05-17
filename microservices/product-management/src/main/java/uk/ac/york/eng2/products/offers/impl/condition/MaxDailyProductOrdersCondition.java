package uk.ac.york.eng2.products.offers.impl.condition;

import uk.ac.york.eng2.products.offers.OfferContext;
import uk.ac.york.eng2.products.offers.OfferRuleCondition;

public class MaxDailyProductOrdersCondition implements OfferRuleCondition {
    private final String productName;
    private final Long maxCount;

    public MaxDailyProductOrdersCondition(String productName, Long maxCount) {
        this.productName = productName;
        this.maxCount = maxCount;
    }

    @Override
    public boolean matches(OfferContext ctx) {
        Long actualCount = ctx.getTodaysOrderCount(productName);
        System.out.println("MaxDailyProductOrdersCondition product '" + productName + "' checking " + actualCount + " <= " + maxCount);
        return actualCount <= maxCount;
    }
}