package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Paciente;

public interface PacienteService {
	public List<Paciente> findAllPacientes();
	public Optional<Paciente> findPacienteById(Long id);
	public List<Paciente> findPacienteByApPaterno(String apPaterno);
	public List<Paciente> findPacienteByNombre(String nombre);
	public List<Paciente> findPacienteByIdTutor(Long idTutor);
	public List<Paciente> findPacienteByIdGeriatra(Long idGeriatra);
	public Paciente savePaciente(Paciente pacienteNew);
	public String deletePaciente(Long id);
	public String updatePaciente(Paciente pacienteNew);

}
