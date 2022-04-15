package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student editStudent(Student student) {
		return studentRepository.save(student);
	}

	public void deleteStudentById(Long idstudent) {
		studentRepository.deleteById(idstudent);
	}

	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}
	
	
}
