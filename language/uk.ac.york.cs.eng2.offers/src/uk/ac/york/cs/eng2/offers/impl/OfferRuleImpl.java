/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.york.cs.eng2.offers.Action;
import uk.ac.york.cs.eng2.offers.Condition;
import uk.ac.york.cs.eng2.offers.OfferRule;
import uk.ac.york.cs.eng2.offers.OffersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offer Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl#getTriggersIfMatch <em>Triggers If Match</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl#getTriggersIfNotMatch <em>Triggers If Not Match</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl#getTriggersAlways <em>Triggers Always</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OfferRuleImpl extends MinimalEObjectImpl.Container implements OfferRule {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getTriggersIfMatch() <em>Triggers If Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggersIfMatch()
	 * @generated
	 * @ordered
	 */
	protected OfferRule triggersIfMatch;

	/**
	 * The cached value of the '{@link #getTriggersIfNotMatch() <em>Triggers If Not Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggersIfNotMatch()
	 * @generated
	 * @ordered
	 */
	protected OfferRule triggersIfNotMatch;

	/**
	 * The cached value of the '{@link #getTriggersAlways() <em>Triggers Always</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggersAlways()
	 * @generated
	 * @ordered
	 */
	protected OfferRule triggersAlways;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfferRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.OFFER_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this, OffersPackage.OFFER_RULE__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, OffersPackage.OFFER_RULE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OfferRule getTriggersIfMatch() {
		if (triggersIfMatch != null && triggersIfMatch.eIsProxy()) {
			InternalEObject oldTriggersIfMatch = (InternalEObject)triggersIfMatch;
			triggersIfMatch = (OfferRule)eResolveProxy(oldTriggersIfMatch);
			if (triggersIfMatch != oldTriggersIfMatch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OffersPackage.OFFER_RULE__TRIGGERS_IF_MATCH, oldTriggersIfMatch, triggersIfMatch));
			}
		}
		return triggersIfMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfferRule basicGetTriggersIfMatch() {
		return triggersIfMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggersIfMatch(OfferRule newTriggersIfMatch) {
		OfferRule oldTriggersIfMatch = triggersIfMatch;
		triggersIfMatch = newTriggersIfMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_RULE__TRIGGERS_IF_MATCH, oldTriggersIfMatch, triggersIfMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OfferRule getTriggersIfNotMatch() {
		if (triggersIfNotMatch != null && triggersIfNotMatch.eIsProxy()) {
			InternalEObject oldTriggersIfNotMatch = (InternalEObject)triggersIfNotMatch;
			triggersIfNotMatch = (OfferRule)eResolveProxy(oldTriggersIfNotMatch);
			if (triggersIfNotMatch != oldTriggersIfNotMatch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OffersPackage.OFFER_RULE__TRIGGERS_IF_NOT_MATCH, oldTriggersIfNotMatch, triggersIfNotMatch));
			}
		}
		return triggersIfNotMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfferRule basicGetTriggersIfNotMatch() {
		return triggersIfNotMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggersIfNotMatch(OfferRule newTriggersIfNotMatch) {
		OfferRule oldTriggersIfNotMatch = triggersIfNotMatch;
		triggersIfNotMatch = newTriggersIfNotMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_RULE__TRIGGERS_IF_NOT_MATCH, oldTriggersIfNotMatch, triggersIfNotMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OfferRule getTriggersAlways() {
		if (triggersAlways != null && triggersAlways.eIsProxy()) {
			InternalEObject oldTriggersAlways = (InternalEObject)triggersAlways;
			triggersAlways = (OfferRule)eResolveProxy(oldTriggersAlways);
			if (triggersAlways != oldTriggersAlways) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OffersPackage.OFFER_RULE__TRIGGERS_ALWAYS, oldTriggersAlways, triggersAlways));
			}
		}
		return triggersAlways;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfferRule basicGetTriggersAlways() {
		return triggersAlways;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggersAlways(OfferRule newTriggersAlways) {
		OfferRule oldTriggersAlways = triggersAlways;
		triggersAlways = newTriggersAlways;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_RULE__TRIGGERS_ALWAYS, oldTriggersAlways, triggersAlways));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OffersPackage.OFFER_RULE__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case OffersPackage.OFFER_RULE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.OFFER_RULE__NAME:
				return getName();
			case OffersPackage.OFFER_RULE__CONDITIONS:
				return getConditions();
			case OffersPackage.OFFER_RULE__ACTIONS:
				return getActions();
			case OffersPackage.OFFER_RULE__TRIGGERS_IF_MATCH:
				if (resolve) return getTriggersIfMatch();
				return basicGetTriggersIfMatch();
			case OffersPackage.OFFER_RULE__TRIGGERS_IF_NOT_MATCH:
				if (resolve) return getTriggersIfNotMatch();
				return basicGetTriggersIfNotMatch();
			case OffersPackage.OFFER_RULE__TRIGGERS_ALWAYS:
				if (resolve) return getTriggersAlways();
				return basicGetTriggersAlways();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OffersPackage.OFFER_RULE__NAME:
				setName((String)newValue);
				return;
			case OffersPackage.OFFER_RULE__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
				return;
			case OffersPackage.OFFER_RULE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case OffersPackage.OFFER_RULE__TRIGGERS_IF_MATCH:
				setTriggersIfMatch((OfferRule)newValue);
				return;
			case OffersPackage.OFFER_RULE__TRIGGERS_IF_NOT_MATCH:
				setTriggersIfNotMatch((OfferRule)newValue);
				return;
			case OffersPackage.OFFER_RULE__TRIGGERS_ALWAYS:
				setTriggersAlways((OfferRule)newValue);
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
			case OffersPackage.OFFER_RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OffersPackage.OFFER_RULE__CONDITIONS:
				getConditions().clear();
				return;
			case OffersPackage.OFFER_RULE__ACTIONS:
				getActions().clear();
				return;
			case OffersPackage.OFFER_RULE__TRIGGERS_IF_MATCH:
				setTriggersIfMatch((OfferRule)null);
				return;
			case OffersPackage.OFFER_RULE__TRIGGERS_IF_NOT_MATCH:
				setTriggersIfNotMatch((OfferRule)null);
				return;
			case OffersPackage.OFFER_RULE__TRIGGERS_ALWAYS:
				setTriggersAlways((OfferRule)null);
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
			case OffersPackage.OFFER_RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OffersPackage.OFFER_RULE__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case OffersPackage.OFFER_RULE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case OffersPackage.OFFER_RULE__TRIGGERS_IF_MATCH:
				return triggersIfMatch != null;
			case OffersPackage.OFFER_RULE__TRIGGERS_IF_NOT_MATCH:
				return triggersIfNotMatch != null;
			case OffersPackage.OFFER_RULE__TRIGGERS_ALWAYS:
				return triggersAlways != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OfferRuleImpl
