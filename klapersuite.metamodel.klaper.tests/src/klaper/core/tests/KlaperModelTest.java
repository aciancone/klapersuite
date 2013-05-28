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
import klaper.core.KlaperModel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Klaper Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KlaperModelTest extends TestCase {

	/**
	 * The fixture for this Klaper Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KlaperModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KlaperModelTest.class);
	}

	/**
	 * Constructs a new Klaper Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KlaperModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Klaper Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(KlaperModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Klaper Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KlaperModel getFixture() {
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
		setFixture(CoreFactory.eINSTANCE.createKlaperModel());
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

} //KlaperModelTest
