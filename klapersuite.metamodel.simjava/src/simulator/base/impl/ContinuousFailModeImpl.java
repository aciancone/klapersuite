/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simulator.base.BasePackage;
import simulator.base.ContinuousFailMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuous Fail Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simulator.base.impl.ContinuousFailModeImpl#getInternalFailProb <em>Internal Fail Prob</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuousFailModeImpl extends FailModeImpl implements ContinuousFailMode {
	/**
	 * The default value of the '{@link #getInternalFailProb() <em>Internal Fail Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFailProb()
	 * @generated
	 * @ordered
	 */
	protected static final double INTERNAL_FAIL_PROB_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInternalFailProb() <em>Internal Fail Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFailProb()
	 * @generated
	 * @ordered
	 */
	protected double internalFailProb = INTERNAL_FAIL_PROB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuousFailModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.CONTINUOUS_FAIL_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInternalFailProb() {
		return internalFailProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalFailProb(double newInternalFailProb) {
		double oldInternalFailProb = internalFailProb;
		internalFailProb = newInternalFailProb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.CONTINUOUS_FAIL_MODE__INTERNAL_FAIL_PROB, oldInternalFailProb, internalFailProb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.CONTINUOUS_FAIL_MODE__INTERNAL_FAIL_PROB:
				return getInternalFailProb();
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
			case BasePackage.CONTINUOUS_FAIL_MODE__INTERNAL_FAIL_PROB:
				setInternalFailProb((Double)newValue);
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
			case BasePackage.CONTINUOUS_FAIL_MODE__INTERNAL_FAIL_PROB:
				setInternalFailProb(INTERNAL_FAIL_PROB_EDEFAULT);
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
			case BasePackage.CONTINUOUS_FAIL_MODE__INTERNAL_FAIL_PROB:
				return internalFailProb != INTERNAL_FAIL_PROB_EDEFAULT;
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
		result.append(" (internalFailProb: ");
		result.append(internalFailProb);
		result.append(')');
		return result.toString();
	}

} //ContinuousFailModeImpl
