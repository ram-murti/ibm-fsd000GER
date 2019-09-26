package com.example.demo.model;

public class ResponseModel {
	private int sid;
	private String skillName;
	private String subSkills;
	public ResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int id) {
		this.sid = id;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getSubSkills() {
		return subSkills;
	}
	public void setSubSkills(String subSkills) {
		this.subSkills = subSkills;
	}
	
}
