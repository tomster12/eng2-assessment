/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Catalogue#getProducts <em>Products</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Catalogue#getCategories <em>Categories</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Catalogue#getTags <em>Tags</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Catalogue#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getCatalogue()
 * @model
 * @generated
 */
public interface Catalogue extends EObject {
	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getCatalogue_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getCatalogue_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getCatalogue_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.OfferRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getCatalogue_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<OfferRule> getRules();

} // Catalogue
