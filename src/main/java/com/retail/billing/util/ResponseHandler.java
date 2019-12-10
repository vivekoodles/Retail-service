package com.retail.billing.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * 
 * @author vivek joshi
 *
 * @date 09-Dec-2019
 * 
 *
 */
public class ResponseHandler {
	
	private static final String RESPONSEKEY_TIMESTAMP="timestamp";
	private static final String RESPONSEKEY_STATUS="status";
	private static final String RESPONSEKEY_ISERROR="isError";
	private static final String RESPONSEKEY_MESSAGE="message";
	private static final String RESPONSEKEY_RESPONSEOBJECT="responseObject";
	
	

	private ResponseHandler() {
	}


	/**
	 * 
	 * @param httpStatus
	 * @param isError
	 * @param message
	 * @param responseObject
	 * @return
	 */
	public static ResponseEntity<Object> response(HttpStatus httpStatus, Boolean isError, String message,  Object responseObject) {
		Map<String, Object> map = new HashMap<>();
		map.put(RESPONSEKEY_TIMESTAMP, new Date().getTime());
		map.put(RESPONSEKEY_STATUS, httpStatus.value());
		map.put(RESPONSEKEY_ISERROR, isError);		
		map.put(RESPONSEKEY_MESSAGE, message);
		map.put(RESPONSEKEY_RESPONSEOBJECT, responseObject);
		return new ResponseEntity<>(map, httpStatus);

	}

	}
