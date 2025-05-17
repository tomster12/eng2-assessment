package uk.ac.york.eng2.products.offers.impl.action;

import uk.ac.york.eng2.products.offers.OfferContext;
import uk.ac.york.eng2.products.offers.OfferRuleAction;

import java.math.BigDecimal;

public class TotalPercentDiscountAction implements OfferRuleAction {
    private final double percentage;

    public TotalPercentDiscountAction(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public void apply(OfferContext ctx) {
        System.out.println("TotalPercentDiscountAction Applying total absolute discount: " + percentage);
        BigDecimal discount = ctx.totalPrice.multiply(BigDecimal.valueOf(percentage / 100.0));
        ctx.totalPrice = ctx.totalPrice.subtract(discount);
    }
}
