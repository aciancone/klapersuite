/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.tests;

import junit.textui.TestRunner;

import lqn.EntryActivityDef;
import lqn.LqnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entry Activity Def</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntryActivityDefTest extends ActivityDefBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntryActivityDefTest.class);
	}

	/**
	 * Constructs a new Entry Activity Def test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryActivityDefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entry Activity Def test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EntryActivityDef getFixture() {
		return (EntryActivityDef)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LqnFactory.eINSTANCE.createEntryActivityDef());
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

} //EntryActivityDefTest
