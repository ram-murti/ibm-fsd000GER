package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.SkillDto;
import com.example.demo.entity.Skill;

public interface SkillService {
	public SkillDto createSkill(SkillDto skillDetail);
	public List<Skill> getAllSkills();
	public Skill findSkill(int id);
	public Skill deleteSkill(int id);
	public SkillDto updateSkill(SkillDto skillDetail,int id);
}
