/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import klaper.probability.HistogramSample;
import klaper.probability.ProbabilityFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Histogram Sample</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HistogramSampleTest extends TestCase {

	/**
	 * The fixture for this Histogram Sample test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistogramSample fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HistogramSampleTest.class);
	}

	/**
	 * Constructs a new Histogram Sample test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistogramSampleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Histogram Sample test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HistogramSample fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Histogram Sample test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistogramSample getFixture() {
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
		setFixture(ProbabilityFactory.eINSTANCE.createHistogramSample());
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

} //HistogramSampleTest
