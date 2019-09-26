package com.example.demo.model;

public class RequestModel {
	
	private String skillName;
	private String subSkills;
	public RequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RequestModel(String skillName, String subSkills) {
		super();
		this.skillName = skillName;
		this.subSkills = subSkills;
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
