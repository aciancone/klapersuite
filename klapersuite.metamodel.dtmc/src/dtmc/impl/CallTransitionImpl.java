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
 * An implementation of the model object '<em><b>Call Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dtmc.impl.CallTransitionImpl#getInvokedTransition <em>Invoked Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallTransitionImpl extends TransitionImpl implements CallTransition {
	/**
	 * The cached value of the '{@link #getInvokedTransition() <em>Invoked Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokedTransition()
	 * @generated
	 * @ordered
	 */
	protected InvokedTransition invokedTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtmcPackage.Literals.CALL_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvokedTransition getInvokedTransition() {
		if (invokedTransition != null && invokedTransition.eIsProxy()) {
			InternalEObject oldInvokedTransition = (InternalEObject)invokedTransition;
			invokedTransition = (InvokedTransition)eResolveProxy(oldInvokedTransition);
			if (invokedTransition != oldInvokedTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DtmcPackage.CALL_TRANSITION__INVOKED_TRANSITION, oldInvokedTransition, invokedTransition));
			}
		}
		return invokedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvokedTransition basicGetInvokedTransition() {
		return invokedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvokedTransition(InvokedTransition newInvokedTransition, NotificationChain msgs) {
		InvokedTransition oldInvokedTransition = invokedTransition;
		invokedTransition = newInvokedTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DtmcPackage.CALL_TRANSITION__INVOKED_TRANSITION, oldInvokedTransition, newInvokedTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvokedTransition(InvokedTransition newInvokedTransition) {
		if (newInvokedTransition != invokedTransition) {
			NotificationChain msgs = null;
			if (invokedTransition != null)
				msgs = ((InternalEObject)invokedTransition).eInverseRemove(this, DtmcPackage.INVOKED_TRANSITION__CALL_TRANSITION, InvokedTransition.class, msgs);
			if (newInvokedTransition != null)
				msgs = ((InternalEObject)newInvokedTransition).eInverseAdd(this, DtmcPackage.INVOKED_TRANSITION__CALL_TRANSITION, InvokedTransition.class, msgs);
			msgs = basicSetInvokedTransition(newInvokedTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtmcPackage.CALL_TRANSITION__INVOKED_TRANSITION, newInvokedTransition, newInvokedTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DtmcPackage.CALL_TRANSITION__INVOKED_TRANSITION:
				if (invokedTransition != null)
					msgs = ((InternalEObject)invokedTransition).eInverseRemove(this, DtmcPackage.INVOKED_TRANSITION__CALL_TRANSITION, InvokedTransition.class, msgs);
				return basicSetInvokedTransition((InvokedTransition)otherEnd, msgs);
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
			case DtmcPackage.CALL_TRANSITION__INVOKED_TRANSITION:
				return basicSetInvokedTransition(null, msgs);
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
			case DtmcPackage.CALL_TRANSITION__INVOKED_TRANSITION:
				if (resolve) return getInvokedTransition();
				return basicGetInvokedTransition();
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
			case DtmcPackage.CALL_TRANSITION__INVOKED_TRANSITION:
				setInvokedTransition((InvokedTransition)newValue);
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
			case DtmcPackage.CALL_TRANSITION__INVOKED_TRANSITION:
				setInvokedTransition((InvokedTransition)null);
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
			case DtmcPackage.CALL_TRANSITION__INVOKED_TRANSITION:
				return invokedTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //CallTransitionImpl
