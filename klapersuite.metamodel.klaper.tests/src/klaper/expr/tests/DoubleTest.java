/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.expr.tests;

import junit.textui.TestRunner;

import klaper.expr.ExprFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Double</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DoubleTest extends NumberTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DoubleTest.class);
	}

	/**
	 * Constructs a new Double test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Double test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected klaper.expr.Double getFixture() {
		return (klaper.expr.Double)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExprFactory.eINSTANCE.createDouble());
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

} //DoubleTest
