/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simulator.base.BasePackage;
import simulator.base.OpenWorkload;

import simulator.distribution.ProbabilityDistributionFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Workload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simulator.base.impl.OpenWorkloadImpl#getArrivalProcess <em>Arrival Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenWorkloadImpl extends WorkloadImpl implements OpenWorkload {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenWorkloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.OPEN_WORKLOAD;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.OPEN_WORKLOAD__ARRIVAL_PROCESS, oldArrivalProcess, newArrivalProcess);
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
				msgs = ((InternalEObject)arrivalProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.OPEN_WORKLOAD__ARRIVAL_PROCESS, null, msgs);
			if (newArrivalProcess != null)
				msgs = ((InternalEObject)newArrivalProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.OPEN_WORKLOAD__ARRIVAL_PROCESS, null, msgs);
			msgs = basicSetArrivalProcess(newArrivalProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.OPEN_WORKLOAD__ARRIVAL_PROCESS, newArrivalProcess, newArrivalProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasePackage.OPEN_WORKLOAD__ARRIVAL_PROCESS:
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
			case BasePackage.OPEN_WORKLOAD__ARRIVAL_PROCESS:
				return getArrivalProcess();
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
			case BasePackage.OPEN_WORKLOAD__ARRIVAL_PROCESS:
				setArrivalProcess((ProbabilityDistributionFunction)newValue);
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
			case BasePackage.OPEN_WORKLOAD__ARRIVAL_PROCESS:
				setArrivalProcess((ProbabilityDistributionFunction)null);
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
			case BasePackage.OPEN_WORKLOAD__ARRIVAL_PROCESS:
				return arrivalProcess != null;
		}
		return super.eIsSet(featureID);
	}

} //OpenWorkloadImpl
