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

import com.example.demo.model.Rubrics;
import com.example.demo.service.RubricsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RequestMapping("/rubrics")
@Api(tags = "rubrics")
@CrossOrigin
@RestController
public class RubricsController {

	@Autowired
	private RubricsService rubricsService ;

	@PostMapping(path = "/insert")
	@ApiOperation(value = "Insert ribricas", response = Rubrics.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied") })
	public Rubrics insertRubrics(@RequestBody Rubrics rubrics) {
		return rubricsService.saveRbrics(rubrics);
	}

	@PutMapping(path = "/update")
	@ApiOperation(value = "Update rubricas", response = Rubrics.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied") })
	public Rubrics updateRubrics(@RequestBody Rubrics rubrics) {
		return rubricsService.editRubrics(rubrics);
	}

	@DeleteMapping(path = "/delete")
	@ApiOperation(value = "Delete rubricas", response = Rubrics.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied"),
			@ApiResponse(code = 404, message = "The estudiante doesn't exist") })
	public void deleteRubricsId(@RequestParam Long idRubrics) {
		rubricsService.deleteRubricsById(idRubrics);
	}

	@GetMapping(path = "/all")
	@ApiOperation(value = "Get All rubricas", response = Rubrics.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied"),
			@ApiResponse(code = 404, message = "The estudiante doesn't exist") })
	public List<Rubrics> getAllStudent() {
		return rubricsService.getAllRubrics();
	}

}
