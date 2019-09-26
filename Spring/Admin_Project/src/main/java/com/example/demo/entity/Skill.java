package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Skill")
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	@Column(name="skill_name")
	private String skillName;
	@Column(name="sub_skills")
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
