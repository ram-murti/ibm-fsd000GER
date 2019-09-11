package com.example.Boot;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService, StudentDao {

	@Autowired
	private StudentDao dao;
	@Override
	public void createStudent(Student student) {
		// TODO Auto-generated method stub
            dao.createStudent(student);
	}
	@Override
	@Transactional
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> student=dao.getAllStudent();
		return student;
	}

}
