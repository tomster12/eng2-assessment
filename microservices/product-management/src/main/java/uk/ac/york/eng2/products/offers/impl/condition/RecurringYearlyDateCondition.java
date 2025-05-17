package uk.ac.york.eng2.products.offers.impl.condition;

import uk.ac.york.eng2.products.offers.OfferContext;
import uk.ac.york.eng2.products.offers.OfferRuleCondition;

import java.time.LocalDate;

public class RecurringYearlyDateCondition implements OfferRuleCondition {
    private final int month;
    private final int day;

    public RecurringYearlyDateCondition(int month, int day) {
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean matches(OfferContext ctx) {
        LocalDate today = LocalDate.now();
        System.out.println("RecurringYearlyDateCondition checking " + today.toString() + " == " + month + ", " + day);
        return today.getMonthValue() == month && today.getDayOfMonth() == day;
    }
}