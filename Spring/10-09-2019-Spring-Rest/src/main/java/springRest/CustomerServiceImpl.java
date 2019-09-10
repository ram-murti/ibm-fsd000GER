package springRest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao dao;
	public void createCustomer(Customer theCustomer) {
		dao.createCustomer(theCustomer);

	}
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		Customer getCustomer=dao.getCustomer(id);
		return getCustomer;
	}
	public List<Customer> viewAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer> allCustomer=dao.viewAllCustomer();
		return allCustomer;
	}
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		dao.deleteCustomer(id);
		
	}
	public void updateEmploy(int id, String firstName, String lastName, String email) {
		// TODO Auto-generated method stub
		dao.updateEmploy(id, firstName, lastName, email);
		
	}
	public List<Customer> searchAllCustomerByfname(String fname) {
		// TODO Auto-generated method stub
		List<Customer> allCustomer=dao.searchAllCustomerByfname(fname);
		return allCustomer;
	}
	public List<Customer> searchAllCustomerBylName(String lname) {
		// TODO Auto-generated method stub
		List<Customer> allCustomer=dao.searchAllCustomerBylName(lname);
		return allCustomer;
	}
	

}