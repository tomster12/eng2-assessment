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
			case OffersPackage.MODEL: return createModel();
			case OffersPackage.PRODUCT: return createProduct();
			case OffersPackage.CATEGORY: return createCategory();
			case OffersPackage.OFFER_RULE: return createOfferRule();
			case OffersPackage.PRODUCT_TAG_CONDITION: return createProductTagCondition();
			case OffersPackage.MIN_ORDER_VALUE_CONDITION: return createMinOrderValueCondition();
			case OffersPackage.PRODUCT_NAME_CONDITION: return createProductNameCondition();
			case OffersPackage.PERCENTAGE_DISCOUNT_ACTION: return createPercentageDiscountAction();
			case OffersPackage.FIXED_DISCOUNT_ACTION: return createFixedDiscountAction();
			case OffersPackage.ADD_FREE_PRODUCT_ACTION: return createAddFreeProductAction();
			case OffersPackage.ADD_DISCOUNTED_PRODUCT_ACTION: return createAddDiscountedProductAction();
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
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
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
	public ProductTagCondition createProductTagCondition() {
		ProductTagConditionImpl productTagCondition = new ProductTagConditionImpl();
		return productTagCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinOrderValueCondition createMinOrderValueCondition() {
		MinOrderValueConditionImpl minOrderValueCondition = new MinOrderValueConditionImpl();
		return minOrderValueCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductNameCondition createProductNameCondition() {
		ProductNameConditionImpl productNameCondition = new ProductNameConditionImpl();
		return productNameCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PercentageDiscountAction createPercentageDiscountAction() {
		PercentageDiscountActionImpl percentageDiscountAction = new PercentageDiscountActionImpl();
		return percentageDiscountAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedDiscountAction createFixedDiscountAction() {
		FixedDiscountActionImpl fixedDiscountAction = new FixedDiscountActionImpl();
		return fixedDiscountAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddFreeProductAction createAddFreeProductAction() {
		AddFreeProductActionImpl addFreeProductAction = new AddFreeProductActionImpl();
		return addFreeProductAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddDiscountedProductAction createAddDiscountedProductAction() {
		AddDiscountedProductActionImpl addDiscountedProductAction = new AddDiscountedProductActionImpl();
		return addDiscountedProductAction;
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
