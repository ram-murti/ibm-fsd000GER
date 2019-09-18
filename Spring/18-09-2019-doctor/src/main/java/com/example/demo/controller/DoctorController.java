package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repo.DoctorRepository;

@RestController
public class DoctorController {

	@Autowired
	DoctorRepository doctorRepository;
	
	@GetMapping("/patients")
	public ResponseEntity<?> getPatients(){
		return ResponseEntity.ok(doctorRepository.findAll());
	}
	
	@GetMapping("/patients/{diseases}")
	public ResponseEntity<?> getPatientsByDisease(@PathVariable("diseases") String  disease){
		return ResponseEntity.ok(doctorRepository.findByDoctorSpeciality(disease));
	}
	
	
}