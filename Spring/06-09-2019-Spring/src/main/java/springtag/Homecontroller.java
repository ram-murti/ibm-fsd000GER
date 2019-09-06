package springtag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {

	@GetMapping("/")
	public String homePage() {
		return"main-menu";
	}
	@GetMapping("/sForm")
	public String studentForm(Model model) {
		Student student=new Student();
		model.addAttribute("student",student);
		return"sForm";
	}
	
	@PostMapping("/Show")
	public String showForm(@ModelAttribute("student") Student student, Model themodel ) {
		themodel.addAttribute("student", student);
		return"Show";
	}
}
