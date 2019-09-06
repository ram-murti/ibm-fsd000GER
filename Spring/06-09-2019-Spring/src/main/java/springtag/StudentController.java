package springtag;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {
     @GetMapping("/")
	public String homePage() {
		return "main-menu";
	}
     @GetMapping("/sForm")
 	public String studentForm(Model model) {
 		Student student=new Student();
 		model.addAttribute("student",student);
 		return "sForm";
 	}
 	
 	@PostMapping("/Show")
 	public String showForm(@ModelAttribute("student") Student student, Model themodel ) {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
 		themodel.addAttribute("student", student);
        StudentDao dao=context.getBean("studentDao",StudentDao.class);
 		dao.createEmployee(student);
 		List<Student> view=dao.getAllStudentRowMapper();
 		for(Student s1:view) {
 			System.out.println(s1.getFirst_name()+s1.getLast_name()+s1.getFavoriteLanguage());
 		}
 		themodel.addAttribute("list",view);
 	   return showAll(themodel);
 		
 	}
	@GetMapping("/ShowAll")
 	public String showAll( Model themodel ) {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
 		
        StudentDao dao=context.getBean("studentDao",StudentDao.class);
 		List<Student> view=dao.getAllStudentRowMapper();
 		for(Student s1:view) {
 			System.out.println(s1.getFirst_name()+s1.getLast_name()+s1.getFavoriteLanguage());
 		}
 		themodel.addAttribute("list",view);
 		return studentForm(themodel);
 	}
 	
}
