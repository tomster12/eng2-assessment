package uk.ac.york.eng2.products.offers.impl.action;

import uk.ac.york.eng2.products.offers.OfferContext;
import uk.ac.york.eng2.products.offers.OfferRuleAction;
import uk.ac.york.eng2.products.offers.OfferTarget;

import java.math.BigDecimal;
import java.util.List;

public class TargetPercentDiscountAction implements OfferRuleAction {
    private final OfferTarget target;
    private final double percentage;

    public TargetPercentDiscountAction(OfferTarget target, double percentage) {
        this.target = target;
        this.percentage = percentage;
    }

    @Override
    public void apply(OfferContext ctx) {
        List<OfferContext.ProductOrder> targets = target.resolve(ctx);

        for (OfferContext.ProductOrder order : ctx.productOrders) {
            if (targets.contains(order)) {
                BigDecimal discount = order.currentPrice.multiply(BigDecimal.valueOf(percentage / 100.0));
                order.currentPrice = order.currentPrice.subtract(discount);
                ctx.totalPrice = ctx.totalPrice.subtract(discount);
            }
        }
    }
}
