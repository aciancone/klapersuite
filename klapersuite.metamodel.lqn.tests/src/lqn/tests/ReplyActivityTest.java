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
import lqn.ReplyActivity;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reply Activity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReplyActivityTest extends TestCase {

	/**
	 * The fixture for this Reply Activity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplyActivity fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReplyActivityTest.class);
	}

	/**
	 * Constructs a new Reply Activity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyActivityTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reply Activity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReplyActivity fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reply Activity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplyActivity getFixture() {
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
		setFixture(LqnFactory.eINSTANCE.createReplyActivity());
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

} //ReplyActivityTest
