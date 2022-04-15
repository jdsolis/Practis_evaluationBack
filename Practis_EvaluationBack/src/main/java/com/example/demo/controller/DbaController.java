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

import com.example.demo.model.Dba;
import com.example.demo.service.DbaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RequestMapping("/dba")
@Api(tags = "dba")
@CrossOrigin 
@RestController
public class DbaController {
	
	@Autowired
	private DbaService dbaService;
	
	@PostMapping(path = "/insert")
	@ApiOperation(value = "Insert dba", response = Dba.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied") })
	public Dba insertDba(@RequestBody Dba dba) {
		return dbaService.saveDba(dba);
	}

	@PutMapping(path = "/update")
	@ApiOperation(value = "Update dba", response = Dba.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied") })
	public Dba updateStudent(@RequestBody Dba student) {
		return dbaService.editDba(student);
	}

	@DeleteMapping(path = "/delete")
	@ApiOperation(value = "Delete dba", response = Dba.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied"),
			@ApiResponse(code = 404, message = "The estudiante doesn't exist") })
	public void deleteDbaId(@RequestParam Long idDba) {
		dbaService.deleteDbaById(idDba);
	}

	@GetMapping(path = "/all")
	@ApiOperation(value = "Get All Dba", response = Dba.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied"),
			@ApiResponse(code = 404, message = "The estudiante doesn't exist") })
	public List<Dba> getAllStudent() {
		return dbaService.getAllStudent();

	}

}
