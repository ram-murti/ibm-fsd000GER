package com.example.Resevation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Resevation.model.Passenger;
@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Long> {

}
