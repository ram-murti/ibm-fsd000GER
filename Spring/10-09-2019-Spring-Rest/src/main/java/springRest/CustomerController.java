package springRest;

import java.util.List;

import org.hibernate.annotations.Parameter;
import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@GetMapping(value="/customers/{id}")
	public Customer getCustomerById(@PathVariable("id") String param) {
		int id=Integer.parseInt(param);
		return service.getCustomer(id);
	}
	
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		
	service.createCustomer(customer);
	return customer;
	}
	@DeleteMapping(value="/customers/{id}")
	public void deleteCustomer(@PathVariable("id") String param) {
		int id=Integer.parseInt(param);

		service.deleteCustomer(id);
	}
	@PutMapping("/customers/{id}")
	public void updateCustomer(@PathVariable("id") String param,@RequestBody Customer customer) {
		int id=Integer.parseInt(param);
          System.out.println(customer.getEmail());
		service.updateEmploy(id, customer.getFirstName(), customer.getLastName(), customer.getEmail());
	}
}
