/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.Entry#getName <em>Name</em>}</li>
 *   <li>{@link lqn.Entry#getOpenArrivalRate <em>Open Arrival Rate</em>}</li>
 *   <li>{@link lqn.Entry#getPriority <em>Priority</em>}</li>
 *   <li>{@link lqn.Entry#getSemaphore <em>Semaphore</em>}</li>
 *   <li>{@link lqn.Entry#getType <em>Type</em>}</li>
 *   <li>{@link lqn.Entry#getEntryActivityGraph <em>Entry Activity Graph</em>}</li>
 *   <li>{@link lqn.Entry#getEntryPhaseActivities <em>Entry Phase Activities</em>}</li>
 *   <li>{@link lqn.Entry#getForwarding <em>Forwarding</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getEntry()
 * @model
 * @generated
 */
public interface Entry extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lqn.LqnPackage#getEntry_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lqn.Entry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Open Arrival Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Arrival Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Arrival Rate</em>' attribute.
	 * @see #setOpenArrivalRate(double)
	 * @see lqn.LqnPackage#getEntry_OpenArrivalRate()
	 * @model unique="false"
	 * @generated
	 */
	double getOpenArrivalRate();

	/**
	 * Sets the value of the '{@link lqn.Entry#getOpenArrivalRate <em>Open Arrival Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Arrival Rate</em>' attribute.
	 * @see #getOpenArrivalRate()
	 * @generated
	 */
	void setOpenArrivalRate(double value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see lqn.LqnPackage#getEntry_Priority()
	 * @model unique="false"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link lqn.Entry#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Semaphore</b></em>' attribute.
	 * The literals are from the enumeration {@link lqn.Semaphore}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semaphore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semaphore</em>' attribute.
	 * @see lqn.Semaphore
	 * @see #setSemaphore(Semaphore)
	 * @see lqn.LqnPackage#getEntry_Semaphore()
	 * @model unique="false"
	 * @generated
	 */
	Semaphore getSemaphore();

	/**
	 * Sets the value of the '{@link lqn.Entry#getSemaphore <em>Semaphore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semaphore</em>' attribute.
	 * @see lqn.Semaphore
	 * @see #getSemaphore()
	 * @generated
	 */
	void setSemaphore(Semaphore value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link lqn.EntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see lqn.EntryType
	 * @see #setType(EntryType)
	 * @see lqn.LqnPackage#getEntry_Type()
	 * @model unique="false" required="true"
	 * @generated
	 */
	EntryType getType();

	/**
	 * Sets the value of the '{@link lqn.Entry#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see lqn.EntryType
	 * @see #getType()
	 * @generated
	 */
	void setType(EntryType value);

	/**
	 * Returns the value of the '<em><b>Entry Activity Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Activity Graph</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Activity Graph</em>' containment reference.
	 * @see #setEntryActivityGraph(EntryActivityGraph)
	 * @see lqn.LqnPackage#getEntry_EntryActivityGraph()
	 * @model containment="true"
	 * @generated
	 */
	EntryActivityGraph getEntryActivityGraph();

	/**
	 * Sets the value of the '{@link lqn.Entry#getEntryActivityGraph <em>Entry Activity Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Activity Graph</em>' containment reference.
	 * @see #getEntryActivityGraph()
	 * @generated
	 */
	void setEntryActivityGraph(EntryActivityGraph value);

	/**
	 * Returns the value of the '<em><b>Entry Phase Activities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Phase Activities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Phase Activities</em>' containment reference.
	 * @see #setEntryPhaseActivities(PhaseActivities)
	 * @see lqn.LqnPackage#getEntry_EntryPhaseActivities()
	 * @model containment="true"
	 * @generated
	 */
	PhaseActivities getEntryPhaseActivities();

	/**
	 * Sets the value of the '{@link lqn.Entry#getEntryPhaseActivities <em>Entry Phase Activities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Phase Activities</em>' containment reference.
	 * @see #getEntryPhaseActivities()
	 * @generated
	 */
	void setEntryPhaseActivities(PhaseActivities value);

	/**
	 * Returns the value of the '<em><b>Forwarding</b></em>' containment reference list.
	 * The list contents are of type {@link lqn.EntryMakingCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forwarding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forwarding</em>' containment reference list.
	 * @see lqn.LqnPackage#getEntry_Forwarding()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntryMakingCall> getForwarding();

} // Entry
