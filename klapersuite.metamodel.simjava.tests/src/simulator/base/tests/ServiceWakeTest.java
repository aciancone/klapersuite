/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base.tests;

import junit.textui.TestRunner;

import simulator.base.BaseFactory;
import simulator.base.ServiceWake;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Wake</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceWakeTest extends StepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceWakeTest.class);
	}

	/**
	 * Constructs a new Service Wake test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceWakeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Service Wake test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ServiceWake getFixture() {
		return (ServiceWake)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BaseFactory.eINSTANCE.createServiceWake());
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

} //ServiceWakeTest
