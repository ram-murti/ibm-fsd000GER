package com.example.Boot;

import java.util.List;

public interface StudentDao {

	public void createStudent(Student student);
	public List<Student> getAllStudent();
}
