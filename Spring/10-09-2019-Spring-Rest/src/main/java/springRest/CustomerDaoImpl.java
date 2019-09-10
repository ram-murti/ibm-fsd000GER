package springRest;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.Query;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;





@Repository

public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	public CustomerDaoImpl() {
		super();
	}
	@PostConstruct
	public void createSession()
	{
		session=sessionFactory.openSession();
	}
	

	public CustomerDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Transactional
	public void createCustomer(Customer theCustomer) {
		
		session.saveOrUpdate(theCustomer);
	}
	
	@Transactional
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		Customer getCustomer=session.get(Customer.class,new Integer(id));
		return getCustomer;
	}
	@Transactional
	public List<Customer> viewAllCustomer() {
		// TODO Auto-generated method stub
		Query query = session.createQuery("from Customer");
       List<Customer> allCustomer=query.getResultList();
		return allCustomer;
	}
	public void deleteCustomer(int id) {
	       Customer delete=session.get(Customer.class, new Integer(id));
	       session.getTransaction().begin();
              session.remove(delete);
             session.getTransaction().commit();
              System.out.println("Deleted");
	
	}
	public void updateEmploy(int id, String firstName, String lastName, String email) {
		// TODO Auto-generated method stub
	    session.getTransaction().begin();
        
			Customer getCustomer=session.get(Customer.class,new Integer(id));
	         getCustomer.setFirstName(firstName);
	         getCustomer.setLastName(lastName);
	         getCustomer.setEmail(email);
	         session.getTransaction().commit();
	}
	public List<Customer> searchAllCustomerByfname(String fname) {
		// TODO Auto-generated method stub
	    session.getTransaction().begin();

		Query query = session.createQuery("from Customer where fName Like '%fname%'");
	       List<Customer> allCustomer=query.getResultList();
	         session.getTransaction().commit();

		return allCustomer;
	}
	public List<Customer> searchAllCustomerBylName(String lname) {
		// TODO Auto-generated method stub
		  session.getTransaction().begin();

			Query query = session.createQuery("from Customer where lName Like '%fname%'");
		       List<Customer> allCustomer=query.getResultList();
		         session.getTransaction().commit();

		return allCustomer;
	}
	

}
	