/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base.tests;

import junit.textui.TestRunner;

import simulator.base.BaseFactory;
import simulator.base.OpenWorkload;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Open Workload</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenWorkloadTest extends WorkloadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OpenWorkloadTest.class);
	}

	/**
	 * Constructs a new Open Workload test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenWorkloadTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Open Workload test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OpenWorkload getFixture() {
		return (OpenWorkload)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BaseFactory.eINSTANCE.createOpenWorkload());
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

} //OpenWorkloadTest
