package com.example.Resevation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Resevation.model.SocceerLeague;
import com.example.Resevation.repository.SocceerLeagueRepository;

@Controller
@RequestMapping("/leagues")
public class LeagueController {

	
	private SocceerLeagueRepository socceerLeagueRepository;


	public LeagueController(SocceerLeagueRepository socceerLeagueRepository) {
		super();
		this.socceerLeagueRepository = socceerLeagueRepository;
	}


	@GetMapping("/list")
	public String getList(Model themodel) {
		Iterable<SocceerLeague> socc= socceerLeagueRepository.findAll();
		themodel.addAttribute("socc", socc);
		return "list";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		SocceerLeague socc = new SocceerLeague();
		
		theModel.addAttribute("socc", socc);
		
		return "showFormForAdd";
	}
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("socc") SocceerLeague socc) {
		
		// save the employee
		socceerLeagueRepository.save(socc);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/leagues/list";
	}
	
}
