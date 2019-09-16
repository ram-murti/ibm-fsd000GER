package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@GetMapping("/add")
	public String addEmployeeForm(Model themodel) {
		
		Employee emp=new Employee();
		
		return "employeeForm";
	}
	@PostMapping("/type")
	public String addEmployee(@ModelAttribute("socc") Employee emp, @RequestParam("type") String type, Model themodel ) {
      PermanentEmployee emp1=new PermanentEmployee();
      themodel.addAttribute("socc1",emp1);
      ContractualEmployee emp2=new ContractualEmployee();
      themodel.addAttribute("socc2",emp2);
      themodel.addAttribute("socc",emp);

		if(type.equals("employee")) {
		
		return "employeeF";}
		else if(type.equals("pemployee")) {
			return "permanentEmployeeForm";
		}
		else {
			return "contractualEmployeeForm";
		}
	
	}
	@PostMapping("/pemployee")
	public String addPEmployee(@ModelAttribute("socc1") PermanentEmployee emp) {
		permanentEmployeeRepository.save(emp);
		return "redirect:/";
		
	}
	@PostMapping("/cemployee")
	public String addCEmployee(@ModelAttribute("socc2") ContractualEmployee emp) {
		contractualEmployeeRepository.save(emp);
		return "redirect:/";
		
	}
	@PostMapping("/employee")
	public String addEmployee(@ModelAttribute("socc") ContractualEmployee emp) {
		employeeRepository.save(emp);
		return "redirect:/";
		
	}

}
