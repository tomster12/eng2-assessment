/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Order Value Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.MinOrderValueCondition#getMinAmount <em>Min Amount</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getMinOrderValueCondition()
 * @model
 * @generated
 */
public interface MinOrderValueCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Min Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Amount</em>' attribute.
	 * @see #setMinAmount(double)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getMinOrderValueCondition_MinAmount()
	 * @model
	 * @generated
	 */
	double getMinAmount();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.MinOrderValueCondition#getMinAmount <em>Min Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Amount</em>' attribute.
	 * @see #getMinAmount()
	 * @generated
	 */
	void setMinAmount(double value);

} // MinOrderValueCondition
