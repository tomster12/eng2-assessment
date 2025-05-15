/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Daily Product Orders Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.MaxDailyProductOrdersCondition#getProduct <em>Product</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.MaxDailyProductOrdersCondition#getMaxCount <em>Max Count</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getMaxDailyProductOrdersCondition()
 * @model
 * @generated
 */
public interface MaxDailyProductOrdersCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getMaxDailyProductOrdersCondition_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.MaxDailyProductOrdersCondition#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Max Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Count</em>' attribute.
	 * @see #setMaxCount(int)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getMaxDailyProductOrdersCondition_MaxCount()
	 * @model
	 * @generated
	 */
	int getMaxCount();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.MaxDailyProductOrdersCondition#getMaxCount <em>Max Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Count</em>' attribute.
	 * @see #getMaxCount()
	 * @generated
	 */
	void setMaxCount(int value);

} // MaxDailyProductOrdersCondition
