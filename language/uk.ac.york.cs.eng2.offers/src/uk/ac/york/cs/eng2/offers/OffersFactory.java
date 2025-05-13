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
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

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
	 * Returns a new object of class '<em>Offer Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer Rule</em>'.
	 * @generated
	 */
	OfferRule createOfferRule();

	/**
	 * Returns a new object of class '<em>Product Tag Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Tag Condition</em>'.
	 * @generated
	 */
	ProductTagCondition createProductTagCondition();

	/**
	 * Returns a new object of class '<em>Min Order Value Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Order Value Condition</em>'.
	 * @generated
	 */
	MinOrderValueCondition createMinOrderValueCondition();

	/**
	 * Returns a new object of class '<em>Product Name Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Name Condition</em>'.
	 * @generated
	 */
	ProductNameCondition createProductNameCondition();

	/**
	 * Returns a new object of class '<em>Percentage Discount Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Percentage Discount Action</em>'.
	 * @generated
	 */
	PercentageDiscountAction createPercentageDiscountAction();

	/**
	 * Returns a new object of class '<em>Fixed Discount Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Discount Action</em>'.
	 * @generated
	 */
	FixedDiscountAction createFixedDiscountAction();

	/**
	 * Returns a new object of class '<em>Add Free Product Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Free Product Action</em>'.
	 * @generated
	 */
	AddFreeProductAction createAddFreeProductAction();

	/**
	 * Returns a new object of class '<em>Add Discounted Product Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Discounted Product Action</em>'.
	 * @generated
	 */
	AddDiscountedProductAction createAddDiscountedProductAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OffersPackage getOffersPackage();

} //OffersFactory
