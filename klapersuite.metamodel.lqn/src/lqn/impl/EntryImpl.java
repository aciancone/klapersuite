/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.impl;

import java.util.Collection;

import lqn.Entry;
import lqn.EntryActivityGraph;
import lqn.EntryMakingCall;
import lqn.EntryType;
import lqn.LqnPackage;
import lqn.PhaseActivities;
import lqn.Semaphore;

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
 * An implementation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lqn.impl.EntryImpl#getName <em>Name</em>}</li>
 *   <li>{@link lqn.impl.EntryImpl#getOpenArrivalRate <em>Open Arrival Rate</em>}</li>
 *   <li>{@link lqn.impl.EntryImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link lqn.impl.EntryImpl#getSemaphore <em>Semaphore</em>}</li>
 *   <li>{@link lqn.impl.EntryImpl#getType <em>Type</em>}</li>
 *   <li>{@link lqn.impl.EntryImpl#getEntryActivityGraph <em>Entry Activity Graph</em>}</li>
 *   <li>{@link lqn.impl.EntryImpl#getEntryPhaseActivities <em>Entry Phase Activities</em>}</li>
 *   <li>{@link lqn.impl.EntryImpl#getForwarding <em>Forwarding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryImpl extends EObjectImpl implements Entry {
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
	 * The default value of the '{@link #getOpenArrivalRate() <em>Open Arrival Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenArrivalRate()
	 * @generated
	 * @ordered
	 */
	protected static final double OPEN_ARRIVAL_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOpenArrivalRate() <em>Open Arrival Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenArrivalRate()
	 * @generated
	 * @ordered
	 */
	protected double openArrivalRate = OPEN_ARRIVAL_RATE_EDEFAULT;

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
	 * The default value of the '{@link #getSemaphore() <em>Semaphore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemaphore()
	 * @generated
	 * @ordered
	 */
	protected static final Semaphore SEMAPHORE_EDEFAULT = Semaphore.NULL;

	/**
	 * The cached value of the '{@link #getSemaphore() <em>Semaphore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemaphore()
	 * @generated
	 * @ordered
	 */
	protected Semaphore semaphore = SEMAPHORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EntryType TYPE_EDEFAULT = EntryType.NULL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EntryType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntryActivityGraph() <em>Entry Activity Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryActivityGraph()
	 * @generated
	 * @ordered
	 */
	protected EntryActivityGraph entryActivityGraph;

	/**
	 * The cached value of the '{@link #getEntryPhaseActivities() <em>Entry Phase Activities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPhaseActivities()
	 * @generated
	 * @ordered
	 */
	protected PhaseActivities entryPhaseActivities;

	/**
	 * The cached value of the '{@link #getForwarding() <em>Forwarding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwarding()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryMakingCall> forwarding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.ENTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOpenArrivalRate() {
		return openArrivalRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenArrivalRate(double newOpenArrivalRate) {
		double oldOpenArrivalRate = openArrivalRate;
		openArrivalRate = newOpenArrivalRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY__OPEN_ARRIVAL_RATE, oldOpenArrivalRate, openArrivalRate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semaphore getSemaphore() {
		return semaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemaphore(Semaphore newSemaphore) {
		Semaphore oldSemaphore = semaphore;
		semaphore = newSemaphore == null ? SEMAPHORE_EDEFAULT : newSemaphore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY__SEMAPHORE, oldSemaphore, semaphore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EntryType newType) {
		EntryType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryActivityGraph getEntryActivityGraph() {
		return entryActivityGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryActivityGraph(EntryActivityGraph newEntryActivityGraph, NotificationChain msgs) {
		EntryActivityGraph oldEntryActivityGraph = entryActivityGraph;
		entryActivityGraph = newEntryActivityGraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY__ENTRY_ACTIVITY_GRAPH, oldEntryActivityGraph, newEntryActivityGraph);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryActivityGraph(EntryActivityGraph newEntryActivityGraph) {
		if (newEntryActivityGraph != entryActivityGraph) {
			NotificationChain msgs = null;
			if (entryActivityGraph != null)
				msgs = ((InternalEObject)entryActivityGraph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnPackage.ENTRY__ENTRY_ACTIVITY_GRAPH, null, msgs);
			if (newEntryActivityGraph != null)
				msgs = ((InternalEObject)newEntryActivityGraph).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LqnPackage.ENTRY__ENTRY_ACTIVITY_GRAPH, null, msgs);
			msgs = basicSetEntryActivityGraph(newEntryActivityGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY__ENTRY_ACTIVITY_GRAPH, newEntryActivityGraph, newEntryActivityGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseActivities getEntryPhaseActivities() {
		return entryPhaseActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryPhaseActivities(PhaseActivities newEntryPhaseActivities, NotificationChain msgs) {
		PhaseActivities oldEntryPhaseActivities = entryPhaseActivities;
		entryPhaseActivities = newEntryPhaseActivities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY__ENTRY_PHASE_ACTIVITIES, oldEntryPhaseActivities, newEntryPhaseActivities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPhaseActivities(PhaseActivities newEntryPhaseActivities) {
		if (newEntryPhaseActivities != entryPhaseActivities) {
			NotificationChain msgs = null;
			if (entryPhaseActivities != null)
				msgs = ((InternalEObject)entryPhaseActivities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnPackage.ENTRY__ENTRY_PHASE_ACTIVITIES, null, msgs);
			if (newEntryPhaseActivities != null)
				msgs = ((InternalEObject)newEntryPhaseActivities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LqnPackage.ENTRY__ENTRY_PHASE_ACTIVITIES, null, msgs);
			msgs = basicSetEntryPhaseActivities(newEntryPhaseActivities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ENTRY__ENTRY_PHASE_ACTIVITIES, newEntryPhaseActivities, newEntryPhaseActivities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryMakingCall> getForwarding() {
		if (forwarding == null) {
			forwarding = new EObjectContainmentEList<EntryMakingCall>(EntryMakingCall.class, this, LqnPackage.ENTRY__FORWARDING);
		}
		return forwarding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnPackage.ENTRY__ENTRY_ACTIVITY_GRAPH:
				return basicSetEntryActivityGraph(null, msgs);
			case LqnPackage.ENTRY__ENTRY_PHASE_ACTIVITIES:
				return basicSetEntryPhaseActivities(null, msgs);
			case LqnPackage.ENTRY__FORWARDING:
				return ((InternalEList<?>)getForwarding()).basicRemove(otherEnd, msgs);
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
			case LqnPackage.ENTRY__NAME:
				return getName();
			case LqnPackage.ENTRY__OPEN_ARRIVAL_RATE:
				return getOpenArrivalRate();
			case LqnPackage.ENTRY__PRIORITY:
				return getPriority();
			case LqnPackage.ENTRY__SEMAPHORE:
				return getSemaphore();
			case LqnPackage.ENTRY__TYPE:
				return getType();
			case LqnPackage.ENTRY__ENTRY_ACTIVITY_GRAPH:
				return getEntryActivityGraph();
			case LqnPackage.ENTRY__ENTRY_PHASE_ACTIVITIES:
				return getEntryPhaseActivities();
			case LqnPackage.ENTRY__FORWARDING:
				return getForwarding();
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
			case LqnPackage.ENTRY__NAME:
				setName((String)newValue);
				return;
			case LqnPackage.ENTRY__OPEN_ARRIVAL_RATE:
				setOpenArrivalRate((Double)newValue);
				return;
			case LqnPackage.ENTRY__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case LqnPackage.ENTRY__SEMAPHORE:
				setSemaphore((Semaphore)newValue);
				return;
			case LqnPackage.ENTRY__TYPE:
				setType((EntryType)newValue);
				return;
			case LqnPackage.ENTRY__ENTRY_ACTIVITY_GRAPH:
				setEntryActivityGraph((EntryActivityGraph)newValue);
				return;
			case LqnPackage.ENTRY__ENTRY_PHASE_ACTIVITIES:
				setEntryPhaseActivities((PhaseActivities)newValue);
				return;
			case LqnPackage.ENTRY__FORWARDING:
				getForwarding().clear();
				getForwarding().addAll((Collection<? extends EntryMakingCall>)newValue);
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
			case LqnPackage.ENTRY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnPackage.ENTRY__OPEN_ARRIVAL_RATE:
				setOpenArrivalRate(OPEN_ARRIVAL_RATE_EDEFAULT);
				return;
			case LqnPackage.ENTRY__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case LqnPackage.ENTRY__SEMAPHORE:
				setSemaphore(SEMAPHORE_EDEFAULT);
				return;
			case LqnPackage.ENTRY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case LqnPackage.ENTRY__ENTRY_ACTIVITY_GRAPH:
				setEntryActivityGraph((EntryActivityGraph)null);
				return;
			case LqnPackage.ENTRY__ENTRY_PHASE_ACTIVITIES:
				setEntryPhaseActivities((PhaseActivities)null);
				return;
			case LqnPackage.ENTRY__FORWARDING:
				getForwarding().clear();
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
			case LqnPackage.ENTRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnPackage.ENTRY__OPEN_ARRIVAL_RATE:
				return openArrivalRate != OPEN_ARRIVAL_RATE_EDEFAULT;
			case LqnPackage.ENTRY__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case LqnPackage.ENTRY__SEMAPHORE:
				return semaphore != SEMAPHORE_EDEFAULT;
			case LqnPackage.ENTRY__TYPE:
				return type != TYPE_EDEFAULT;
			case LqnPackage.ENTRY__ENTRY_ACTIVITY_GRAPH:
				return entryActivityGraph != null;
			case LqnPackage.ENTRY__ENTRY_PHASE_ACTIVITIES:
				return entryPhaseActivities != null;
			case LqnPackage.ENTRY__FORWARDING:
				return forwarding != null && !forwarding.isEmpty();
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
		result.append(", openArrivalRate: ");
		result.append(openArrivalRate);
		result.append(", priority: ");
		result.append(priority);
		result.append(", semaphore: ");
		result.append(semaphore);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //EntryImpl
