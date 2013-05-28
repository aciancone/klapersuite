/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability.tests;

import junit.textui.TestRunner;

import klaper.probability.Poisson;
import klaper.probability.ProbabilityFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Poisson</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PoissonTest extends ProbabilityDistributionFunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PoissonTest.class);
	}

	/**
	 * Constructs a new Poisson test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoissonTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Poisson test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Poisson getFixture() {
		return (Poisson)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProbabilityFactory.eINSTANCE.createPoisson());
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

} //PoissonTest
