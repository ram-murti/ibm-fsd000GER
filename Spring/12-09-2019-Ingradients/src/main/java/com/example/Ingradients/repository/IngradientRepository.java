package com.example.Ingradients.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Ingradients.model.Ingradient;
import com.example.Ingradients.model.Receipe;
@Repository
public interface IngradientRepository extends CrudRepository<Ingradient, Long> {
        List<Ingradient> findAllByReceipe(Receipe receipe);
}
