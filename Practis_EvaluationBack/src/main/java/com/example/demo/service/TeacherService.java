package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepository teacherRepository;

	public Teacher saveTeacher(Teacher teacher) {
	return teacherRepository.save(teacher);
	}
	public Teacher editTeacher(Teacher teacher) {
	return teacherRepository.save(teacher);
	}
	public void deleteTeacherById(Long idteacher) {
		teacherRepository.deleteById(idteacher);
	}
	public List<Teacher> getAllTeacher() {
	return teacherRepository.findAll();
	}


}
