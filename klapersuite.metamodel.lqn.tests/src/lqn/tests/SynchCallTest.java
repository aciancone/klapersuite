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
import lqn.SynchCall;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Synch Call</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SynchCallTest extends TestCase {

	/**
	 * The fixture for this Synch Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchCall fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SynchCallTest.class);
	}

	/**
	 * Constructs a new Synch Call test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchCallTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Synch Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SynchCall fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Synch Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchCall getFixture() {
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
		setFixture(LqnFactory.eINSTANCE.createSynchCall());
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

} //SynchCallTest
