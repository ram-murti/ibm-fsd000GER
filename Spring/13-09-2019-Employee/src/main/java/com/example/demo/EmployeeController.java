package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repository.ContractualEmployeeRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.PermanentEmployeeRepository;

@Controller

public class EmployeeController {
	private EmployeeRepository employeeRepository;
	private PermanentEmployeeRepository permanentEmployeeRepository;
	private ContractualEmployeeRepository contractualEmployeeRepository;
	public EmployeeController(EmployeeRepository employeeRepository,
			PermanentEmployeeRepository permanentEmployeeRepository,
			ContractualEmployeeRepository contractualEmployeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
		this.permanentEmployeeRepository = permanentEmployeeRepository;
		this.contractualEmployeeRepository = contractualEmployeeRepository;
	}
	
	@GetMapping("/")
	public String getlist(Model themodel) {
		List<Employee> emp=(List<Employee>) employeeRepository.findAll();
		themodel.addAttribute("socc",emp);
		return "list";
	}
	@GetMapping("/loginp")
	public String getlistp(Model themodel) {
		List<PermanentEmployee> emp=(List<PermanentEmployee>) permanentEmployeeRepository.findAll();
		themodel.addAttribute("soccp",emp);
		return "list";
	}
	
	@GetMapping("/loginc")
	public String getlistc(Model themodel) {
		List<ContractualEmployee> emp=(List<ContractualEmployee>) contractualEmployeeRepository.findAll();
		themodel.addAttribute("soccc",emp);
		return "list";
	}
	

}
