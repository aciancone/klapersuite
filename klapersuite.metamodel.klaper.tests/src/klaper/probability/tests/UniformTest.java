/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability.tests;

import junit.textui.TestRunner;

import klaper.probability.ProbabilityFactory;
import klaper.probability.Uniform;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uniform</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniformTest extends ProbabilityDistributionFunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UniformTest.class);
	}

	/**
	 * Constructs a new Uniform test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniformTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Uniform test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Uniform getFixture() {
		return (Uniform)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProbabilityFactory.eINSTANCE.createUniform());
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

} //UniformTest
