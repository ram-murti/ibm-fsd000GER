package com.ibm.fsd.my_first_maven_demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="employee")
@Data
public class Employee implements Serializable {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", lName=" + lName + "]";
	}
	@Column(name="Fname")
private String fName;
	@Column(name="Lname")
private String lName;

public Employee() {
	super();
}
public Employee( String fName, String lName ) {
	super();
	this.fName = fName;
	this.lName = lName;
	
}
}
