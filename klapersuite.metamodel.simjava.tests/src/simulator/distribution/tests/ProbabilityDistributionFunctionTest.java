/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.distribution.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import simulator.distribution.DistributionFactory;
import simulator.distribution.ProbabilityDistributionFunction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Probability Distribution Function</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProbabilityDistributionFunctionTest extends TestCase {

	/**
	 * The fixture for this Probability Distribution Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilityDistributionFunction fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProbabilityDistributionFunctionTest.class);
	}

	/**
	 * Constructs a new Probability Distribution Function test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityDistributionFunctionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Probability Distribution Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProbabilityDistributionFunction fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Probability Distribution Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilityDistributionFunction getFixture() {
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
		setFixture(DistributionFactory.eINSTANCE.createProbabilityDistributionFunction());
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

} //ProbabilityDistributionFunctionTest
