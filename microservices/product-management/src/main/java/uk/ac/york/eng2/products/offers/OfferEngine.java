package uk.ac.york.eng2.products.offers;

import jakarta.inject.Singleton;
import org.flywaydb.core.internal.util.Pair;
import uk.ac.york.eng2.products.domain.Product;

import java.math.BigDecimal;
import java.util.List;

@Singleton
public class OfferEngine {

    private final OfferRule initialRule;

    public OfferEngine() {
        this.initialRule = OfferDefinitions.initializeOfferGraph();
    }

    public void applyOffers(OfferContext ctx) {
        ctx.totalPrice = BigDecimal.ZERO;

        for (OfferContext.ProductOrder order : ctx.productOrders) {
            ctx.totalPrice = ctx.totalPrice.add(order.currentPrice);
        }

        System.out.println("Price before: " + ctx.totalPrice);

        if (initialRule != null) {
            initialRule.apply(ctx);
        }

        System.out.println("Price after: " + ctx.totalPrice);
    }
}
