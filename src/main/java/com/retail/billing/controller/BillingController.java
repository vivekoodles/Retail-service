package com.retail.billing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.retail.billing.dto.BillDetailsDto;
import com.retail.billing.service.BillingService;
import com.retail.billing.util.ResponseHandler;

import io.swagger.annotations.Api;

@RestController
@Api
public class BillingController {

	
	@Autowired
	BillingService billingService;
	
	public BillingController() {
		// TODO Auto-generated constructor stub
	}

	@PostMapping("api/v1/generate-bill")
	public ResponseEntity<Object> generateBill(@RequestBody BillDetailsDto billDetails){
		
		
		double paybleAmount= billingService.generateBill(billDetails);
		
		
	return	ResponseHandler.response(HttpStatus.OK, false, "success", paybleAmount);
	}
}
