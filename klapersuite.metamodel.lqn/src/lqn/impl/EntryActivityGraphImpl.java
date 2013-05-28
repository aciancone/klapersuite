/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.impl;

import java.util.Collection;

import lqn.EntryActivityGraph;
import lqn.LqnPackage;
import lqn.ReplyActivity;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Activity Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lqn.impl.EntryActivityGraphImpl#getReplyActivity <em>Reply Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryActivityGraphImpl extends ActivityGraphImpl implements EntryActivityGraph {
	/**
	 * The cached value of the '{@link #getReplyActivity() <em>Reply Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ReplyActivity> replyActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryActivityGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.ENTRY_ACTIVITY_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReplyActivity> getReplyActivity() {
		if (replyActivity == null) {
			replyActivity = new EObjectContainmentEList<ReplyActivity>(ReplyActivity.class, this, LqnPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY);
		}
		return replyActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY:
				return ((InternalEList<?>)getReplyActivity()).basicRemove(otherEnd, msgs);
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
			case LqnPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY:
				return getReplyActivity();
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
			case LqnPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY:
				getReplyActivity().clear();
				getReplyActivity().addAll((Collection<? extends ReplyActivity>)newValue);
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
			case LqnPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY:
				getReplyActivity().clear();
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
			case LqnPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY:
				return replyActivity != null && !replyActivity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntryActivityGraphImpl
