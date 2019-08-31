package com.ibm.fsd.my_first_maven_demo;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
                                   .buildSessionFactory();
              Session session=factory.openSession();
              Employee employee=new Employee("Sachin","Tendulkar"); 
              session.getTransaction().begin();
              session.persist(employee);
              System.out.println("inserted");
              session.getTransaction().commit();
              
	}

}
