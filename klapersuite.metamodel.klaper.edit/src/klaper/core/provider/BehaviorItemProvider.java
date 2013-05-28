/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core.provider;


import java.util.Collection;
import java.util.List;

import klaper.core.Behavior;
import klaper.core.CoreFactory;
import klaper.core.CorePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link klaper.core.Behavior} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CorePackage.Literals.BEHAVIOR__STEP);
			childrenFeatures.add(CorePackage.Literals.BEHAVIOR__TRANSITION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Behavior.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Behavior"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Behavior_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Behavior.class)) {
			case CorePackage.BEHAVIOR__STEP:
			case CorePackage.BEHAVIOR__TRANSITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.BEHAVIOR__STEP,
				 CoreFactory.eINSTANCE.createStep()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.BEHAVIOR__STEP,
				 CoreFactory.eINSTANCE.createControl()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.BEHAVIOR__STEP,
				 CoreFactory.eINSTANCE.createStart()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.BEHAVIOR__STEP,
				 CoreFactory.eINSTANCE.createWait()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.BEHAVIOR__STEP,
				 CoreFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.BEHAVIOR__STEP,
				 CoreFactory.eINSTANCE.createBranch()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.BEHAVIOR__STEP,
				 CoreFactory.eINSTANCE.createFork()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.BEHAVIOR__STEP,
				 CoreFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.BEHAVIOR__STEP,
				 CoreFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.BEHAVIOR__STEP,
				 CoreFactory.eINSTANCE.createAcquire()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.BEHAVIOR__STEP,
				 CoreFactory.eINSTANCE.createRelease()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.BEHAVIOR__STEP,
				 CoreFactory.eINSTANCE.createReconfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.BEHAVIOR__STEP,
				 CoreFactory.eINSTANCE.createCreateBinding()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.BEHAVIOR__STEP,
				 CoreFactory.eINSTANCE.createDeleteBinding()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.BEHAVIOR__STEP,
				 CoreFactory.eINSTANCE.createServiceControl()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.BEHAVIOR__TRANSITION,
				 CoreFactory.eINSTANCE.createTransition()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return KlaperEditPlugin.INSTANCE;
	}

}
