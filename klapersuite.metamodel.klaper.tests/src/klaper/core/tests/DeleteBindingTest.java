/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core.tests;

import junit.textui.TestRunner;

import klaper.core.CoreFactory;
import klaper.core.DeleteBinding;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delete Binding</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeleteBindingTest extends ReconfigurationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeleteBindingTest.class);
	}

	/**
	 * Constructs a new Delete Binding test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteBindingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Delete Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeleteBinding getFixture() {
		return (DeleteBinding)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoreFactory.eINSTANCE.createDeleteBinding());
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

} //DeleteBindingTest
