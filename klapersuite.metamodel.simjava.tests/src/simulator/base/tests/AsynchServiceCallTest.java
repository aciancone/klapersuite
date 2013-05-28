/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base.tests;

import junit.textui.TestRunner;

import simulator.base.AsynchServiceCall;
import simulator.base.BaseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asynch Service Call</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsynchServiceCallTest extends ServiceCallTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AsynchServiceCallTest.class);
	}

	/**
	 * Constructs a new Asynch Service Call test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchServiceCallTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asynch Service Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AsynchServiceCall getFixture() {
		return (AsynchServiceCall)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BaseFactory.eINSTANCE.createAsynchServiceCall());
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

} //AsynchServiceCallTest
