/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.eng2.offers.AddDiscountedProductAction;
import uk.ac.york.cs.eng2.offers.OffersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Discounted Product Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.AddDiscountedProductActionImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.AddDiscountedProductActionImpl#getDiscountedPrice <em>Discounted Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddDiscountedProductActionImpl extends ActionImpl implements AddDiscountedProductAction {
	/**
	 * The default value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected String productName = PRODUCT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscountedPrice() <em>Discounted Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountedPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double DISCOUNTED_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiscountedPrice() <em>Discounted Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountedPrice()
	 * @generated
	 * @ordered
	 */
	protected double discountedPrice = DISCOUNTED_PRICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddDiscountedProductActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.ADD_DISCOUNTED_PRODUCT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductName(String newProductName) {
		String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.ADD_DISCOUNTED_PRODUCT_ACTION__PRODUCT_NAME, oldProductName, productName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDiscountedPrice() {
		return discountedPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscountedPrice(double newDiscountedPrice) {
		double oldDiscountedPrice = discountedPrice;
		discountedPrice = newDiscountedPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.ADD_DISCOUNTED_PRODUCT_ACTION__DISCOUNTED_PRICE, oldDiscountedPrice, discountedPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.ADD_DISCOUNTED_PRODUCT_ACTION__PRODUCT_NAME:
				return getProductName();
			case OffersPackage.ADD_DISCOUNTED_PRODUCT_ACTION__DISCOUNTED_PRICE:
				return getDiscountedPrice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OffersPackage.ADD_DISCOUNTED_PRODUCT_ACTION__PRODUCT_NAME:
				setProductName((String)newValue);
				return;
			case OffersPackage.ADD_DISCOUNTED_PRODUCT_ACTION__DISCOUNTED_PRICE:
				setDiscountedPrice((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OffersPackage.ADD_DISCOUNTED_PRODUCT_ACTION__PRODUCT_NAME:
				setProductName(PRODUCT_NAME_EDEFAULT);
				return;
			case OffersPackage.ADD_DISCOUNTED_PRODUCT_ACTION__DISCOUNTED_PRICE:
				setDiscountedPrice(DISCOUNTED_PRICE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OffersPackage.ADD_DISCOUNTED_PRODUCT_ACTION__PRODUCT_NAME:
				return PRODUCT_NAME_EDEFAULT == null ? productName != null : !PRODUCT_NAME_EDEFAULT.equals(productName);
			case OffersPackage.ADD_DISCOUNTED_PRODUCT_ACTION__DISCOUNTED_PRICE:
				return discountedPrice != DISCOUNTED_PRICE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (productName: ");
		result.append(productName);
		result.append(", discountedPrice: ");
		result.append(discountedPrice);
		result.append(')');
		return result.toString();
	}

} //AddDiscountedProductActionImpl
