package uk.ac.york.eng2.products.offers.impl.condition;

import uk.ac.york.eng2.products.offers.OfferContext;
import uk.ac.york.eng2.products.offers.OfferRuleCondition;
import uk.ac.york.eng2.products.offers.OfferTarget;

import java.util.List;

public class ContainsTargetCondition implements OfferRuleCondition {
    private final OfferTarget target;
    private final int minCount;

    public ContainsTargetCondition(OfferTarget target, int minCount) {
        this.target = target;
        this.minCount = minCount;
    }

    public boolean matches(OfferContext ctx) {
        List<OfferContext.IndividualProductOrder> targets = target.resolve(ctx);
        System.out.println("ContainsTargetCondition '" + this.target.toString() + "' checking " + targets.size() + " >= " + minCount);
        return targets.size() >= minCount;
    }
}
