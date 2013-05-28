/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability.provider;

import java.util.ArrayList;
import java.util.Collection;

import klaper.probability.util.ProbabilityAdapterFactory;

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

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProbabilityItemProviderAdapterFactory extends ProbabilityAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public ProbabilityItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link klaper.probability.ProbabilityDistributionFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilityDistributionFunctionItemProvider probabilityDistributionFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link klaper.probability.ProbabilityDistributionFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProbabilityDistributionFunctionAdapter() {
		if (probabilityDistributionFunctionItemProvider == null) {
			probabilityDistributionFunctionItemProvider = new ProbabilityDistributionFunctionItemProvider(this);
		}

		return probabilityDistributionFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klaper.probability.Normal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalItemProvider normalItemProvider;

	/**
	 * This creates an adapter for a {@link klaper.probability.Normal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNormalAdapter() {
		if (normalItemProvider == null) {
			normalItemProvider = new NormalItemProvider(this);
		}

		return normalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klaper.probability.Poisson} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoissonItemProvider poissonItemProvider;

	/**
	 * This creates an adapter for a {@link klaper.probability.Poisson}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPoissonAdapter() {
		if (poissonItemProvider == null) {
			poissonItemProvider = new PoissonItemProvider(this);
		}

		return poissonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klaper.probability.Uniform} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniformItemProvider uniformItemProvider;

	/**
	 * This creates an adapter for a {@link klaper.probability.Uniform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUniformAdapter() {
		if (uniformItemProvider == null) {
			uniformItemProvider = new UniformItemProvider(this);
		}

		return uniformItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klaper.probability.Exponential} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExponentialItemProvider exponentialItemProvider;

	/**
	 * This creates an adapter for a {@link klaper.probability.Exponential}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExponentialAdapter() {
		if (exponentialItemProvider == null) {
			exponentialItemProvider = new ExponentialItemProvider(this);
		}

		return exponentialItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klaper.probability.Constant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantItemProvider constantItemProvider;

	/**
	 * This creates an adapter for a {@link klaper.probability.Constant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstantAdapter() {
		if (constantItemProvider == null) {
			constantItemProvider = new ConstantItemProvider(this);
		}

		return constantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klaper.probability.Histogram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistogramItemProvider histogramItemProvider;

	/**
	 * This creates an adapter for a {@link klaper.probability.Histogram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHistogramAdapter() {
		if (histogramItemProvider == null) {
			histogramItemProvider = new HistogramItemProvider(this);
		}

		return histogramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klaper.probability.HistogramSample} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistogramSampleItemProvider histogramSampleItemProvider;

	/**
	 * This creates an adapter for a {@link klaper.probability.HistogramSample}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHistogramSampleAdapter() {
		if (histogramSampleItemProvider == null) {
			histogramSampleItemProvider = new HistogramSampleItemProvider(this);
		}

		return histogramSampleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klaper.probability.Geometric} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometricItemProvider geometricItemProvider;

	/**
	 * This creates an adapter for a {@link klaper.probability.Geometric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeometricAdapter() {
		if (geometricItemProvider == null) {
			geometricItemProvider = new GeometricItemProvider(this);
		}

		return geometricItemProvider;
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
		if (probabilityDistributionFunctionItemProvider != null) probabilityDistributionFunctionItemProvider.dispose();
		if (normalItemProvider != null) normalItemProvider.dispose();
		if (poissonItemProvider != null) poissonItemProvider.dispose();
		if (uniformItemProvider != null) uniformItemProvider.dispose();
		if (exponentialItemProvider != null) exponentialItemProvider.dispose();
		if (constantItemProvider != null) constantItemProvider.dispose();
		if (histogramItemProvider != null) histogramItemProvider.dispose();
		if (histogramSampleItemProvider != null) histogramSampleItemProvider.dispose();
		if (geometricItemProvider != null) geometricItemProvider.dispose();
	}

}
