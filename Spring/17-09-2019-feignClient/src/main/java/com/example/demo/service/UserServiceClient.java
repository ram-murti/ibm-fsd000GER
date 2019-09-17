package com.example.demo.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@FeignClient(name = "user-wa")
public interface UserServiceClient {

	 @RequestMapping(value = "/{id}", method = RequestMethod.GET)
		public ResponseEntity<?> createUser(@PathVariable("id") Long id) ;
		
	
		
	 

}
