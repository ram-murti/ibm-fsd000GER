package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.CreateUserRequestModel;
import com.example.demo.service.AssociateService;

@Controller
public class AssociateController {

	@Autowired AssociateService associateService;
	@GetMapping("/")
public String homePage() {
		return "home";
	}
	@GetMapping("/Associate/type/{name}")
	public String getById(Model themodel,@RequestParam("name") String var,@RequestParam("type") String type) {
		if(type.equals("id")) {
			
			ResponseEntity<?> temp=associateService.findAssociateDetailById(var);
			themodel.addAttribute("socc",temp);
			System.out.println(temp);
			return  "list";
		}
		else if(type.equals("fname")) {
			System.out.println(var);
			System.out.println(var);
			ResponseEntity<?> temp=associateService.findAssociateDetailByFirstName(var);
			System.out.println(temp);
			themodel.addAttribute("asso",temp);
			System.out.println(temp);
			System.out.println(temp);
               return "list";
		}
		else if(type.equals("lname")) {
			ResponseEntity<?> temp=associateService.findAssociateDetailByLastName(var);
			themodel.addAttribute("asso",temp);
return "list";
		}
		else if(type.equals("fullname")) {
			
	        String[] fullname = var.split(" "); 
	        System.out.println(fullname[0]+fullname[1]);
			ResponseEntity<?> temp=associateService.findAssociateDetailByLastNameAndLastName(fullname[1],fullname[0]);
			System.out.println(temp);
			themodel.addAttribute("socc",temp);
          return "list";
		}
		else if(type.equals("email")) {
			ResponseEntity<?> temp=associateService.findAssociateDetailByEmail(var);
themodel.addAttribute("socc",temp);
return "list";
		}
		else if(type.equals("number")) {
			ResponseEntity<?> temp=associateService.findAssociateDetailByNumber(var);
themodel.addAttribute("socc",temp);
return "list";
		}
		else {
			System.out.println("here");
			return "list";
		}
	}
	
	@GetMapping("/Associate/showform")
	public String showForm(Model themodel,@ModelAttribute("requestmodel") CreateUserRequestModel model) {
		ResponseEntity<?> temp=associateService.createUser(model);
	themodel.addAttribute("socc",temp);
	return "showForm";
	}
	@PostMapping("/Associate/add")
	public String createAssociate(Model themodel) {
		
		return "list";
	}
	@GetMapping("/Associate/viewall")
	public String viewAll(Model themodel) {
		return "list";
	}
	@DeleteMapping("/Associate/delete/{id}")
	public String deleteAssociate(Model themodel) {
		return "list";
	}
}
