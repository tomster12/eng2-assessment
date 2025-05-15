package uk.ac.york.eng2.products.offers;

import jakarta.inject.Singleton;
import org.flywaydb.core.internal.util.Pair;
import uk.ac.york.eng2.products.domain.Product;

import java.math.BigDecimal;
import java.util.List;

@Singleton
public class OfferEngine {

    private OfferRule initialRule;

    public OfferEngine() {
        this.initialRule = OfferDefinitions.initializeOfferGraph();
    }

    public void applyOffers(OfferContext ctx) {
        ctx.totalPrice = BigDecimal.ZERO;

        for (OfferContext.ProductOrder order : ctx.productOrders) {
            BigDecimal quantity = BigDecimal.valueOf(order.quantity);
            ctx.totalPrice = ctx.totalPrice.add(order.currentPrice.multiply(quantity));
        }

        if (initialRule != null) {
            initialRule.apply(ctx);
        }
    }
}
