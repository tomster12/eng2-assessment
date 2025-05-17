package uk.ac.york.eng2.products.offers.impl.action;

import uk.ac.york.eng2.products.offers.OfferContext;
import uk.ac.york.eng2.products.offers.OfferRuleAction;

import java.math.BigDecimal;

public class TotalAbsoluteDiscountAction implements OfferRuleAction {
    private final double amount;

    public TotalAbsoluteDiscountAction(double amount) {
        this.amount = amount;
    }

    @Override
    public void apply(OfferContext ctx) {
        System.out.println("TotalAbsoluteDiscountAction Applying total absolute discount: " + amount);
        ctx.totalPrice = ctx.totalPrice.subtract(BigDecimal.valueOf(amount));
    }
}
