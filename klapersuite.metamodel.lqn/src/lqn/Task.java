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
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.Task#getName <em>Name</em>}</li>
 *   <li>{@link lqn.Task#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link lqn.Task#getQueueLength <em>Queue Length</em>}</li>
 *   <li>{@link lqn.Task#getReplication <em>Replication</em>}</li>
 *   <li>{@link lqn.Task#getScheduling <em>Scheduling</em>}</li>
 *   <li>{@link lqn.Task#getActivityGraph <em>Activity Graph</em>}</li>
 *   <li>{@link lqn.Task#getThinkTime <em>Think Time</em>}</li>
 *   <li>{@link lqn.Task#getPriority <em>Priority</em>}</li>
 *   <li>{@link lqn.Task#getEntry <em>Entry</em>}</li>
 *   <li>{@link lqn.Task#getTaskActivity <em>Task Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
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
	 * @see lqn.LqnPackage#getTask_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lqn.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see #setMultiplicity(int)
	 * @see lqn.LqnPackage#getTask_Multiplicity()
	 * @model unique="false"
	 * @generated
	 */
	int getMultiplicity();

	/**
	 * Sets the value of the '{@link lqn.Task#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(int value);

	/**
	 * Returns the value of the '<em><b>Queue Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Length</em>' attribute.
	 * @see #setQueueLength(int)
	 * @see lqn.LqnPackage#getTask_QueueLength()
	 * @model unique="false"
	 * @generated
	 */
	int getQueueLength();

	/**
	 * Sets the value of the '{@link lqn.Task#getQueueLength <em>Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Length</em>' attribute.
	 * @see #getQueueLength()
	 * @generated
	 */
	void setQueueLength(int value);

	/**
	 * Returns the value of the '<em><b>Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replication</em>' attribute.
	 * @see #setReplication(int)
	 * @see lqn.LqnPackage#getTask_Replication()
	 * @model unique="false"
	 * @generated
	 */
	int getReplication();

	/**
	 * Sets the value of the '{@link lqn.Task#getReplication <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication</em>' attribute.
	 * @see #getReplication()
	 * @generated
	 */
	void setReplication(int value);

	/**
	 * Returns the value of the '<em><b>Scheduling</b></em>' attribute.
	 * The literals are from the enumeration {@link lqn.TaskSchedulingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling</em>' attribute.
	 * @see lqn.TaskSchedulingType
	 * @see #setScheduling(TaskSchedulingType)
	 * @see lqn.LqnPackage#getTask_Scheduling()
	 * @model unique="false"
	 * @generated
	 */
	TaskSchedulingType getScheduling();

	/**
	 * Sets the value of the '{@link lqn.Task#getScheduling <em>Scheduling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling</em>' attribute.
	 * @see lqn.TaskSchedulingType
	 * @see #getScheduling()
	 * @generated
	 */
	void setScheduling(TaskSchedulingType value);

	/**
	 * Returns the value of the '<em><b>Activity Graph</b></em>' attribute.
	 * The literals are from the enumeration {@link lqn.TaskOptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Graph</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Graph</em>' attribute.
	 * @see lqn.TaskOptionType
	 * @see #setActivityGraph(TaskOptionType)
	 * @see lqn.LqnPackage#getTask_ActivityGraph()
	 * @model unique="false"
	 * @generated
	 */
	TaskOptionType getActivityGraph();

	/**
	 * Sets the value of the '{@link lqn.Task#getActivityGraph <em>Activity Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Graph</em>' attribute.
	 * @see lqn.TaskOptionType
	 * @see #getActivityGraph()
	 * @generated
	 */
	void setActivityGraph(TaskOptionType value);

	/**
	 * Returns the value of the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Think Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Think Time</em>' attribute.
	 * @see #setThinkTime(double)
	 * @see lqn.LqnPackage#getTask_ThinkTime()
	 * @model unique="false"
	 * @generated
	 */
	double getThinkTime();

	/**
	 * Sets the value of the '{@link lqn.Task#getThinkTime <em>Think Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Think Time</em>' attribute.
	 * @see #getThinkTime()
	 * @generated
	 */
	void setThinkTime(double value);

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
	 * @see lqn.LqnPackage#getTask_Priority()
	 * @model unique="false"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link lqn.Task#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link lqn.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see lqn.LqnPackage#getTask_Entry()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Entry> getEntry();

	/**
	 * Returns the value of the '<em><b>Task Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Activity</em>' containment reference.
	 * @see #setTaskActivity(TaskActivityGraph)
	 * @see lqn.LqnPackage#getTask_TaskActivity()
	 * @model containment="true"
	 * @generated
	 */
	TaskActivityGraph getTaskActivity();

	/**
	 * Sets the value of the '{@link lqn.Task#getTaskActivity <em>Task Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Activity</em>' containment reference.
	 * @see #getTaskActivity()
	 * @generated
	 */
	void setTaskActivity(TaskActivityGraph value);

} // Task
