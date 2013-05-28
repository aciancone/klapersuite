/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core.impl;

import klaper.core.CorePackage;
import klaper.core.Join;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link klaper.core.impl.JoinImpl#getTransitionsNeededToGo <em>Transitions Needed To Go</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinImpl extends ControlImpl implements Join {
	/**
	 * The default value of the '{@link #getTransitionsNeededToGo() <em>Transitions Needed To Go</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionsNeededToGo()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSITIONS_NEEDED_TO_GO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTransitionsNeededToGo() <em>Transitions Needed To Go</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionsNeededToGo()
	 * @generated
	 * @ordered
	 */
	protected int transitionsNeededToGo = TRANSITIONS_NEEDED_TO_GO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.JOIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTransitionsNeededToGo() {
		return transitionsNeededToGo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionsNeededToGo(int newTransitionsNeededToGo) {
		int oldTransitionsNeededToGo = transitionsNeededToGo;
		transitionsNeededToGo = newTransitionsNeededToGo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.JOIN__TRANSITIONS_NEEDED_TO_GO, oldTransitionsNeededToGo, transitionsNeededToGo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.JOIN__TRANSITIONS_NEEDED_TO_GO:
				return getTransitionsNeededToGo();
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
			case CorePackage.JOIN__TRANSITIONS_NEEDED_TO_GO:
				setTransitionsNeededToGo((Integer)newValue);
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
			case CorePackage.JOIN__TRANSITIONS_NEEDED_TO_GO:
				setTransitionsNeededToGo(TRANSITIONS_NEEDED_TO_GO_EDEFAULT);
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
			case CorePackage.JOIN__TRANSITIONS_NEEDED_TO_GO:
				return transitionsNeededToGo != TRANSITIONS_NEEDED_TO_GO_EDEFAULT;
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
		result.append(" (transitionsNeededToGo: ");
		result.append(transitionsNeededToGo);
		result.append(')');
		return result.toString();
	}

} //JoinImpl
