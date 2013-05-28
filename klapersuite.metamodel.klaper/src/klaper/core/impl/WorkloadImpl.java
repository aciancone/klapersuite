/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core.impl;

import klaper.core.Behavior;
import klaper.core.CorePackage;
import klaper.core.Workload;
import klaper.core.WorkloadType;

import klaper.probability.ProbabilityDistributionFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link klaper.core.impl.WorkloadImpl#getType <em>Type</em>}</li>
 *   <li>{@link klaper.core.impl.WorkloadImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link klaper.core.impl.WorkloadImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link klaper.core.impl.WorkloadImpl#getArrivalProcess <em>Arrival Process</em>}</li>
 *   <li>{@link klaper.core.impl.WorkloadImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkloadImpl extends EObjectImpl implements Workload {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final WorkloadType TYPE_EDEFAULT = WorkloadType.NULL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected WorkloadType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected static final int POPULATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected int population = POPULATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior behavior;

	/**
	 * The cached value of the '{@link #getArrivalProcess() <em>Arrival Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalProcess()
	 * @generated
	 * @ordered
	 */
	protected ProbabilityDistributionFunction arrivalProcess;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.WORKLOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(WorkloadType newType) {
		WorkloadType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKLOAD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulation(int newPopulation) {
		int oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKLOAD__POPULATION, oldPopulation, population));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavior(Behavior newBehavior, NotificationChain msgs) {
		Behavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.WORKLOAD__BEHAVIOR, oldBehavior, newBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(Behavior newBehavior) {
		if (newBehavior != behavior) {
			NotificationChain msgs = null;
			if (behavior != null)
				msgs = ((InternalEObject)behavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.WORKLOAD__BEHAVIOR, null, msgs);
			if (newBehavior != null)
				msgs = ((InternalEObject)newBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.WORKLOAD__BEHAVIOR, null, msgs);
			msgs = basicSetBehavior(newBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKLOAD__BEHAVIOR, newBehavior, newBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityDistributionFunction getArrivalProcess() {
		return arrivalProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrivalProcess(ProbabilityDistributionFunction newArrivalProcess, NotificationChain msgs) {
		ProbabilityDistributionFunction oldArrivalProcess = arrivalProcess;
		arrivalProcess = newArrivalProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.WORKLOAD__ARRIVAL_PROCESS, oldArrivalProcess, newArrivalProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalProcess(ProbabilityDistributionFunction newArrivalProcess) {
		if (newArrivalProcess != arrivalProcess) {
			NotificationChain msgs = null;
			if (arrivalProcess != null)
				msgs = ((InternalEObject)arrivalProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.WORKLOAD__ARRIVAL_PROCESS, null, msgs);
			if (newArrivalProcess != null)
				msgs = ((InternalEObject)newArrivalProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.WORKLOAD__ARRIVAL_PROCESS, null, msgs);
			msgs = basicSetArrivalProcess(newArrivalProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKLOAD__ARRIVAL_PROCESS, newArrivalProcess, newArrivalProcess));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKLOAD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.WORKLOAD__BEHAVIOR:
				return basicSetBehavior(null, msgs);
			case CorePackage.WORKLOAD__ARRIVAL_PROCESS:
				return basicSetArrivalProcess(null, msgs);
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
			case CorePackage.WORKLOAD__TYPE:
				return getType();
			case CorePackage.WORKLOAD__POPULATION:
				return getPopulation();
			case CorePackage.WORKLOAD__BEHAVIOR:
				return getBehavior();
			case CorePackage.WORKLOAD__ARRIVAL_PROCESS:
				return getArrivalProcess();
			case CorePackage.WORKLOAD__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.WORKLOAD__TYPE:
				setType((WorkloadType)newValue);
				return;
			case CorePackage.WORKLOAD__POPULATION:
				setPopulation((Integer)newValue);
				return;
			case CorePackage.WORKLOAD__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case CorePackage.WORKLOAD__ARRIVAL_PROCESS:
				setArrivalProcess((ProbabilityDistributionFunction)newValue);
				return;
			case CorePackage.WORKLOAD__NAME:
				setName((String)newValue);
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
			case CorePackage.WORKLOAD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CorePackage.WORKLOAD__POPULATION:
				setPopulation(POPULATION_EDEFAULT);
				return;
			case CorePackage.WORKLOAD__BEHAVIOR:
				setBehavior((Behavior)null);
				return;
			case CorePackage.WORKLOAD__ARRIVAL_PROCESS:
				setArrivalProcess((ProbabilityDistributionFunction)null);
				return;
			case CorePackage.WORKLOAD__NAME:
				setName(NAME_EDEFAULT);
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
			case CorePackage.WORKLOAD__TYPE:
				return type != TYPE_EDEFAULT;
			case CorePackage.WORKLOAD__POPULATION:
				return population != POPULATION_EDEFAULT;
			case CorePackage.WORKLOAD__BEHAVIOR:
				return behavior != null;
			case CorePackage.WORKLOAD__ARRIVAL_PROCESS:
				return arrivalProcess != null;
			case CorePackage.WORKLOAD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", population: ");
		result.append(population);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WorkloadImpl
