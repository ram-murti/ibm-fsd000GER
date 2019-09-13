package com.example.Ingradients;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Ingradients.model.Ingradient;
import com.example.Ingradients.model.Note;
import com.example.Ingradients.model.Receipe;
import com.example.Ingradients.repository.IngradientRepository;
import com.example.Ingradients.repository.NoteRepository;
import com.example.Ingradients.repository.ReceipeRepository;


@Controller
@RequestMapping("/gradients")
public class GradientController {

	private ReceipeRepository receipeRepository;
	private IngradientRepository ingradientRepository;
	private NoteRepository noteRepository;
	


	
	public GradientController(ReceipeRepository receipeRepository, IngradientRepository ingradientRepository,
			NoteRepository noteRepository) {
		super();
		this.receipeRepository = receipeRepository;
		this.ingradientRepository = ingradientRepository;
		this.noteRepository = noteRepository;
	}
	@GetMapping("/list")
	public String getList(Model themodel) {
		Iterable<Receipe> socc= receipeRepository.findAll();
		themodel.addAttribute("socc", socc);
	
		System.out.println("here");
		return "list";
	}
	@GetMapping("/showAll")
	public String getAllDetails(Model themodel,@RequestParam("id") int id) {
	   Optional<Receipe> result=receipeRepository.findById( (long) id);
	   Receipe receipe = result.get();
	  List<Ingradient> receipe1=ingradientRepository.findAllByReceipe(receipe);
	  List<Note> receipe2=noteRepository.findAllByReceipe(receipe);
	  themodel.addAttribute("receipe", receipe);
	  themodel.addAttribute("ingradient",receipe1);
	  themodel.addAttribute("note",receipe2);

		return "showAll";
	}
}
