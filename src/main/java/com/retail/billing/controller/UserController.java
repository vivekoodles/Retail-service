package com.retail.billing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.retail.billing.model.Users;
import com.retail.billing.service.UserService;
import com.retail.billing.util.ResponseHandler;

import io.swagger.annotations.Api;

@RestController
@Api
public class UserController {

	
	@Autowired
	UserService userservice;
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping(value = "api/v1/user")
	public ResponseEntity<Object> createUser(@RequestBody Users user){
		
		Users newUser=userservice.createUser(user);
		
		return ResponseHandler.response(HttpStatus.OK, false, "success", newUser);
	}

}
