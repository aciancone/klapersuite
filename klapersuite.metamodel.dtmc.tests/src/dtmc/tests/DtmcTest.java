/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dtmc.tests;

import dtmc.Dtmc;
import dtmc.DtmcFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dtmc</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DtmcTest extends NamedEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DtmcTest.class);
	}

	/**
	 * Constructs a new Dtmc test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtmcTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dtmc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Dtmc getFixture() {
		return (Dtmc)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DtmcFactory.eINSTANCE.createDtmc());
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

} //DtmcTest
