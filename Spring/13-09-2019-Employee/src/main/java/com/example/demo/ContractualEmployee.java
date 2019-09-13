package com.example.demo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contractual_employee")
public class ContractualEmployee extends Employee {
   
	private int paperhour;
	private String contractualperiod;
	
	public ContractualEmployee(String first_name,String last_name,String email,int paperhour, String contractualperiod) {
		super(first_name, last_name, email);
		this.paperhour = paperhour;
		this.contractualperiod = contractualperiod;
		
	}
	public ContractualEmployee() {
		super();
	}
	public int getPaperhour() {
		return paperhour;
	}
	public void setPaperhour(int paperhour) {
		this.paperhour = paperhour;
	}
	public String getContractualperiod() {
		return contractualperiod;
	}
	public void setContractualperiod(String contractualperiod) {
		this.contractualperiod = contractualperiod;
	}
	
}
