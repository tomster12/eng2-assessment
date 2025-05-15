/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.ProductInCategoryTarget;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Product In Category Target</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductInCategoryTargetTest extends TargetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProductInCategoryTargetTest.class);
	}

	/**
	 * Constructs a new Product In Category Target test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInCategoryTargetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Product In Category Target test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProductInCategoryTarget getFixture() {
		return (ProductInCategoryTarget)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OffersFactory.eINSTANCE.createProductInCategoryTarget());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ProductInCategoryTargetTest
