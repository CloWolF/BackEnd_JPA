package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Comuna;
import com.example.demo.repository.ComunaRepository;
import com.example.demo.services.ComunaService;

@Service
public class ComunaServiceImpl implements ComunaService {
	@Autowired
	ComunaRepository comunaRepository;


	@Override
	public List<Comuna> findAllComunas() {
		return comunaRepository.findAll();
	}


	@Override
	public Optional<Comuna> findComunaById(Long id) {
		Optional<Comuna> comuna =comunaRepository.findById(id);
		return comuna;
	}

}
