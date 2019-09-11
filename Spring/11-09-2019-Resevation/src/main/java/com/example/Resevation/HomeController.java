package com.example.Resevation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Resevation.repository.PassengerRepository;


@Controller
public class HomeController {
private PassengerRepository passengerRepository;

public HomeController(PassengerRepository passengerRepository) {
	super();
	this.passengerRepository = passengerRepository;
}

@RequestMapping("/")
public String init() {
	return "redirect:/leagues/list";
}

	@RequestMapping("/passengers")
	public String getAllBooks(Model theModel)
	{
		theModel.addAttribute("passengers",passengerRepository.findAll());
		return "passengers";
	}
}
