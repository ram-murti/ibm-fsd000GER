package com.example.Ingradients;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	@RequestMapping("/")
	public String init() {
		return "redirect:/gradients/list";
	}

	}
