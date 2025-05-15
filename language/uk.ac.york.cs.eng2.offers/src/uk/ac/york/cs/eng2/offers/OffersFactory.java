/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.eng2.offers.OffersPackage
 * @generated
 */
public interface OffersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OffersFactory eINSTANCE = uk.ac.york.cs.eng2.offers.impl.OffersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalogue</em>'.
	 * @generated
	 */
	Catalogue createCatalogue();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Offer Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer Rule</em>'.
	 * @generated
	 */
	OfferRule createOfferRule();

	/**
	 * Returns a new object of class '<em>Product Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Target</em>'.
	 * @generated
	 */
	ProductTarget createProductTarget();

	/**
	 * Returns a new object of class '<em>Product In Category Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product In Category Target</em>'.
	 * @generated
	 */
	ProductInCategoryTarget createProductInCategoryTarget();

	/**
	 * Returns a new object of class '<em>Product With Tag Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product With Tag Target</em>'.
	 * @generated
	 */
	ProductWithTagTarget createProductWithTagTarget();

	/**
	 * Returns a new object of class '<em>Contains Target Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contains Target Condition</em>'.
	 * @generated
	 */
	ContainsTargetCondition createContainsTargetCondition();

	/**
	 * Returns a new object of class '<em>Max Daily Product Orders Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Daily Product Orders Condition</em>'.
	 * @generated
	 */
	MaxDailyProductOrdersCondition createMaxDailyProductOrdersCondition();

	/**
	 * Returns a new object of class '<em>Minimum Total Order Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minimum Total Order Condition</em>'.
	 * @generated
	 */
	MinimumTotalOrderCondition createMinimumTotalOrderCondition();

	/**
	 * Returns a new object of class '<em>Recurring Yearly Date Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recurring Yearly Date Condition</em>'.
	 * @generated
	 */
	RecurringYearlyDateCondition createRecurringYearlyDateCondition();

	/**
	 * Returns a new object of class '<em>Total Percent Discount Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Total Percent Discount Action</em>'.
	 * @generated
	 */
	TotalPercentDiscountAction createTotalPercentDiscountAction();

	/**
	 * Returns a new object of class '<em>Total Absolute Discount Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Total Absolute Discount Action</em>'.
	 * @generated
	 */
	TotalAbsoluteDiscountAction createTotalAbsoluteDiscountAction();

	/**
	 * Returns a new object of class '<em>Target Percent Discount Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Percent Discount Action</em>'.
	 * @generated
	 */
	TargetPercentDiscountAction createTargetPercentDiscountAction();

	/**
	 * Returns a new object of class '<em>Replace Target Cost Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replace Target Cost Action</em>'.
	 * @generated
	 */
	ReplaceTargetCostAction createReplaceTargetCostAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OffersPackage getOffersPackage();

} //OffersFactory
