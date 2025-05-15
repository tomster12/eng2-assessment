/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.TotalAbsoluteDiscountAction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Total Absolute Discount Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TotalAbsoluteDiscountActionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TotalAbsoluteDiscountActionTest.class);
	}

	/**
	 * Constructs a new Total Absolute Discount Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalAbsoluteDiscountActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Total Absolute Discount Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TotalAbsoluteDiscountAction getFixture() {
		return (TotalAbsoluteDiscountAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OffersFactory.eINSTANCE.createTotalAbsoluteDiscountAction());
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

} //TotalAbsoluteDiscountActionTest
