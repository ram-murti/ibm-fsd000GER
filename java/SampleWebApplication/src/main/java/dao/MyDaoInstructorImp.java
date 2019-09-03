package dao;

import org.hibernate.Session;


import Factory.InstructorFactory;



public class MyDaoInstructorImp implements MyDao {
	private static Session session=null;
	static
	{
		session=InstructorFactory.getMySession();
	}

	public void createInstructor(Instructor instructor) {
		
		session.getTransaction().begin();
		session.persist(instructor);
		session.getTransaction().commit();
	}

	
}
