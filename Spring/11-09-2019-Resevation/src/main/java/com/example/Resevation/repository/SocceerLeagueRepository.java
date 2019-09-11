package com.example.Resevation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Resevation.model.SocceerLeague;
@Repository
public interface SocceerLeagueRepository extends CrudRepository<SocceerLeague, Long> {

}
