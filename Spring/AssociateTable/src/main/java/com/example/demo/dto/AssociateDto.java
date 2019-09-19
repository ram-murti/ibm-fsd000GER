package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
@Entity
public class AssociateDto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String associateId;
	private String associateFirstName;
	private String associateLastName;
	private String email;
	private long associateMobilenumber;
	
	public AssociateDto() {
		super();
	}

	public AssociateDto( String associate_id, String associateFirstName, String associateLastName,
			String email, long associateMobilenumber) {
		super();

		this.associateId = associate_id;
		this.associateFirstName = associateFirstName;
		this.associateLastName = associateLastName;
		this.email = email;
		this.associateMobilenumber = associateMobilenumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAssociateId() {
		return associateId;
	}

	public void setAssociateId(String associate_id) {
		this.associateId = associate_id;
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

	public Long getAssociateMobilenumber() {
		return associateMobilenumber;
	}

	public void setAssociateMobilenumber(long associateMobilenumber) {
		this.associateMobilenumber = associateMobilenumber;
	}
	
}