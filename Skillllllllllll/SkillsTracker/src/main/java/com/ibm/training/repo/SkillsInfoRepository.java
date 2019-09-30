package com.ibm.training.repo;

import org.springframework.data.repository.CrudRepository;

import com.ibm.training.model.SkillsInfo;

public interface SkillsInfoRepository extends CrudRepository<SkillsInfo, String> 
{
	
}
