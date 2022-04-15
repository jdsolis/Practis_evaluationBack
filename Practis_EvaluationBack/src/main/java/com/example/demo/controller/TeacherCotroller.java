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

import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RequestMapping("/teacher")
@Api(tags = "teacher")
@CrossOrigin
@RestController


public class TeacherCotroller {

	@Autowired
	private TeacherService teacherService;
	
	@PostMapping(path = "/insert")
	@ApiOperation(value = "Insert profesor", response = Teacher.class)
	@ApiResponses(value = {
	@ApiResponse(code = 400, message = "Something went wrong"),
	@ApiResponse(code = 401, message = "Access denied")})
	public Teacher insertTeacher(@RequestBody Teacher teacher){
	return teacherService.saveTeacher(teacher);
	}
	
	
	@PutMapping(path = "/update")
	@ApiOperation(value = "Update profesor", response = Teacher.class)
	@ApiResponses(value = {
	@ApiResponse(code = 400, message = "Something went wrong"),
	@ApiResponse(code = 401, message = "Access denied")})
	public Teacher updateTeacher(@RequestBody Teacher teacher) {
	return teacherService.editTeacher(teacher);
	}
	
	@DeleteMapping(path = "/delete")
	@ApiOperation(value = "Delete profesor", response = Teacher.class)
	@ApiResponses(value = {
	@ApiResponse(code = 400, message = "Something went wrong"),
	@ApiResponse(code = 401, message = "Access denied"),
	@ApiResponse(code = 404, message = "The tarea doesn't exist")})
	public void deleteTeacherId(@RequestParam Long idteacher) {
		teacherService.deleteTeacherById(idteacher);
	}
	
	@GetMapping(path = "/all")
	@ApiOperation(value = "Get All profesor", response = Teacher.class)
	@ApiResponses(value = {
	@ApiResponse(code = 400, message = "Something went wrong"),
	@ApiResponse(code = 401, message = "Access denied"),
	@ApiResponse(code = 404, message = "The tarea doesn't exist")})
	public List<Teacher> getAllTeacher() {
	return teacherService.getAllTeacher();
	
			}
	}
	

