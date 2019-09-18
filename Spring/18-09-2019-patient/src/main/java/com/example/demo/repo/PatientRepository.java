package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Patient;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer> {

	List<Patient> findByPatientDisease(String disease);
}
