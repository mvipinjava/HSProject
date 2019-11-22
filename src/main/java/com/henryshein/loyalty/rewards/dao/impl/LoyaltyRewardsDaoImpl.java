/**
 * Copyrights are with Henry Shein 2019. 
 * Do not diclose the code outside.
 * All rights are reserved with Henry shien
 */
package com.henryshein.loyalty.rewards.dao.impl;

import com.henryshein.loyalty.rewards.dao.model.CustomerRegDaoReq;
import com.henryshein.loyalty.rewards.dao.model.CustomerRegDaoRes;

/**
 * @author Vipin Mahor<14-Nov-2019
 *
 */
public class LoyaltyRewardsDaoImpl {
public CustomerRegDaoRes registration(CustomerRegDaoReq daoReq){
	CustomerRegDaoRes daoResp = new CustomerRegDaoRes();
	daoResp.setRefNum("101");
	daoResp.setRespCode("abc");
	daoResp.setRespMsg("success");
	daoResp.setStatus("delivered");
	return daoResp;
	
}
}
