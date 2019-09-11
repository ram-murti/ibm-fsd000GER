package com.example.Boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class HomeController {

	@Autowired
	private StudentService service;
	
	public StudentService getStudent() {
		return service;
	}
	public void setStudent(StudentService student) {
		this.service = service;
	}
	@GetMapping("/boot")
	public String showSomething() {
		return "hello boot";
	}
	@PostMapping("/student")
	public void add(Student student) {
		service.createStudent(student);
		
	}
	@GetMapping("/student")
	public List<Student> getAllStudent(){
		List<Student> allStudent=service.getAllStudent();
		return allStudent;
	}
	
}
