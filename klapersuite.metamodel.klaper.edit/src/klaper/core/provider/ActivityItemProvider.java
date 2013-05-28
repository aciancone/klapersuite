/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core.provider;


import java.util.Collection;
import java.util.List;

import klaper.core.Activity;
import klaper.core.CoreFactory;
import klaper.core.CorePackage;

import klaper.probability.ProbabilityFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link klaper.core.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider
	extends StepItemProvider
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
	public ActivityItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CorePackage.Literals.ACTIVITY__NESTED_BEHAVIOR);
			childrenFeatures.add(CorePackage.Literals.ACTIVITY__INTERNAL_EXEC_TIME);
			childrenFeatures.add(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_PROB);
			childrenFeatures.add(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_TIME);
			childrenFeatures.add(CorePackage.Literals.ACTIVITY__REPETITIONS);
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
	 * This returns Activity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Activity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Activity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Activity_type") :
			getString("_UI_Activity_type") + " " + label;
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

		switch (notification.getFeatureID(Activity.class)) {
			case CorePackage.ACTIVITY__NESTED_BEHAVIOR:
			case CorePackage.ACTIVITY__INTERNAL_EXEC_TIME:
			case CorePackage.ACTIVITY__INTERNAL_FAIL_PROB:
			case CorePackage.ACTIVITY__INTERNAL_FAIL_TIME:
			case CorePackage.ACTIVITY__REPETITIONS:
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
				(CorePackage.Literals.ACTIVITY__NESTED_BEHAVIOR,
				 CoreFactory.eINSTANCE.createBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_EXEC_TIME,
				 ProbabilityFactory.eINSTANCE.createProbabilityDistributionFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_EXEC_TIME,
				 ProbabilityFactory.eINSTANCE.createNormal()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_EXEC_TIME,
				 ProbabilityFactory.eINSTANCE.createPoisson()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_EXEC_TIME,
				 ProbabilityFactory.eINSTANCE.createUniform()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_EXEC_TIME,
				 ProbabilityFactory.eINSTANCE.createExponential()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_EXEC_TIME,
				 ProbabilityFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_EXEC_TIME,
				 ProbabilityFactory.eINSTANCE.createHistogram()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_EXEC_TIME,
				 ProbabilityFactory.eINSTANCE.createGeometric()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_PROB,
				 ProbabilityFactory.eINSTANCE.createProbabilityDistributionFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_PROB,
				 ProbabilityFactory.eINSTANCE.createNormal()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_PROB,
				 ProbabilityFactory.eINSTANCE.createPoisson()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_PROB,
				 ProbabilityFactory.eINSTANCE.createUniform()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_PROB,
				 ProbabilityFactory.eINSTANCE.createExponential()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_PROB,
				 ProbabilityFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_PROB,
				 ProbabilityFactory.eINSTANCE.createHistogram()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_PROB,
				 ProbabilityFactory.eINSTANCE.createGeometric()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_TIME,
				 ProbabilityFactory.eINSTANCE.createProbabilityDistributionFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_TIME,
				 ProbabilityFactory.eINSTANCE.createNormal()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_TIME,
				 ProbabilityFactory.eINSTANCE.createPoisson()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_TIME,
				 ProbabilityFactory.eINSTANCE.createUniform()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_TIME,
				 ProbabilityFactory.eINSTANCE.createExponential()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_TIME,
				 ProbabilityFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_TIME,
				 ProbabilityFactory.eINSTANCE.createHistogram()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_TIME,
				 ProbabilityFactory.eINSTANCE.createGeometric()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__REPETITIONS,
				 ProbabilityFactory.eINSTANCE.createProbabilityDistributionFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__REPETITIONS,
				 ProbabilityFactory.eINSTANCE.createNormal()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__REPETITIONS,
				 ProbabilityFactory.eINSTANCE.createPoisson()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__REPETITIONS,
				 ProbabilityFactory.eINSTANCE.createUniform()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__REPETITIONS,
				 ProbabilityFactory.eINSTANCE.createExponential()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__REPETITIONS,
				 ProbabilityFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__REPETITIONS,
				 ProbabilityFactory.eINSTANCE.createHistogram()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ACTIVITY__REPETITIONS,
				 ProbabilityFactory.eINSTANCE.createGeometric()));
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
			childFeature == CorePackage.Literals.ACTIVITY__INTERNAL_EXEC_TIME ||
			childFeature == CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_PROB ||
			childFeature == CorePackage.Literals.ACTIVITY__INTERNAL_FAIL_TIME ||
			childFeature == CorePackage.Literals.ACTIVITY__REPETITIONS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
