/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.impl;

import java.util.Collection;

import lqn.Entry;
import lqn.LqnPackage;
import lqn.Task;
import lqn.TaskActivityGraph;
import lqn.TaskOptionType;
import lqn.TaskSchedulingType;

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
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lqn.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link lqn.impl.TaskImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link lqn.impl.TaskImpl#getQueueLength <em>Queue Length</em>}</li>
 *   <li>{@link lqn.impl.TaskImpl#getReplication <em>Replication</em>}</li>
 *   <li>{@link lqn.impl.TaskImpl#getScheduling <em>Scheduling</em>}</li>
 *   <li>{@link lqn.impl.TaskImpl#getActivityGraph <em>Activity Graph</em>}</li>
 *   <li>{@link lqn.impl.TaskImpl#getThinkTime <em>Think Time</em>}</li>
 *   <li>{@link lqn.impl.TaskImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link lqn.impl.TaskImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link lqn.impl.TaskImpl#getTaskActivity <em>Task Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends EObjectImpl implements Task {
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
	 * The default value of the '{@link #getQueueLength() <em>Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueLength()
	 * @generated
	 * @ordered
	 */
	protected static final int QUEUE_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQueueLength() <em>Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueLength()
	 * @generated
	 * @ordered
	 */
	protected int queueLength = QUEUE_LENGTH_EDEFAULT;

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
	 * The default value of the '{@link #getScheduling() <em>Scheduling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduling()
	 * @generated
	 * @ordered
	 */
	protected static final TaskSchedulingType SCHEDULING_EDEFAULT = TaskSchedulingType.NULL;

	/**
	 * The cached value of the '{@link #getScheduling() <em>Scheduling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduling()
	 * @generated
	 * @ordered
	 */
	protected TaskSchedulingType scheduling = SCHEDULING_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivityGraph() <em>Activity Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityGraph()
	 * @generated
	 * @ordered
	 */
	protected static final TaskOptionType ACTIVITY_GRAPH_EDEFAULT = TaskOptionType.NULL;

	/**
	 * The cached value of the '{@link #getActivityGraph() <em>Activity Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityGraph()
	 * @generated
	 * @ordered
	 */
	protected TaskOptionType activityGraph = ACTIVITY_GRAPH_EDEFAULT;

	/**
	 * The default value of the '{@link #getThinkTime() <em>Think Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinkTime()
	 * @generated
	 * @ordered
	 */
	protected static final double THINK_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThinkTime() <em>Think Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinkTime()
	 * @generated
	 * @ordered
	 */
	protected double thinkTime = THINK_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<Entry> entry;

	/**
	 * The cached value of the '{@link #getTaskActivity() <em>Task Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskActivity()
	 * @generated
	 * @ordered
	 */
	protected TaskActivityGraph taskActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQueueLength() {
		return queueLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueLength(int newQueueLength) {
		int oldQueueLength = queueLength;
		queueLength = newQueueLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK__QUEUE_LENGTH, oldQueueLength, queueLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK__REPLICATION, oldReplication, replication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSchedulingType getScheduling() {
		return scheduling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduling(TaskSchedulingType newScheduling) {
		TaskSchedulingType oldScheduling = scheduling;
		scheduling = newScheduling == null ? SCHEDULING_EDEFAULT : newScheduling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK__SCHEDULING, oldScheduling, scheduling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskOptionType getActivityGraph() {
		return activityGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityGraph(TaskOptionType newActivityGraph) {
		TaskOptionType oldActivityGraph = activityGraph;
		activityGraph = newActivityGraph == null ? ACTIVITY_GRAPH_EDEFAULT : newActivityGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK__ACTIVITY_GRAPH, oldActivityGraph, activityGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThinkTime() {
		return thinkTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThinkTime(double newThinkTime) {
		double oldThinkTime = thinkTime;
		thinkTime = newThinkTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK__THINK_TIME, oldThinkTime, thinkTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entry> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentEList<Entry>(Entry.class, this, LqnPackage.TASK__ENTRY);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskActivityGraph getTaskActivity() {
		return taskActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskActivity(TaskActivityGraph newTaskActivity, NotificationChain msgs) {
		TaskActivityGraph oldTaskActivity = taskActivity;
		taskActivity = newTaskActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnPackage.TASK__TASK_ACTIVITY, oldTaskActivity, newTaskActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskActivity(TaskActivityGraph newTaskActivity) {
		if (newTaskActivity != taskActivity) {
			NotificationChain msgs = null;
			if (taskActivity != null)
				msgs = ((InternalEObject)taskActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnPackage.TASK__TASK_ACTIVITY, null, msgs);
			if (newTaskActivity != null)
				msgs = ((InternalEObject)newTaskActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LqnPackage.TASK__TASK_ACTIVITY, null, msgs);
			msgs = basicSetTaskActivity(newTaskActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.TASK__TASK_ACTIVITY, newTaskActivity, newTaskActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnPackage.TASK__ENTRY:
				return ((InternalEList<?>)getEntry()).basicRemove(otherEnd, msgs);
			case LqnPackage.TASK__TASK_ACTIVITY:
				return basicSetTaskActivity(null, msgs);
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
			case LqnPackage.TASK__NAME:
				return getName();
			case LqnPackage.TASK__MULTIPLICITY:
				return getMultiplicity();
			case LqnPackage.TASK__QUEUE_LENGTH:
				return getQueueLength();
			case LqnPackage.TASK__REPLICATION:
				return getReplication();
			case LqnPackage.TASK__SCHEDULING:
				return getScheduling();
			case LqnPackage.TASK__ACTIVITY_GRAPH:
				return getActivityGraph();
			case LqnPackage.TASK__THINK_TIME:
				return getThinkTime();
			case LqnPackage.TASK__PRIORITY:
				return getPriority();
			case LqnPackage.TASK__ENTRY:
				return getEntry();
			case LqnPackage.TASK__TASK_ACTIVITY:
				return getTaskActivity();
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
			case LqnPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case LqnPackage.TASK__MULTIPLICITY:
				setMultiplicity((Integer)newValue);
				return;
			case LqnPackage.TASK__QUEUE_LENGTH:
				setQueueLength((Integer)newValue);
				return;
			case LqnPackage.TASK__REPLICATION:
				setReplication((Integer)newValue);
				return;
			case LqnPackage.TASK__SCHEDULING:
				setScheduling((TaskSchedulingType)newValue);
				return;
			case LqnPackage.TASK__ACTIVITY_GRAPH:
				setActivityGraph((TaskOptionType)newValue);
				return;
			case LqnPackage.TASK__THINK_TIME:
				setThinkTime((Double)newValue);
				return;
			case LqnPackage.TASK__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case LqnPackage.TASK__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends Entry>)newValue);
				return;
			case LqnPackage.TASK__TASK_ACTIVITY:
				setTaskActivity((TaskActivityGraph)newValue);
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
			case LqnPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnPackage.TASK__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
			case LqnPackage.TASK__QUEUE_LENGTH:
				setQueueLength(QUEUE_LENGTH_EDEFAULT);
				return;
			case LqnPackage.TASK__REPLICATION:
				setReplication(REPLICATION_EDEFAULT);
				return;
			case LqnPackage.TASK__SCHEDULING:
				setScheduling(SCHEDULING_EDEFAULT);
				return;
			case LqnPackage.TASK__ACTIVITY_GRAPH:
				setActivityGraph(ACTIVITY_GRAPH_EDEFAULT);
				return;
			case LqnPackage.TASK__THINK_TIME:
				setThinkTime(THINK_TIME_EDEFAULT);
				return;
			case LqnPackage.TASK__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case LqnPackage.TASK__ENTRY:
				getEntry().clear();
				return;
			case LqnPackage.TASK__TASK_ACTIVITY:
				setTaskActivity((TaskActivityGraph)null);
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
			case LqnPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnPackage.TASK__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
			case LqnPackage.TASK__QUEUE_LENGTH:
				return queueLength != QUEUE_LENGTH_EDEFAULT;
			case LqnPackage.TASK__REPLICATION:
				return replication != REPLICATION_EDEFAULT;
			case LqnPackage.TASK__SCHEDULING:
				return scheduling != SCHEDULING_EDEFAULT;
			case LqnPackage.TASK__ACTIVITY_GRAPH:
				return activityGraph != ACTIVITY_GRAPH_EDEFAULT;
			case LqnPackage.TASK__THINK_TIME:
				return thinkTime != THINK_TIME_EDEFAULT;
			case LqnPackage.TASK__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case LqnPackage.TASK__ENTRY:
				return entry != null && !entry.isEmpty();
			case LqnPackage.TASK__TASK_ACTIVITY:
				return taskActivity != null;
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
		result.append(", queueLength: ");
		result.append(queueLength);
		result.append(", replication: ");
		result.append(replication);
		result.append(", scheduling: ");
		result.append(scheduling);
		result.append(", activityGraph: ");
		result.append(activityGraph);
		result.append(", thinkTime: ");
		result.append(thinkTime);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
