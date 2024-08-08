package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Paciente;

public interface PacienteService {
	public List<Paciente> findAllPacientes();
	public Optional<Paciente> findPacienteById(Long id);
	//public List<Paciente> findPacienteByApPaterno(String apPaterno);
	//public List<Paciente> findPacienteLikeApPaterno(String apPaterno);
	public Paciente savePaciente(Paciente pacienteNew);
	public String deletePaciente(Long id);
	public String updatePaciente(Paciente pacienteNew);

}
