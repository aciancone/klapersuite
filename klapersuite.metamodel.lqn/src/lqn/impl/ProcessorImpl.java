/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.impl;

import java.util.Collection;

import lqn.LqnPackage;
import lqn.Processor;
import lqn.SchedulingType;
import lqn.Task;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lqn.impl.ProcessorImpl#getName <em>Name</em>}</li>
 *   <li>{@link lqn.impl.ProcessorImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link lqn.impl.ProcessorImpl#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link lqn.impl.ProcessorImpl#getScheduling <em>Scheduling</em>}</li>
 *   <li>{@link lqn.impl.ProcessorImpl#getReplication <em>Replication</em>}</li>
 *   <li>{@link lqn.impl.ProcessorImpl#getQuantum <em>Quantum</em>}</li>
 *   <li>{@link lqn.impl.ProcessorImpl#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorImpl extends EObjectImpl implements Processor {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected int multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double SPEED_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected double speedFactor = SPEED_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduling() <em>Scheduling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduling()
	 * @generated
	 * @ordered
	 */
	protected static final SchedulingType SCHEDULING_EDEFAULT = SchedulingType.NULL;

	/**
	 * The cached value of the '{@link #getScheduling() <em>Scheduling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduling()
	 * @generated
	 * @ordered
	 */
	protected SchedulingType scheduling = SCHEDULING_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplication() <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLICATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReplication() <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication()
	 * @generated
	 * @ordered
	 */
	protected int replication = REPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantum() <em>Quantum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantum()
	 * @generated
	 * @ordered
	 */
	protected static final double QUANTUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuantum() <em>Quantum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantum()
	 * @generated
	 * @ordered
	 */
	protected double quantum = QUANTUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> task;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PROCESSOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(int newMultiplicity) {
		int oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PROCESSOR__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpeedFactor() {
		return speedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedFactor(double newSpeedFactor) {
		double oldSpeedFactor = speedFactor;
		speedFactor = newSpeedFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PROCESSOR__SPEED_FACTOR, oldSpeedFactor, speedFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingType getScheduling() {
		return scheduling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduling(SchedulingType newScheduling) {
		SchedulingType oldScheduling = scheduling;
		scheduling = newScheduling == null ? SCHEDULING_EDEFAULT : newScheduling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PROCESSOR__SCHEDULING, oldScheduling, scheduling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReplication() {
		return replication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplication(int newReplication) {
		int oldReplication = replication;
		replication = newReplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PROCESSOR__REPLICATION, oldReplication, replication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getQuantum() {
		return quantum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantum(double newQuantum) {
		double oldQuantum = quantum;
		quantum = newQuantum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PROCESSOR__QUANTUM, oldQuantum, quantum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTask() {
		if (task == null) {
			task = new EObjectContainmentEList<Task>(Task.class, this, LqnPackage.PROCESSOR__TASK);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnPackage.PROCESSOR__TASK:
				return ((InternalEList<?>)getTask()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LqnPackage.PROCESSOR__NAME:
				return getName();
			case LqnPackage.PROCESSOR__MULTIPLICITY:
				return getMultiplicity();
			case LqnPackage.PROCESSOR__SPEED_FACTOR:
				return getSpeedFactor();
			case LqnPackage.PROCESSOR__SCHEDULING:
				return getScheduling();
			case LqnPackage.PROCESSOR__REPLICATION:
				return getReplication();
			case LqnPackage.PROCESSOR__QUANTUM:
				return getQuantum();
			case LqnPackage.PROCESSOR__TASK:
				return getTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LqnPackage.PROCESSOR__NAME:
				setName((String)newValue);
				return;
			case LqnPackage.PROCESSOR__MULTIPLICITY:
				setMultiplicity((Integer)newValue);
				return;
			case LqnPackage.PROCESSOR__SPEED_FACTOR:
				setSpeedFactor((Double)newValue);
				return;
			case LqnPackage.PROCESSOR__SCHEDULING:
				setScheduling((SchedulingType)newValue);
				return;
			case LqnPackage.PROCESSOR__REPLICATION:
				setReplication((Integer)newValue);
				return;
			case LqnPackage.PROCESSOR__QUANTUM:
				setQuantum((Double)newValue);
				return;
			case LqnPackage.PROCESSOR__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends Task>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LqnPackage.PROCESSOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnPackage.PROCESSOR__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
			case LqnPackage.PROCESSOR__SPEED_FACTOR:
				setSpeedFactor(SPEED_FACTOR_EDEFAULT);
				return;
			case LqnPackage.PROCESSOR__SCHEDULING:
				setScheduling(SCHEDULING_EDEFAULT);
				return;
			case LqnPackage.PROCESSOR__REPLICATION:
				setReplication(REPLICATION_EDEFAULT);
				return;
			case LqnPackage.PROCESSOR__QUANTUM:
				setQuantum(QUANTUM_EDEFAULT);
				return;
			case LqnPackage.PROCESSOR__TASK:
				getTask().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LqnPackage.PROCESSOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnPackage.PROCESSOR__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
			case LqnPackage.PROCESSOR__SPEED_FACTOR:
				return speedFactor != SPEED_FACTOR_EDEFAULT;
			case LqnPackage.PROCESSOR__SCHEDULING:
				return scheduling != SCHEDULING_EDEFAULT;
			case LqnPackage.PROCESSOR__REPLICATION:
				return replication != REPLICATION_EDEFAULT;
			case LqnPackage.PROCESSOR__QUANTUM:
				return quantum != QUANTUM_EDEFAULT;
			case LqnPackage.PROCESSOR__TASK:
				return task != null && !task.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", multiplicity: ");
		result.append(multiplicity);
		result.append(", speedFactor: ");
		result.append(speedFactor);
		result.append(", scheduling: ");
		result.append(scheduling);
		result.append(", replication: ");
		result.append(replication);
		result.append(", quantum: ");
		result.append(quantum);
		result.append(')');
		return result.toString();
	}

} //ProcessorImpl
