/**
 * Copyrights are with Henry Shein 2019. 
 * Do not diclose the code outside.
 * All rights are reserved with Henry shien
 */
package com.henryshein.loyalty.rewards.dao.model;

/**
 * @author Vipin Mahor<17-Nov-2019
 *
 */
public class CustomerRegDaoReq {
private String  clientID;
private String requestId ;
private String firstName ;
private String lastName ;
private String emailId ;
private String dob ;
private String address ;
private String website ;
private String organisationName ;
private String pincode;
/**
 * @return the clientID
 */
public String getClientID() {
	return clientID;
}
/**
 * @param clientID the clientID to set
 */
public void setClientID(String clientID) {
	this.clientID = clientID;
}
/**
 * @return the requestId
 */
public String getRequestId() {
	return requestId;
}
/**
 * @param requestId the requestId to set
 */
public void setRequestId(String requestId) {
	this.requestId = requestId;
}
/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}
/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}
/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}
/**
 * @return the emailId
 */
public String getEmailId() {
	return emailId;
}
/**
 * @param emailId the emailId to set
 */
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
/**
 * @return the dob
 */
public String getDob() {
	return dob;
}
/**
 * @param dob the dob to set
 */
public void setDob(String dob) {
	this.dob = dob;
}
/**
 * @return the address
 */
public String getAddress() {
	return address;
}
/**
 * @param address the address to set
 */
public void setAddress(String address) {
	this.address = address;
}
/**
 * @return the website
 */
public String getWebsite() {
	return website;
}
/**
 * @param website the website to set
 */
public void setWebsite(String website) {
	this.website = website;
}
/**
 * @return the organisationName
 */
public String getOrganisationName() {
	return organisationName;
}
/**
 * @param organisationName the organisationName to set
 */
public void setOrganisationName(String organisationName) {
	this.organisationName = organisationName;
}
/**
 * @return the pincode
 */
public String getPincode() {
	return pincode;
}
/**
 * @param pincode the pincode to set
 */
public void setPincode(String pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "CustomerRegDaoReq [clientID=" + clientID + ", requestId=" + requestId + ", firstName=" + firstName
			+ ", lastName=" + lastName + ", emailId=" + emailId + ", dob=" + dob + ", address=" + address + ", website="
			+ website + ", organisationName=" + organisationName + ", pincode=" + pincode + "]";
}

}
