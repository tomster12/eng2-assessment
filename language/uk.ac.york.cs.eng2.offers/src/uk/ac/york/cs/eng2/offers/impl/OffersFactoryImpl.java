/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.york.cs.eng2.offers.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OffersFactoryImpl extends EFactoryImpl implements OffersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OffersFactory init() {
		try {
			OffersFactory theOffersFactory = (OffersFactory)EPackage.Registry.INSTANCE.getEFactory(OffersPackage.eNS_URI);
			if (theOffersFactory != null) {
				return theOffersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OffersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OffersPackage.CATALOGUE: return createCatalogue();
			case OffersPackage.PRODUCT: return createProduct();
			case OffersPackage.CATEGORY: return createCategory();
			case OffersPackage.TAG: return createTag();
			case OffersPackage.OFFER_RULE: return createOfferRule();
			case OffersPackage.PRODUCT_TARGET: return createProductTarget();
			case OffersPackage.PRODUCT_IN_CATEGORY_TARGET: return createProductInCategoryTarget();
			case OffersPackage.PRODUCT_WITH_TAG_TARGET: return createProductWithTagTarget();
			case OffersPackage.CONTAINS_TARGET_CONDITION: return createContainsTargetCondition();
			case OffersPackage.MAX_DAILY_PRODUCT_ORDERS_CONDITION: return createMaxDailyProductOrdersCondition();
			case OffersPackage.MINIMUM_TOTAL_ORDER_CONDITION: return createMinimumTotalOrderCondition();
			case OffersPackage.RECURRING_YEARLY_DATE_CONDITION: return createRecurringYearlyDateCondition();
			case OffersPackage.TOTAL_PERCENT_DISCOUNT_ACTION: return createTotalPercentDiscountAction();
			case OffersPackage.TOTAL_ABSOLUTE_DISCOUNT_ACTION: return createTotalAbsoluteDiscountAction();
			case OffersPackage.TARGET_PERCENT_DISCOUNT_ACTION: return createTargetPercentDiscountAction();
			case OffersPackage.REPLACE_TARGET_COST_ACTION: return createReplaceTargetCostAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalogue createCatalogue() {
		CatalogueImpl catalogue = new CatalogueImpl();
		return catalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OfferRule createOfferRule() {
		OfferRuleImpl offerRule = new OfferRuleImpl();
		return offerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductTarget createProductTarget() {
		ProductTargetImpl productTarget = new ProductTargetImpl();
		return productTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductInCategoryTarget createProductInCategoryTarget() {
		ProductInCategoryTargetImpl productInCategoryTarget = new ProductInCategoryTargetImpl();
		return productInCategoryTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductWithTagTarget createProductWithTagTarget() {
		ProductWithTagTargetImpl productWithTagTarget = new ProductWithTagTargetImpl();
		return productWithTagTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainsTargetCondition createContainsTargetCondition() {
		ContainsTargetConditionImpl containsTargetCondition = new ContainsTargetConditionImpl();
		return containsTargetCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaxDailyProductOrdersCondition createMaxDailyProductOrdersCondition() {
		MaxDailyProductOrdersConditionImpl maxDailyProductOrdersCondition = new MaxDailyProductOrdersConditionImpl();
		return maxDailyProductOrdersCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinimumTotalOrderCondition createMinimumTotalOrderCondition() {
		MinimumTotalOrderConditionImpl minimumTotalOrderCondition = new MinimumTotalOrderConditionImpl();
		return minimumTotalOrderCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurringYearlyDateCondition createRecurringYearlyDateCondition() {
		RecurringYearlyDateConditionImpl recurringYearlyDateCondition = new RecurringYearlyDateConditionImpl();
		return recurringYearlyDateCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TotalPercentDiscountAction createTotalPercentDiscountAction() {
		TotalPercentDiscountActionImpl totalPercentDiscountAction = new TotalPercentDiscountActionImpl();
		return totalPercentDiscountAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TotalAbsoluteDiscountAction createTotalAbsoluteDiscountAction() {
		TotalAbsoluteDiscountActionImpl totalAbsoluteDiscountAction = new TotalAbsoluteDiscountActionImpl();
		return totalAbsoluteDiscountAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetPercentDiscountAction createTargetPercentDiscountAction() {
		TargetPercentDiscountActionImpl targetPercentDiscountAction = new TargetPercentDiscountActionImpl();
		return targetPercentDiscountAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReplaceTargetCostAction createReplaceTargetCostAction() {
		ReplaceTargetCostActionImpl replaceTargetCostAction = new ReplaceTargetCostActionImpl();
		return replaceTargetCostAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OffersPackage getOffersPackage() {
		return (OffersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OffersPackage getPackage() {
		return OffersPackage.eINSTANCE;
	}

} //OffersFactoryImpl
