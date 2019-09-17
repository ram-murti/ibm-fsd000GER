package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ImageFreignClient;
import com.example.demo.service.UserServiceClient;
@RestController
public class ApplicationController {

	@Autowired
	 UserServiceClient userServiceClient;
	@Autowired
	 ImageFreignClient imageFreignClient;
	 @GetMapping("/fetchProduct/{id}")
		public ResponseEntity<?> createUser(@PathVariable("id") Long id) {
		 
		 return userServiceClient.createUser(id);
	 }
	 @GetMapping("/fetchProduct/images")
		public ResponseEntity<?> getImages() {
        return ResponseEntity.ok(imageFreignClient.getImages());
	 }
}
