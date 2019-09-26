package com.example.demo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.SkillDto;
import com.example.demo.entity.Skill;
import com.example.demo.repository.SkillRepo;
@Service
public class SkillServiceImpl implements SkillService {
	@Autowired
	SkillRepo skillRepo;
	@Override
	public SkillDto createSkill(SkillDto skillDetail) {
		ModelMapper mapper=new ModelMapper();
		Skill s=mapper.map(skillDetail, Skill.class);
		skillRepo.save(s);
		SkillDto skill=mapper.map(s,SkillDto.class);
		return skill;
	}

	@Override
	public List<Skill> getAllSkills() {
		List<Skill> s=(List<Skill>) skillRepo.findAll();
		return s;
	}

	@Override
	public Skill findSkill(int id) {
		Skill skill=skillRepo.findBySid(id);
		return skill;
	}

	@Override
	public Skill deleteSkill(int id) {
		Skill skill=skillRepo.findBySid(id);
		skillRepo.delete(skill);
		return skill;
	}

	@Override
	public SkillDto updateSkill(SkillDto skillDetail, int id) {
		ModelMapper mapper=new ModelMapper();
		Skill skill=skillRepo.findBySid(id);
		Skill updatedSkill=mapper.map(skillDetail, Skill.class);
		skill.setSid(id);
		skill.setSkillName(updatedSkill.getSkillName());
		skill.setSubSkills(updatedSkill.getSubSkills());
		skillRepo.save(skill);
		
		SkillDto temp=mapper.map(updatedSkill, SkillDto.class);
		temp.setSid(id);
		System.out.println(temp.getSid());
		return temp;
	}
	
}
