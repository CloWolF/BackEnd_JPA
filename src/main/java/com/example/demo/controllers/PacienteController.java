package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Paciente;

public interface PacienteController {
	public List<Paciente> getPacientes();
	public Optional<Paciente> getPacienteById(Long id);
	public List<Paciente> getPacientesByApPaterno(String apPaterno);
	public List<Paciente> getPacientesByNombre(String nombre);
	public List<Paciente> getPacientesByIdTutor(Long idTutor);
	public List<Paciente> getPacientesByIdGeriatra(Long idGeriatra);
	public Paciente addPaciente(Paciente paciente);
	public String deletePaciente(Long id);
	public String updatePaciente(Paciente pacienteNew);
}
