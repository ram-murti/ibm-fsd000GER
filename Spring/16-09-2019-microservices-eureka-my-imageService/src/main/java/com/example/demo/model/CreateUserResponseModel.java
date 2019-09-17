package com.example.demo.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CreateUserResponseModel {
	private String user_id;
	private String fname;
	private String lname;
	private String email;

	public CreateUserResponseModel() {
		super();
	}

	public CreateUserResponseModel(String userId, String fname, String lname, String email) {
		super();
		this.user_id = userId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String userId) {
		this.user_id = userId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
	