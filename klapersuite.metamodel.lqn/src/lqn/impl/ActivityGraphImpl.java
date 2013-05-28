/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.impl;

import java.util.Collection;

import lqn.ActivityDef;
import lqn.ActivityGraph;
import lqn.LqnPackage;
import lqn.Precedence;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lqn.impl.ActivityGraphImpl#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link lqn.impl.ActivityGraphImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityGraphImpl extends EObjectImpl implements ActivityGraph {
	/**
	 * The cached value of the '{@link #getPrecedence() <em>Precedence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedence()
	 * @generated
	 * @ordered
	 */
	protected EList<Precedence> precedence;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityDef> activity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.ACTIVITY_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Precedence> getPrecedence() {
		if (precedence == null) {
			precedence = new EObjectContainmentEList<Precedence>(Precedence.class, this, LqnPackage.ACTIVITY_GRAPH__PRECEDENCE);
		}
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityDef> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<ActivityDef>(ActivityDef.class, this, LqnPackage.ACTIVITY_GRAPH__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnPackage.ACTIVITY_GRAPH__PRECEDENCE:
				return ((InternalEList<?>)getPrecedence()).basicRemove(otherEnd, msgs);
			case LqnPackage.ACTIVITY_GRAPH__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
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
			case LqnPackage.ACTIVITY_GRAPH__PRECEDENCE:
				return getPrecedence();
			case LqnPackage.ACTIVITY_GRAPH__ACTIVITY:
				return getActivity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LqnPackage.ACTIVITY_GRAPH__PRECEDENCE:
				getPrecedence().clear();
				getPrecedence().addAll((Collection<? extends Precedence>)newValue);
				return;
			case LqnPackage.ACTIVITY_GRAPH__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends ActivityDef>)newValue);
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
			case LqnPackage.ACTIVITY_GRAPH__PRECEDENCE:
				getPrecedence().clear();
				return;
			case LqnPackage.ACTIVITY_GRAPH__ACTIVITY:
				getActivity().clear();
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
			case LqnPackage.ACTIVITY_GRAPH__PRECEDENCE:
				return precedence != null && !precedence.isEmpty();
			case LqnPackage.ACTIVITY_GRAPH__ACTIVITY:
				return activity != null && !activity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityGraphImpl
