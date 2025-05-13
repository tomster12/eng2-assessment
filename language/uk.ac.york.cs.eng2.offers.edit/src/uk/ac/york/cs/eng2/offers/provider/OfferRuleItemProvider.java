/**
 */
package uk.ac.york.cs.eng2.offers.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.york.cs.eng2.offers.OfferRule;
import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.OffersPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.york.cs.eng2.offers.OfferRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OfferRuleItemProvider 
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
	public OfferRuleItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addTriggersIfMatchPropertyDescriptor(object);
			addTriggersIfNotMatchPropertyDescriptor(object);
			addTriggersAlwaysPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OfferRule_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OfferRule_name_feature", "_UI_OfferRule_type"),
				 OffersPackage.Literals.OFFER_RULE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Triggers If Match feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriggersIfMatchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OfferRule_triggersIfMatch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OfferRule_triggersIfMatch_feature", "_UI_OfferRule_type"),
				 OffersPackage.Literals.OFFER_RULE__TRIGGERS_IF_MATCH,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Triggers If Not Match feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriggersIfNotMatchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OfferRule_triggersIfNotMatch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OfferRule_triggersIfNotMatch_feature", "_UI_OfferRule_type"),
				 OffersPackage.Literals.OFFER_RULE__TRIGGERS_IF_NOT_MATCH,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Triggers Always feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriggersAlwaysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OfferRule_triggersAlways_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OfferRule_triggersAlways_feature", "_UI_OfferRule_type"),
				 OffersPackage.Literals.OFFER_RULE__TRIGGERS_ALWAYS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(OffersPackage.Literals.OFFER_RULE__CONDITIONS);
			childrenFeatures.add(OffersPackage.Literals.OFFER_RULE__ACTIONS);
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
	 * This returns OfferRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OfferRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OfferRule)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OfferRule_type") :
			getString("_UI_OfferRule_type") + " " + label;
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

		switch (notification.getFeatureID(OfferRule.class)) {
			case OffersPackage.OFFER_RULE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OffersPackage.OFFER_RULE__CONDITIONS:
			case OffersPackage.OFFER_RULE__ACTIONS:
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
				(OffersPackage.Literals.OFFER_RULE__CONDITIONS,
				 OffersFactory.eINSTANCE.createProductTagCondition()));

		newChildDescriptors.add
			(createChildParameter
				(OffersPackage.Literals.OFFER_RULE__CONDITIONS,
				 OffersFactory.eINSTANCE.createMinOrderValueCondition()));

		newChildDescriptors.add
			(createChildParameter
				(OffersPackage.Literals.OFFER_RULE__CONDITIONS,
				 OffersFactory.eINSTANCE.createProductNameCondition()));

		newChildDescriptors.add
			(createChildParameter
				(OffersPackage.Literals.OFFER_RULE__ACTIONS,
				 OffersFactory.eINSTANCE.createPercentageDiscountAction()));

		newChildDescriptors.add
			(createChildParameter
				(OffersPackage.Literals.OFFER_RULE__ACTIONS,
				 OffersFactory.eINSTANCE.createFixedDiscountAction()));

		newChildDescriptors.add
			(createChildParameter
				(OffersPackage.Literals.OFFER_RULE__ACTIONS,
				 OffersFactory.eINSTANCE.createAddFreeProductAction()));

		newChildDescriptors.add
			(createChildParameter
				(OffersPackage.Literals.OFFER_RULE__ACTIONS,
				 OffersFactory.eINSTANCE.createAddDiscountedProductAction()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OffersEditPlugin.INSTANCE;
	}

}
