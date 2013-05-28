/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.provider;


import java.util.Collection;
import java.util.List;

import lqn.LqnFactory;
import lqn.LqnPackage;
import lqn.Precedence;

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
 * This is the item provider adapter for a {@link lqn.Precedence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrecedenceItemProvider
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
	public PrecedenceItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(LqnPackage.Literals.PRECEDENCE__PRE);
			childrenFeatures.add(LqnPackage.Literals.PRECEDENCE__POST);
			childrenFeatures.add(LqnPackage.Literals.PRECEDENCE__PRE_AND);
			childrenFeatures.add(LqnPackage.Literals.PRECEDENCE__POST_AND);
			childrenFeatures.add(LqnPackage.Literals.PRECEDENCE__PRE_OR);
			childrenFeatures.add(LqnPackage.Literals.PRECEDENCE__POST_OR);
			childrenFeatures.add(LqnPackage.Literals.PRECEDENCE__POST_LOOP);
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
	 * This returns Precedence.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Precedence"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Precedence_type");
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

		switch (notification.getFeatureID(Precedence.class)) {
			case LqnPackage.PRECEDENCE__PRE:
			case LqnPackage.PRECEDENCE__POST:
			case LqnPackage.PRECEDENCE__PRE_AND:
			case LqnPackage.PRECEDENCE__POST_AND:
			case LqnPackage.PRECEDENCE__PRE_OR:
			case LqnPackage.PRECEDENCE__POST_OR:
			case LqnPackage.PRECEDENCE__POST_LOOP:
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
				(LqnPackage.Literals.PRECEDENCE__PRE,
				 LqnFactory.eINSTANCE.createSingleActivityList()));

		newChildDescriptors.add
			(createChildParameter
				(LqnPackage.Literals.PRECEDENCE__POST,
				 LqnFactory.eINSTANCE.createSingleActivityList()));

		newChildDescriptors.add
			(createChildParameter
				(LqnPackage.Literals.PRECEDENCE__PRE_AND,
				 LqnFactory.eINSTANCE.createAndJoinList()));

		newChildDescriptors.add
			(createChildParameter
				(LqnPackage.Literals.PRECEDENCE__POST_AND,
				 LqnFactory.eINSTANCE.createActivityList()));

		newChildDescriptors.add
			(createChildParameter
				(LqnPackage.Literals.PRECEDENCE__PRE_OR,
				 LqnFactory.eINSTANCE.createActivityList()));

		newChildDescriptors.add
			(createChildParameter
				(LqnPackage.Literals.PRECEDENCE__POST_OR,
				 LqnFactory.eINSTANCE.createOrList()));

		newChildDescriptors.add
			(createChildParameter
				(LqnPackage.Literals.PRECEDENCE__POST_LOOP,
				 LqnFactory.eINSTANCE.createActivityLoopList()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == LqnPackage.Literals.PRECEDENCE__PRE ||
			childFeature == LqnPackage.Literals.PRECEDENCE__POST ||
			childFeature == LqnPackage.Literals.PRECEDENCE__POST_AND ||
			childFeature == LqnPackage.Literals.PRECEDENCE__PRE_OR;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LQNEditPlugin.INSTANCE;
	}

}
