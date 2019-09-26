package com.example.demo.entity;

public class Admin {
	private int aid;
	private String userName;
	private String fname;
	private String lname;
	private String password;

	public Admin(String userName, String fname, String lname, String password) {
		super();
		this.userName = userName;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

}
