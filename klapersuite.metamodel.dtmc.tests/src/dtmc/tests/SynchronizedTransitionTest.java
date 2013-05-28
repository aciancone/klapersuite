/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dtmc.tests;

import dtmc.DtmcFactory;
import dtmc.SynchronizedTransition;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Synchronized Transition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SynchronizedTransitionTest extends TransitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SynchronizedTransitionTest.class);
	}

	/**
	 * Constructs a new Synchronized Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizedTransitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Synchronized Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SynchronizedTransition getFixture() {
		return (SynchronizedTransition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DtmcFactory.eINSTANCE.createSynchronizedTransition());
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

} //SynchronizedTransitionTest
