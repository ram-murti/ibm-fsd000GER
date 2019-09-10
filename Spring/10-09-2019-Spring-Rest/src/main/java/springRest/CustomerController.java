package springRest;

import java.util.List;

import org.hibernate.annotations.Parameter;
import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	private CustomerService service;
     @GetMapping("/customers")
	public List<Customer> getAllCustomers()
	{
		return service.viewAllCustomer();
	}
	@GetMapping(value="/customer/{id}")
	public Customer getCustomerById(int id) {
		
		return service.getCustomer(id);
	}
	
	@PostMapping
	public void addCustomer(Customer customer) {
		
	service.createCustomer(customer);
	}
	@DeleteMapping(value="/?id")
	public void deleteCustomer(int id) {
		service.deleteCustomer(id);
	}
	
	public void updateCustomer() {
		//service.updateEmploy(id, firstName, lastName, email);
	}
}
