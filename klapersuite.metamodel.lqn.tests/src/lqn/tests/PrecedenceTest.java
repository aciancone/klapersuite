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
import lqn.Precedence;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Precedence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrecedenceTest extends TestCase {

	/**
	 * The fixture for this Precedence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Precedence fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrecedenceTest.class);
	}

	/**
	 * Constructs a new Precedence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Precedence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Precedence fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Precedence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Precedence getFixture() {
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
		setFixture(LqnFactory.eINSTANCE.createPrecedence());
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

} //PrecedenceTest
