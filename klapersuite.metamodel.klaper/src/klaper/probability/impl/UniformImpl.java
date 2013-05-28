/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability.impl;

import klaper.expr.Expression;

import klaper.probability.ProbabilityPackage;
import klaper.probability.Uniform;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uniform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link klaper.probability.impl.UniformImpl#getMin <em>Min</em>}</li>
 *   <li>{@link klaper.probability.impl.UniformImpl#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UniformImpl extends ProbabilityDistributionFunctionImpl implements Uniform {
	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected Expression min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected Expression max;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProbabilityPackage.Literals.UNIFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(Expression newMin, NotificationChain msgs) {
		Expression oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProbabilityPackage.UNIFORM__MIN, oldMin, newMin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(Expression newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProbabilityPackage.UNIFORM__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProbabilityPackage.UNIFORM__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProbabilityPackage.UNIFORM__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(Expression newMax, NotificationChain msgs) {
		Expression oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProbabilityPackage.UNIFORM__MAX, oldMax, newMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(Expression newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProbabilityPackage.UNIFORM__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProbabilityPackage.UNIFORM__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProbabilityPackage.UNIFORM__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProbabilityPackage.UNIFORM__MIN:
				return basicSetMin(null, msgs);
			case ProbabilityPackage.UNIFORM__MAX:
				return basicSetMax(null, msgs);
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
			case ProbabilityPackage.UNIFORM__MIN:
				return getMin();
			case ProbabilityPackage.UNIFORM__MAX:
				return getMax();
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
			case ProbabilityPackage.UNIFORM__MIN:
				setMin((Expression)newValue);
				return;
			case ProbabilityPackage.UNIFORM__MAX:
				setMax((Expression)newValue);
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
			case ProbabilityPackage.UNIFORM__MIN:
				setMin((Expression)null);
				return;
			case ProbabilityPackage.UNIFORM__MAX:
				setMax((Expression)null);
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
			case ProbabilityPackage.UNIFORM__MIN:
				return min != null;
			case ProbabilityPackage.UNIFORM__MAX:
				return max != null;
		}
		return super.eIsSet(featureID);
	}

} //UniformImpl
