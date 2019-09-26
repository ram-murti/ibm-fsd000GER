package com.example.demo.entity;

public class Skill {
	private int sid;
	private String skillName;
	private String subSkills;
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skill(String skillName, String subSkills) {
		super();
		this.skillName = skillName;
		this.subSkills = subSkills;
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
