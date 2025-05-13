/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Discounted Product Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.AddDiscountedProductAction#getProductName <em>Product Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.AddDiscountedProductAction#getDiscountedPrice <em>Discounted Price</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getAddDiscountedProductAction()
 * @model
 * @generated
 */
public interface AddDiscountedProductAction extends Action {
	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Name</em>' attribute.
	 * @see #setProductName(String)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getAddDiscountedProductAction_ProductName()
	 * @model
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.AddDiscountedProductAction#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

	/**
	 * Returns the value of the '<em><b>Discounted Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discounted Price</em>' attribute.
	 * @see #setDiscountedPrice(double)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getAddDiscountedProductAction_DiscountedPrice()
	 * @model
	 * @generated
	 */
	double getDiscountedPrice();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.AddDiscountedProductAction#getDiscountedPrice <em>Discounted Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discounted Price</em>' attribute.
	 * @see #getDiscountedPrice()
	 * @generated
	 */
	void setDiscountedPrice(double value);

} // AddDiscountedProductAction
