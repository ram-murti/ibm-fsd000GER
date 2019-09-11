package com.example.Resevation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Resevation.model.Reservation;


@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {

}
