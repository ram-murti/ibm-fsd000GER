package com.example.demo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("permanent_employee")
public class PermanentEmployee extends Employee{
    
	private double salary;
	private double commission;
	
	
	public PermanentEmployee() {
		super();
	}
	public PermanentEmployee(String first_name,String last_name,String email,double salary) {
		super(first_name, last_name, email);
		this.salary = salary;
		this.commission = this.salary/100;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	

}
