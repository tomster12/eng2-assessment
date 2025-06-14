/**
 */
package uk.ac.york.cs.eng2.offers.provider;

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

import uk.ac.york.cs.eng2.offers.util.OffersAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OffersItemProviderAdapterFactory extends OffersAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public OffersItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.york.cs.eng2.offers.Catalogue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogueItemProvider catalogueItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.york.cs.eng2.offers.Catalogue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCatalogueAdapter() {
		if (catalogueItemProvider == null) {
			catalogueItemProvider = new CatalogueItemProvider(this);
		}

		return catalogueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.york.cs.eng2.offers.Product} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductItemProvider productItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.york.cs.eng2.offers.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductAdapter() {
		if (productItemProvider == null) {
			productItemProvider = new ProductItemProvider(this);
		}

		return productItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.york.cs.eng2.offers.Category} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryItemProvider categoryItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.york.cs.eng2.offers.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCategoryAdapter() {
		if (categoryItemProvider == null) {
			categoryItemProvider = new CategoryItemProvider(this);
		}

		return categoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.york.cs.eng2.offers.Tag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagItemProvider tagItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.york.cs.eng2.offers.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTagAdapter() {
		if (tagItemProvider == null) {
			tagItemProvider = new TagItemProvider(this);
		}

		return tagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.york.cs.eng2.offers.OfferRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfferRuleItemProvider offerRuleItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.york.cs.eng2.offers.OfferRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOfferRuleAdapter() {
		if (offerRuleItemProvider == null) {
			offerRuleItemProvider = new OfferRuleItemProvider(this);
		}

		return offerRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.york.cs.eng2.offers.ProductTarget} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductTargetItemProvider productTargetItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.york.cs.eng2.offers.ProductTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductTargetAdapter() {
		if (productTargetItemProvider == null) {
			productTargetItemProvider = new ProductTargetItemProvider(this);
		}

		return productTargetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.york.cs.eng2.offers.ProductInCategoryTarget} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInCategoryTargetItemProvider productInCategoryTargetItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.york.cs.eng2.offers.ProductInCategoryTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductInCategoryTargetAdapter() {
		if (productInCategoryTargetItemProvider == null) {
			productInCategoryTargetItemProvider = new ProductInCategoryTargetItemProvider(this);
		}

		return productInCategoryTargetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.york.cs.eng2.offers.ProductWithTagTarget} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductWithTagTargetItemProvider productWithTagTargetItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.york.cs.eng2.offers.ProductWithTagTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductWithTagTargetAdapter() {
		if (productWithTagTargetItemProvider == null) {
			productWithTagTargetItemProvider = new ProductWithTagTargetItemProvider(this);
		}

		return productWithTagTargetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.york.cs.eng2.offers.ContainsTargetCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainsTargetConditionItemProvider containsTargetConditionItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.york.cs.eng2.offers.ContainsTargetCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainsTargetConditionAdapter() {
		if (containsTargetConditionItemProvider == null) {
			containsTargetConditionItemProvider = new ContainsTargetConditionItemProvider(this);
		}

		return containsTargetConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.york.cs.eng2.offers.MaxDailyProductOrdersCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaxDailyProductOrdersConditionItemProvider maxDailyProductOrdersConditionItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.york.cs.eng2.offers.MaxDailyProductOrdersCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMaxDailyProductOrdersConditionAdapter() {
		if (maxDailyProductOrdersConditionItemProvider == null) {
			maxDailyProductOrdersConditionItemProvider = new MaxDailyProductOrdersConditionItemProvider(this);
		}

		return maxDailyProductOrdersConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.york.cs.eng2.offers.MinimumTotalOrderCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinimumTotalOrderConditionItemProvider minimumTotalOrderConditionItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.york.cs.eng2.offers.MinimumTotalOrderCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMinimumTotalOrderConditionAdapter() {
		if (minimumTotalOrderConditionItemProvider == null) {
			minimumTotalOrderConditionItemProvider = new MinimumTotalOrderConditionItemProvider(this);
		}

		return minimumTotalOrderConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.york.cs.eng2.offers.RecurringYearlyDateCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecurringYearlyDateConditionItemProvider recurringYearlyDateConditionItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.york.cs.eng2.offers.RecurringYearlyDateCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRecurringYearlyDateConditionAdapter() {
		if (recurringYearlyDateConditionItemProvider == null) {
			recurringYearlyDateConditionItemProvider = new RecurringYearlyDateConditionItemProvider(this);
		}

		return recurringYearlyDateConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.york.cs.eng2.offers.TotalPercentDiscountAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TotalPercentDiscountActionItemProvider totalPercentDiscountActionItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.york.cs.eng2.offers.TotalPercentDiscountAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTotalPercentDiscountActionAdapter() {
		if (totalPercentDiscountActionItemProvider == null) {
			totalPercentDiscountActionItemProvider = new TotalPercentDiscountActionItemProvider(this);
		}

		return totalPercentDiscountActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.york.cs.eng2.offers.TotalAbsoluteDiscountAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TotalAbsoluteDiscountActionItemProvider totalAbsoluteDiscountActionItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.york.cs.eng2.offers.TotalAbsoluteDiscountAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTotalAbsoluteDiscountActionAdapter() {
		if (totalAbsoluteDiscountActionItemProvider == null) {
			totalAbsoluteDiscountActionItemProvider = new TotalAbsoluteDiscountActionItemProvider(this);
		}

		return totalAbsoluteDiscountActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.york.cs.eng2.offers.TargetPercentDiscountAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetPercentDiscountActionItemProvider targetPercentDiscountActionItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.york.cs.eng2.offers.TargetPercentDiscountAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTargetPercentDiscountActionAdapter() {
		if (targetPercentDiscountActionItemProvider == null) {
			targetPercentDiscountActionItemProvider = new TargetPercentDiscountActionItemProvider(this);
		}

		return targetPercentDiscountActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplaceTargetCostActionItemProvider replaceTargetCostActionItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.york.cs.eng2.offers.ReplaceTargetCostAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReplaceTargetCostActionAdapter() {
		if (replaceTargetCostActionItemProvider == null) {
			replaceTargetCostActionItemProvider = new ReplaceTargetCostActionItemProvider(this);
		}

		return replaceTargetCostActionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public void dispose() {
		if (catalogueItemProvider != null) catalogueItemProvider.dispose();
		if (productItemProvider != null) productItemProvider.dispose();
		if (categoryItemProvider != null) categoryItemProvider.dispose();
		if (tagItemProvider != null) tagItemProvider.dispose();
		if (offerRuleItemProvider != null) offerRuleItemProvider.dispose();
		if (productTargetItemProvider != null) productTargetItemProvider.dispose();
		if (productInCategoryTargetItemProvider != null) productInCategoryTargetItemProvider.dispose();
		if (productWithTagTargetItemProvider != null) productWithTagTargetItemProvider.dispose();
		if (containsTargetConditionItemProvider != null) containsTargetConditionItemProvider.dispose();
		if (maxDailyProductOrdersConditionItemProvider != null) maxDailyProductOrdersConditionItemProvider.dispose();
		if (minimumTotalOrderConditionItemProvider != null) minimumTotalOrderConditionItemProvider.dispose();
		if (recurringYearlyDateConditionItemProvider != null) recurringYearlyDateConditionItemProvider.dispose();
		if (totalPercentDiscountActionItemProvider != null) totalPercentDiscountActionItemProvider.dispose();
		if (totalAbsoluteDiscountActionItemProvider != null) totalAbsoluteDiscountActionItemProvider.dispose();
		if (targetPercentDiscountActionItemProvider != null) targetPercentDiscountActionItemProvider.dispose();
		if (replaceTargetCostActionItemProvider != null) replaceTargetCostActionItemProvider.dispose();
	}

}
