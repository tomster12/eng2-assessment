/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.TargetPercentDiscountAction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Target Percent Discount Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetPercentDiscountActionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TargetPercentDiscountActionTest.class);
	}

	/**
	 * Constructs a new Target Percent Discount Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPercentDiscountActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Target Percent Discount Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TargetPercentDiscountAction getFixture() {
		return (TargetPercentDiscountAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OffersFactory.eINSTANCE.createTargetPercentDiscountAction());
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

} //TargetPercentDiscountActionTest
