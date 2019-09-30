package com.ibm.training.repo;

import org.springframework.data.repository.CrudRepository;

import com.ibm.training.model.AssociateSkills;

public interface AssociateSkillsInt extends CrudRepository<AssociateSkills, Integer>
{

	void deleteByAidAssociateId(Integer id);

	//Iterable<AssociateSkills> findAllById(Integer id);

}
