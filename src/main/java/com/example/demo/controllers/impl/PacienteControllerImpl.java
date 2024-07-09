package com.example.demo.controllers.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.controllers.PacienteController;
import com.example.demo.entities.Paciente;
import com.example.demo.services.PacienteService;

public class PacienteControllerImpl  implements PacienteController {

	@Autowired
	PacienteService pacienteService;


	// http://localhost:8888/customers (GET)
	@GetMapping(value = "/pacientes", produces = "application/json")
	@Override
	public List<Paciente> getPacientes() {
		return pacienteService.findAllPacientes();
	}


	// http://localhost:8888/customers/1 (GET)
	@Override
	//@RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = "application/json")
	@GetMapping(value = "/pacientes/{id}", produces = "application/json")
	public Optional<Paciente> getPacienteById(@PathVariable Long id) {
		return pacienteService.findPacienteById(id);
	}
}
