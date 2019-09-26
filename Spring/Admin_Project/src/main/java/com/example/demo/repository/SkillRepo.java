package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Skill;
@Repository
public interface SkillRepo extends CrudRepository<Skill, Integer>{
	Skill findBySid(int id);
}
