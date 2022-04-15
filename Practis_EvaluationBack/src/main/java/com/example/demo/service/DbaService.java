package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Dba;
import com.example.demo.repository.DbaRepository;

@Service
public class DbaService {
	
	@Autowired
	private DbaRepository dbaRepository;
	
	public Dba saveDba(Dba dba) {
		return dbaRepository.save(dba);
	}

	public Dba editDba(Dba dba) {
		return dbaRepository.save(dba);
	}

	public void deleteDbaById(Long idDba) {
		dbaRepository.deleteById(idDba);
	}

	public List<Dba> getAllStudent() {
		return dbaRepository.findAll();
	}

}
