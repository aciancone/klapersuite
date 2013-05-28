/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import lqn.ActivityLoopList;
import lqn.LqnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity Loop List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityLoopListTest extends TestCase {

	/**
	 * The fixture for this Activity Loop List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityLoopList fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActivityLoopListTest.class);
	}

	/**
	 * Constructs a new Activity Loop List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLoopListTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Activity Loop List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ActivityLoopList fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Activity Loop List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityLoopList getFixture() {
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
		setFixture(LqnFactory.eINSTANCE.createActivityLoopList());
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

} //ActivityLoopListTest
