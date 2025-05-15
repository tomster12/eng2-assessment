/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.RecurringYearlyDateCondition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Recurring Yearly Date Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecurringYearlyDateConditionTest extends ConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RecurringYearlyDateConditionTest.class);
	}

	/**
	 * Constructs a new Recurring Yearly Date Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecurringYearlyDateConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Recurring Yearly Date Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RecurringYearlyDateCondition getFixture() {
		return (RecurringYearlyDateCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OffersFactory.eINSTANCE.createRecurringYearlyDateCondition());
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

} //RecurringYearlyDateConditionTest
