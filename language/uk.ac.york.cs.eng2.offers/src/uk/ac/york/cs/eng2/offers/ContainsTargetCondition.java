/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contains Target Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.ContainsTargetCondition#getTarget <em>Target</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.ContainsTargetCondition#getMinCount <em>Min Count</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getContainsTargetCondition()
 * @model
 * @generated
 */
public interface ContainsTargetCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Target)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getContainsTargetCondition_Target()
	 * @model containment="true"
	 * @generated
	 */
	Target getTarget();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.ContainsTargetCondition#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Target value);

	/**
	 * Returns the value of the '<em><b>Min Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Count</em>' attribute.
	 * @see #setMinCount(int)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getContainsTargetCondition_MinCount()
	 * @model
	 * @generated
	 */
	int getMinCount();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.ContainsTargetCondition#getMinCount <em>Min Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Count</em>' attribute.
	 * @see #getMinCount()
	 * @generated
	 */
	void setMinCount(int value);

} // ContainsTargetCondition
