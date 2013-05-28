/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core.tests;

import junit.textui.TestRunner;

import klaper.core.CoreFactory;
import klaper.core.ParamVariable;

import klaper.expr.tests.VariableTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Param Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParamVariableTest extends VariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParamVariableTest.class);
	}

	/**
	 * Constructs a new Param Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Param Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ParamVariable getFixture() {
		return (ParamVariable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoreFactory.eINSTANCE.createParamVariable());
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

} //ParamVariableTest
