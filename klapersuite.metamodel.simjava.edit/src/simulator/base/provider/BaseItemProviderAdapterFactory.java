/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import simulator.base.util.BaseAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BaseItemProviderAdapterFactory extends BaseAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.SimModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimModelItemProvider simModelItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.SimModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimModelAdapter() {
		if (simModelItemProvider == null) {
			simModelItemProvider = new SimModelItemProvider(this);
		}

		return simModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.Workload} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadItemProvider workloadItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.Workload}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkloadAdapter() {
		if (workloadItemProvider == null) {
			workloadItemProvider = new WorkloadItemProvider(this);
		}

		return workloadItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.Service} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceItemProvider serviceItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceAdapter() {
		if (serviceItemProvider == null) {
			serviceItemProvider = new ServiceItemProvider(this);
		}

		return serviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.ResourceQueue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceQueueItemProvider resourceQueueItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.ResourceQueue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceQueueAdapter() {
		if (resourceQueueItemProvider == null) {
			resourceQueueItemProvider = new ResourceQueueItemProvider(this);
		}

		return resourceQueueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.Step} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepItemProvider stepItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStepAdapter() {
		if (stepItemProvider == null) {
			stepItemProvider = new StepItemProvider(this);
		}

		return stepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.Start} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartItemProvider startItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.Start}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStartAdapter() {
		if (startItemProvider == null) {
			startItemProvider = new StartItemProvider(this);
		}

		return startItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.End} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndItemProvider endItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.End}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndAdapter() {
		if (endItemProvider == null) {
			endItemProvider = new EndItemProvider(this);
		}

		return endItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.Activity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityItemProvider activityItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityAdapter() {
		if (activityItemProvider == null) {
			activityItemProvider = new ActivityItemProvider(this);
		}

		return activityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.DiscreteFailMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteFailModeItemProvider discreteFailModeItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.DiscreteFailMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiscreteFailModeAdapter() {
		if (discreteFailModeItemProvider == null) {
			discreteFailModeItemProvider = new DiscreteFailModeItemProvider(this);
		}

		return discreteFailModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.ContinuousFailMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuousFailModeItemProvider continuousFailModeItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.ContinuousFailMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContinuousFailModeAdapter() {
		if (continuousFailModeItemProvider == null) {
			continuousFailModeItemProvider = new ContinuousFailModeItemProvider(this);
		}

		return continuousFailModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.FailMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailModeItemProvider failModeItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.FailMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFailModeAdapter() {
		if (failModeItemProvider == null) {
			failModeItemProvider = new FailModeItemProvider(this);
		}

		return failModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.ServiceCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceCallItemProvider serviceCallItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.ServiceCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceCallAdapter() {
		if (serviceCallItemProvider == null) {
			serviceCallItemProvider = new ServiceCallItemProvider(this);
		}

		return serviceCallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.SynchServiceCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchServiceCallItemProvider synchServiceCallItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.SynchServiceCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSynchServiceCallAdapter() {
		if (synchServiceCallItemProvider == null) {
			synchServiceCallItemProvider = new SynchServiceCallItemProvider(this);
		}

		return synchServiceCallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.AsynchServiceCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsynchServiceCallItemProvider asynchServiceCallItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.AsynchServiceCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAsynchServiceCallAdapter() {
		if (asynchServiceCallItemProvider == null) {
			asynchServiceCallItemProvider = new AsynchServiceCallItemProvider(this);
		}

		return asynchServiceCallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.Branch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchItemProvider branchItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBranchAdapter() {
		if (branchItemProvider == null) {
			branchItemProvider = new BranchItemProvider(this);
		}

		return branchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.Join} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinItemProvider joinItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.Join}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJoinAdapter() {
		if (joinItemProvider == null) {
			joinItemProvider = new JoinItemProvider(this);
		}

		return joinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.Fork} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkItemProvider forkItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.Fork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForkAdapter() {
		if (forkItemProvider == null) {
			forkItemProvider = new ForkItemProvider(this);
		}

		return forkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.Wait} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaitItemProvider waitItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.Wait}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWaitAdapter() {
		if (waitItemProvider == null) {
			waitItemProvider = new WaitItemProvider(this);
		}

		return waitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.OpenWorkload} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenWorkloadItemProvider openWorkloadItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.OpenWorkload}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOpenWorkloadAdapter() {
		if (openWorkloadItemProvider == null) {
			openWorkloadItemProvider = new OpenWorkloadItemProvider(this);
		}

		return openWorkloadItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.ClosedWorkload} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClosedWorkloadItemProvider closedWorkloadItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.ClosedWorkload}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClosedWorkloadAdapter() {
		if (closedWorkloadItemProvider == null) {
			closedWorkloadItemProvider = new ClosedWorkloadItemProvider(this);
		}

		return closedWorkloadItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.ExternalService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalServiceItemProvider externalServiceItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.ExternalService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalServiceAdapter() {
		if (externalServiceItemProvider == null) {
			externalServiceItemProvider = new ExternalServiceItemProvider(this);
		}

		return externalServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.ServiceWake} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceWakeItemProvider serviceWakeItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.ServiceWake}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceWakeAdapter() {
		if (serviceWakeItemProvider == null) {
			serviceWakeItemProvider = new ServiceWakeItemProvider(this);
		}

		return serviceWakeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simulator.base.EClass0} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass0ItemProvider eClass0ItemProvider;

	/**
	 * This creates an adapter for a {@link simulator.base.EClass0}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEClass0Adapter() {
		if (eClass0ItemProvider == null) {
			eClass0ItemProvider = new EClass0ItemProvider(this);
		}

		return eClass0ItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (simModelItemProvider != null) simModelItemProvider.dispose();
		if (workloadItemProvider != null) workloadItemProvider.dispose();
		if (serviceItemProvider != null) serviceItemProvider.dispose();
		if (resourceQueueItemProvider != null) resourceQueueItemProvider.dispose();
		if (stepItemProvider != null) stepItemProvider.dispose();
		if (transitionItemProvider != null) transitionItemProvider.dispose();
		if (startItemProvider != null) startItemProvider.dispose();
		if (endItemProvider != null) endItemProvider.dispose();
		if (activityItemProvider != null) activityItemProvider.dispose();
		if (discreteFailModeItemProvider != null) discreteFailModeItemProvider.dispose();
		if (continuousFailModeItemProvider != null) continuousFailModeItemProvider.dispose();
		if (failModeItemProvider != null) failModeItemProvider.dispose();
		if (serviceCallItemProvider != null) serviceCallItemProvider.dispose();
		if (synchServiceCallItemProvider != null) synchServiceCallItemProvider.dispose();
		if (asynchServiceCallItemProvider != null) asynchServiceCallItemProvider.dispose();
		if (branchItemProvider != null) branchItemProvider.dispose();
		if (joinItemProvider != null) joinItemProvider.dispose();
		if (forkItemProvider != null) forkItemProvider.dispose();
		if (waitItemProvider != null) waitItemProvider.dispose();
		if (openWorkloadItemProvider != null) openWorkloadItemProvider.dispose();
		if (closedWorkloadItemProvider != null) closedWorkloadItemProvider.dispose();
		if (externalServiceItemProvider != null) externalServiceItemProvider.dispose();
		if (serviceWakeItemProvider != null) serviceWakeItemProvider.dispose();
		if (eClass0ItemProvider != null) eClass0ItemProvider.dispose();
	}

}