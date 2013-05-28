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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dtmc.impl.TransitionImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link dtmc.impl.TransitionImpl#get_from <em>from</em>}</li>
 *   <li>{@link dtmc.impl.TransitionImpl#get_to <em>to</em>}</li>
 *   <li>{@link dtmc.impl.TransitionImpl#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TransitionImpl extends NamedEntityImpl implements Transition {
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final String PROBABILITY_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected String probability = PROBABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #get_from() <em>from</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_from()
	 * @generated
	 * @ordered
	 */
	protected Node _from;

	/**
	 * The cached value of the '{@link #get_to() <em>to</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_to()
	 * @generated
	 * @ordered
	 */
	protected Node _to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtmcPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(String newProbability) {
		String oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtmcPackage.TRANSITION__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node get_from() {
		if (_from != null && _from.eIsProxy()) {
			InternalEObject old_from = (InternalEObject)_from;
			_from = (Node)eResolveProxy(old_from);
			if (_from != old_from) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DtmcPackage.TRANSITION__FROM, old_from, _from));
			}
		}
		return _from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGet_from() {
		return _from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSet_from(Node new_from, NotificationChain msgs) {
		Node old_from = _from;
		_from = new_from;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DtmcPackage.TRANSITION__FROM, old_from, new_from);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_from(Node new_from) {
		if (new_from != _from) {
			NotificationChain msgs = null;
			if (_from != null)
				msgs = ((InternalEObject)_from).eInverseRemove(this, DtmcPackage.NODE__OUT_TRANSITIONS, Node.class, msgs);
			if (new_from != null)
				msgs = ((InternalEObject)new_from).eInverseAdd(this, DtmcPackage.NODE__OUT_TRANSITIONS, Node.class, msgs);
			msgs = basicSet_from(new_from, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtmcPackage.TRANSITION__FROM, new_from, new_from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node get_to() {
		if (_to != null && _to.eIsProxy()) {
			InternalEObject old_to = (InternalEObject)_to;
			_to = (Node)eResolveProxy(old_to);
			if (_to != old_to) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DtmcPackage.TRANSITION__TO, old_to, _to));
			}
		}
		return _to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGet_to() {
		return _to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSet_to(Node new_to, NotificationChain msgs) {
		Node old_to = _to;
		_to = new_to;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DtmcPackage.TRANSITION__TO, old_to, new_to);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_to(Node new_to) {
		if (new_to != _to) {
			NotificationChain msgs = null;
			if (_to != null)
				msgs = ((InternalEObject)_to).eInverseRemove(this, DtmcPackage.NODE__IN_TRANSITIONS, Node.class, msgs);
			if (new_to != null)
				msgs = ((InternalEObject)new_to).eInverseAdd(this, DtmcPackage.NODE__IN_TRANSITIONS, Node.class, msgs);
			msgs = basicSet_to(new_to, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtmcPackage.TRANSITION__TO, new_to, new_to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getModule() {
		if (eContainerFeatureID() != DtmcPackage.TRANSITION__MODULE) return null;
		return (Module)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Module newModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModule, DtmcPackage.TRANSITION__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Module newModule) {
		if (newModule != eInternalContainer() || (eContainerFeatureID() != DtmcPackage.TRANSITION__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, DtmcPackage.MODULE__TRANSITIONS, Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtmcPackage.TRANSITION__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DtmcPackage.TRANSITION__FROM:
				if (_from != null)
					msgs = ((InternalEObject)_from).eInverseRemove(this, DtmcPackage.NODE__OUT_TRANSITIONS, Node.class, msgs);
				return basicSet_from((Node)otherEnd, msgs);
			case DtmcPackage.TRANSITION__TO:
				if (_to != null)
					msgs = ((InternalEObject)_to).eInverseRemove(this, DtmcPackage.NODE__IN_TRANSITIONS, Node.class, msgs);
				return basicSet_to((Node)otherEnd, msgs);
			case DtmcPackage.TRANSITION__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((Module)otherEnd, msgs);
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
			case DtmcPackage.TRANSITION__FROM:
				return basicSet_from(null, msgs);
			case DtmcPackage.TRANSITION__TO:
				return basicSet_to(null, msgs);
			case DtmcPackage.TRANSITION__MODULE:
				return basicSetModule(null, msgs);
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
			case DtmcPackage.TRANSITION__MODULE:
				return eInternalContainer().eInverseRemove(this, DtmcPackage.MODULE__TRANSITIONS, Module.class, msgs);
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
			case DtmcPackage.TRANSITION__PROBABILITY:
				return getProbability();
			case DtmcPackage.TRANSITION__FROM:
				if (resolve) return get_from();
				return basicGet_from();
			case DtmcPackage.TRANSITION__TO:
				if (resolve) return get_to();
				return basicGet_to();
			case DtmcPackage.TRANSITION__MODULE:
				return getModule();
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
			case DtmcPackage.TRANSITION__PROBABILITY:
				setProbability((String)newValue);
				return;
			case DtmcPackage.TRANSITION__FROM:
				set_from((Node)newValue);
				return;
			case DtmcPackage.TRANSITION__TO:
				set_to((Node)newValue);
				return;
			case DtmcPackage.TRANSITION__MODULE:
				setModule((Module)newValue);
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
			case DtmcPackage.TRANSITION__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case DtmcPackage.TRANSITION__FROM:
				set_from((Node)null);
				return;
			case DtmcPackage.TRANSITION__TO:
				set_to((Node)null);
				return;
			case DtmcPackage.TRANSITION__MODULE:
				setModule((Module)null);
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
			case DtmcPackage.TRANSITION__PROBABILITY:
				return PROBABILITY_EDEFAULT == null ? probability != null : !PROBABILITY_EDEFAULT.equals(probability);
			case DtmcPackage.TRANSITION__FROM:
				return _from != null;
			case DtmcPackage.TRANSITION__TO:
				return _to != null;
			case DtmcPackage.TRANSITION__MODULE:
				return getModule() != null;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
