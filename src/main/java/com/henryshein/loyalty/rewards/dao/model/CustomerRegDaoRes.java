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
public class CustomerRegDaoRes {
private String respCode;
private String respMsg;
private String status;
private String refNum;
/**
 * @return the respCode
 */
public String getRespCode() {
	return respCode;
}
/**
 * @param respCode the respCode to set
 */
public void setRespCode(String respCode) {
	this.respCode = respCode;
}
/**
 * @return the respMsg
 */
public String getRespMsg() {
	return respMsg;
}
/**
 * @param respMsg the respMsg to set
 */
public void setRespMsg(String respMsg) {
	this.respMsg = respMsg;
}
/**
 * @return the status
 */
public String getStatus() {
	return status;
}
/**
 * @param status the status to set
 */
public void setStatus(String status) {
	this.status = status;
}
/**
 * @return the refNum
 */
public String getRefNum() {
	return refNum;
}
/**
 * @param refNum the refNum to set
 */
public void setRefNum(String refNum) {
	this.refNum = refNum;
}
@Override
public String toString() {
	return "CustomerRegDaoRes [respCode=" + respCode + ", respMsg=" + respMsg + ", status=" + status + ", refNum="
			+ refNum + "]";
}


}
