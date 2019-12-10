package com.retail.billing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.billing.model.Users;
import com.retail.billing.repository.UserRepositry;

@Service
public class UserService {

	@Autowired
	UserRepositry userRepo;
	
	public UserService() {
		// TODO Auto-generated constructor stub
	}

	
	public Users createUser(Users user) {
		
		return userRepo.save(user);
	}
	
}
