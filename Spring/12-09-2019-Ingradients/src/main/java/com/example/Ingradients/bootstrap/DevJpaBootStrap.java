package com.example.Ingradients.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.Ingradients.model.Ingradient;
import com.example.Ingradients.model.Note;
import com.example.Ingradients.model.Receipe;
import com.example.Ingradients.repository.IngradientRepository;
import com.example.Ingradients.repository.NoteRepository;
import com.example.Ingradients.repository.ReceipeRepository;
@Component
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent> {

	
	private NoteRepository noteRepository;
	private ReceipeRepository receipeRepository;
	private IngradientRepository ingradientRepository;
	
	
	public DevJpaBootStrap(NoteRepository noteRepository, ReceipeRepository receipeRepository,
			IngradientRepository ingradientRepository) {
		super();
		this.noteRepository = noteRepository;
		this.receipeRepository = receipeRepository;
		this.ingradientRepository = ingradientRepository;
	}


	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}


	private void init() {
		// TODO Auto-generated method stub
		Note note=new Note();
		note.setRecipie_note("Be Careful");
		
		Ingradient ing=new Ingradient(10.00,"sugar","2 spoon");
		Receipe rece=new Receipe("masala",5l,6l,"Moderate",note);
		rece.getIngradient().add(ing);
		ing.getReceipe().add(rece);
		note.setReceipe(rece);
		rece.setNote(note);
		ingradientRepository.save(ing);
		receipeRepository.save(rece);
		
		
		Note note1=new Note();
		note1.setRecipie_note("Be more  Careful");
		
		Ingradient ing1=new Ingradient(15.00,"mirchimsala","15 Sppon");
		Receipe rece1=new Receipe("chicken",5l,6l,"Hard",note1);
		rece1.getIngradient().add(ing1);
		ing1.getReceipe().add(rece1);
		note1.setReceipe(rece1);
		rece.setNote(note1);
		ingradientRepository.save(ing1);
		receipeRepository.save(rece1);
	}

}
