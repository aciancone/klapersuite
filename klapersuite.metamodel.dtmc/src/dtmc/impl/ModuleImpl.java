/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dtmc.impl;

import dtmc.DtmcPackage;
import dtmc.Module;
import dtmc.Node;
import dtmc.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dtmc.impl.ModuleImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link dtmc.impl.ModuleImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dtmc.impl.ModuleImpl#isIsAutonomous <em>Is Autonomous</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends NamedEntityImpl implements Module {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The default value of the '{@link #isIsAutonomous() <em>Is Autonomous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutonomous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTONOMOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAutonomous() <em>Is Autonomous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutonomous()
	 * @generated
	 * @ordered
	 */
	protected boolean isAutonomous = IS_AUTONOMOUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtmcPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList<Node>(Node.class, this, DtmcPackage.MODULE__NODES, DtmcPackage.NODE__MODULE);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, DtmcPackage.MODULE__TRANSITIONS, DtmcPackage.TRANSITION__MODULE);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAutonomous() {
		return isAutonomous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAutonomous(boolean newIsAutonomous) {
		boolean oldIsAutonomous = isAutonomous;
		isAutonomous = newIsAutonomous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtmcPackage.MODULE__IS_AUTONOMOUS, oldIsAutonomous, isAutonomous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DtmcPackage.MODULE__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
			case DtmcPackage.MODULE__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
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
			case DtmcPackage.MODULE__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case DtmcPackage.MODULE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
			case DtmcPackage.MODULE__NODES:
				return getNodes();
			case DtmcPackage.MODULE__TRANSITIONS:
				return getTransitions();
			case DtmcPackage.MODULE__IS_AUTONOMOUS:
				return isIsAutonomous();
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
			case DtmcPackage.MODULE__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case DtmcPackage.MODULE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case DtmcPackage.MODULE__IS_AUTONOMOUS:
				setIsAutonomous((Boolean)newValue);
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
			case DtmcPackage.MODULE__NODES:
				getNodes().clear();
				return;
			case DtmcPackage.MODULE__TRANSITIONS:
				getTransitions().clear();
				return;
			case DtmcPackage.MODULE__IS_AUTONOMOUS:
				setIsAutonomous(IS_AUTONOMOUS_EDEFAULT);
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
			case DtmcPackage.MODULE__NODES:
				return nodes != null && !nodes.isEmpty();
			case DtmcPackage.MODULE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case DtmcPackage.MODULE__IS_AUTONOMOUS:
				return isAutonomous != IS_AUTONOMOUS_EDEFAULT;
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
		result.append(" (isAutonomous: ");
		result.append(isAutonomous);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
