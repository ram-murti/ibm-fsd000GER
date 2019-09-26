package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CreateUserRequestModel;
import com.example.demo.model.CreateUserResponseModel;
import com.example.demo.service.AssociateService;

@RestController
public class AssociateRestController {
	@Autowired
	AssociateService associateService;

	@GetMapping("/")
	public String homePage() {
		return "home";
	}

	@GetMapping("/Associate/id/{name}")
	public ResponseEntity<?> getById( @RequestParam("name") String var) {

			
			return ResponseEntity.ok(associateService.findAssociateDetailById(var));
		} @GetMapping("/Associate/fname/{name}")
		public ResponseEntity<?> getByfName( @PathVariable("name") String var) {
			System.out.println(var);
			
			
			return ResponseEntity.ok(associateService.findAssociateDetailByFirstName(var));
		}
		@GetMapping("/Associate/lname/{name}")
		public ResponseEntity<?> getBylName(  @PathVariable("name") String var) {		
			return ResponseEntity.ok(associateService.findAssociateDetailByLastName(var));

		}
		@GetMapping("/Associate/flname/{name}")
		public ResponseEntity<?> getByfAndlName(@PathVariable("name") String var, @PathVariable("type") String type) {
			String[] fullname = var.split(" ");
			return ResponseEntity.ok(associateService.findAssociateDetailByLastNameAndLastName(fullname[1], fullname[0]));

		}
		@GetMapping("/Associate/email/{name}")
		public ResponseEntity<?> getByEmail(Model themodel, @PathVariable("name") String var, @PathVariable("type") String type) {
			return ResponseEntity.ok(associateService.findAssociateDetailByEmail(var));

		} 
		@GetMapping("/Associate/number/{name}")
		public ResponseEntity<?> getByNumber( @PathVariable("name") String var, @PathVariable("type") String type) {
			return ResponseEntity.ok(associateService.findAssociateDetailByNumber(var));
		}
			

	//@GetMapping("/Associate/showform")
	//public String showForm(Model themodel) {
		//CreateUserRequestModel model = new CreateUserRequestModel();
	////	themodel.addAttribute("socc", model);
		//return "showFormhtml";
	//}

	@PostMapping("/Associate/add")
	public ResponseEntity<?> createAssociate(@RequestBody CreateUserRequestModel model) {
		return ResponseEntity.ok(associateService.createUser(model));

	}

	@GetMapping("/Associate/viewAll")
	public ResponseEntity<?> viewAll() {
		return ResponseEntity.ok(associateService.findAll());

	}

	@PostMapping("/Associate/delete/{id}")
	public ResponseEntity<?> deleteAssociate(@PathVariable("id") String id ) {
		return ResponseEntity.ok(associateService.deleteById(id));
	}
	@PostMapping("/Associate/update")
	public ResponseEntity<?> updateAssociate(@RequestBody CreateUserResponseModel model) {
		return ResponseEntity.ok(associateService.updateUser(model));

	}
	//@GetMapping("/Associate/updateForm/{id}")
	//public String updateForm(Model themodel,@RequestParam("id") String id ) {
	//	System.out.println("here");
		//CreateUserResponseModel temp=associateService.findByAssociateId(id);
	//	themodel.addAttribute("socc",temp);
		//return "showUpdateForm";
	//}
	}

	

