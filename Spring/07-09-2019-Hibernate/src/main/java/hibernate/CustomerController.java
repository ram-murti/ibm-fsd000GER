package hibernate;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;





@Controller
@RequestMapping("/customer")
public class CustomerController {
		@Autowired
		private CustomerService customerService;
		  @GetMapping("/")
		 	public String studentForm(Model model) {
		 		Customer customer=new Customer();
		 		model.addAttribute("customer",customer);
		 		return "sForm";
		  }
		  
		  @PostMapping("/view")
		  public String addcustomer(@ModelAttribute("customer") Customer customer, Model themodel) {
			  customerService.createCustomer(customer);		 
			  System.out.println("added");
			  return "sForm";
		  }
		@GetMapping("/viewAll")
		public String viewAll(Model themodel){
			Customer customer=new Customer();
	 		themodel.addAttribute("customer",customer);
			 List<Customer> allCustomer=customerService.viewAllCustomer();
			  themodel.addAttribute("allCustomer",allCustomer);
			  return "sForm";
		}
		@GetMapping("delete")
		public String deleteById(Model themodel,@RequestParam("id") String Param){
			Customer customer=new Customer();
	 		themodel.addAttribute("customer",customer);
	 		int id=Integer.parseInt(Param);
	 		System.out.println(id);
			 customerService.deleteCustomer(id);
			  
			  return "redirect:/customer/viewAll";
		}
		
		@GetMapping("/firstfind")
		public String findById(Model themodel,@RequestParam("id") String Param){
	 		int id=Integer.parseInt(Param);
			Customer customer=customerService.getCustomer(id);
	           themodel.addAttribute("customer", customer);
			return "update";

			
		}
		@PostMapping("/update")
		public String updateById(Model themodel,@ModelAttribute("customer") Customer customer){
		
			customerService.updateEmploy(customer.getId(), customer.getFirstName(), customer.getLastName(),customer.getEmail());
			
		return "redirect:/customer/viewAll";
		}
		
		
		
}
