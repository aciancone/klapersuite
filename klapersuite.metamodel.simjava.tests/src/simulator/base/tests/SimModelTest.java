/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import simulator.base.BaseFactory;
import simulator.base.SimModel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sim Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimModelTest extends TestCase {

	/**
	 * The fixture for this Sim Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimModelTest.class);
	}

	/**
	 * Constructs a new Sim Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sim Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SimModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sim Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimModel getFixture() {
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
		setFixture(BaseFactory.eINSTANCE.createSimModel());
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

} //SimModelTest
