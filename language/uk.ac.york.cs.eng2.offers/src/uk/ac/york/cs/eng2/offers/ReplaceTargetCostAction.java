/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replace Target Cost Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction#getTarget <em>Target</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction#getMaxCount <em>Max Count</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getReplaceTargetCostAction()
 * @model
 * @generated
 */
public interface ReplaceTargetCostAction extends Action {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Target)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getReplaceTargetCostAction_Target()
	 * @model containment="true"
	 * @generated
	 */
	Target getTarget();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Target value);

	/**
	 * Returns the value of the '<em><b>Max Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Count</em>' attribute.
	 * @see #setMaxCount(int)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getReplaceTargetCostAction_MaxCount()
	 * @model
	 * @generated
	 */
	int getMaxCount();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction#getMaxCount <em>Max Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Count</em>' attribute.
	 * @see #getMaxCount()
	 * @generated
	 */
	void setMaxCount(int value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getReplaceTargetCostAction_Cost()
	 * @model
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

} // ReplaceTargetCostAction
