package com.ibm.training.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ibm.training.model.AssociateSkills;


public interface AssociateSkillsRepository extends CrudRepository<AssociateSkills, String>
{
	List<AssociateSkills> findByAidAssociateId(String associateId);
	Iterable<AssociateSkills> deleteByAidAssociateId(String id);
}
