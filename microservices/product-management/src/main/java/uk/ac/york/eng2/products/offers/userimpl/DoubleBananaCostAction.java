package uk.ac.york.eng2.products.offers.userimpl;

import uk.ac.york.eng2.products.offers.OfferContext;
import uk.ac.york.eng2.products.offers.OfferRuleAction;
import uk.ac.york.eng2.products.offers.OfferTarget;
import uk.ac.york.eng2.products.offers.impl.target.ProductOfferTarget;

import java.math.BigDecimal;
import java.util.List;

public class DoubleBananaCostAction implements OfferRuleAction {
    private final OfferTarget target;

    public DoubleBananaCostAction() {
        target = new ProductOfferTarget("Banana");
    }

    @Override
    public void apply(OfferContext ctx) {
        List<OfferContext.IndividualProductOrder> targets = target.resolve(ctx);
        for (OfferContext.IndividualProductOrder order : targets) {
            BigDecimal change = order.currentPrice;
            order.currentPrice = order.currentPrice.add(change);
            ctx.totalPrice = ctx.totalPrice.add(change);
        }
    }
}
