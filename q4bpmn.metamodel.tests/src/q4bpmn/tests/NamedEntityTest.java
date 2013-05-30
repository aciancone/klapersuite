/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package q4bpmn.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import q4bpmn.NamedEntity;
import q4bpmn.Q4bpmnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Named Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NamedEntityTest extends TestCase {

	/**
	 * The fixture for this Named Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedEntity fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NamedEntityTest.class);
	}

	/**
	 * Constructs a new Named Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedEntityTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Named Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NamedEntity fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Named Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedEntity getFixture() {
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
		setFixture(Q4bpmnFactory.eINSTANCE.createNamedEntity());
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

} //NamedEntityTest
