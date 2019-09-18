package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.service.ImageFreignClient;
import com.example.demo.service.UserServiceClient;
@Controller
public class ApplicationController {

	@Autowired
	 UserServiceClient userServiceClient;
	@Autowired
	 ImageFreignClient imageFreignClient;
	@GetMapping("/")
	public String getByidhtml() {
		return "list";
	}
	 @GetMapping("/fetchProduct/{id}")
		public String createUser(@PathVariable("id") Long id,Model themodel) {
		 ResponseEntity<?> temp=userServiceClient.createUser(id);
		 themodel.addAttribute("socc",temp);
		 return "showhtml";
	 }
	 @GetMapping("/fetchProduct/images")
		public ResponseEntity<?> getImages() {
        return ResponseEntity.ok(imageFreignClient.getImages());
	 }
	 @PostMapping("/fetchProduct")
		public String createUser(@ModelAttribute("user") CreateUserRequestModel userDetail,Model themodel) {
		 ResponseEntity<?> temp=userServiceClient.createUser(userDetail);
		 themodel.addAttribute("socc",temp);
		 
			return "showhtml";
	 }
}
