/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base.tests;

import junit.textui.TestRunner;

import simulator.base.BaseFactory;
import simulator.base.ContinuousFailMode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Continuous Fail Mode</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContinuousFailModeTest extends FailModeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContinuousFailModeTest.class);
	}

	/**
	 * Constructs a new Continuous Fail Mode test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousFailModeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Continuous Fail Mode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContinuousFailMode getFixture() {
		return (ContinuousFailMode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BaseFactory.eINSTANCE.createContinuousFailMode());
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

} //ContinuousFailModeTest
