package uk.ac.york.eng2.products.offers;

import java.util.ArrayList;
import java.util.List;

public class OfferRule {
    private String name;
    private final List<OfferRuleCondition> conditions = new ArrayList<>();
    private final List<OfferRuleAction> actions = new ArrayList<>();

    private OfferRule triggersIfMatch;
    private OfferRule triggersIfNotMatch;
    private OfferRule triggersAlways;

    public OfferRule(String name) {
        this.name = name;
    }

    public void addCondition(OfferRuleCondition condition) {
        conditions.add(condition);
    }

    public void addAction(OfferRuleAction action) {
        actions.add(action);
    }

    public void setTriggersIfMatch(OfferRule rule) {
        this.triggersIfMatch = rule;
    }

    public void setTriggersIfNotMatch(OfferRule rule) {
        this.triggersIfNotMatch = rule;
    }

    public void setTriggersAlways(OfferRule rule) {
        this.triggersAlways = rule;
    }

    public void apply(OfferContext ctx) {
        System.out.println("Applying rule " + name);

        boolean allMatch = true;
        for (OfferRuleCondition condition : conditions) {
            allMatch &= condition.matches(ctx);
        }

        System.out.println("Conditions matched " + allMatch);

        if (allMatch) {
            for (OfferRuleAction action : actions) {
                action.apply(ctx);
            }
        }

        if (allMatch && triggersIfMatch != null) triggersIfMatch.apply(ctx);
        else if (!allMatch && triggersIfNotMatch != null) triggersIfNotMatch.apply(ctx);
        if (triggersAlways != null) triggersAlways.apply(ctx);
    }
}
