package com.example.Ingradients.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Ingradients.model.Note;
import com.example.Ingradients.model.Receipe;
@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {
   List<Note> findAllByReceipe(Receipe receipe);
}
