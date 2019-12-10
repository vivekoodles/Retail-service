package com.retail.billing.dto;

import javax.validation.constraints.NotBlank;

import com.retail.billing.enums.ProductType;

import io.swagger.annotations.ApiParam;

public class BillingItems {

	public BillingItems() {
		// TODO Auto-generated constructor stub
	}
	
	@NotBlank(message = "item name must be required")
	String itemName;
	
	@NotBlank()
	@ApiParam(example = "GROCERY or NON_GROCERY")
	ProductType type;
	
	double price;
	
	int quantity;

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return the type
	 */
	public ProductType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(ProductType type) {
		this.type = type;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
