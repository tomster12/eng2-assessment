/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Replace Target Cost Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReplaceTargetCostActionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReplaceTargetCostActionTest.class);
	}

	/**
	 * Constructs a new Replace Target Cost Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceTargetCostActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Replace Target Cost Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReplaceTargetCostAction getFixture() {
		return (ReplaceTargetCostAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OffersFactory.eINSTANCE.createReplaceTargetCostAction());
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

} //ReplaceTargetCostActionTest
