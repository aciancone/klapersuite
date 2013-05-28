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

import simulator.base.Activity;
import simulator.base.BasePackage;
import simulator.base.FailMode;

import simulator.distribution.ProbabilityDistributionFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simulator.base.impl.ActivityImpl#getRepetitions <em>Repetitions</em>}</li>
 *   <li>{@link simulator.base.impl.ActivityImpl#getServiceTime <em>Service Time</em>}</li>
 *   <li>{@link simulator.base.impl.ActivityImpl#getFailMode <em>Fail Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends StepImpl implements Activity {
	/**
	 * The default value of the '{@link #getRepetitions() <em>Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitions()
	 * @generated
	 * @ordered
	 */
	protected static final int REPETITIONS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getRepetitions() <em>Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitions()
	 * @generated
	 * @ordered
	 */
	protected int repetitions = REPETITIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceTime() <em>Service Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTime()
	 * @generated
	 * @ordered
	 */
	protected ProbabilityDistributionFunction serviceTime;

	/**
	 * The cached value of the '{@link #getFailMode() <em>Fail Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailMode()
	 * @generated
	 * @ordered
	 */
	protected FailMode failMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRepetitions() {
		return repetitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepetitions(int newRepetitions) {
		int oldRepetitions = repetitions;
		repetitions = newRepetitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.ACTIVITY__REPETITIONS, oldRepetitions, repetitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityDistributionFunction getServiceTime() {
		return serviceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceTime(ProbabilityDistributionFunction newServiceTime, NotificationChain msgs) {
		ProbabilityDistributionFunction oldServiceTime = serviceTime;
		serviceTime = newServiceTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.ACTIVITY__SERVICE_TIME, oldServiceTime, newServiceTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceTime(ProbabilityDistributionFunction newServiceTime) {
		if (newServiceTime != serviceTime) {
			NotificationChain msgs = null;
			if (serviceTime != null)
				msgs = ((InternalEObject)serviceTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.ACTIVITY__SERVICE_TIME, null, msgs);
			if (newServiceTime != null)
				msgs = ((InternalEObject)newServiceTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.ACTIVITY__SERVICE_TIME, null, msgs);
			msgs = basicSetServiceTime(newServiceTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.ACTIVITY__SERVICE_TIME, newServiceTime, newServiceTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailMode getFailMode() {
		return failMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailMode(FailMode newFailMode, NotificationChain msgs) {
		FailMode oldFailMode = failMode;
		failMode = newFailMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.ACTIVITY__FAIL_MODE, oldFailMode, newFailMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailMode(FailMode newFailMode) {
		if (newFailMode != failMode) {
			NotificationChain msgs = null;
			if (failMode != null)
				msgs = ((InternalEObject)failMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.ACTIVITY__FAIL_MODE, null, msgs);
			if (newFailMode != null)
				msgs = ((InternalEObject)newFailMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.ACTIVITY__FAIL_MODE, null, msgs);
			msgs = basicSetFailMode(newFailMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.ACTIVITY__FAIL_MODE, newFailMode, newFailMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasePackage.ACTIVITY__SERVICE_TIME:
				return basicSetServiceTime(null, msgs);
			case BasePackage.ACTIVITY__FAIL_MODE:
				return basicSetFailMode(null, msgs);
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
			case BasePackage.ACTIVITY__REPETITIONS:
				return getRepetitions();
			case BasePackage.ACTIVITY__SERVICE_TIME:
				return getServiceTime();
			case BasePackage.ACTIVITY__FAIL_MODE:
				return getFailMode();
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
			case BasePackage.ACTIVITY__REPETITIONS:
				setRepetitions((Integer)newValue);
				return;
			case BasePackage.ACTIVITY__SERVICE_TIME:
				setServiceTime((ProbabilityDistributionFunction)newValue);
				return;
			case BasePackage.ACTIVITY__FAIL_MODE:
				setFailMode((FailMode)newValue);
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
			case BasePackage.ACTIVITY__REPETITIONS:
				setRepetitions(REPETITIONS_EDEFAULT);
				return;
			case BasePackage.ACTIVITY__SERVICE_TIME:
				setServiceTime((ProbabilityDistributionFunction)null);
				return;
			case BasePackage.ACTIVITY__FAIL_MODE:
				setFailMode((FailMode)null);
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
			case BasePackage.ACTIVITY__REPETITIONS:
				return repetitions != REPETITIONS_EDEFAULT;
			case BasePackage.ACTIVITY__SERVICE_TIME:
				return serviceTime != null;
			case BasePackage.ACTIVITY__FAIL_MODE:
				return failMode != null;
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
		result.append(" (repetitions: ");
		result.append(repetitions);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
