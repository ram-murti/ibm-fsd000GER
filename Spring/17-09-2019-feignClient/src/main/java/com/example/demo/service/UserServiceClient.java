package com.example.demo.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.CreateUserRequestModel;






@FeignClient(name = "user-wa")
public interface UserServiceClient {

	 @RequestMapping(value = "/{id}", method = RequestMethod.GET)
		public ResponseEntity<?> createUser(@PathVariable("id") Long id) ;
		
	 @RequestMapping(value = "/", method = RequestMethod.GET)
		public ResponseEntity<?> createUser(@RequestBody CreateUserRequestModel userDetail) ;
			
		
	 

}
