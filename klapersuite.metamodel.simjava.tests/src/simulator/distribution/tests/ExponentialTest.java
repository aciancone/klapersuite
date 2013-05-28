/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.distribution.tests;

import junit.textui.TestRunner;

import simulator.distribution.DistributionFactory;
import simulator.distribution.Exponential;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exponential</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExponentialTest extends ProbabilityDistributionFunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExponentialTest.class);
	}

	/**
	 * Constructs a new Exponential test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExponentialTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exponential test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Exponential getFixture() {
		return (Exponential)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DistributionFactory.eINSTANCE.createExponential());
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

} //ExponentialTest
