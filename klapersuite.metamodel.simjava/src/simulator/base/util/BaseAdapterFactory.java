/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import simulator.base.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see simulator.base.BasePackage
 * @generated
 */
public class BaseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BasePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseSwitch<Adapter> modelSwitch =
		new BaseSwitch<Adapter>() {
			@Override
			public Adapter caseSimModel(SimModel object) {
				return createSimModelAdapter();
			}
			@Override
			public Adapter caseWorkload(Workload object) {
				return createWorkloadAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseResourceQueue(ResourceQueue object) {
				return createResourceQueueAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseStart(Start object) {
				return createStartAdapter();
			}
			@Override
			public Adapter caseEnd(End object) {
				return createEndAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseDiscreteFailMode(DiscreteFailMode object) {
				return createDiscreteFailModeAdapter();
			}
			@Override
			public Adapter caseContinuousFailMode(ContinuousFailMode object) {
				return createContinuousFailModeAdapter();
			}
			@Override
			public Adapter caseFailMode(FailMode object) {
				return createFailModeAdapter();
			}
			@Override
			public Adapter caseServiceCall(ServiceCall object) {
				return createServiceCallAdapter();
			}
			@Override
			public Adapter caseSynchServiceCall(SynchServiceCall object) {
				return createSynchServiceCallAdapter();
			}
			@Override
			public Adapter caseAsynchServiceCall(AsynchServiceCall object) {
				return createAsynchServiceCallAdapter();
			}
			@Override
			public Adapter caseBranch(Branch object) {
				return createBranchAdapter();
			}
			@Override
			public Adapter caseJoin(Join object) {
				return createJoinAdapter();
			}
			@Override
			public Adapter caseFork(Fork object) {
				return createForkAdapter();
			}
			@Override
			public Adapter caseWait(Wait object) {
				return createWaitAdapter();
			}
			@Override
			public Adapter caseOpenWorkload(OpenWorkload object) {
				return createOpenWorkloadAdapter();
			}
			@Override
			public Adapter caseClosedWorkload(ClosedWorkload object) {
				return createClosedWorkloadAdapter();
			}
			@Override
			public Adapter caseExternalService(ExternalService object) {
				return createExternalServiceAdapter();
			}
			@Override
			public Adapter caseServiceWake(ServiceWake object) {
				return createServiceWakeAdapter();
			}
			@Override
			public Adapter caseEClass0(EClass0 object) {
				return createEClass0Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.SimModel <em>Sim Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.SimModel
	 * @generated
	 */
	public Adapter createSimModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.Workload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.Workload
	 * @generated
	 */
	public Adapter createWorkloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.ResourceQueue <em>Resource Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.ResourceQueue
	 * @generated
	 */
	public Adapter createResourceQueueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.Start
	 * @generated
	 */
	public Adapter createStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.End
	 * @generated
	 */
	public Adapter createEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.DiscreteFailMode <em>Discrete Fail Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.DiscreteFailMode
	 * @generated
	 */
	public Adapter createDiscreteFailModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.ContinuousFailMode <em>Continuous Fail Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.ContinuousFailMode
	 * @generated
	 */
	public Adapter createContinuousFailModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.FailMode <em>Fail Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.FailMode
	 * @generated
	 */
	public Adapter createFailModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.ServiceCall <em>Service Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.ServiceCall
	 * @generated
	 */
	public Adapter createServiceCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.SynchServiceCall <em>Synch Service Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.SynchServiceCall
	 * @generated
	 */
	public Adapter createSynchServiceCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.AsynchServiceCall <em>Asynch Service Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.AsynchServiceCall
	 * @generated
	 */
	public Adapter createAsynchServiceCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.Branch
	 * @generated
	 */
	public Adapter createBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.Join
	 * @generated
	 */
	public Adapter createJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.Fork
	 * @generated
	 */
	public Adapter createForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.Wait
	 * @generated
	 */
	public Adapter createWaitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.OpenWorkload <em>Open Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.OpenWorkload
	 * @generated
	 */
	public Adapter createOpenWorkloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.ClosedWorkload <em>Closed Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.ClosedWorkload
	 * @generated
	 */
	public Adapter createClosedWorkloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.ExternalService <em>External Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.ExternalService
	 * @generated
	 */
	public Adapter createExternalServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.ServiceWake <em>Service Wake</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.ServiceWake
	 * @generated
	 */
	public Adapter createServiceWakeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.base.EClass0 <em>EClass0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.base.EClass0
	 * @generated
	 */
	public Adapter createEClass0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BaseAdapterFactory
