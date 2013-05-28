/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core.tests;

import junit.textui.TestRunner;

import klaper.core.Acquire;
import klaper.core.CoreFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Acquire</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AcquireTest extends ActivityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AcquireTest.class);
	}

	/**
	 * Constructs a new Acquire test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquireTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Acquire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Acquire getFixture() {
		return (Acquire)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoreFactory.eINSTANCE.createAcquire());
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

} //AcquireTest
