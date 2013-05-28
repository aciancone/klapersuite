/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core.impl;

import klaper.core.CorePackage;
import klaper.core.Reconfiguration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconfiguration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link klaper.core.impl.ReconfigurationImpl#getSourceStep <em>Source Step</em>}</li>
 *   <li>{@link klaper.core.impl.ReconfigurationImpl#getTargetService <em>Target Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReconfigurationImpl extends ActivityImpl implements Reconfiguration {
	/**
	 * The default value of the '{@link #getSourceStep() <em>Source Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceStep()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_STEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceStep() <em>Source Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceStep()
	 * @generated
	 * @ordered
	 */
	protected String sourceStep = SOURCE_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetService() <em>Target Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetService()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetService() <em>Target Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetService()
	 * @generated
	 * @ordered
	 */
	protected String targetService = TARGET_SERVICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.RECONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceStep() {
		return sourceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceStep(String newSourceStep) {
		String oldSourceStep = sourceStep;
		sourceStep = newSourceStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RECONFIGURATION__SOURCE_STEP, oldSourceStep, sourceStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetService() {
		return targetService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetService(String newTargetService) {
		String oldTargetService = targetService;
		targetService = newTargetService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RECONFIGURATION__TARGET_SERVICE, oldTargetService, targetService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.RECONFIGURATION__SOURCE_STEP:
				return getSourceStep();
			case CorePackage.RECONFIGURATION__TARGET_SERVICE:
				return getTargetService();
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
			case CorePackage.RECONFIGURATION__SOURCE_STEP:
				setSourceStep((String)newValue);
				return;
			case CorePackage.RECONFIGURATION__TARGET_SERVICE:
				setTargetService((String)newValue);
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
			case CorePackage.RECONFIGURATION__SOURCE_STEP:
				setSourceStep(SOURCE_STEP_EDEFAULT);
				return;
			case CorePackage.RECONFIGURATION__TARGET_SERVICE:
				setTargetService(TARGET_SERVICE_EDEFAULT);
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
			case CorePackage.RECONFIGURATION__SOURCE_STEP:
				return SOURCE_STEP_EDEFAULT == null ? sourceStep != null : !SOURCE_STEP_EDEFAULT.equals(sourceStep);
			case CorePackage.RECONFIGURATION__TARGET_SERVICE:
				return TARGET_SERVICE_EDEFAULT == null ? targetService != null : !TARGET_SERVICE_EDEFAULT.equals(targetService);
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
		result.append(" (sourceStep: ");
		result.append(sourceStep);
		result.append(", targetService: ");
		result.append(targetService);
		result.append(')');
		return result.toString();
	}

} //ReconfigurationImpl
