package _08_2019_CRUD_MAVEN.CRUD;

import java.util.List;


import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import javax.persistence.Query;
public class CRUDmethod {
	Employee emp = new Employee();
	public SessionFactory getSession() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		return factory;
	}

	public void addEmployeMethod(String fname, String lname) {
		SessionFactory s = getSession();
		Session session = s.openSession();
		Employee employee = new Employee(fname, lname);
		session.getTransaction().begin();
		session.persist(employee);
		session.getTransaction().commit();

	}

	public void viewAllEmployee() {
		SessionFactory s = getSession();
		Session session = s.openSession();
		 session.getTransaction().begin();

		Query query = session.createQuery("from Employee");
		@SuppressWarnings("unchecked")
		List<Employee> list = query.getResultList();
		for (Employee e : list) {
			System.out.println(e);
		}
         
         
         session.getTransaction().commit();
	}

	public void getEmployeeById(int id) {
		SessionFactory s = getSession();
		Session session = s.openSession();
		
		 session.getTransaction().begin();

		Employee getEmp = session.get(Employee.class, new Integer(id));
		System.out.println(getEmp.toString());
        session.getTransaction().commit();

	}
	public void deleteEmployeById(int id) {
		SessionFactory s = getSession();
		Session session = s.openSession();
		 session.getTransaction().begin();
       Employee emp1=session.get(Employee.class, new Integer(id));
       session.delete(emp1);
       session.getTransaction().commit();

	}
	public void updateEmployeById(int id,String fName,String lName) {
		SessionFactory s = getSession();
		Session session = s.openSession();
		 session.getTransaction().begin();
       Employee emp1=session.get(Employee.class, new Integer(id));
       
       emp1.setfName(fName);
       emp1.setlName(lName);
       if(emp1==null) {
    	   System.out.println("not found");
       }
       else {
    	   System.out.println(emp1.toString());
       }
       session.getTransaction().commit();

	}
	
}
