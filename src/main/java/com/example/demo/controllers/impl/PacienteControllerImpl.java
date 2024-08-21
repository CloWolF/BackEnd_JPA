package com.example.demo.controllers.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controllers.PacienteController;
import com.example.demo.entities.Paciente;
import com.example.demo.services.PacienteService;

@RestController
public class PacienteControllerImpl  implements PacienteController {

	@Autowired
	PacienteService pacienteService;

	@GetMapping(value = "/pacientes", produces = "application/json")
	@Override
	public List<Paciente> getPacientes() {
		return pacienteService.findAllPacientes();
	}

	@Override
	@GetMapping(value = "/pacientes/{id}", produces = "application/json")
	public Optional<Paciente> getPacienteById(@PathVariable Long id) {
		return pacienteService.findPacienteById(id);
	}
	
	@GetMapping(value = "/pacientes/apPaterno/{apPaterno}", produces = "application/json")
	public List<Paciente> getPacientesByApPaterno(@PathVariable String apPaterno) {
		return pacienteService.findPacienteByApPaterno(apPaterno);
	}
	
	@GetMapping(value = "/pacientes/nombre/{nombre}", produces = "application/json")
	@Override
	public List<Paciente> getPacientesByNombre(@PathVariable String nombre) {
		return pacienteService.findPacienteByNombre(nombre);
	}
	
	@GetMapping(value = "/pacientes/tutor/{idTutor}", produces = "application/json")
	@Override
	public List<Paciente> getPacientesByIdTutor(@PathVariable Long idTutor) {
		return pacienteService.findPacienteByIdTutor(idTutor);
	}
	
	@GetMapping(value = "/pacientes/medico/{idGeriatra}", produces = "application/json")
	@Override
	public List<Paciente> getPacientesByIdGeriatra(@PathVariable Long idGeriatra) {
		return pacienteService.findPacienteByIdGeriatra(idGeriatra);
	}
	
	@Override
	@PostMapping(value = "/pacientes/add", produces = "application/json")
	public Paciente addPaciente(@RequestBody Paciente paciente) {
		return pacienteService.savePaciente(paciente);
	}
	
	@Override
	@GetMapping(value = "/pacientes/delete/{id}", produces = "application/json")
	public String deletePaciente(@PathVariable Long id) {
		return pacienteService.deletePaciente(id);
	}
	
	@Override
	@PatchMapping(value = "/pacientes/update", produces = "application/json")
	public String updatePaciente(@RequestBody Paciente pacienteNew) {
		return pacienteService.updatePaciente(pacienteNew);
	}

}
