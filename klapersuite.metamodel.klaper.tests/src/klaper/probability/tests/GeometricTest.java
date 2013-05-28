/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability.tests;

import junit.textui.TestRunner;

import klaper.probability.Geometric;
import klaper.probability.ProbabilityFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Geometric</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeometricTest extends ProbabilityDistributionFunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GeometricTest.class);
	}

	/**
	 * Constructs a new Geometric test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometricTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Geometric test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Geometric getFixture() {
		return (Geometric)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProbabilityFactory.eINSTANCE.createGeometric());
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

} //GeometricTest
