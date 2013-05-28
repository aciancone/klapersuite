/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.expr.tests;

import junit.textui.TestRunner;

import klaper.expr.ExprFactory;
import klaper.expr.Unary;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unary</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnaryTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnaryTest.class);
	}

	/**
	 * Constructs a new Unary test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Unary getFixture() {
		return (Unary)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExprFactory.eINSTANCE.createUnary());
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

} //UnaryTest
