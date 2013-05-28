/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import simulator.base.BasePackage;
import simulator.base.Join;
import simulator.base.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simulator.base.impl.JoinImpl#getNTransition <em>NTransition</em>}</li>
 *   <li>{@link simulator.base.impl.JoinImpl#getInTransition <em>In Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinImpl extends StepImpl implements Join {
	/**
	 * The default value of the '{@link #getNTransition() <em>NTransition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNTransition()
	 * @generated
	 * @ordered
	 */
	protected static final int NTRANSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNTransition() <em>NTransition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNTransition()
	 * @generated
	 * @ordered
	 */
	protected int nTransition = NTRANSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInTransition() <em>In Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> inTransition;

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
		return BasePackage.Literals.JOIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNTransition() {
		return nTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNTransition(int newNTransition) {
		int oldNTransition = nTransition;
		nTransition = newNTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.JOIN__NTRANSITION, oldNTransition, nTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getInTransition() {
		if (inTransition == null) {
			inTransition = new EObjectResolvingEList<Transition>(Transition.class, this, BasePackage.JOIN__IN_TRANSITION);
		}
		return inTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.JOIN__NTRANSITION:
				return getNTransition();
			case BasePackage.JOIN__IN_TRANSITION:
				return getInTransition();
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
			case BasePackage.JOIN__NTRANSITION:
				setNTransition((Integer)newValue);
				return;
			case BasePackage.JOIN__IN_TRANSITION:
				getInTransition().clear();
				getInTransition().addAll((Collection<? extends Transition>)newValue);
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
			case BasePackage.JOIN__NTRANSITION:
				setNTransition(NTRANSITION_EDEFAULT);
				return;
			case BasePackage.JOIN__IN_TRANSITION:
				getInTransition().clear();
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
			case BasePackage.JOIN__NTRANSITION:
				return nTransition != NTRANSITION_EDEFAULT;
			case BasePackage.JOIN__IN_TRANSITION:
				return inTransition != null && !inTransition.isEmpty();
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
		result.append(" (nTransition: ");
		result.append(nTransition);
		result.append(')');
		return result.toString();
	}

} //JoinImpl
