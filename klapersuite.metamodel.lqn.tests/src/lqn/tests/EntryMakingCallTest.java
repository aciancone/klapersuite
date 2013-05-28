/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.tests;

import junit.textui.TestRunner;

import lqn.EntryMakingCall;
import lqn.LqnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entry Making Call</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntryMakingCallTest extends MakingCallTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntryMakingCallTest.class);
	}

	/**
	 * Constructs a new Entry Making Call test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryMakingCallTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entry Making Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EntryMakingCall getFixture() {
		return (EntryMakingCall)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LqnFactory.eINSTANCE.createEntryMakingCall());
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

} //EntryMakingCallTest
