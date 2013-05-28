/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base.tests;

import junit.textui.TestRunner;

import simulator.base.BaseFactory;
import simulator.base.DiscreteFailMode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Discrete Fail Mode</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscreteFailModeTest extends FailModeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiscreteFailModeTest.class);
	}

	/**
	 * Constructs a new Discrete Fail Mode test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteFailModeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Discrete Fail Mode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DiscreteFailMode getFixture() {
		return (DiscreteFailMode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BaseFactory.eINSTANCE.createDiscreteFailMode());
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

} //DiscreteFailModeTest
