/**
 */
package uk.ac.york.cs.eng2.offers.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.york.cs.eng2.offers.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.eng2.offers.OffersPackage
 * @generated
 */
public class OffersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OffersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffersSwitch() {
		if (modelPackage == null) {
			modelPackage = OffersPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OffersPackage.CATALOGUE: {
				Catalogue catalogue = (Catalogue)theEObject;
				T result = caseCatalogue(catalogue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.OFFER_RULE: {
				OfferRule offerRule = (OfferRule)theEObject;
				T result = caseOfferRule(offerRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.TARGET: {
				Target target = (Target)theEObject;
				T result = caseTarget(target);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.PRODUCT_TARGET: {
				ProductTarget productTarget = (ProductTarget)theEObject;
				T result = caseProductTarget(productTarget);
				if (result == null) result = caseTarget(productTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.PRODUCT_IN_CATEGORY_TARGET: {
				ProductInCategoryTarget productInCategoryTarget = (ProductInCategoryTarget)theEObject;
				T result = caseProductInCategoryTarget(productInCategoryTarget);
				if (result == null) result = caseTarget(productInCategoryTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.PRODUCT_WITH_TAG_TARGET: {
				ProductWithTagTarget productWithTagTarget = (ProductWithTagTarget)theEObject;
				T result = caseProductWithTagTarget(productWithTagTarget);
				if (result == null) result = caseTarget(productWithTagTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.CONTAINS_TARGET_CONDITION: {
				ContainsTargetCondition containsTargetCondition = (ContainsTargetCondition)theEObject;
				T result = caseContainsTargetCondition(containsTargetCondition);
				if (result == null) result = caseCondition(containsTargetCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.MAX_DAILY_PRODUCT_ORDERS_CONDITION: {
				MaxDailyProductOrdersCondition maxDailyProductOrdersCondition = (MaxDailyProductOrdersCondition)theEObject;
				T result = caseMaxDailyProductOrdersCondition(maxDailyProductOrdersCondition);
				if (result == null) result = caseCondition(maxDailyProductOrdersCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.MINIMUM_TOTAL_ORDER_CONDITION: {
				MinimumTotalOrderCondition minimumTotalOrderCondition = (MinimumTotalOrderCondition)theEObject;
				T result = caseMinimumTotalOrderCondition(minimumTotalOrderCondition);
				if (result == null) result = caseCondition(minimumTotalOrderCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.RECURRING_YEARLY_DATE_CONDITION: {
				RecurringYearlyDateCondition recurringYearlyDateCondition = (RecurringYearlyDateCondition)theEObject;
				T result = caseRecurringYearlyDateCondition(recurringYearlyDateCondition);
				if (result == null) result = caseCondition(recurringYearlyDateCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.TOTAL_PERCENT_DISCOUNT_ACTION: {
				TotalPercentDiscountAction totalPercentDiscountAction = (TotalPercentDiscountAction)theEObject;
				T result = caseTotalPercentDiscountAction(totalPercentDiscountAction);
				if (result == null) result = caseAction(totalPercentDiscountAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.TOTAL_ABSOLUTE_DISCOUNT_ACTION: {
				TotalAbsoluteDiscountAction totalAbsoluteDiscountAction = (TotalAbsoluteDiscountAction)theEObject;
				T result = caseTotalAbsoluteDiscountAction(totalAbsoluteDiscountAction);
				if (result == null) result = caseAction(totalAbsoluteDiscountAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.TARGET_PERCENT_DISCOUNT_ACTION: {
				TargetPercentDiscountAction targetPercentDiscountAction = (TargetPercentDiscountAction)theEObject;
				T result = caseTargetPercentDiscountAction(targetPercentDiscountAction);
				if (result == null) result = caseAction(targetPercentDiscountAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OffersPackage.REPLACE_TARGET_COST_ACTION: {
				ReplaceTargetCostAction replaceTargetCostAction = (ReplaceTargetCostAction)theEObject;
				T result = caseReplaceTargetCostAction(replaceTargetCostAction);
				if (result == null) result = caseAction(replaceTargetCostAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalogue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalogue(Catalogue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offer Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offer Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOfferRule(OfferRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTarget(Target object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductTarget(ProductTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product In Category Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product In Category Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductInCategoryTarget(ProductInCategoryTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product With Tag Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product With Tag Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductWithTagTarget(ProductWithTagTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contains Target Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contains Target Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainsTargetCondition(ContainsTargetCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Daily Product Orders Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Daily Product Orders Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxDailyProductOrdersCondition(MaxDailyProductOrdersCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minimum Total Order Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minimum Total Order Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinimumTotalOrderCondition(MinimumTotalOrderCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recurring Yearly Date Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recurring Yearly Date Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecurringYearlyDateCondition(RecurringYearlyDateCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Percent Discount Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Percent Discount Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalPercentDiscountAction(TotalPercentDiscountAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Absolute Discount Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Absolute Discount Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalAbsoluteDiscountAction(TotalAbsoluteDiscountAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Percent Discount Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Percent Discount Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetPercentDiscountAction(TargetPercentDiscountAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Target Cost Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Target Cost Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceTargetCostAction(ReplaceTargetCostAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OffersSwitch
