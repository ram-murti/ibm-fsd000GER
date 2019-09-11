package com.example.Resevation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Resevation.model.Flight;
@Repository
public interface FlightRepository extends CrudRepository<Flight, Long> {

}
