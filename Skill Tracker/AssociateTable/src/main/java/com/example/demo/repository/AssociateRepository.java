package com.example.demo.repository;

import java.util.List;

import javax.validation.constraints.Email;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AssociateDetail;
@Repository
public interface AssociateRepository extends JpaRepository<AssociateDetail, Long> {

	public List<AssociateDetail> findByAssociateFirstName(String fname);
	public List<AssociateDetail> findByAssociateLastName(String lname);
	public AssociateDetail findByAssociateFirstNameAndAssociateLastName(String fname,String lname);
	public AssociateDetail findByEmail(String email);
	public AssociateDetail findByAssociateMobilenumber(long number);
	
}
