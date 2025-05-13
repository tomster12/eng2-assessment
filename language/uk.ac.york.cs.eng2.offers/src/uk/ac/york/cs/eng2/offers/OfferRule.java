/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offer Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferRule#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferRule#getConditions <em>Conditions</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferRule#getActions <em>Actions</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferRule#getTriggersIfMatch <em>Triggers If Match</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferRule#getTriggersIfNotMatch <em>Triggers If Not Match</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferRule#getTriggersAlways <em>Triggers Always</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferRule()
 * @model
 * @generated
 */
public interface OfferRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OfferRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferRule_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferRule_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Triggers If Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers If Match</em>' reference.
	 * @see #setTriggersIfMatch(OfferRule)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferRule_TriggersIfMatch()
	 * @model
	 * @generated
	 */
	OfferRule getTriggersIfMatch();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OfferRule#getTriggersIfMatch <em>Triggers If Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggers If Match</em>' reference.
	 * @see #getTriggersIfMatch()
	 * @generated
	 */
	void setTriggersIfMatch(OfferRule value);

	/**
	 * Returns the value of the '<em><b>Triggers If Not Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers If Not Match</em>' reference.
	 * @see #setTriggersIfNotMatch(OfferRule)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferRule_TriggersIfNotMatch()
	 * @model
	 * @generated
	 */
	OfferRule getTriggersIfNotMatch();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OfferRule#getTriggersIfNotMatch <em>Triggers If Not Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggers If Not Match</em>' reference.
	 * @see #getTriggersIfNotMatch()
	 * @generated
	 */
	void setTriggersIfNotMatch(OfferRule value);

	/**
	 * Returns the value of the '<em><b>Triggers Always</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers Always</em>' reference.
	 * @see #setTriggersAlways(OfferRule)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferRule_TriggersAlways()
	 * @model
	 * @generated
	 */
	OfferRule getTriggersAlways();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OfferRule#getTriggersAlways <em>Triggers Always</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggers Always</em>' reference.
	 * @see #getTriggersAlways()
	 * @generated
	 */
	void setTriggersAlways(OfferRule value);

} // OfferRule
