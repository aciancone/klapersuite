/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.distribution.tests;

import junit.textui.TestRunner;

import simulator.distribution.DistributionFactory;
import simulator.distribution.Normal;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Normal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NormalTest extends ProbabilityDistributionFunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NormalTest.class);
	}

	/**
	 * Constructs a new Normal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Normal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Normal getFixture() {
		return (Normal)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DistributionFactory.eINSTANCE.createNormal());
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

} //NormalTest
