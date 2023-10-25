package com.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.model.Student;
import com.webapp.repoaitory.StudentRepository;

@Service
public class StudentSerciceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
	

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).orElse(null);
	}

	@Override
	public void saveStudent(Student student) {
		studentRepository.save(student);

	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);

	}

}
