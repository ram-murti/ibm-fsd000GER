package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Doctor;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Integer> {

	List<Doctor> findByDoctorSpeciality(String disease);
}