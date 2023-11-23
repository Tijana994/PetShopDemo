/**
 */
package petShopDemo.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petShopDemo.PetShopDemoPackage;
import petShopDemo.Principal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Principal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petShopDemo.impl.PrincipalImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link petShopDemo.impl.PrincipalImpl#getDate <em>Date</em>}</li>
 *   <li>{@link petShopDemo.impl.PrincipalImpl#getBirtday <em>Birtday</em>}</li>
 *   <li>{@link petShopDemo.impl.PrincipalImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link petShopDemo.impl.PrincipalImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link petShopDemo.impl.PrincipalImpl#isApproval <em>Approval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrincipalImpl extends NamedElementImpl implements Principal {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirtday() <em>Birtday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirtday()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTDAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirtday() <em>Birtday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirtday()
	 * @generated
	 * @ordered
	 */
	protected Date birtday = BIRTDAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isApproval() <em>Approval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApproval()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPROVAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApproval() <em>Approval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApproval()
	 * @generated
	 * @ordered
	 */
	protected boolean approval = APPROVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrincipalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetShopDemoPackage.Literals.PRINCIPAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetShopDemoPackage.PRINCIPAL__LOCATION, oldLocation,
					location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetShopDemoPackage.PRINCIPAL__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getBirtday() {
		return birtday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirtday(Date newBirtday) {
		Date oldBirtday = birtday;
		birtday = newBirtday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetShopDemoPackage.PRINCIPAL__BIRTDAY, oldBirtday,
					birtday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetShopDemoPackage.PRINCIPAL__EMAIL, oldEmail,
					email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetShopDemoPackage.PRINCIPAL__NUMBER, oldNumber,
					number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isApproval() {
		return approval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApproval(boolean newApproval) {
		boolean oldApproval = approval;
		approval = newApproval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetShopDemoPackage.PRINCIPAL__APPROVAL, oldApproval,
					approval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PetShopDemoPackage.PRINCIPAL__LOCATION:
			return getLocation();
		case PetShopDemoPackage.PRINCIPAL__DATE:
			return getDate();
		case PetShopDemoPackage.PRINCIPAL__BIRTDAY:
			return getBirtday();
		case PetShopDemoPackage.PRINCIPAL__EMAIL:
			return getEmail();
		case PetShopDemoPackage.PRINCIPAL__NUMBER:
			return getNumber();
		case PetShopDemoPackage.PRINCIPAL__APPROVAL:
			return isApproval();
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
		case PetShopDemoPackage.PRINCIPAL__LOCATION:
			setLocation((String) newValue);
			return;
		case PetShopDemoPackage.PRINCIPAL__DATE:
			setDate((Date) newValue);
			return;
		case PetShopDemoPackage.PRINCIPAL__BIRTDAY:
			setBirtday((Date) newValue);
			return;
		case PetShopDemoPackage.PRINCIPAL__EMAIL:
			setEmail((String) newValue);
			return;
		case PetShopDemoPackage.PRINCIPAL__NUMBER:
			setNumber((String) newValue);
			return;
		case PetShopDemoPackage.PRINCIPAL__APPROVAL:
			setApproval((Boolean) newValue);
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
		case PetShopDemoPackage.PRINCIPAL__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case PetShopDemoPackage.PRINCIPAL__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case PetShopDemoPackage.PRINCIPAL__BIRTDAY:
			setBirtday(BIRTDAY_EDEFAULT);
			return;
		case PetShopDemoPackage.PRINCIPAL__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case PetShopDemoPackage.PRINCIPAL__NUMBER:
			setNumber(NUMBER_EDEFAULT);
			return;
		case PetShopDemoPackage.PRINCIPAL__APPROVAL:
			setApproval(APPROVAL_EDEFAULT);
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
		case PetShopDemoPackage.PRINCIPAL__LOCATION:
			return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		case PetShopDemoPackage.PRINCIPAL__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case PetShopDemoPackage.PRINCIPAL__BIRTDAY:
			return BIRTDAY_EDEFAULT == null ? birtday != null : !BIRTDAY_EDEFAULT.equals(birtday);
		case PetShopDemoPackage.PRINCIPAL__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case PetShopDemoPackage.PRINCIPAL__NUMBER:
			return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
		case PetShopDemoPackage.PRINCIPAL__APPROVAL:
			return approval != APPROVAL_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (location: ");
		result.append(location);
		result.append(", date: ");
		result.append(date);
		result.append(", birtday: ");
		result.append(birtday);
		result.append(", email: ");
		result.append(email);
		result.append(", number: ");
		result.append(number);
		result.append(", approval: ");
		result.append(approval);
		result.append(')');
		return result.toString();
	}

} //PrincipalImpl
