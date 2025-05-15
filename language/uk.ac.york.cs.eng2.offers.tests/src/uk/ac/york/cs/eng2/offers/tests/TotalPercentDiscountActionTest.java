/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.TotalPercentDiscountAction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Total Percent Discount Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TotalPercentDiscountActionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TotalPercentDiscountActionTest.class);
	}

	/**
	 * Constructs a new Total Percent Discount Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalPercentDiscountActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Total Percent Discount Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TotalPercentDiscountAction getFixture() {
		return (TotalPercentDiscountAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OffersFactory.eINSTANCE.createTotalPercentDiscountAction());
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

} //TotalPercentDiscountActionTest
