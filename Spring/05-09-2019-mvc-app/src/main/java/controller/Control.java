package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Control {
     @RequestMapping (method=RequestMethod.GET,name="/transfer")
	public String showView() {
		return "hello";
	}
   //  @RequestMapping (method=RequestMethod.POST ,name="/processView")
 //	public String processView() {
 	//	return "process";
 	//}
     @RequestMapping(name = "/processFormVersionTwo")
 	public String processStudentFormVersionTwo(HttpServletRequest request,
 			Model theModel)
 	
 	{
 		String message="Yo!!"+(request.getParameter("StudentName")).toUpperCase();
 theModel.addAttribute("M", message);
 		return "process";
 	}
// 	@RequestMapping(name = "/processFormVersionThree")
// 	public String processStudentFormVersionThree(@RequestParam("StudentName") String studentName,
// 			Model theModel)
// 	
// 	{
// 		String message="Yo!!"+(studentName.toUpperCase());
// theModel.addAttribute("M", message);
// 		return "hello-world";
// 	}
 	
	
}
