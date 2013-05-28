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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dtmc.impl.NodeImpl#getModule <em>Module</em>}</li>
 *   <li>{@link dtmc.impl.NodeImpl#getOutTransitions <em>Out Transitions</em>}</li>
 *   <li>{@link dtmc.impl.NodeImpl#getInTransitions <em>In Transitions</em>}</li>
 *   <li>{@link dtmc.impl.NodeImpl#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link dtmc.impl.NodeImpl#isIsEnd <em>Is End</em>}</li>
 *   <li>{@link dtmc.impl.NodeImpl#isIsFail <em>Is Fail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends NamedEntityImpl implements Node {
	/**
	 * The cached value of the '{@link #getOutTransitions() <em>Out Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outTransitions;

	/**
	 * The cached value of the '{@link #getInTransitions() <em>In Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> inTransitions;

	/**
	 * The default value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStart()
	 * @generated
	 * @ordered
	 */
	protected boolean isStart = IS_START_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEnd() <em>Is End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_END_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEnd() <em>Is End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnd()
	 * @generated
	 * @ordered
	 */
	protected boolean isEnd = IS_END_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFail() <em>Is Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FAIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFail() <em>Is Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFail()
	 * @generated
	 * @ordered
	 */
	protected boolean isFail = IS_FAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtmcPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getModule() {
		if (eContainerFeatureID() != DtmcPackage.NODE__MODULE) return null;
		return (Module)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Module newModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModule, DtmcPackage.NODE__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Module newModule) {
		if (newModule != eInternalContainer() || (eContainerFeatureID() != DtmcPackage.NODE__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, DtmcPackage.MODULE__NODES, Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtmcPackage.NODE__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutTransitions() {
		if (outTransitions == null) {
			outTransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, DtmcPackage.NODE__OUT_TRANSITIONS, DtmcPackage.TRANSITION__FROM);
		}
		return outTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getInTransitions() {
		if (inTransitions == null) {
			inTransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, DtmcPackage.NODE__IN_TRANSITIONS, DtmcPackage.TRANSITION__TO);
		}
		return inTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStart() {
		return isStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStart(boolean newIsStart) {
		boolean oldIsStart = isStart;
		isStart = newIsStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtmcPackage.NODE__IS_START, oldIsStart, isStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEnd() {
		return isEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEnd(boolean newIsEnd) {
		boolean oldIsEnd = isEnd;
		isEnd = newIsEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtmcPackage.NODE__IS_END, oldIsEnd, isEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFail() {
		return isFail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFail(boolean newIsFail) {
		boolean oldIsFail = isFail;
		isFail = newIsFail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtmcPackage.NODE__IS_FAIL, oldIsFail, isFail));
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
			case DtmcPackage.NODE__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((Module)otherEnd, msgs);
			case DtmcPackage.NODE__OUT_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutTransitions()).basicAdd(otherEnd, msgs);
			case DtmcPackage.NODE__IN_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInTransitions()).basicAdd(otherEnd, msgs);
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
			case DtmcPackage.NODE__MODULE:
				return basicSetModule(null, msgs);
			case DtmcPackage.NODE__OUT_TRANSITIONS:
				return ((InternalEList<?>)getOutTransitions()).basicRemove(otherEnd, msgs);
			case DtmcPackage.NODE__IN_TRANSITIONS:
				return ((InternalEList<?>)getInTransitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DtmcPackage.NODE__MODULE:
				return eInternalContainer().eInverseRemove(this, DtmcPackage.MODULE__NODES, Module.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DtmcPackage.NODE__MODULE:
				return getModule();
			case DtmcPackage.NODE__OUT_TRANSITIONS:
				return getOutTransitions();
			case DtmcPackage.NODE__IN_TRANSITIONS:
				return getInTransitions();
			case DtmcPackage.NODE__IS_START:
				return isIsStart();
			case DtmcPackage.NODE__IS_END:
				return isIsEnd();
			case DtmcPackage.NODE__IS_FAIL:
				return isIsFail();
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
			case DtmcPackage.NODE__MODULE:
				setModule((Module)newValue);
				return;
			case DtmcPackage.NODE__OUT_TRANSITIONS:
				getOutTransitions().clear();
				getOutTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case DtmcPackage.NODE__IN_TRANSITIONS:
				getInTransitions().clear();
				getInTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case DtmcPackage.NODE__IS_START:
				setIsStart((Boolean)newValue);
				return;
			case DtmcPackage.NODE__IS_END:
				setIsEnd((Boolean)newValue);
				return;
			case DtmcPackage.NODE__IS_FAIL:
				setIsFail((Boolean)newValue);
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
			case DtmcPackage.NODE__MODULE:
				setModule((Module)null);
				return;
			case DtmcPackage.NODE__OUT_TRANSITIONS:
				getOutTransitions().clear();
				return;
			case DtmcPackage.NODE__IN_TRANSITIONS:
				getInTransitions().clear();
				return;
			case DtmcPackage.NODE__IS_START:
				setIsStart(IS_START_EDEFAULT);
				return;
			case DtmcPackage.NODE__IS_END:
				setIsEnd(IS_END_EDEFAULT);
				return;
			case DtmcPackage.NODE__IS_FAIL:
				setIsFail(IS_FAIL_EDEFAULT);
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
			case DtmcPackage.NODE__MODULE:
				return getModule() != null;
			case DtmcPackage.NODE__OUT_TRANSITIONS:
				return outTransitions != null && !outTransitions.isEmpty();
			case DtmcPackage.NODE__IN_TRANSITIONS:
				return inTransitions != null && !inTransitions.isEmpty();
			case DtmcPackage.NODE__IS_START:
				return isStart != IS_START_EDEFAULT;
			case DtmcPackage.NODE__IS_END:
				return isEnd != IS_END_EDEFAULT;
			case DtmcPackage.NODE__IS_FAIL:
				return isFail != IS_FAIL_EDEFAULT;
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
		result.append(" (isStart: ");
		result.append(isStart);
		result.append(", isEnd: ");
		result.append(isEnd);
		result.append(", isFail: ");
		result.append(isFail);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
