/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core.tests;

import junit.textui.TestRunner;

import klaper.core.CoreFactory;
import klaper.core.CreateBinding;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Create Binding</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateBindingTest extends ReconfigurationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CreateBindingTest.class);
	}

	/**
	 * Constructs a new Create Binding test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateBindingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Create Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CreateBinding getFixture() {
		return (CreateBinding)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoreFactory.eINSTANCE.createCreateBinding());
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

} //CreateBindingTest
