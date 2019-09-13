package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ContractualEmployee;
@Repository
public interface ContractualEmployeeRepository extends CrudRepository<ContractualEmployee, Long> {

}
