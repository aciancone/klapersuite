/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.impl;

import lqn.ActivityOr;
import lqn.LqnPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Or</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lqn.impl.ActivityOrImpl#getProb <em>Prob</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityOrImpl extends ActivityImpl implements ActivityOr {
	/**
	 * The default value of the '{@link #getProb() <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProb()
	 * @generated
	 * @ordered
	 */
	protected static final double PROB_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProb() <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProb()
	 * @generated
	 * @ordered
	 */
	protected double prob = PROB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityOrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.ACTIVITY_OR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProb() {
		return prob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProb(double newProb) {
		double oldProb = prob;
		prob = newProb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ACTIVITY_OR__PROB, oldProb, prob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LqnPackage.ACTIVITY_OR__PROB:
				return getProb();
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
			case LqnPackage.ACTIVITY_OR__PROB:
				setProb((Double)newValue);
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
			case LqnPackage.ACTIVITY_OR__PROB:
				setProb(PROB_EDEFAULT);
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
			case LqnPackage.ACTIVITY_OR__PROB:
				return prob != PROB_EDEFAULT;
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
		result.append(" (prob: ");
		result.append(prob);
		result.append(')');
		return result.toString();
	}

} //ActivityOrImpl
