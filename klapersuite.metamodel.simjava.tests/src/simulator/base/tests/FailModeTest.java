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
import simulator.base.FailMode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fail Mode</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FailModeTest extends TestCase {

	/**
	 * The fixture for this Fail Mode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailMode fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FailModeTest.class);
	}

	/**
	 * Constructs a new Fail Mode test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailModeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Fail Mode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FailMode fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Fail Mode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailMode getFixture() {
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
		setFixture(BaseFactory.eINSTANCE.createFailMode());
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

} //FailModeTest
