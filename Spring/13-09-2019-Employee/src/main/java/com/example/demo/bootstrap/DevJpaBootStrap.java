package com.example.demo.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.ContractualEmployee;
import com.example.demo.Employee;
import com.example.demo.PermanentEmployee;
import com.example.demo.repository.ContractualEmployeeRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.PermanentEmployeeRepository;
@Component
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent> {

	private EmployeeRepository employeeRepository;
	private PermanentEmployeeRepository permanentEmployeeRepository;
	private ContractualEmployeeRepository contractualEmployeeRepository;
	
	
	
	
	

	public DevJpaBootStrap(EmployeeRepository employeeRepository,
			PermanentEmployeeRepository permanentEmployeeRepository,
			ContractualEmployeeRepository contractualEmployeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
		this.permanentEmployeeRepository = permanentEmployeeRepository;
		this.contractualEmployeeRepository = contractualEmployeeRepository;
	}


	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}


	private void init() {
		// TODO Auto-generated method stub
		Employee emp=new Employee("Ram","Murti","murti@gmail.com");
		employeeRepository.save(emp);
		ContractualEmployee cemp=new ContractualEmployee("Anu","bhav","anu@gmail.com",10,"2019-2020");
		PermanentEmployee pemp=new PermanentEmployee("Ajju","giri","ajju@gmail.com",20000000);
		permanentEmployeeRepository.save(pemp);
		contractualEmployeeRepository.save(cemp);

	}

	
}
