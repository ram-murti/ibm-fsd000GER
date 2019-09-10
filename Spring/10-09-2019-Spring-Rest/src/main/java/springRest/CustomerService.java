package springRest;

import java.util.List;

public interface CustomerService {
      public void createCustomer(Customer customer);
      public Customer getCustomer(int id);
  	public List<Customer> viewAllCustomer() ;
  	public void deleteCustomer(int id);
  	public void updateEmploy(int id,String firstName,String lastName,String email) ;
  	public List<Customer> searchAllCustomerByfname(String fname);
	public List<Customer> searchAllCustomerBylName(String lname);
}
