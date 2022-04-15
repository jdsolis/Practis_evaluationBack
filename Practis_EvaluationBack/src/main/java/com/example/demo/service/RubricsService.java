package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Rubrics;
import com.example.demo.repository.RubricsRepository;

@Service
public class RubricsService {

	
	@Autowired
	private RubricsRepository rubricsRepository;
	
	public Rubrics saveRbrics(Rubrics rubrics) {
		return rubricsRepository.save(rubrics);
	}

	public Rubrics editRubrics(Rubrics rubrics) {
		return rubricsRepository.save(rubrics);
	}

	public void deleteRubricsById(Long idRubrics) {
		rubricsRepository.deleteById(idRubrics);
	}

	public List<Rubrics> getAllRubrics() {
		return rubricsRepository.findAll();
	}
}
