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
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ModelImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PRODUCTS = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CATEGORIES = 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__RULES = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;


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
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
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
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Subcategories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SUBCATEGORIES = 2;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl <em>Offer Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferRule()
	 * @generated
	 */
	int OFFER_RULE = 3;

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
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 4;

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
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductTagConditionImpl <em>Product Tag Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ProductTagConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductTagCondition()
	 * @generated
	 */
	int PRODUCT_TAG_CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TAG_CONDITION__TAG = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product Tag Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TAG_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product Tag Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TAG_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.MinOrderValueConditionImpl <em>Min Order Value Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.MinOrderValueConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getMinOrderValueCondition()
	 * @generated
	 */
	int MIN_ORDER_VALUE_CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Min Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_ORDER_VALUE_CONDITION__MIN_AMOUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Min Order Value Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_ORDER_VALUE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Min Order Value Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_ORDER_VALUE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductNameConditionImpl <em>Product Name Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ProductNameConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductNameCondition()
	 * @generated
	 */
	int PRODUCT_NAME_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_NAME_CONDITION__PRODUCT_NAME = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product Name Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_NAME_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product Name Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_NAME_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 8;

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
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.PercentageDiscountActionImpl <em>Percentage Discount Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.PercentageDiscountActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getPercentageDiscountAction()
	 * @generated
	 */
	int PERCENTAGE_DISCOUNT_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_ACTION__PERCENTAGE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Percentage Discount Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Percentage Discount Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.FixedDiscountActionImpl <em>Fixed Discount Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.FixedDiscountActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getFixedDiscountAction()
	 * @generated
	 */
	int FIXED_DISCOUNT_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_DISCOUNT_ACTION__AMOUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fixed Discount Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_DISCOUNT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fixed Discount Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_DISCOUNT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.AddFreeProductActionImpl <em>Add Free Product Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.AddFreeProductActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getAddFreeProductAction()
	 * @generated
	 */
	int ADD_FREE_PRODUCT_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FREE_PRODUCT_ACTION__PRODUCT_NAME = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Free Product Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FREE_PRODUCT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add Free Product Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FREE_PRODUCT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.AddDiscountedProductActionImpl <em>Add Discounted Product Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.AddDiscountedProductActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getAddDiscountedProductAction()
	 * @generated
	 */
	int ADD_DISCOUNTED_PRODUCT_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DISCOUNTED_PRODUCT_ACTION__PRODUCT_NAME = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Discounted Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DISCOUNTED_PRODUCT_ACTION__DISCOUNTED_PRICE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Discounted Product Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DISCOUNTED_PRODUCT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Add Discounted Product Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DISCOUNTED_PRODUCT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Model#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model#getProducts()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Model#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model#getCategories()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Model#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model#getRules()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Rules();

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
	 * Returns the meta object for the attribute list '{@link uk.ac.york.cs.eng2.offers.Product#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product#getTags()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Tags();

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
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.Category#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category#getContainer()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Container();

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
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.ProductTagCondition <em>Product Tag Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Tag Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductTagCondition
	 * @generated
	 */
	EClass getProductTagCondition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.ProductTagCondition#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductTagCondition#getTag()
	 * @see #getProductTagCondition()
	 * @generated
	 */
	EAttribute getProductTagCondition_Tag();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.MinOrderValueCondition <em>Min Order Value Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Order Value Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.MinOrderValueCondition
	 * @generated
	 */
	EClass getMinOrderValueCondition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.MinOrderValueCondition#getMinAmount <em>Min Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Amount</em>'.
	 * @see uk.ac.york.cs.eng2.offers.MinOrderValueCondition#getMinAmount()
	 * @see #getMinOrderValueCondition()
	 * @generated
	 */
	EAttribute getMinOrderValueCondition_MinAmount();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.ProductNameCondition <em>Product Name Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Name Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductNameCondition
	 * @generated
	 */
	EClass getProductNameCondition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.ProductNameCondition#getProductName <em>Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductNameCondition#getProductName()
	 * @see #getProductNameCondition()
	 * @generated
	 */
	EAttribute getProductNameCondition_ProductName();

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
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.PercentageDiscountAction <em>Percentage Discount Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Percentage Discount Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.PercentageDiscountAction
	 * @generated
	 */
	EClass getPercentageDiscountAction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.PercentageDiscountAction#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see uk.ac.york.cs.eng2.offers.PercentageDiscountAction#getPercentage()
	 * @see #getPercentageDiscountAction()
	 * @generated
	 */
	EAttribute getPercentageDiscountAction_Percentage();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.FixedDiscountAction <em>Fixed Discount Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Discount Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.FixedDiscountAction
	 * @generated
	 */
	EClass getFixedDiscountAction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.FixedDiscountAction#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see uk.ac.york.cs.eng2.offers.FixedDiscountAction#getAmount()
	 * @see #getFixedDiscountAction()
	 * @generated
	 */
	EAttribute getFixedDiscountAction_Amount();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.AddFreeProductAction <em>Add Free Product Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Free Product Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.AddFreeProductAction
	 * @generated
	 */
	EClass getAddFreeProductAction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.AddFreeProductAction#getProductName <em>Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.AddFreeProductAction#getProductName()
	 * @see #getAddFreeProductAction()
	 * @generated
	 */
	EAttribute getAddFreeProductAction_ProductName();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.AddDiscountedProductAction <em>Add Discounted Product Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Discounted Product Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.AddDiscountedProductAction
	 * @generated
	 */
	EClass getAddDiscountedProductAction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.AddDiscountedProductAction#getProductName <em>Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.AddDiscountedProductAction#getProductName()
	 * @see #getAddDiscountedProductAction()
	 * @generated
	 */
	EAttribute getAddDiscountedProductAction_ProductName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.AddDiscountedProductAction#getDiscountedPrice <em>Discounted Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discounted Price</em>'.
	 * @see uk.ac.york.cs.eng2.offers.AddDiscountedProductAction#getDiscountedPrice()
	 * @see #getAddDiscountedProductAction()
	 * @generated
	 */
	EAttribute getAddDiscountedProductAction_DiscountedPrice();

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
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ModelImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();
		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PRODUCTS = eINSTANCE.getModel_Products();
		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CATEGORIES = eINSTANCE.getModel_Categories();
		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__RULES = eINSTANCE.getModel_Rules();
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
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__TAGS = eINSTANCE.getProduct_Tags();
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
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CONTAINER = eINSTANCE.getCategory_Container();
		/**
		 * The meta object literal for the '<em><b>Subcategories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__SUBCATEGORIES = eINSTANCE.getCategory_Subcategories();
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
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductTagConditionImpl <em>Product Tag Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ProductTagConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductTagCondition()
		 * @generated
		 */
		EClass PRODUCT_TAG_CONDITION = eINSTANCE.getProductTagCondition();
		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TAG_CONDITION__TAG = eINSTANCE.getProductTagCondition_Tag();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.MinOrderValueConditionImpl <em>Min Order Value Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.MinOrderValueConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getMinOrderValueCondition()
		 * @generated
		 */
		EClass MIN_ORDER_VALUE_CONDITION = eINSTANCE.getMinOrderValueCondition();
		/**
		 * The meta object literal for the '<em><b>Min Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_ORDER_VALUE_CONDITION__MIN_AMOUNT = eINSTANCE.getMinOrderValueCondition_MinAmount();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductNameConditionImpl <em>Product Name Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ProductNameConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductNameCondition()
		 * @generated
		 */
		EClass PRODUCT_NAME_CONDITION = eINSTANCE.getProductNameCondition();
		/**
		 * The meta object literal for the '<em><b>Product Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_NAME_CONDITION__PRODUCT_NAME = eINSTANCE.getProductNameCondition_ProductName();
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
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.PercentageDiscountActionImpl <em>Percentage Discount Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.PercentageDiscountActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getPercentageDiscountAction()
		 * @generated
		 */
		EClass PERCENTAGE_DISCOUNT_ACTION = eINSTANCE.getPercentageDiscountAction();
		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_DISCOUNT_ACTION__PERCENTAGE = eINSTANCE.getPercentageDiscountAction_Percentage();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.FixedDiscountActionImpl <em>Fixed Discount Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.FixedDiscountActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getFixedDiscountAction()
		 * @generated
		 */
		EClass FIXED_DISCOUNT_ACTION = eINSTANCE.getFixedDiscountAction();
		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_DISCOUNT_ACTION__AMOUNT = eINSTANCE.getFixedDiscountAction_Amount();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.AddFreeProductActionImpl <em>Add Free Product Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.AddFreeProductActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getAddFreeProductAction()
		 * @generated
		 */
		EClass ADD_FREE_PRODUCT_ACTION = eINSTANCE.getAddFreeProductAction();
		/**
		 * The meta object literal for the '<em><b>Product Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_FREE_PRODUCT_ACTION__PRODUCT_NAME = eINSTANCE.getAddFreeProductAction_ProductName();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.AddDiscountedProductActionImpl <em>Add Discounted Product Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.AddDiscountedProductActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getAddDiscountedProductAction()
		 * @generated
		 */
		EClass ADD_DISCOUNTED_PRODUCT_ACTION = eINSTANCE.getAddDiscountedProductAction();
		/**
		 * The meta object literal for the '<em><b>Product Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_DISCOUNTED_PRODUCT_ACTION__PRODUCT_NAME = eINSTANCE.getAddDiscountedProductAction_ProductName();
		/**
		 * The meta object literal for the '<em><b>Discounted Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_DISCOUNTED_PRODUCT_ACTION__DISCOUNTED_PRICE = eINSTANCE.getAddDiscountedProductAction_DiscountedPrice();

	}

} //OffersPackage
