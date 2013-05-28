/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core.impl;

import klaper.core.Activity;
import klaper.core.Behavior;
import klaper.core.CorePackage;

import klaper.probability.ProbabilityDistributionFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link klaper.core.impl.ActivityImpl#getNestedBehavior <em>Nested Behavior</em>}</li>
 *   <li>{@link klaper.core.impl.ActivityImpl#getInternalExecTime <em>Internal Exec Time</em>}</li>
 *   <li>{@link klaper.core.impl.ActivityImpl#getInternalFailProb <em>Internal Fail Prob</em>}</li>
 *   <li>{@link klaper.core.impl.ActivityImpl#getInternalFailTime <em>Internal Fail Time</em>}</li>
 *   <li>{@link klaper.core.impl.ActivityImpl#getRepetitions <em>Repetitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends StepImpl implements Activity {
	/**
	 * The cached value of the '{@link #getNestedBehavior() <em>Nested Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior nestedBehavior;

	/**
	 * The cached value of the '{@link #getInternalExecTime() <em>Internal Exec Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalExecTime()
	 * @generated
	 * @ordered
	 */
	protected ProbabilityDistributionFunction internalExecTime;

	/**
	 * The cached value of the '{@link #getInternalFailProb() <em>Internal Fail Prob</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFailProb()
	 * @generated
	 * @ordered
	 */
	protected ProbabilityDistributionFunction internalFailProb;

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
	 * The cached value of the '{@link #getRepetitions() <em>Repetitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitions()
	 * @generated
	 * @ordered
	 */
	protected ProbabilityDistributionFunction repetitions;

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
		return CorePackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getNestedBehavior() {
		return nestedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestedBehavior(Behavior newNestedBehavior, NotificationChain msgs) {
		Behavior oldNestedBehavior = nestedBehavior;
		nestedBehavior = newNestedBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ACTIVITY__NESTED_BEHAVIOR, oldNestedBehavior, newNestedBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestedBehavior(Behavior newNestedBehavior) {
		if (newNestedBehavior != nestedBehavior) {
			NotificationChain msgs = null;
			if (nestedBehavior != null)
				msgs = ((InternalEObject)nestedBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTIVITY__NESTED_BEHAVIOR, null, msgs);
			if (newNestedBehavior != null)
				msgs = ((InternalEObject)newNestedBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTIVITY__NESTED_BEHAVIOR, null, msgs);
			msgs = basicSetNestedBehavior(newNestedBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ACTIVITY__NESTED_BEHAVIOR, newNestedBehavior, newNestedBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityDistributionFunction getInternalExecTime() {
		return internalExecTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalExecTime(ProbabilityDistributionFunction newInternalExecTime, NotificationChain msgs) {
		ProbabilityDistributionFunction oldInternalExecTime = internalExecTime;
		internalExecTime = newInternalExecTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ACTIVITY__INTERNAL_EXEC_TIME, oldInternalExecTime, newInternalExecTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalExecTime(ProbabilityDistributionFunction newInternalExecTime) {
		if (newInternalExecTime != internalExecTime) {
			NotificationChain msgs = null;
			if (internalExecTime != null)
				msgs = ((InternalEObject)internalExecTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTIVITY__INTERNAL_EXEC_TIME, null, msgs);
			if (newInternalExecTime != null)
				msgs = ((InternalEObject)newInternalExecTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTIVITY__INTERNAL_EXEC_TIME, null, msgs);
			msgs = basicSetInternalExecTime(newInternalExecTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ACTIVITY__INTERNAL_EXEC_TIME, newInternalExecTime, newInternalExecTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityDistributionFunction getInternalFailProb() {
		return internalFailProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalFailProb(ProbabilityDistributionFunction newInternalFailProb, NotificationChain msgs) {
		ProbabilityDistributionFunction oldInternalFailProb = internalFailProb;
		internalFailProb = newInternalFailProb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ACTIVITY__INTERNAL_FAIL_PROB, oldInternalFailProb, newInternalFailProb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalFailProb(ProbabilityDistributionFunction newInternalFailProb) {
		if (newInternalFailProb != internalFailProb) {
			NotificationChain msgs = null;
			if (internalFailProb != null)
				msgs = ((InternalEObject)internalFailProb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTIVITY__INTERNAL_FAIL_PROB, null, msgs);
			if (newInternalFailProb != null)
				msgs = ((InternalEObject)newInternalFailProb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTIVITY__INTERNAL_FAIL_PROB, null, msgs);
			msgs = basicSetInternalFailProb(newInternalFailProb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ACTIVITY__INTERNAL_FAIL_PROB, newInternalFailProb, newInternalFailProb));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ACTIVITY__INTERNAL_FAIL_TIME, oldInternalFailTime, newInternalFailTime);
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
				msgs = ((InternalEObject)internalFailTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTIVITY__INTERNAL_FAIL_TIME, null, msgs);
			if (newInternalFailTime != null)
				msgs = ((InternalEObject)newInternalFailTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTIVITY__INTERNAL_FAIL_TIME, null, msgs);
			msgs = basicSetInternalFailTime(newInternalFailTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ACTIVITY__INTERNAL_FAIL_TIME, newInternalFailTime, newInternalFailTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityDistributionFunction getRepetitions() {
		return repetitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepetitions(ProbabilityDistributionFunction newRepetitions, NotificationChain msgs) {
		ProbabilityDistributionFunction oldRepetitions = repetitions;
		repetitions = newRepetitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ACTIVITY__REPETITIONS, oldRepetitions, newRepetitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepetitions(ProbabilityDistributionFunction newRepetitions) {
		if (newRepetitions != repetitions) {
			NotificationChain msgs = null;
			if (repetitions != null)
				msgs = ((InternalEObject)repetitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTIVITY__REPETITIONS, null, msgs);
			if (newRepetitions != null)
				msgs = ((InternalEObject)newRepetitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTIVITY__REPETITIONS, null, msgs);
			msgs = basicSetRepetitions(newRepetitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ACTIVITY__REPETITIONS, newRepetitions, newRepetitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ACTIVITY__NESTED_BEHAVIOR:
				return basicSetNestedBehavior(null, msgs);
			case CorePackage.ACTIVITY__INTERNAL_EXEC_TIME:
				return basicSetInternalExecTime(null, msgs);
			case CorePackage.ACTIVITY__INTERNAL_FAIL_PROB:
				return basicSetInternalFailProb(null, msgs);
			case CorePackage.ACTIVITY__INTERNAL_FAIL_TIME:
				return basicSetInternalFailTime(null, msgs);
			case CorePackage.ACTIVITY__REPETITIONS:
				return basicSetRepetitions(null, msgs);
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
			case CorePackage.ACTIVITY__NESTED_BEHAVIOR:
				return getNestedBehavior();
			case CorePackage.ACTIVITY__INTERNAL_EXEC_TIME:
				return getInternalExecTime();
			case CorePackage.ACTIVITY__INTERNAL_FAIL_PROB:
				return getInternalFailProb();
			case CorePackage.ACTIVITY__INTERNAL_FAIL_TIME:
				return getInternalFailTime();
			case CorePackage.ACTIVITY__REPETITIONS:
				return getRepetitions();
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
			case CorePackage.ACTIVITY__NESTED_BEHAVIOR:
				setNestedBehavior((Behavior)newValue);
				return;
			case CorePackage.ACTIVITY__INTERNAL_EXEC_TIME:
				setInternalExecTime((ProbabilityDistributionFunction)newValue);
				return;
			case CorePackage.ACTIVITY__INTERNAL_FAIL_PROB:
				setInternalFailProb((ProbabilityDistributionFunction)newValue);
				return;
			case CorePackage.ACTIVITY__INTERNAL_FAIL_TIME:
				setInternalFailTime((ProbabilityDistributionFunction)newValue);
				return;
			case CorePackage.ACTIVITY__REPETITIONS:
				setRepetitions((ProbabilityDistributionFunction)newValue);
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
			case CorePackage.ACTIVITY__NESTED_BEHAVIOR:
				setNestedBehavior((Behavior)null);
				return;
			case CorePackage.ACTIVITY__INTERNAL_EXEC_TIME:
				setInternalExecTime((ProbabilityDistributionFunction)null);
				return;
			case CorePackage.ACTIVITY__INTERNAL_FAIL_PROB:
				setInternalFailProb((ProbabilityDistributionFunction)null);
				return;
			case CorePackage.ACTIVITY__INTERNAL_FAIL_TIME:
				setInternalFailTime((ProbabilityDistributionFunction)null);
				return;
			case CorePackage.ACTIVITY__REPETITIONS:
				setRepetitions((ProbabilityDistributionFunction)null);
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
			case CorePackage.ACTIVITY__NESTED_BEHAVIOR:
				return nestedBehavior != null;
			case CorePackage.ACTIVITY__INTERNAL_EXEC_TIME:
				return internalExecTime != null;
			case CorePackage.ACTIVITY__INTERNAL_FAIL_PROB:
				return internalFailProb != null;
			case CorePackage.ACTIVITY__INTERNAL_FAIL_TIME:
				return internalFailTime != null;
			case CorePackage.ACTIVITY__REPETITIONS:
				return repetitions != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl
