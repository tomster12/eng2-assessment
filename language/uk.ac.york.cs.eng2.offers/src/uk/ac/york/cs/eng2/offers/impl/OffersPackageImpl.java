/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.york.cs.eng2.offers.Action;
import uk.ac.york.cs.eng2.offers.Catalogue;
import uk.ac.york.cs.eng2.offers.Category;
import uk.ac.york.cs.eng2.offers.Condition;
import uk.ac.york.cs.eng2.offers.ContainsTargetCondition;
import uk.ac.york.cs.eng2.offers.MaxDailyProductOrdersCondition;
import uk.ac.york.cs.eng2.offers.MinimumTotalOrderCondition;
import uk.ac.york.cs.eng2.offers.OfferRule;
import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.Product;
import uk.ac.york.cs.eng2.offers.ProductInCategoryTarget;
import uk.ac.york.cs.eng2.offers.ProductTarget;
import uk.ac.york.cs.eng2.offers.ProductWithTagTarget;
import uk.ac.york.cs.eng2.offers.RecurringYearlyDateCondition;
import uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction;
import uk.ac.york.cs.eng2.offers.Tag;
import uk.ac.york.cs.eng2.offers.Target;
import uk.ac.york.cs.eng2.offers.TargetPercentDiscountAction;
import uk.ac.york.cs.eng2.offers.TotalAbsoluteDiscountAction;
import uk.ac.york.cs.eng2.offers.TotalPercentDiscountAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OffersPackageImpl extends EPackageImpl implements OffersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInCategoryTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productWithTagTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsTargetConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxDailyProductOrdersConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minimumTotalOrderConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recurringYearlyDateConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass totalPercentDiscountActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass totalAbsoluteDiscountActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetPercentDiscountActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replaceTargetCostActionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OffersPackageImpl() {
		super(eNS_URI, OffersFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OffersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OffersPackage init() {
		if (isInited) return (OffersPackage)EPackage.Registry.INSTANCE.getEPackage(OffersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOffersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OffersPackageImpl theOffersPackage = registeredOffersPackage instanceof OffersPackageImpl ? (OffersPackageImpl)registeredOffersPackage : new OffersPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOffersPackage.createPackageContents();

		// Initialize created meta-data
		theOffersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOffersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OffersPackage.eNS_URI, theOffersPackage);
		return theOffersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalogue() {
		return catalogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogue_Products() {
		return (EReference)catalogueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogue_Categories() {
		return (EReference)catalogueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogue_Tags() {
		return (EReference)catalogueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogue_Rules() {
		return (EReference)catalogueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Name() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Category() {
		return (EReference)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Tags() {
		return (EReference)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategory_Name() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCategory_Subcategories() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_Name() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOfferRule() {
		return offerRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfferRule_Name() {
		return (EAttribute)offerRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOfferRule_Conditions() {
		return (EReference)offerRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOfferRule_Actions() {
		return (EReference)offerRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOfferRule_TriggersIfMatch() {
		return (EReference)offerRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOfferRule_TriggersIfNotMatch() {
		return (EReference)offerRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOfferRule_TriggersAlways() {
		return (EReference)offerRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTarget() {
		return targetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductTarget() {
		return productTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductTarget_Product() {
		return (EReference)productTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductInCategoryTarget() {
		return productInCategoryTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductInCategoryTarget_Category() {
		return (EReference)productInCategoryTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductWithTagTarget() {
		return productWithTagTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductWithTagTarget_Tags() {
		return (EReference)productWithTagTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainsTargetCondition() {
		return containsTargetConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainsTargetCondition_Target() {
		return (EReference)containsTargetConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainsTargetCondition_MinCount() {
		return (EAttribute)containsTargetConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaxDailyProductOrdersCondition() {
		return maxDailyProductOrdersConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMaxDailyProductOrdersCondition_Product() {
		return (EReference)maxDailyProductOrdersConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaxDailyProductOrdersCondition_MaxCount() {
		return (EAttribute)maxDailyProductOrdersConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMinimumTotalOrderCondition() {
		return minimumTotalOrderConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMinimumTotalOrderCondition_Total() {
		return (EAttribute)minimumTotalOrderConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecurringYearlyDateCondition() {
		return recurringYearlyDateConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecurringYearlyDateCondition_Month() {
		return (EAttribute)recurringYearlyDateConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecurringYearlyDateCondition_Day() {
		return (EAttribute)recurringYearlyDateConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTotalPercentDiscountAction() {
		return totalPercentDiscountActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTotalPercentDiscountAction_Percentage() {
		return (EAttribute)totalPercentDiscountActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTotalAbsoluteDiscountAction() {
		return totalAbsoluteDiscountActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTotalAbsoluteDiscountAction_Amount() {
		return (EAttribute)totalAbsoluteDiscountActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetPercentDiscountAction() {
		return targetPercentDiscountActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetPercentDiscountAction_Target() {
		return (EReference)targetPercentDiscountActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetPercentDiscountAction_Percentage() {
		return (EAttribute)targetPercentDiscountActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReplaceTargetCostAction() {
		return replaceTargetCostActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReplaceTargetCostAction_Target() {
		return (EReference)replaceTargetCostActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReplaceTargetCostAction_MaxCount() {
		return (EAttribute)replaceTargetCostActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReplaceTargetCostAction_Cost() {
		return (EAttribute)replaceTargetCostActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OffersFactory getOffersFactory() {
		return (OffersFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		catalogueEClass = createEClass(CATALOGUE);
		createEReference(catalogueEClass, CATALOGUE__PRODUCTS);
		createEReference(catalogueEClass, CATALOGUE__CATEGORIES);
		createEReference(catalogueEClass, CATALOGUE__TAGS);
		createEReference(catalogueEClass, CATALOGUE__RULES);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__NAME);
		createEReference(productEClass, PRODUCT__CATEGORY);
		createEReference(productEClass, PRODUCT__TAGS);

		categoryEClass = createEClass(CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__NAME);
		createEReference(categoryEClass, CATEGORY__SUBCATEGORIES);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__NAME);

		offerRuleEClass = createEClass(OFFER_RULE);
		createEAttribute(offerRuleEClass, OFFER_RULE__NAME);
		createEReference(offerRuleEClass, OFFER_RULE__CONDITIONS);
		createEReference(offerRuleEClass, OFFER_RULE__ACTIONS);
		createEReference(offerRuleEClass, OFFER_RULE__TRIGGERS_IF_MATCH);
		createEReference(offerRuleEClass, OFFER_RULE__TRIGGERS_IF_NOT_MATCH);
		createEReference(offerRuleEClass, OFFER_RULE__TRIGGERS_ALWAYS);

		targetEClass = createEClass(TARGET);

		productTargetEClass = createEClass(PRODUCT_TARGET);
		createEReference(productTargetEClass, PRODUCT_TARGET__PRODUCT);

		productInCategoryTargetEClass = createEClass(PRODUCT_IN_CATEGORY_TARGET);
		createEReference(productInCategoryTargetEClass, PRODUCT_IN_CATEGORY_TARGET__CATEGORY);

		productWithTagTargetEClass = createEClass(PRODUCT_WITH_TAG_TARGET);
		createEReference(productWithTagTargetEClass, PRODUCT_WITH_TAG_TARGET__TAGS);

		conditionEClass = createEClass(CONDITION);

		containsTargetConditionEClass = createEClass(CONTAINS_TARGET_CONDITION);
		createEReference(containsTargetConditionEClass, CONTAINS_TARGET_CONDITION__TARGET);
		createEAttribute(containsTargetConditionEClass, CONTAINS_TARGET_CONDITION__MIN_COUNT);

		maxDailyProductOrdersConditionEClass = createEClass(MAX_DAILY_PRODUCT_ORDERS_CONDITION);
		createEReference(maxDailyProductOrdersConditionEClass, MAX_DAILY_PRODUCT_ORDERS_CONDITION__PRODUCT);
		createEAttribute(maxDailyProductOrdersConditionEClass, MAX_DAILY_PRODUCT_ORDERS_CONDITION__MAX_COUNT);

		minimumTotalOrderConditionEClass = createEClass(MINIMUM_TOTAL_ORDER_CONDITION);
		createEAttribute(minimumTotalOrderConditionEClass, MINIMUM_TOTAL_ORDER_CONDITION__TOTAL);

		recurringYearlyDateConditionEClass = createEClass(RECURRING_YEARLY_DATE_CONDITION);
		createEAttribute(recurringYearlyDateConditionEClass, RECURRING_YEARLY_DATE_CONDITION__MONTH);
		createEAttribute(recurringYearlyDateConditionEClass, RECURRING_YEARLY_DATE_CONDITION__DAY);

		actionEClass = createEClass(ACTION);

		totalPercentDiscountActionEClass = createEClass(TOTAL_PERCENT_DISCOUNT_ACTION);
		createEAttribute(totalPercentDiscountActionEClass, TOTAL_PERCENT_DISCOUNT_ACTION__PERCENTAGE);

		totalAbsoluteDiscountActionEClass = createEClass(TOTAL_ABSOLUTE_DISCOUNT_ACTION);
		createEAttribute(totalAbsoluteDiscountActionEClass, TOTAL_ABSOLUTE_DISCOUNT_ACTION__AMOUNT);

		targetPercentDiscountActionEClass = createEClass(TARGET_PERCENT_DISCOUNT_ACTION);
		createEReference(targetPercentDiscountActionEClass, TARGET_PERCENT_DISCOUNT_ACTION__TARGET);
		createEAttribute(targetPercentDiscountActionEClass, TARGET_PERCENT_DISCOUNT_ACTION__PERCENTAGE);

		replaceTargetCostActionEClass = createEClass(REPLACE_TARGET_COST_ACTION);
		createEReference(replaceTargetCostActionEClass, REPLACE_TARGET_COST_ACTION__TARGET);
		createEAttribute(replaceTargetCostActionEClass, REPLACE_TARGET_COST_ACTION__MAX_COUNT);
		createEAttribute(replaceTargetCostActionEClass, REPLACE_TARGET_COST_ACTION__COST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		productTargetEClass.getESuperTypes().add(this.getTarget());
		productInCategoryTargetEClass.getESuperTypes().add(this.getTarget());
		productWithTagTargetEClass.getESuperTypes().add(this.getTarget());
		containsTargetConditionEClass.getESuperTypes().add(this.getCondition());
		maxDailyProductOrdersConditionEClass.getESuperTypes().add(this.getCondition());
		minimumTotalOrderConditionEClass.getESuperTypes().add(this.getCondition());
		recurringYearlyDateConditionEClass.getESuperTypes().add(this.getCondition());
		totalPercentDiscountActionEClass.getESuperTypes().add(this.getAction());
		totalAbsoluteDiscountActionEClass.getESuperTypes().add(this.getAction());
		targetPercentDiscountActionEClass.getESuperTypes().add(this.getAction());
		replaceTargetCostActionEClass.getESuperTypes().add(this.getAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(catalogueEClass, Catalogue.class, "Catalogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalogue_Products(), this.getProduct(), null, "products", null, 0, -1, Catalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogue_Categories(), this.getCategory(), null, "categories", null, 0, -1, Catalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogue_Tags(), this.getTag(), null, "tags", null, 0, -1, Catalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogue_Rules(), this.getOfferRule(), null, "rules", null, 0, -1, Catalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_Name(), ecorePackage.getEString(), "name", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Category(), this.getCategory(), null, "category", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Tags(), this.getTag(), null, "tags", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategory_Name(), ecorePackage.getEString(), "name", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_Subcategories(), this.getCategory(), null, "subcategories", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offerRuleEClass, OfferRule.class, "OfferRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOfferRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, OfferRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOfferRule_Conditions(), this.getCondition(), null, "conditions", null, 0, -1, OfferRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOfferRule_Actions(), this.getAction(), null, "actions", null, 0, -1, OfferRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOfferRule_TriggersIfMatch(), this.getOfferRule(), null, "triggersIfMatch", null, 0, 1, OfferRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOfferRule_TriggersIfNotMatch(), this.getOfferRule(), null, "triggersIfNotMatch", null, 0, 1, OfferRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOfferRule_TriggersAlways(), this.getOfferRule(), null, "triggersAlways", null, 0, 1, OfferRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetEClass, Target.class, "Target", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(productTargetEClass, ProductTarget.class, "ProductTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductTarget_Product(), this.getProduct(), null, "product", null, 0, 1, ProductTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productInCategoryTargetEClass, ProductInCategoryTarget.class, "ProductInCategoryTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductInCategoryTarget_Category(), this.getCategory(), null, "category", null, 0, 1, ProductInCategoryTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productWithTagTargetEClass, ProductWithTagTarget.class, "ProductWithTagTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductWithTagTarget_Tags(), this.getTag(), null, "tags", null, 0, -1, ProductWithTagTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containsTargetConditionEClass, ContainsTargetCondition.class, "ContainsTargetCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainsTargetCondition_Target(), this.getTarget(), null, "target", null, 0, 1, ContainsTargetCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainsTargetCondition_MinCount(), ecorePackage.getEInt(), "minCount", null, 0, 1, ContainsTargetCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxDailyProductOrdersConditionEClass, MaxDailyProductOrdersCondition.class, "MaxDailyProductOrdersCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaxDailyProductOrdersCondition_Product(), this.getProduct(), null, "product", null, 0, 1, MaxDailyProductOrdersCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaxDailyProductOrdersCondition_MaxCount(), ecorePackage.getEInt(), "maxCount", null, 0, 1, MaxDailyProductOrdersCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minimumTotalOrderConditionEClass, MinimumTotalOrderCondition.class, "MinimumTotalOrderCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinimumTotalOrderCondition_Total(), ecorePackage.getEDouble(), "total", null, 0, 1, MinimumTotalOrderCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recurringYearlyDateConditionEClass, RecurringYearlyDateCondition.class, "RecurringYearlyDateCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecurringYearlyDateCondition_Month(), ecorePackage.getEInt(), "month", null, 0, 1, RecurringYearlyDateCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecurringYearlyDateCondition_Day(), ecorePackage.getEInt(), "day", null, 0, 1, RecurringYearlyDateCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(totalPercentDiscountActionEClass, TotalPercentDiscountAction.class, "TotalPercentDiscountAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTotalPercentDiscountAction_Percentage(), ecorePackage.getEDouble(), "percentage", null, 0, 1, TotalPercentDiscountAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(totalAbsoluteDiscountActionEClass, TotalAbsoluteDiscountAction.class, "TotalAbsoluteDiscountAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTotalAbsoluteDiscountAction_Amount(), ecorePackage.getEDouble(), "amount", null, 0, 1, TotalAbsoluteDiscountAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetPercentDiscountActionEClass, TargetPercentDiscountAction.class, "TargetPercentDiscountAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetPercentDiscountAction_Target(), this.getTarget(), null, "target", null, 0, 1, TargetPercentDiscountAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetPercentDiscountAction_Percentage(), ecorePackage.getEDouble(), "percentage", null, 0, 1, TargetPercentDiscountAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replaceTargetCostActionEClass, ReplaceTargetCostAction.class, "ReplaceTargetCostAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReplaceTargetCostAction_Target(), this.getTarget(), null, "target", null, 0, 1, ReplaceTargetCostAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReplaceTargetCostAction_MaxCount(), ecorePackage.getEInt(), "maxCount", null, 0, 1, ReplaceTargetCostAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReplaceTargetCostAction_Cost(), ecorePackage.getEDouble(), "cost", null, 0, 1, ReplaceTargetCostAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OffersPackageImpl
