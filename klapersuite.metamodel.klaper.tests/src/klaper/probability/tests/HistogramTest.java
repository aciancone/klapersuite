/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability.tests;

import junit.textui.TestRunner;

import klaper.probability.Histogram;
import klaper.probability.ProbabilityFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Histogram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HistogramTest extends ProbabilityDistributionFunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HistogramTest.class);
	}

	/**
	 * Constructs a new Histogram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistogramTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Histogram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Histogram getFixture() {
		return (Histogram)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProbabilityFactory.eINSTANCE.createHistogram());
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

} //HistogramTest
