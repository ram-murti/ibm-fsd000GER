package com.example9.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example9.model.Author;
@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
