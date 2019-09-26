package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.AssociateDto;

public interface AssociateService {

public AssociateDto createAssociate(AssociateDto tempDto);
public AssociateDto findById(Long id);
public List<AssociateDto> findByFirstName(String fname);
public List<AssociateDto> findByLastName(String lname)
;
public AssociateDto findByFirstNameAndLastName(String fname,String lname);
public AssociateDto findByEmail(String email);
public AssociateDto findBymobileNumber(long number);
public List<AssociateDto> deleteById(long id);
public List<AssociateDto> viewAll();
public List<AssociateDto> updateById(AssociateDto tempDto);
public List<AssociateDto> deleteByAssociateId(String id);
public AssociateDto findByAssociateId(String id);

}
