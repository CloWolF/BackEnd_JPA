package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Paciente;
import com.example.demo.repository.PacienteRepository;
import com.example.demo.services.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService {
	@Autowired
	PacienteRepository pacienteRepository;


	@Override
	public List<Paciente> findAllPacientes() {
		return pacienteRepository.findAll();
	}


	@Override
	public Optional<Paciente> findPacienteById(Long id) {
		Optional<Paciente> paciente =pacienteRepository.findById(id);
		return paciente;
	}
}
