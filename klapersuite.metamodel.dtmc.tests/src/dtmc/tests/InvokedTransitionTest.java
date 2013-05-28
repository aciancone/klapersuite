/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dtmc.tests;

import dtmc.DtmcFactory;
import dtmc.InvokedTransition;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Invoked Transition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InvokedTransitionTest extends TransitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InvokedTransitionTest.class);
	}

	/**
	 * Constructs a new Invoked Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvokedTransitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Invoked Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InvokedTransition getFixture() {
		return (InvokedTransition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DtmcFactory.eINSTANCE.createInvokedTransition());
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

} //InvokedTransitionTest
