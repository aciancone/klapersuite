/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dtmc.impl;

import dtmc.CallTransition;
import dtmc.DtmcPackage;
import dtmc.InvokedTransition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoked Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dtmc.impl.InvokedTransitionImpl#getCallTransition <em>Call Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokedTransitionImpl extends TransitionImpl implements InvokedTransition {
	/**
	 * The cached value of the '{@link #getCallTransition() <em>Call Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallTransition()
	 * @generated
	 * @ordered
	 */
	protected CallTransition callTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvokedTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtmcPackage.Literals.INVOKED_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTransition getCallTransition() {
		if (callTransition != null && callTransition.eIsProxy()) {
			InternalEObject oldCallTransition = (InternalEObject)callTransition;
			callTransition = (CallTransition)eResolveProxy(oldCallTransition);
			if (callTransition != oldCallTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DtmcPackage.INVOKED_TRANSITION__CALL_TRANSITION, oldCallTransition, callTransition));
			}
		}
		return callTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTransition basicGetCallTransition() {
		return callTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallTransition(CallTransition newCallTransition, NotificationChain msgs) {
		CallTransition oldCallTransition = callTransition;
		callTransition = newCallTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DtmcPackage.INVOKED_TRANSITION__CALL_TRANSITION, oldCallTransition, newCallTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallTransition(CallTransition newCallTransition) {
		if (newCallTransition != callTransition) {
			NotificationChain msgs = null;
			if (callTransition != null)
				msgs = ((InternalEObject)callTransition).eInverseRemove(this, DtmcPackage.CALL_TRANSITION__INVOKED_TRANSITION, CallTransition.class, msgs);
			if (newCallTransition != null)
				msgs = ((InternalEObject)newCallTransition).eInverseAdd(this, DtmcPackage.CALL_TRANSITION__INVOKED_TRANSITION, CallTransition.class, msgs);
			msgs = basicSetCallTransition(newCallTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtmcPackage.INVOKED_TRANSITION__CALL_TRANSITION, newCallTransition, newCallTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DtmcPackage.INVOKED_TRANSITION__CALL_TRANSITION:
				if (callTransition != null)
					msgs = ((InternalEObject)callTransition).eInverseRemove(this, DtmcPackage.CALL_TRANSITION__INVOKED_TRANSITION, CallTransition.class, msgs);
				return basicSetCallTransition((CallTransition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DtmcPackage.INVOKED_TRANSITION__CALL_TRANSITION:
				return basicSetCallTransition(null, msgs);
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
			case DtmcPackage.INVOKED_TRANSITION__CALL_TRANSITION:
				if (resolve) return getCallTransition();
				return basicGetCallTransition();
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
			case DtmcPackage.INVOKED_TRANSITION__CALL_TRANSITION:
				setCallTransition((CallTransition)newValue);
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
			case DtmcPackage.INVOKED_TRANSITION__CALL_TRANSITION:
				setCallTransition((CallTransition)null);
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
			case DtmcPackage.INVOKED_TRANSITION__CALL_TRANSITION:
				return callTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //InvokedTransitionImpl
