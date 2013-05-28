/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.impl;

import lqn.ActivityList;
import lqn.ActivityLoopList;
import lqn.AndJoinList;
import lqn.LqnPackage;
import lqn.OrList;
import lqn.Precedence;
import lqn.SingleActivityList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precedence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lqn.impl.PrecedenceImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link lqn.impl.PrecedenceImpl#getPost <em>Post</em>}</li>
 *   <li>{@link lqn.impl.PrecedenceImpl#getPreAND <em>Pre AND</em>}</li>
 *   <li>{@link lqn.impl.PrecedenceImpl#getPostAND <em>Post AND</em>}</li>
 *   <li>{@link lqn.impl.PrecedenceImpl#getPreOR <em>Pre OR</em>}</li>
 *   <li>{@link lqn.impl.PrecedenceImpl#getPostOR <em>Post OR</em>}</li>
 *   <li>{@link lqn.impl.PrecedenceImpl#getPostLOOP <em>Post LOOP</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrecedenceImpl extends EObjectImpl implements Precedence {
	/**
	 * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre()
	 * @generated
	 * @ordered
	 */
	protected SingleActivityList pre;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected SingleActivityList post;

	/**
	 * The cached value of the '{@link #getPreAND() <em>Pre AND</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAND()
	 * @generated
	 * @ordered
	 */
	protected AndJoinList preAND;

	/**
	 * The cached value of the '{@link #getPostAND() <em>Post AND</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostAND()
	 * @generated
	 * @ordered
	 */
	protected ActivityList postAND;

	/**
	 * The cached value of the '{@link #getPreOR() <em>Pre OR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreOR()
	 * @generated
	 * @ordered
	 */
	protected ActivityList preOR;

	/**
	 * The cached value of the '{@link #getPostOR() <em>Post OR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostOR()
	 * @generated
	 * @ordered
	 */
	protected OrList postOR;

	/**
	 * The cached value of the '{@link #getPostLOOP() <em>Post LOOP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostLOOP()
	 * @generated
	 * @ordered
	 */
	protected ActivityLoopList postLOOP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrecedenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.PRECEDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleActivityList getPre() {
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPre(SingleActivityList newPre, NotificationChain msgs) {
		SingleActivityList oldPre = pre;
		pre = newPre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE__PRE, oldPre, newPre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPre(SingleActivityList newPre) {
		if (newPre != pre) {
			NotificationChain msgs = null;
			if (pre != null)
				msgs = ((InternalEObject)pre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE__PRE, null, msgs);
			if (newPre != null)
				msgs = ((InternalEObject)newPre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE__PRE, null, msgs);
			msgs = basicSetPre(newPre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE__PRE, newPre, newPre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleActivityList getPost() {
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPost(SingleActivityList newPost, NotificationChain msgs) {
		SingleActivityList oldPost = post;
		post = newPost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE__POST, oldPost, newPost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPost(SingleActivityList newPost) {
		if (newPost != post) {
			NotificationChain msgs = null;
			if (post != null)
				msgs = ((InternalEObject)post).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE__POST, null, msgs);
			if (newPost != null)
				msgs = ((InternalEObject)newPost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE__POST, null, msgs);
			msgs = basicSetPost(newPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE__POST, newPost, newPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndJoinList getPreAND() {
		return preAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreAND(AndJoinList newPreAND, NotificationChain msgs) {
		AndJoinList oldPreAND = preAND;
		preAND = newPreAND;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE__PRE_AND, oldPreAND, newPreAND);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreAND(AndJoinList newPreAND) {
		if (newPreAND != preAND) {
			NotificationChain msgs = null;
			if (preAND != null)
				msgs = ((InternalEObject)preAND).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE__PRE_AND, null, msgs);
			if (newPreAND != null)
				msgs = ((InternalEObject)newPreAND).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE__PRE_AND, null, msgs);
			msgs = basicSetPreAND(newPreAND, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE__PRE_AND, newPreAND, newPreAND));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityList getPostAND() {
		return postAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostAND(ActivityList newPostAND, NotificationChain msgs) {
		ActivityList oldPostAND = postAND;
		postAND = newPostAND;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE__POST_AND, oldPostAND, newPostAND);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostAND(ActivityList newPostAND) {
		if (newPostAND != postAND) {
			NotificationChain msgs = null;
			if (postAND != null)
				msgs = ((InternalEObject)postAND).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE__POST_AND, null, msgs);
			if (newPostAND != null)
				msgs = ((InternalEObject)newPostAND).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE__POST_AND, null, msgs);
			msgs = basicSetPostAND(newPostAND, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE__POST_AND, newPostAND, newPostAND));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityList getPreOR() {
		return preOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreOR(ActivityList newPreOR, NotificationChain msgs) {
		ActivityList oldPreOR = preOR;
		preOR = newPreOR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE__PRE_OR, oldPreOR, newPreOR);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreOR(ActivityList newPreOR) {
		if (newPreOR != preOR) {
			NotificationChain msgs = null;
			if (preOR != null)
				msgs = ((InternalEObject)preOR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE__PRE_OR, null, msgs);
			if (newPreOR != null)
				msgs = ((InternalEObject)newPreOR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE__PRE_OR, null, msgs);
			msgs = basicSetPreOR(newPreOR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE__PRE_OR, newPreOR, newPreOR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrList getPostOR() {
		return postOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostOR(OrList newPostOR, NotificationChain msgs) {
		OrList oldPostOR = postOR;
		postOR = newPostOR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE__POST_OR, oldPostOR, newPostOR);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostOR(OrList newPostOR) {
		if (newPostOR != postOR) {
			NotificationChain msgs = null;
			if (postOR != null)
				msgs = ((InternalEObject)postOR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE__POST_OR, null, msgs);
			if (newPostOR != null)
				msgs = ((InternalEObject)newPostOR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE__POST_OR, null, msgs);
			msgs = basicSetPostOR(newPostOR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE__POST_OR, newPostOR, newPostOR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLoopList getPostLOOP() {
		return postLOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostLOOP(ActivityLoopList newPostLOOP, NotificationChain msgs) {
		ActivityLoopList oldPostLOOP = postLOOP;
		postLOOP = newPostLOOP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE__POST_LOOP, oldPostLOOP, newPostLOOP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostLOOP(ActivityLoopList newPostLOOP) {
		if (newPostLOOP != postLOOP) {
			NotificationChain msgs = null;
			if (postLOOP != null)
				msgs = ((InternalEObject)postLOOP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE__POST_LOOP, null, msgs);
			if (newPostLOOP != null)
				msgs = ((InternalEObject)newPostLOOP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LqnPackage.PRECEDENCE__POST_LOOP, null, msgs);
			msgs = basicSetPostLOOP(newPostLOOP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.PRECEDENCE__POST_LOOP, newPostLOOP, newPostLOOP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnPackage.PRECEDENCE__PRE:
				return basicSetPre(null, msgs);
			case LqnPackage.PRECEDENCE__POST:
				return basicSetPost(null, msgs);
			case LqnPackage.PRECEDENCE__PRE_AND:
				return basicSetPreAND(null, msgs);
			case LqnPackage.PRECEDENCE__POST_AND:
				return basicSetPostAND(null, msgs);
			case LqnPackage.PRECEDENCE__PRE_OR:
				return basicSetPreOR(null, msgs);
			case LqnPackage.PRECEDENCE__POST_OR:
				return basicSetPostOR(null, msgs);
			case LqnPackage.PRECEDENCE__POST_LOOP:
				return basicSetPostLOOP(null, msgs);
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
			case LqnPackage.PRECEDENCE__PRE:
				return getPre();
			case LqnPackage.PRECEDENCE__POST:
				return getPost();
			case LqnPackage.PRECEDENCE__PRE_AND:
				return getPreAND();
			case LqnPackage.PRECEDENCE__POST_AND:
				return getPostAND();
			case LqnPackage.PRECEDENCE__PRE_OR:
				return getPreOR();
			case LqnPackage.PRECEDENCE__POST_OR:
				return getPostOR();
			case LqnPackage.PRECEDENCE__POST_LOOP:
				return getPostLOOP();
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
			case LqnPackage.PRECEDENCE__PRE:
				setPre((SingleActivityList)newValue);
				return;
			case LqnPackage.PRECEDENCE__POST:
				setPost((SingleActivityList)newValue);
				return;
			case LqnPackage.PRECEDENCE__PRE_AND:
				setPreAND((AndJoinList)newValue);
				return;
			case LqnPackage.PRECEDENCE__POST_AND:
				setPostAND((ActivityList)newValue);
				return;
			case LqnPackage.PRECEDENCE__PRE_OR:
				setPreOR((ActivityList)newValue);
				return;
			case LqnPackage.PRECEDENCE__POST_OR:
				setPostOR((OrList)newValue);
				return;
			case LqnPackage.PRECEDENCE__POST_LOOP:
				setPostLOOP((ActivityLoopList)newValue);
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
			case LqnPackage.PRECEDENCE__PRE:
				setPre((SingleActivityList)null);
				return;
			case LqnPackage.PRECEDENCE__POST:
				setPost((SingleActivityList)null);
				return;
			case LqnPackage.PRECEDENCE__PRE_AND:
				setPreAND((AndJoinList)null);
				return;
			case LqnPackage.PRECEDENCE__POST_AND:
				setPostAND((ActivityList)null);
				return;
			case LqnPackage.PRECEDENCE__PRE_OR:
				setPreOR((ActivityList)null);
				return;
			case LqnPackage.PRECEDENCE__POST_OR:
				setPostOR((OrList)null);
				return;
			case LqnPackage.PRECEDENCE__POST_LOOP:
				setPostLOOP((ActivityLoopList)null);
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
			case LqnPackage.PRECEDENCE__PRE:
				return pre != null;
			case LqnPackage.PRECEDENCE__POST:
				return post != null;
			case LqnPackage.PRECEDENCE__PRE_AND:
				return preAND != null;
			case LqnPackage.PRECEDENCE__POST_AND:
				return postAND != null;
			case LqnPackage.PRECEDENCE__PRE_OR:
				return preOR != null;
			case LqnPackage.PRECEDENCE__POST_OR:
				return postOR != null;
			case LqnPackage.PRECEDENCE__POST_LOOP:
				return postLOOP != null;
		}
		return super.eIsSet(featureID);
	}

} //PrecedenceImpl
