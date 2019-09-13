package com.example.Ingradients.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Ingradients.model.Receipe;
@Repository
public interface ReceipeRepository extends CrudRepository<Receipe, Long> {

	 
}
