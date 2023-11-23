/**
 */
package petShopDemo.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import petShopDemo.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see petShopDemo.PetShopDemoPackage
 * @generated
 */
public class PetShopDemoValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PetShopDemoValidator INSTANCE = new PetShopDemoValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "petShopDemo";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Customer Name' of 'Company'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPANY__UNIQUE_CUSTOMER_NAME = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Offer Name' of 'Company'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPANY__UNIQUE_OFFER_NAME = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Shop Name' of 'Company'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPANY__UNIQUE_SHOP_NAME = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Employees Name' of 'Company'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPANY__UNIQUE_EMPLOYEES_NAME = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Need Approval For Notification' of 'Offer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OFFER__NEED_APPROVAL_FOR_NOTIFICATION = 5;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 5;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetShopDemoValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return PetShopDemoPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case PetShopDemoPackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		case PetShopDemoPackage.COMPANY:
			return validateCompany((Company) value, diagnostics, context);
		case PetShopDemoPackage.SHOP:
			return validateShop((Shop) value, diagnostics, context);
		case PetShopDemoPackage.PRINCIPAL:
			return validatePrincipal((Principal) value, diagnostics, context);
		case PetShopDemoPackage.PRODUCT:
			return validateProduct((Product) value, diagnostics, context);
		case PetShopDemoPackage.OFFER:
			return validateOffer((Offer) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompany(Company company, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(company, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(company, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(company, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(company, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(company, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(company, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(company, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(company, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(company, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCompany_UniqueEmployeesName(company, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCompany_UniqueCustomerName(company, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCompany_UniqueOfferName(company, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCompany_UniqueShopName(company, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueEmployeesName constraint of '<em>Company</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompany_UniqueEmployeesName(Company company, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return company.UniqueEmployeesName(diagnostics, context);
	}

	/**
	 * Validates the UniqueCustomerName constraint of '<em>Company</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompany_UniqueCustomerName(Company company, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return company.UniqueCustomerName(diagnostics, context);
	}

	/**
	 * Validates the UniqueOfferName constraint of '<em>Company</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompany_UniqueOfferName(Company company, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return company.UniqueOfferName(diagnostics, context);
	}

	/**
	 * Validates the UniqueShopName constraint of '<em>Company</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompany_UniqueShopName(Company company, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return company.UniqueShopName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShop(Shop shop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrincipal(Principal principal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(principal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(product, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOffer(Offer offer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(offer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(offer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(offer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(offer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(offer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(offer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(offer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(offer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(offer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOffer_NeedApprovalForNotification(offer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NeedApprovalForNotification constraint of '<em>Offer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOffer_NeedApprovalForNotification(Offer offer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return offer.NeedApprovalForNotification(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PetShopDemoValidator
