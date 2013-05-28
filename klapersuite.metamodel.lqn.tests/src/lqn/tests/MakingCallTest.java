/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import lqn.LqnFactory;
import lqn.MakingCall;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Making Call</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MakingCallTest extends TestCase {

	/**
	 * The fixture for this Making Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MakingCall fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MakingCallTest.class);
	}

	/**
	 * Constructs a new Making Call test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakingCallTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Making Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MakingCall fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Making Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MakingCall getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LqnFactory.eINSTANCE.createMakingCall());
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

} //MakingCallTest
