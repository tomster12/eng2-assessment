package uk.ac.york.eng2.products.offers;

public interface OfferRuleCondition {
    boolean matches(OfferContext ctx);
}