package com.example.demo.model;

import javax.validation.constraints.Email;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateUserRequestModel {
	private String associateFirstName;
	private String associateLastName;
	private String email;
	private long associateMobilenumber;
	
	public CreateUserRequestModel() {
		super();
	}
	public CreateUserRequestModel( String associateFirstName, String associateLastName, String email,
			long associateMobilenumber) {
		super();
	
		this.associateFirstName = associateFirstName;
		this.associateLastName = associateLastName;
		this.email = email;
		this.associateMobilenumber = associateMobilenumber;
	}
	
	public String getAssociateFirstName() {
		return associateFirstName;
	}
	public void setAssociateFirstName(String associateFirstName) {
		this.associateFirstName = associateFirstName;
	}
	public String getAssociateLastName() {
		return associateLastName;
	}
	public void setAssociateLastName(String associateLastName) {
		this.associateLastName = associateLastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Number getAssociateMobilenumber() {
		return associateMobilenumber;
	}
	public void setAssociateMobilenumber(long associateMobilenumber) {
		this.associateMobilenumber = associateMobilenumber;
	}
	
	

}
