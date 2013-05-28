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
import simulator.base.ContinuousFailMode;
import simulator.base.ExternalService;
import simulator.base.ServiceCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simulator.base.impl.ExternalServiceImpl#getServiceCall <em>Service Call</em>}</li>
 *   <li>{@link simulator.base.impl.ExternalServiceImpl#getFailProb <em>Fail Prob</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalServiceImpl extends StepImpl implements ExternalService {
	/**
	 * The cached value of the '{@link #getServiceCall() <em>Service Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCall()
	 * @generated
	 * @ordered
	 */
	protected ServiceCall serviceCall;

	/**
	 * The cached value of the '{@link #getFailProb() <em>Fail Prob</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailProb()
	 * @generated
	 * @ordered
	 */
	protected ContinuousFailMode failProb;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.EXTERNAL_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCall getServiceCall() {
		return serviceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceCall(ServiceCall newServiceCall, NotificationChain msgs) {
		ServiceCall oldServiceCall = serviceCall;
		serviceCall = newServiceCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.EXTERNAL_SERVICE__SERVICE_CALL, oldServiceCall, newServiceCall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCall(ServiceCall newServiceCall) {
		if (newServiceCall != serviceCall) {
			NotificationChain msgs = null;
			if (serviceCall != null)
				msgs = ((InternalEObject)serviceCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.EXTERNAL_SERVICE__SERVICE_CALL, null, msgs);
			if (newServiceCall != null)
				msgs = ((InternalEObject)newServiceCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.EXTERNAL_SERVICE__SERVICE_CALL, null, msgs);
			msgs = basicSetServiceCall(newServiceCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.EXTERNAL_SERVICE__SERVICE_CALL, newServiceCall, newServiceCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousFailMode getFailProb() {
		return failProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailProb(ContinuousFailMode newFailProb, NotificationChain msgs) {
		ContinuousFailMode oldFailProb = failProb;
		failProb = newFailProb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.EXTERNAL_SERVICE__FAIL_PROB, oldFailProb, newFailProb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailProb(ContinuousFailMode newFailProb) {
		if (newFailProb != failProb) {
			NotificationChain msgs = null;
			if (failProb != null)
				msgs = ((InternalEObject)failProb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.EXTERNAL_SERVICE__FAIL_PROB, null, msgs);
			if (newFailProb != null)
				msgs = ((InternalEObject)newFailProb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.EXTERNAL_SERVICE__FAIL_PROB, null, msgs);
			msgs = basicSetFailProb(newFailProb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.EXTERNAL_SERVICE__FAIL_PROB, newFailProb, newFailProb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasePackage.EXTERNAL_SERVICE__SERVICE_CALL:
				return basicSetServiceCall(null, msgs);
			case BasePackage.EXTERNAL_SERVICE__FAIL_PROB:
				return basicSetFailProb(null, msgs);
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
			case BasePackage.EXTERNAL_SERVICE__SERVICE_CALL:
				return getServiceCall();
			case BasePackage.EXTERNAL_SERVICE__FAIL_PROB:
				return getFailProb();
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
			case BasePackage.EXTERNAL_SERVICE__SERVICE_CALL:
				setServiceCall((ServiceCall)newValue);
				return;
			case BasePackage.EXTERNAL_SERVICE__FAIL_PROB:
				setFailProb((ContinuousFailMode)newValue);
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
			case BasePackage.EXTERNAL_SERVICE__SERVICE_CALL:
				setServiceCall((ServiceCall)null);
				return;
			case BasePackage.EXTERNAL_SERVICE__FAIL_PROB:
				setFailProb((ContinuousFailMode)null);
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
			case BasePackage.EXTERNAL_SERVICE__SERVICE_CALL:
				return serviceCall != null;
			case BasePackage.EXTERNAL_SERVICE__FAIL_PROB:
				return failProb != null;
		}
		return super.eIsSet(featureID);
	}

} //ExternalServiceImpl
