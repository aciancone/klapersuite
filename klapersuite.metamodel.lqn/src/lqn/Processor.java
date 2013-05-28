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
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.Processor#getName <em>Name</em>}</li>
 *   <li>{@link lqn.Processor#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link lqn.Processor#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link lqn.Processor#getScheduling <em>Scheduling</em>}</li>
 *   <li>{@link lqn.Processor#getReplication <em>Replication</em>}</li>
 *   <li>{@link lqn.Processor#getQuantum <em>Quantum</em>}</li>
 *   <li>{@link lqn.Processor#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getProcessor()
 * @model
 * @generated
 */
public interface Processor extends EObject {
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
	 * @see lqn.LqnPackage#getProcessor_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lqn.Processor#getName <em>Name</em>}' attribute.
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
	 * @see lqn.LqnPackage#getProcessor_Multiplicity()
	 * @model unique="false"
	 * @generated
	 */
	int getMultiplicity();

	/**
	 * Sets the value of the '{@link lqn.Processor#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(int value);

	/**
	 * Returns the value of the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Factor</em>' attribute.
	 * @see #setSpeedFactor(double)
	 * @see lqn.LqnPackage#getProcessor_SpeedFactor()
	 * @model unique="false"
	 * @generated
	 */
	double getSpeedFactor();

	/**
	 * Sets the value of the '{@link lqn.Processor#getSpeedFactor <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Factor</em>' attribute.
	 * @see #getSpeedFactor()
	 * @generated
	 */
	void setSpeedFactor(double value);

	/**
	 * Returns the value of the '<em><b>Scheduling</b></em>' attribute.
	 * The literals are from the enumeration {@link lqn.SchedulingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling</em>' attribute.
	 * @see lqn.SchedulingType
	 * @see #setScheduling(SchedulingType)
	 * @see lqn.LqnPackage#getProcessor_Scheduling()
	 * @model unique="false"
	 * @generated
	 */
	SchedulingType getScheduling();

	/**
	 * Sets the value of the '{@link lqn.Processor#getScheduling <em>Scheduling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling</em>' attribute.
	 * @see lqn.SchedulingType
	 * @see #getScheduling()
	 * @generated
	 */
	void setScheduling(SchedulingType value);

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
	 * @see lqn.LqnPackage#getProcessor_Replication()
	 * @model unique="false"
	 * @generated
	 */
	int getReplication();

	/**
	 * Sets the value of the '{@link lqn.Processor#getReplication <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication</em>' attribute.
	 * @see #getReplication()
	 * @generated
	 */
	void setReplication(int value);

	/**
	 * Returns the value of the '<em><b>Quantum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantum</em>' attribute.
	 * @see #setQuantum(double)
	 * @see lqn.LqnPackage#getProcessor_Quantum()
	 * @model unique="false"
	 * @generated
	 */
	double getQuantum();

	/**
	 * Sets the value of the '{@link lqn.Processor#getQuantum <em>Quantum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantum</em>' attribute.
	 * @see #getQuantum()
	 * @generated
	 */
	void setQuantum(double value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link lqn.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see lqn.LqnPackage#getProcessor_Task()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getTask();

} // Processor
