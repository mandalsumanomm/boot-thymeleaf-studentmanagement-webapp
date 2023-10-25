package com.webapp.service;

import java.util.List;

import com.webapp.model.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student getStudentById(Long id);
	
	void saveStudent(Student student);
	
	void deleteStudent(Long id);
}
