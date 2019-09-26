package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Admin;
import com.example.demo.model.RequestModel;
import com.example.demo.service.AdminService;
import com.example.demo.service.SkillService;

@RestController
public class AppController {

//	@Autowired
//	AdminService adminService;

	@Autowired
	SkillService skillService;

	@PostMapping("skill")
	public ResponseEntity<?> createSkill(@RequestBody RequestModel skillDetail) {

		return ResponseEntity.ok(skillService.create(skillDetail));
	}
	
	@GetMapping("skill/getAll")
	public ResponseEntity<?> getSkills() {
		return ResponseEntity.ok(skillService.getAllSkills());
	}
	
	@GetMapping("skill/id/{id}")
	public ResponseEntity<?> getSkillById(@PathVariable("id") String userID){
		return ResponseEntity.ok(skillService.findSkill(userID));
	}
	
	@GetMapping("skill/name/{name}")
	public ResponseEntity<?> getSkillByName(@PathVariable("name") String skillName){
		return ResponseEntity.ok(skillService.findSkillByName(skillName));
	}
	
	@DeleteMapping("skill/delete/{id}")
	public ResponseEntity<?> deleteSkill(@PathVariable("id") String userID){
		return ResponseEntity.ok(skillService.deleteSkill(userID));
	}
	
	@PostMapping("/skill/update/{id}")
	public ResponseEntity<?> updateSkill(@RequestBody RequestModel skillDetail,@PathVariable("id") String userID) {
		return ResponseEntity.ok(skillService.updateSkill(skillDetail,userID));
	}
	
	@PutMapping("/admin/update")
	public ResponseEntity<?> updateAdmin(@RequestBody Admin a) {
		return ResponseEntity.ok(skillService.updateAdmin(a));
	}
	
	@GetMapping("/admin/view")
	public ResponseEntity<?> getAdminDetails() {
		return ResponseEntity.ok(skillService.getAdmin());
	}
}
