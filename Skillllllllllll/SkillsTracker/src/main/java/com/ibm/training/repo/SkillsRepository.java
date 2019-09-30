package com.ibm.training.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ibm.training.model.AssociateInfo;

public interface SkillsRepository extends CrudRepository<AssociateInfo, String> 
{
	List<AssociateInfo> findByAssociateName(String associateName);
	List<AssociateInfo> findByAssociateEmail(String associateName);
}
