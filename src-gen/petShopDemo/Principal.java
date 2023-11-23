/**
 */
package petShopDemo;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Principal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petShopDemo.Principal#getLocation <em>Location</em>}</li>
 *   <li>{@link petShopDemo.Principal#getDate <em>Date</em>}</li>
 *   <li>{@link petShopDemo.Principal#getBirtday <em>Birtday</em>}</li>
 *   <li>{@link petShopDemo.Principal#getEmail <em>Email</em>}</li>
 *   <li>{@link petShopDemo.Principal#getNumber <em>Number</em>}</li>
 *   <li>{@link petShopDemo.Principal#isApproval <em>Approval</em>}</li>
 * </ul>
 *
 * @see petShopDemo.PetShopDemoPackage#getPrincipal()
 * @model
 * @generated
 */
public interface Principal extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see petShopDemo.PetShopDemoPackage#getPrincipal_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link petShopDemo.Principal#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see petShopDemo.PetShopDemoPackage#getPrincipal_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link petShopDemo.Principal#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Birtday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birtday</em>' attribute.
	 * @see #setBirtday(Date)
	 * @see petShopDemo.PetShopDemoPackage#getPrincipal_Birtday()
	 * @model
	 * @generated
	 */
	Date getBirtday();

	/**
	 * Sets the value of the '{@link petShopDemo.Principal#getBirtday <em>Birtday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birtday</em>' attribute.
	 * @see #getBirtday()
	 * @generated
	 */
	void setBirtday(Date value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see petShopDemo.PetShopDemoPackage#getPrincipal_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link petShopDemo.Principal#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see petShopDemo.PetShopDemoPackage#getPrincipal_Number()
	 * @model
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link petShopDemo.Principal#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Approval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval</em>' attribute.
	 * @see #setApproval(boolean)
	 * @see petShopDemo.PetShopDemoPackage#getPrincipal_Approval()
	 * @model required="true"
	 * @generated
	 */
	boolean isApproval();

	/**
	 * Sets the value of the '{@link petShopDemo.Principal#isApproval <em>Approval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval</em>' attribute.
	 * @see #isApproval()
	 * @generated
	 */
	void setApproval(boolean value);

} // Principal
