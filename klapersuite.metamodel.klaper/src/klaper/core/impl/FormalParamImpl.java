/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core.impl;

import klaper.core.ActualParam;
import klaper.core.CorePackage;
import klaper.core.FormalParam;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link klaper.core.impl.FormalParamImpl#getName <em>Name</em>}</li>
 *   <li>{@link klaper.core.impl.FormalParamImpl#isReturn <em>Return</em>}</li>
 *   <li>{@link klaper.core.impl.FormalParamImpl#getActual <em>Actual</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormalParamImpl extends EObjectImpl implements FormalParam {
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
	 * The default value of the '{@link #isReturn() <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturn() <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturn()
	 * @generated
	 * @ordered
	 */
	protected boolean return_ = RETURN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActual() <em>Actual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual()
	 * @generated
	 * @ordered
	 */
	protected ActualParam actual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.FORMAL_PARAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FORMAL_PARAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReturn() {
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturn(boolean newReturn) {
		boolean oldReturn = return_;
		return_ = newReturn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FORMAL_PARAM__RETURN, oldReturn, return_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualParam getActual() {
		if (actual != null && actual.eIsProxy()) {
			InternalEObject oldActual = (InternalEObject)actual;
			actual = (ActualParam)eResolveProxy(oldActual);
			if (actual != oldActual) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.FORMAL_PARAM__ACTUAL, oldActual, actual));
			}
		}
		return actual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualParam basicGetActual() {
		return actual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActual(ActualParam newActual, NotificationChain msgs) {
		ActualParam oldActual = actual;
		actual = newActual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FORMAL_PARAM__ACTUAL, oldActual, newActual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActual(ActualParam newActual) {
		if (newActual != actual) {
			NotificationChain msgs = null;
			if (actual != null)
				msgs = ((InternalEObject)actual).eInverseRemove(this, CorePackage.ACTUAL_PARAM__FORMAL, ActualParam.class, msgs);
			if (newActual != null)
				msgs = ((InternalEObject)newActual).eInverseAdd(this, CorePackage.ACTUAL_PARAM__FORMAL, ActualParam.class, msgs);
			msgs = basicSetActual(newActual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FORMAL_PARAM__ACTUAL, newActual, newActual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FORMAL_PARAM__ACTUAL:
				if (actual != null)
					msgs = ((InternalEObject)actual).eInverseRemove(this, CorePackage.ACTUAL_PARAM__FORMAL, ActualParam.class, msgs);
				return basicSetActual((ActualParam)otherEnd, msgs);
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
			case CorePackage.FORMAL_PARAM__ACTUAL:
				return basicSetActual(null, msgs);
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
			case CorePackage.FORMAL_PARAM__NAME:
				return getName();
			case CorePackage.FORMAL_PARAM__RETURN:
				return isReturn();
			case CorePackage.FORMAL_PARAM__ACTUAL:
				if (resolve) return getActual();
				return basicGetActual();
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
			case CorePackage.FORMAL_PARAM__NAME:
				setName((String)newValue);
				return;
			case CorePackage.FORMAL_PARAM__RETURN:
				setReturn((Boolean)newValue);
				return;
			case CorePackage.FORMAL_PARAM__ACTUAL:
				setActual((ActualParam)newValue);
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
			case CorePackage.FORMAL_PARAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.FORMAL_PARAM__RETURN:
				setReturn(RETURN_EDEFAULT);
				return;
			case CorePackage.FORMAL_PARAM__ACTUAL:
				setActual((ActualParam)null);
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
			case CorePackage.FORMAL_PARAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.FORMAL_PARAM__RETURN:
				return return_ != RETURN_EDEFAULT;
			case CorePackage.FORMAL_PARAM__ACTUAL:
				return actual != null;
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
		result.append(", return: ");
		result.append(return_);
		result.append(')');
		return result.toString();
	}

} //FormalParamImpl
