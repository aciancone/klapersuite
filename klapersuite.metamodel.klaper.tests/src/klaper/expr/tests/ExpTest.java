/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.expr.tests;

import junit.textui.TestRunner;

import klaper.expr.Exp;
import klaper.expr.ExprFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpTest extends OperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExpTest.class);
	}

	/**
	 * Constructs a new Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Exp getFixture() {
		return (Exp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExprFactory.eINSTANCE.createExp());
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

} //ExpTest
