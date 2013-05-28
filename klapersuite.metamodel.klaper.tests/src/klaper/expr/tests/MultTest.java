/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.expr.tests;

import junit.textui.TestRunner;

import klaper.expr.ExprFactory;
import klaper.expr.Mult;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mult</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultTest extends OperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MultTest.class);
	}

	/**
	 * Constructs a new Mult test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mult test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Mult getFixture() {
		return (Mult)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExprFactory.eINSTANCE.createMult());
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

} //MultTest
