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
import lqn.OrList;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Or List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrListTest extends TestCase {

	/**
	 * The fixture for this Or List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrList fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrListTest.class);
	}

	/**
	 * Constructs a new Or List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrListTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Or List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OrList fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Or List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrList getFixture() {
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
		setFixture(LqnFactory.eINSTANCE.createOrList());
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

} //OrListTest
