package com.retail.billing.dto;

import java.util.List;

public class BillDetailsDto {

	public BillDetailsDto() {
		// TODO Auto-generated constructor stub
	}
	
	String userEmail;
	
	
	List<BillingItems> items;

	
	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * @return the items
	 */
	public List<BillingItems> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<BillingItems> items) {
		this.items = items;
	}
	
	

}
