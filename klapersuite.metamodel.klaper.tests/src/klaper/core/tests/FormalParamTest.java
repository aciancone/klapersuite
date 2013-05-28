/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import klaper.core.CoreFactory;
import klaper.core.FormalParam;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Formal Param</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormalParamTest extends TestCase {

	/**
	 * The fixture for this Formal Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalParam fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FormalParamTest.class);
	}

	/**
	 * Constructs a new Formal Param test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalParamTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Formal Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FormalParam fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Formal Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalParam getFixture() {
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
		setFixture(CoreFactory.eINSTANCE.createFormalParam());
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

} //FormalParamTest
