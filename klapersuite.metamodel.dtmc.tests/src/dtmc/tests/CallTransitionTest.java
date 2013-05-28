/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dtmc.tests;

import dtmc.CallTransition;
import dtmc.DtmcFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Call Transition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CallTransitionTest extends TransitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CallTransitionTest.class);
	}

	/**
	 * Constructs a new Call Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTransitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Call Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CallTransition getFixture() {
		return (CallTransition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DtmcFactory.eINSTANCE.createCallTransition());
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

} //CallTransitionTest
