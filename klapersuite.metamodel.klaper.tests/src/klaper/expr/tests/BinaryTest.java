/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.expr.tests;

import junit.textui.TestRunner;

import klaper.expr.Binary;
import klaper.expr.ExprFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BinaryTest.class);
	}

	/**
	 * Constructs a new Binary test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Binary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Binary getFixture() {
		return (Binary)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExprFactory.eINSTANCE.createBinary());
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

} //BinaryTest
