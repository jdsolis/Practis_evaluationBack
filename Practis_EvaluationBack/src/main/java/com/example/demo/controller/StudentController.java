package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RequestMapping("/student")
@Api(tags = "student")
@CrossOrigin
@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping(path = "/insert")
	@ApiOperation(value = "Insert estudiante", response = Student.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied") })
	public Student insertStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@PutMapping(path = "/update")
	@ApiOperation(value = "Update estudiante", response = Student.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied") })
	public Student updateStudent(@RequestBody Student student) {
		return studentService.editStudent(student);
	}

	@DeleteMapping(path = "/delete")
	@ApiOperation(value = "Delete estudiante", response = Student.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied"),
			@ApiResponse(code = 404, message = "The estudiante doesn't exist") })
	public void deleteStudentId(@RequestParam Long idstudent) {
		studentService.deleteStudentById(idstudent);
	}

	@GetMapping(path = "/all")
	@ApiOperation(value = "Get All estudiante", response = Student.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied"),
			@ApiResponse(code = 404, message = "The estudiante doesn't exist") })
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}
}
