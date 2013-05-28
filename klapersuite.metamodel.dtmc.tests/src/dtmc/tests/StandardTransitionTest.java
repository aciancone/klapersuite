/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dtmc.tests;

import dtmc.DtmcFactory;
import dtmc.StandardTransition;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Standard Transition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardTransitionTest extends TransitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StandardTransitionTest.class);
	}

	/**
	 * Constructs a new Standard Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardTransitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Standard Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StandardTransition getFixture() {
		return (StandardTransition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DtmcFactory.eINSTANCE.createStandardTransition());
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

} //StandardTransitionTest
