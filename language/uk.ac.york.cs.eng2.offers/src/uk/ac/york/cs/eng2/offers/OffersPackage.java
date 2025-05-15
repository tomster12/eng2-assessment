/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.eng2.offers.OffersFactory
 * @model kind="package"
 * @generated
 */
public interface OffersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "offers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.york.ac.uk/eng2/202425/offers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OffersPackage eINSTANCE = uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.CatalogueImpl <em>Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.CatalogueImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCatalogue()
	 * @generated
	 */
	int CATALOGUE = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__PRODUCTS = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__CATEGORIES = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__TAGS = 2;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__RULES = 3;

	/**
	 * The number of structural features of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ProductImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TAGS = 2;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.CategoryImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subcategories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SUBCATEGORIES = 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.TagImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl <em>Offer Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferRule()
	 * @generated
	 */
	int OFFER_RULE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE__CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE__ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Triggers If Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE__TRIGGERS_IF_MATCH = 3;

	/**
	 * The feature id for the '<em><b>Triggers If Not Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE__TRIGGERS_IF_NOT_MATCH = 4;

	/**
	 * The feature id for the '<em><b>Triggers Always</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE__TRIGGERS_ALWAYS = 5;

	/**
	 * The number of structural features of the '<em>Offer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Offer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.TargetImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 5;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductTargetImpl <em>Product Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ProductTargetImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductTarget()
	 * @generated
	 */
	int PRODUCT_TARGET = 6;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TARGET__PRODUCT = TARGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TARGET_FEATURE_COUNT = TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TARGET_OPERATION_COUNT = TARGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductInCategoryTargetImpl <em>Product In Category Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ProductInCategoryTargetImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductInCategoryTarget()
	 * @generated
	 */
	int PRODUCT_IN_CATEGORY_TARGET = 7;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_IN_CATEGORY_TARGET__CATEGORY = TARGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product In Category Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_IN_CATEGORY_TARGET_FEATURE_COUNT = TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product In Category Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_IN_CATEGORY_TARGET_OPERATION_COUNT = TARGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductWithTagTargetImpl <em>Product With Tag Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ProductWithTagTargetImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductWithTagTarget()
	 * @generated
	 */
	int PRODUCT_WITH_TAG_TARGET = 8;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_WITH_TAG_TARGET__TAGS = TARGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product With Tag Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_WITH_TAG_TARGET_FEATURE_COUNT = TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product With Tag Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_WITH_TAG_TARGET_OPERATION_COUNT = TARGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 9;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ContainsTargetConditionImpl <em>Contains Target Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ContainsTargetConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getContainsTargetCondition()
	 * @generated
	 */
	int CONTAINS_TARGET_CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_TARGET_CONDITION__TARGET = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_TARGET_CONDITION__MIN_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contains Target Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_TARGET_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Contains Target Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_TARGET_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.MaxDailyProductOrdersConditionImpl <em>Max Daily Product Orders Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.MaxDailyProductOrdersConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getMaxDailyProductOrdersCondition()
	 * @generated
	 */
	int MAX_DAILY_PRODUCT_ORDERS_CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_DAILY_PRODUCT_ORDERS_CONDITION__PRODUCT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_DAILY_PRODUCT_ORDERS_CONDITION__MAX_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Max Daily Product Orders Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_DAILY_PRODUCT_ORDERS_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Max Daily Product Orders Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_DAILY_PRODUCT_ORDERS_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.MinimumTotalOrderConditionImpl <em>Minimum Total Order Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.MinimumTotalOrderConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getMinimumTotalOrderCondition()
	 * @generated
	 */
	int MINIMUM_TOTAL_ORDER_CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_TOTAL_ORDER_CONDITION__TOTAL = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Minimum Total Order Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_TOTAL_ORDER_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Minimum Total Order Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_TOTAL_ORDER_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.RecurringYearlyDateConditionImpl <em>Recurring Yearly Date Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.RecurringYearlyDateConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getRecurringYearlyDateCondition()
	 * @generated
	 */
	int RECURRING_YEARLY_DATE_CONDITION = 13;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_YEARLY_DATE_CONDITION__MONTH = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_YEARLY_DATE_CONDITION__DAY = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Recurring Yearly Date Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_YEARLY_DATE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Recurring Yearly Date Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRING_YEARLY_DATE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 14;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.TotalPercentDiscountActionImpl <em>Total Percent Discount Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.TotalPercentDiscountActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTotalPercentDiscountAction()
	 * @generated
	 */
	int TOTAL_PERCENT_DISCOUNT_ACTION = 15;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PERCENT_DISCOUNT_ACTION__PERCENTAGE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Total Percent Discount Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PERCENT_DISCOUNT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Total Percent Discount Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PERCENT_DISCOUNT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.TotalAbsoluteDiscountActionImpl <em>Total Absolute Discount Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.TotalAbsoluteDiscountActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTotalAbsoluteDiscountAction()
	 * @generated
	 */
	int TOTAL_ABSOLUTE_DISCOUNT_ACTION = 16;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_ABSOLUTE_DISCOUNT_ACTION__AMOUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Total Absolute Discount Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_ABSOLUTE_DISCOUNT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Total Absolute Discount Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_ABSOLUTE_DISCOUNT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.TargetPercentDiscountActionImpl <em>Target Percent Discount Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.TargetPercentDiscountActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTargetPercentDiscountAction()
	 * @generated
	 */
	int TARGET_PERCENT_DISCOUNT_ACTION = 17;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PERCENT_DISCOUNT_ACTION__TARGET = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PERCENT_DISCOUNT_ACTION__PERCENTAGE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target Percent Discount Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PERCENT_DISCOUNT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Target Percent Discount Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PERCENT_DISCOUNT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ReplaceTargetCostActionImpl <em>Replace Target Cost Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ReplaceTargetCostActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getReplaceTargetCostAction()
	 * @generated
	 */
	int REPLACE_TARGET_COST_ACTION = 18;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TARGET_COST_ACTION__TARGET = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TARGET_COST_ACTION__MAX_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TARGET_COST_ACTION__COST = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Replace Target Cost Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TARGET_COST_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Replace Target Cost Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TARGET_COST_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Catalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogue</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Catalogue
	 * @generated
	 */
	EClass getCatalogue();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Catalogue#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Catalogue#getProducts()
	 * @see #getCatalogue()
	 * @generated
	 */
	EReference getCatalogue_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Catalogue#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Catalogue#getCategories()
	 * @see #getCatalogue()
	 * @generated
	 */
	EReference getCatalogue_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Catalogue#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Catalogue#getTags()
	 * @see #getCatalogue()
	 * @generated
	 */
	EReference getCatalogue_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Catalogue#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Catalogue#getRules()
	 * @see #getCatalogue()
	 * @generated
	 */
	EReference getCatalogue_Rules();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.Product#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product#getCategory()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Category();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.cs.eng2.offers.Product#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product#getTags()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Tags();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Category#getSubcategories <em>Subcategories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcategories</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category#getSubcategories()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Subcategories();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.OfferRule <em>Offer Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer Rule</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule
	 * @generated
	 */
	EClass getOfferRule();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.OfferRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule#getName()
	 * @see #getOfferRule()
	 * @generated
	 */
	EAttribute getOfferRule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.OfferRule#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule#getConditions()
	 * @see #getOfferRule()
	 * @generated
	 */
	EReference getOfferRule_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.OfferRule#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule#getActions()
	 * @see #getOfferRule()
	 * @generated
	 */
	EReference getOfferRule_Actions();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.OfferRule#getTriggersIfMatch <em>Triggers If Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggers If Match</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule#getTriggersIfMatch()
	 * @see #getOfferRule()
	 * @generated
	 */
	EReference getOfferRule_TriggersIfMatch();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.OfferRule#getTriggersIfNotMatch <em>Triggers If Not Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggers If Not Match</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule#getTriggersIfNotMatch()
	 * @see #getOfferRule()
	 * @generated
	 */
	EReference getOfferRule_TriggersIfNotMatch();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.OfferRule#getTriggersAlways <em>Triggers Always</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggers Always</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule#getTriggersAlways()
	 * @see #getOfferRule()
	 * @generated
	 */
	EReference getOfferRule_TriggersAlways();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.ProductTarget <em>Product Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Target</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductTarget
	 * @generated
	 */
	EClass getProductTarget();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.ProductTarget#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductTarget#getProduct()
	 * @see #getProductTarget()
	 * @generated
	 */
	EReference getProductTarget_Product();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.ProductInCategoryTarget <em>Product In Category Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product In Category Target</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductInCategoryTarget
	 * @generated
	 */
	EClass getProductInCategoryTarget();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.ProductInCategoryTarget#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductInCategoryTarget#getCategory()
	 * @see #getProductInCategoryTarget()
	 * @generated
	 */
	EReference getProductInCategoryTarget_Category();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.ProductWithTagTarget <em>Product With Tag Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product With Tag Target</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductWithTagTarget
	 * @generated
	 */
	EClass getProductWithTagTarget();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.cs.eng2.offers.ProductWithTagTarget#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductWithTagTarget#getTags()
	 * @see #getProductWithTagTarget()
	 * @generated
	 */
	EReference getProductWithTagTarget_Tags();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.ContainsTargetCondition <em>Contains Target Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains Target Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ContainsTargetCondition
	 * @generated
	 */
	EClass getContainsTargetCondition();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.cs.eng2.offers.ContainsTargetCondition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ContainsTargetCondition#getTarget()
	 * @see #getContainsTargetCondition()
	 * @generated
	 */
	EReference getContainsTargetCondition_Target();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.ContainsTargetCondition#getMinCount <em>Min Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Count</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ContainsTargetCondition#getMinCount()
	 * @see #getContainsTargetCondition()
	 * @generated
	 */
	EAttribute getContainsTargetCondition_MinCount();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.MaxDailyProductOrdersCondition <em>Max Daily Product Orders Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Daily Product Orders Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.MaxDailyProductOrdersCondition
	 * @generated
	 */
	EClass getMaxDailyProductOrdersCondition();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.MaxDailyProductOrdersCondition#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.MaxDailyProductOrdersCondition#getProduct()
	 * @see #getMaxDailyProductOrdersCondition()
	 * @generated
	 */
	EReference getMaxDailyProductOrdersCondition_Product();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.MaxDailyProductOrdersCondition#getMaxCount <em>Max Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Count</em>'.
	 * @see uk.ac.york.cs.eng2.offers.MaxDailyProductOrdersCondition#getMaxCount()
	 * @see #getMaxDailyProductOrdersCondition()
	 * @generated
	 */
	EAttribute getMaxDailyProductOrdersCondition_MaxCount();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.MinimumTotalOrderCondition <em>Minimum Total Order Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimum Total Order Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.MinimumTotalOrderCondition
	 * @generated
	 */
	EClass getMinimumTotalOrderCondition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.MinimumTotalOrderCondition#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see uk.ac.york.cs.eng2.offers.MinimumTotalOrderCondition#getTotal()
	 * @see #getMinimumTotalOrderCondition()
	 * @generated
	 */
	EAttribute getMinimumTotalOrderCondition_Total();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.RecurringYearlyDateCondition <em>Recurring Yearly Date Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recurring Yearly Date Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.RecurringYearlyDateCondition
	 * @generated
	 */
	EClass getRecurringYearlyDateCondition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.RecurringYearlyDateCondition#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see uk.ac.york.cs.eng2.offers.RecurringYearlyDateCondition#getMonth()
	 * @see #getRecurringYearlyDateCondition()
	 * @generated
	 */
	EAttribute getRecurringYearlyDateCondition_Month();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.RecurringYearlyDateCondition#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see uk.ac.york.cs.eng2.offers.RecurringYearlyDateCondition#getDay()
	 * @see #getRecurringYearlyDateCondition()
	 * @generated
	 */
	EAttribute getRecurringYearlyDateCondition_Day();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.TotalPercentDiscountAction <em>Total Percent Discount Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Total Percent Discount Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TotalPercentDiscountAction
	 * @generated
	 */
	EClass getTotalPercentDiscountAction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.TotalPercentDiscountAction#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TotalPercentDiscountAction#getPercentage()
	 * @see #getTotalPercentDiscountAction()
	 * @generated
	 */
	EAttribute getTotalPercentDiscountAction_Percentage();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.TotalAbsoluteDiscountAction <em>Total Absolute Discount Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Total Absolute Discount Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TotalAbsoluteDiscountAction
	 * @generated
	 */
	EClass getTotalAbsoluteDiscountAction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.TotalAbsoluteDiscountAction#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TotalAbsoluteDiscountAction#getAmount()
	 * @see #getTotalAbsoluteDiscountAction()
	 * @generated
	 */
	EAttribute getTotalAbsoluteDiscountAction_Amount();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.TargetPercentDiscountAction <em>Target Percent Discount Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Percent Discount Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TargetPercentDiscountAction
	 * @generated
	 */
	EClass getTargetPercentDiscountAction();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.cs.eng2.offers.TargetPercentDiscountAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TargetPercentDiscountAction#getTarget()
	 * @see #getTargetPercentDiscountAction()
	 * @generated
	 */
	EReference getTargetPercentDiscountAction_Target();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.TargetPercentDiscountAction#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TargetPercentDiscountAction#getPercentage()
	 * @see #getTargetPercentDiscountAction()
	 * @generated
	 */
	EAttribute getTargetPercentDiscountAction_Percentage();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction <em>Replace Target Cost Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace Target Cost Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction
	 * @generated
	 */
	EClass getReplaceTargetCostAction();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction#getTarget()
	 * @see #getReplaceTargetCostAction()
	 * @generated
	 */
	EReference getReplaceTargetCostAction_Target();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction#getMaxCount <em>Max Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Count</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction#getMaxCount()
	 * @see #getReplaceTargetCostAction()
	 * @generated
	 */
	EAttribute getReplaceTargetCostAction_MaxCount();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction#getCost()
	 * @see #getReplaceTargetCostAction()
	 * @generated
	 */
	EAttribute getReplaceTargetCostAction_Cost();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OffersFactory getOffersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.CatalogueImpl <em>Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.CatalogueImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCatalogue()
		 * @generated
		 */
		EClass CATALOGUE = eINSTANCE.getCatalogue();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE__PRODUCTS = eINSTANCE.getCatalogue_Products();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE__CATEGORIES = eINSTANCE.getCatalogue_Categories();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE__TAGS = eINSTANCE.getCatalogue_Tags();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE__RULES = eINSTANCE.getCatalogue_Rules();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ProductImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__CATEGORY = eINSTANCE.getProduct_Category();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__TAGS = eINSTANCE.getProduct_Tags();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.CategoryImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Subcategories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__SUBCATEGORIES = eINSTANCE.getCategory_Subcategories();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.TagImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl <em>Offer Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferRule()
		 * @generated
		 */
		EClass OFFER_RULE = eINSTANCE.getOfferRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER_RULE__NAME = eINSTANCE.getOfferRule_Name();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_RULE__CONDITIONS = eINSTANCE.getOfferRule_Conditions();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_RULE__ACTIONS = eINSTANCE.getOfferRule_Actions();

		/**
		 * The meta object literal for the '<em><b>Triggers If Match</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_RULE__TRIGGERS_IF_MATCH = eINSTANCE.getOfferRule_TriggersIfMatch();

		/**
		 * The meta object literal for the '<em><b>Triggers If Not Match</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_RULE__TRIGGERS_IF_NOT_MATCH = eINSTANCE.getOfferRule_TriggersIfNotMatch();

		/**
		 * The meta object literal for the '<em><b>Triggers Always</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_RULE__TRIGGERS_ALWAYS = eINSTANCE.getOfferRule_TriggersAlways();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.TargetImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductTargetImpl <em>Product Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ProductTargetImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductTarget()
		 * @generated
		 */
		EClass PRODUCT_TARGET = eINSTANCE.getProductTarget();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TARGET__PRODUCT = eINSTANCE.getProductTarget_Product();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductInCategoryTargetImpl <em>Product In Category Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ProductInCategoryTargetImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductInCategoryTarget()
		 * @generated
		 */
		EClass PRODUCT_IN_CATEGORY_TARGET = eINSTANCE.getProductInCategoryTarget();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_IN_CATEGORY_TARGET__CATEGORY = eINSTANCE.getProductInCategoryTarget_Category();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductWithTagTargetImpl <em>Product With Tag Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ProductWithTagTargetImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductWithTagTarget()
		 * @generated
		 */
		EClass PRODUCT_WITH_TAG_TARGET = eINSTANCE.getProductWithTagTarget();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_WITH_TAG_TARGET__TAGS = eINSTANCE.getProductWithTagTarget_Tags();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ContainsTargetConditionImpl <em>Contains Target Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ContainsTargetConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getContainsTargetCondition()
		 * @generated
		 */
		EClass CONTAINS_TARGET_CONDITION = eINSTANCE.getContainsTargetCondition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINS_TARGET_CONDITION__TARGET = eINSTANCE.getContainsTargetCondition_Target();

		/**
		 * The meta object literal for the '<em><b>Min Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINS_TARGET_CONDITION__MIN_COUNT = eINSTANCE.getContainsTargetCondition_MinCount();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.MaxDailyProductOrdersConditionImpl <em>Max Daily Product Orders Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.MaxDailyProductOrdersConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getMaxDailyProductOrdersCondition()
		 * @generated
		 */
		EClass MAX_DAILY_PRODUCT_ORDERS_CONDITION = eINSTANCE.getMaxDailyProductOrdersCondition();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAX_DAILY_PRODUCT_ORDERS_CONDITION__PRODUCT = eINSTANCE.getMaxDailyProductOrdersCondition_Product();

		/**
		 * The meta object literal for the '<em><b>Max Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_DAILY_PRODUCT_ORDERS_CONDITION__MAX_COUNT = eINSTANCE.getMaxDailyProductOrdersCondition_MaxCount();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.MinimumTotalOrderConditionImpl <em>Minimum Total Order Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.MinimumTotalOrderConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getMinimumTotalOrderCondition()
		 * @generated
		 */
		EClass MINIMUM_TOTAL_ORDER_CONDITION = eINSTANCE.getMinimumTotalOrderCondition();

		/**
		 * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINIMUM_TOTAL_ORDER_CONDITION__TOTAL = eINSTANCE.getMinimumTotalOrderCondition_Total();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.RecurringYearlyDateConditionImpl <em>Recurring Yearly Date Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.RecurringYearlyDateConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getRecurringYearlyDateCondition()
		 * @generated
		 */
		EClass RECURRING_YEARLY_DATE_CONDITION = eINSTANCE.getRecurringYearlyDateCondition();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRING_YEARLY_DATE_CONDITION__MONTH = eINSTANCE.getRecurringYearlyDateCondition_Month();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRING_YEARLY_DATE_CONDITION__DAY = eINSTANCE.getRecurringYearlyDateCondition_Day();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.TotalPercentDiscountActionImpl <em>Total Percent Discount Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.TotalPercentDiscountActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTotalPercentDiscountAction()
		 * @generated
		 */
		EClass TOTAL_PERCENT_DISCOUNT_ACTION = eINSTANCE.getTotalPercentDiscountAction();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOTAL_PERCENT_DISCOUNT_ACTION__PERCENTAGE = eINSTANCE.getTotalPercentDiscountAction_Percentage();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.TotalAbsoluteDiscountActionImpl <em>Total Absolute Discount Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.TotalAbsoluteDiscountActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTotalAbsoluteDiscountAction()
		 * @generated
		 */
		EClass TOTAL_ABSOLUTE_DISCOUNT_ACTION = eINSTANCE.getTotalAbsoluteDiscountAction();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOTAL_ABSOLUTE_DISCOUNT_ACTION__AMOUNT = eINSTANCE.getTotalAbsoluteDiscountAction_Amount();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.TargetPercentDiscountActionImpl <em>Target Percent Discount Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.TargetPercentDiscountActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTargetPercentDiscountAction()
		 * @generated
		 */
		EClass TARGET_PERCENT_DISCOUNT_ACTION = eINSTANCE.getTargetPercentDiscountAction();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_PERCENT_DISCOUNT_ACTION__TARGET = eINSTANCE.getTargetPercentDiscountAction_Target();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_PERCENT_DISCOUNT_ACTION__PERCENTAGE = eINSTANCE.getTargetPercentDiscountAction_Percentage();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ReplaceTargetCostActionImpl <em>Replace Target Cost Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ReplaceTargetCostActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getReplaceTargetCostAction()
		 * @generated
		 */
		EClass REPLACE_TARGET_COST_ACTION = eINSTANCE.getReplaceTargetCostAction();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACE_TARGET_COST_ACTION__TARGET = eINSTANCE.getReplaceTargetCostAction_Target();

		/**
		 * The meta object literal for the '<em><b>Max Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE_TARGET_COST_ACTION__MAX_COUNT = eINSTANCE.getReplaceTargetCostAction_MaxCount();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE_TARGET_COST_ACTION__COST = eINSTANCE.getReplaceTargetCostAction_Cost();

	}

} //OffersPackage
