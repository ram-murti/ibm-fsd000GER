//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.example.demo.model.CreateUserRequestModel;
//import com.example.demo.model.CreateUserResponseModel;
//import com.example.demo.service.AssociateService;
//
//@Controller
//public class AssociateController {
//
//	@Autowired
//	AssociateService associateService;
//
//	@GetMapping("/")
//	public String homePage() {
//		return "home";
//	}
//
//	@GetMapping("/Associate/type/{name}")
//	public String getById(Model themodel, @RequestParam("name") String var, @RequestParam("type") String type) {
//		if (type.equals("id")) {
//
//			ResponseEntity<?> temp = associateService.findAssociateDetailById(var);
//			themodel.addAttribute("socc", temp);
//			System.out.println(temp);
//			return "list";
//		} else if (type.equals("fname")) {
//			System.out.println(var);
//			
//			ResponseEntity<?> temp = associateService.findAssociateDetailByFirstName(var);
//			System.out.println(temp);
//			themodel.addAttribute("asso", temp);
//			System.out.println(temp);
//			System.out.println(temp);
//			return "list";
//		} else if (type.equals("lname")) {
//			ResponseEntity<?> temp = associateService.findAssociateDetailByLastName(var);
//			themodel.addAttribute("asso", temp);
//			return "list";
//		} else if (type.equals("fullname")) {
//
//			String[] fullname = var.split(" ");
//			System.out.println(fullname[0] + fullname[1]);
//			ResponseEntity<?> temp = associateService.findAssociateDetailByLastNameAndLastName(fullname[1],
//					fullname[0]);
//			System.out.println(temp);
//			themodel.addAttribute("socc", temp);
//			return "list";
//		} else if (type.equals("email")) {
//			ResponseEntity<?> temp = associateService.findAssociateDetailByEmail(var);
//			System.out.println(temp.toString());
//			themodel.addAttribute("socc", temp);
//			return "list";
//		} else if (type.equals("number")) {
//			ResponseEntity<?> temp = associateService.findAssociateDetailByNumber(var);
//			themodel.addAttribute("socc", temp);
//			return "list";
//		} else {
//			System.out.println("here");
//			return "list";
//		}
//	}
//
//	@GetMapping("/Associate/showform")
//	public String showForm(Model themodel) {
//		CreateUserRequestModel model = new CreateUserRequestModel();
//		themodel.addAttribute("socc", model);
//		return "showFormhtml";
//	}
//
//	@PostMapping("/Associate/create")
//	public String createAssociate(Model themodel, @ModelAttribute("model") CreateUserRequestModel model) {
//		ResponseEntity<?> temp = associateService.createUser(model);
//		System.out.println(temp);
//		if(temp.equals("a")) {
//			themodel.addAttribute("socc", temp);
//			return "error";
//		}
//		else {
//		themodel.addAttribute("socc", temp);
//		return "redirect:/Associate/viewAll";}
//	}
//
//	@GetMapping("/Associate/viewall")
//	public String viewAll(Model themodel) {
//		ResponseEntity<?> temp = associateService.findAll();
//		themodel.addAttribute("asso", temp);
//		return "list";
//	}
//
//	@PostMapping("/Associate/delete/{id}")
//	public String deleteAssociate(Model themodel,@RequestParam("id") String id ) {
//System.out.println(id);
//		ResponseEntity<?> temp = associateService.deleteById(id);
//		System.out.println("here");
//		return "redirect:/Associate/viewAll";
//	}
//	@PostMapping("/Associate/Update")
//	public String updateAssociate(Model themodel,@ModelAttribute("temp") CreateUserResponseModel model) {
//		ResponseEntity<?> temp = associateService.updateUser(model);
//		return "redirect:/Associate/viewAll";
//	}
//	@GetMapping("/Associate/updateForm/{id}")
//	public String updateForm(Model themodel,@RequestParam("id") String id ) {
//		System.out.println("here");
//		CreateUserResponseModel temp=associateService.findByAssociateId(id);
//		themodel.addAttribute("socc",temp);
//		return "showUpdateForm";
//	}
//	}
