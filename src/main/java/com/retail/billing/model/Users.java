package com.retail.billing.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.retail.billing.enums.UserType;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@Column(unique = true)
	String email;
	
	String pass;
	
	@Enumerated(EnumType.STRING)
	UserType userType;
	
	Date createdOn=new Date();
	
	boolean isAffiliatedByStore;
	
	
	
	
	
	public Users(Long id, String email, String pass, UserType userType, Date createdOn, boolean isAffiliatedByStore) {
		super();
		this.id = id;
		this.email = email;
		this.pass = pass;
		this.userType = userType;
		this.createdOn = createdOn;
		this.isAffiliatedByStore = isAffiliatedByStore;
	}





	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}





	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}





	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}





	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}





	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}





	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}





	/**
	 * @return the userType
	 */
	public UserType getUserType() {
		return userType;
	}





	/**
	 * @param userType the userType to set
	 */
	public void setUserType(UserType userType) {
		this.userType = userType;
	}





	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}





	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}





	/**
	 * @return the isAffiliatedByStore
	 */
	public boolean isAffiliatedByStore() {
		return isAffiliatedByStore;
	}





	/**
	 * @param isAffiliatedByStore the isAffiliatedByStore to set
	 */
	public void setAffiliatedByStore(boolean isAffiliatedByStore) {
		this.isAffiliatedByStore = isAffiliatedByStore;
	}





	public Users() {
		// TODO Auto-generated constructor stub
	}

}
