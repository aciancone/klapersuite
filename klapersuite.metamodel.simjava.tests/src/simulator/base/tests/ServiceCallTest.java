/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import simulator.base.BaseFactory;
import simulator.base.ServiceCall;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Call</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceCallTest extends TestCase {

	/**
	 * The fixture for this Service Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceCall fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceCallTest.class);
	}

	/**
	 * Constructs a new Service Call test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCallTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Service Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ServiceCall fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Service Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceCall getFixture() {
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
		setFixture(BaseFactory.eINSTANCE.createServiceCall());
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

} //ServiceCallTest
