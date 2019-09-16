package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Employee;
import com.example.demo.PermanentEmployee;
@Repository
public interface PermanentEmployeeRepository extends CrudRepository<PermanentEmployee, Long> {


}
