package com.example9.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example9.model.Publisher;
@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

	
}
