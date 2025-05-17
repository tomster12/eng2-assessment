package uk.ac.york.eng2.products.offers.impl.action;

import uk.ac.york.eng2.products.offers.OfferContext;
import uk.ac.york.eng2.products.offers.OfferRuleAction;
import uk.ac.york.eng2.products.offers.OfferTarget;

import java.math.BigDecimal;
import java.util.List;

public class ReplaceTargetCostAction implements OfferRuleAction {
    private final OfferTarget target;
    private final int maxCount;
    private final double cost;

    public ReplaceTargetCostAction(OfferTarget target, int maxCount, double cost) {
        this.target = target;
        this.maxCount = maxCount;
        this.cost = cost;
    }

    @Override
    public void apply(OfferContext ctx) {
        System.out.println("ReplaceTargetCostAction Applying replace cost: " + cost + " with max count: " + maxCount);
        int countRemaining = maxCount;
        List<OfferContext.ProductOrder> targets = target.resolve(ctx);
        for (OfferContext.ProductOrder order : targets) {
            BigDecimal targetCost = BigDecimal.valueOf(cost);
            BigDecimal difference = targetCost.subtract(order.currentPrice);
            order.currentPrice = targetCost;
            System.out.println("- Applying replace cost to product order: " + order + ", discount: " + difference);
            ctx.totalPrice = ctx.totalPrice.add(difference);
            countRemaining--;
            if (countRemaining <= 0) break;
        }
    }
}
