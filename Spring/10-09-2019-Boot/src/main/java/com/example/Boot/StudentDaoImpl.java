package com.example.Boot;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDaoImpl implements StudentDao {

	
	@Autowired
	private EntityManager em;
	private Session session;
	
	
	public StudentDaoImpl() {
		super();

	}

	@Override
	public void createStudent(Student student) {
		// TODO Auto-generated method stub
		session.saveOrUpdate(student);

		
	}

	@Override
	public List<Student> getAllStudent() {
		System.out.println("here");
		// TODO Auto-generated method stub
		session=em.unwrap(Session.class);

		Query query = session.createQuery("from Student",Student.class);
		System.out.println(query);
     
	List<Student> allStudent=query.getResultList();
		return allStudent;
	}

}
