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
import simulator.base.DiscreteFailMode;

import simulator.distribution.ProbabilityDistributionFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Fail Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simulator.base.impl.DiscreteFailModeImpl#getInternalFailTime <em>Internal Fail Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscreteFailModeImpl extends FailModeImpl implements DiscreteFailMode {
	/**
	 * The cached value of the '{@link #getInternalFailTime() <em>Internal Fail Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFailTime()
	 * @generated
	 * @ordered
	 */
	protected ProbabilityDistributionFunction internalFailTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteFailModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.DISCRETE_FAIL_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityDistributionFunction getInternalFailTime() {
		return internalFailTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalFailTime(ProbabilityDistributionFunction newInternalFailTime, NotificationChain msgs) {
		ProbabilityDistributionFunction oldInternalFailTime = internalFailTime;
		internalFailTime = newInternalFailTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.DISCRETE_FAIL_MODE__INTERNAL_FAIL_TIME, oldInternalFailTime, newInternalFailTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalFailTime(ProbabilityDistributionFunction newInternalFailTime) {
		if (newInternalFailTime != internalFailTime) {
			NotificationChain msgs = null;
			if (internalFailTime != null)
				msgs = ((InternalEObject)internalFailTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.DISCRETE_FAIL_MODE__INTERNAL_FAIL_TIME, null, msgs);
			if (newInternalFailTime != null)
				msgs = ((InternalEObject)newInternalFailTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.DISCRETE_FAIL_MODE__INTERNAL_FAIL_TIME, null, msgs);
			msgs = basicSetInternalFailTime(newInternalFailTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DISCRETE_FAIL_MODE__INTERNAL_FAIL_TIME, newInternalFailTime, newInternalFailTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasePackage.DISCRETE_FAIL_MODE__INTERNAL_FAIL_TIME:
				return basicSetInternalFailTime(null, msgs);
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
			case BasePackage.DISCRETE_FAIL_MODE__INTERNAL_FAIL_TIME:
				return getInternalFailTime();
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
			case BasePackage.DISCRETE_FAIL_MODE__INTERNAL_FAIL_TIME:
				setInternalFailTime((ProbabilityDistributionFunction)newValue);
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
			case BasePackage.DISCRETE_FAIL_MODE__INTERNAL_FAIL_TIME:
				setInternalFailTime((ProbabilityDistributionFunction)null);
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
			case BasePackage.DISCRETE_FAIL_MODE__INTERNAL_FAIL_TIME:
				return internalFailTime != null;
		}
		return super.eIsSet(featureID);
	}

} //DiscreteFailModeImpl
