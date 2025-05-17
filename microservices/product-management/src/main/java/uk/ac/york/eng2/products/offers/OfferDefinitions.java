package uk.ac.york.eng2.products.offers;

import uk.ac.york.eng2.products.offers.impl.condition.ContainsTargetCondition;
import uk.ac.york.eng2.products.offers.impl.condition.MaxDailyProductOrdersCondition;
import uk.ac.york.eng2.products.offers.impl.condition.MinimumTotalOrderCondition;
import uk.ac.york.eng2.products.offers.impl.condition.RecurringYearlyDateCondition;
import uk.ac.york.eng2.products.offers.impl.action.ReplaceTargetCostAction;
import uk.ac.york.eng2.products.offers.impl.action.TargetPercentDiscountAction;
import uk.ac.york.eng2.products.offers.impl.action.TotalAbsoluteDiscountAction;
import uk.ac.york.eng2.products.offers.impl.action.TotalPercentDiscountAction;
import uk.ac.york.eng2.products.offers.impl.target.ProductOfferTarget;
import uk.ac.york.eng2.products.offers.impl.target.ProductWithTagOfferTarget;

import java.util.List;

// protected region user-imports on begin
import uk.ac.york.eng2.products.offers.userimpl.DoubleBananaCostAction;
import uk.ac.york.eng2.products.offers.userimpl.OrderedThreeBananasCondition;
// protected region user-imports end

public class OfferDefinitions {

	public static OfferRule initializeOfferGraph() {
		OfferRule initialRule = null;

		OfferRule ruleBakewellSpecial = new OfferRule("Bakewell Special");
		ruleBakewellSpecial.addCondition(new ContainsTargetCondition(new ProductOfferTarget("Bakewell Tart"), 1));
		ruleBakewellSpecial.addCondition(new MaxDailyProductOrdersCondition("Bakewell Tart", 10L));
		ruleBakewellSpecial.addAction(new TargetPercentDiscountAction(new ProductOfferTarget("Bakewell Tart"), 10.0));

		initialRule = ruleBakewellSpecial;

		OfferRule ruleLargePizzaIcecream = new OfferRule("Large Pizza + Icecream");
		ruleLargePizzaIcecream.addCondition(new ContainsTargetCondition(new ProductWithTagOfferTarget(List.of("Large", "Pizza")), 2));
		ruleLargePizzaIcecream.addAction(new ReplaceTargetCostAction(new ProductWithTagOfferTarget(List.of("Large", "Pizza")), 2, 5.0));
		ruleLargePizzaIcecream.addAction(new ReplaceTargetCostAction(new ProductWithTagOfferTarget(List.of("Ice Cream")), 1, 0.0));

		OfferRule rule241Pizza = new OfferRule("241 Pizza");
		rule241Pizza.addCondition(new ContainsTargetCondition(new ProductWithTagOfferTarget(List.of("Pizza")), 2));
		rule241Pizza.addAction(new ReplaceTargetCostAction(new ProductWithTagOfferTarget(List.of("Pizza")), 1, 0.0));

		OfferRule ruleChristmasDiscount = new OfferRule("Christmas Discount");
		ruleChristmasDiscount.addCondition(new MinimumTotalOrderCondition(60.0));
		ruleChristmasDiscount.addCondition(new RecurringYearlyDateCondition(12, 25));
		ruleChristmasDiscount.addAction(new TotalPercentDiscountAction(10.0));

		OfferRule ruleChocolateDeal = new OfferRule("Chocolate Deal");
		ruleChocolateDeal.addCondition(new ContainsTargetCondition(new ProductWithTagOfferTarget(List.of("Chocolate", "Cake")), 1));
		ruleChocolateDeal.addCondition(new MinimumTotalOrderCondition(50.0));
		ruleChocolateDeal.addAction(new TotalAbsoluteDiscountAction(5.0));

		ruleBakewellSpecial.setTriggersAlways(ruleLargePizzaIcecream);
		ruleLargePizzaIcecream.setTriggersIfMatch(ruleChristmasDiscount);
		ruleLargePizzaIcecream.setTriggersIfNotMatch(rule241Pizza);
		rule241Pizza.setTriggersAlways(ruleChristmasDiscount);
		ruleChristmasDiscount.setTriggersIfNotMatch(ruleChocolateDeal);

		// protected region user-offer-rules on begin
		OfferRule ruleBadBananas = new OfferRule("Bad Bananas");
		ruleBadBananas.addCondition(new OrderedThreeBananasCondition());
		ruleBadBananas.addAction(new DoubleBananaCostAction());
		ruleChocolateDeal.setTriggersAlways(ruleBadBananas);
		// protected region user-offer-rules end

		return initialRule;
	}
}