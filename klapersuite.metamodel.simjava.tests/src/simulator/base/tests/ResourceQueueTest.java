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
import simulator.base.ResourceQueue;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Queue</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceQueueTest extends TestCase {

	/**
	 * The fixture for this Resource Queue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceQueue fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceQueueTest.class);
	}

	/**
	 * Constructs a new Resource Queue test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceQueueTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resource Queue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResourceQueue fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resource Queue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceQueue getFixture() {
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
		setFixture(BaseFactory.eINSTANCE.createResourceQueue());
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

} //ResourceQueueTest
