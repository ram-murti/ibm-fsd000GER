package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface DoctorService {
	
	
	@GetMapping("/doctors")
	public ResponseEntity<?> getDoctors();
	@GetMapping("/doctors/{diseases}")
	public ResponseEntity<?> getDoctorsByDisease(@PathVariable("diseases") String  disease);


}
