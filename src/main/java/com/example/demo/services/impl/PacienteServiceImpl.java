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
	
	@Override
	public List<Paciente> findPacienteByApPaterno(String apPaterno) {
		return pacienteRepository.findByApPaterno(apPaterno);
		 
	}
	
	@Override
	public List<Paciente> findPacienteByNombre(String nombre) {
		return pacienteRepository.findByNombre(nombre);
		 
	}
	
	@Override
	public Paciente savePaciente(Paciente pacienteNew) {
		if (pacienteNew != null) {
			return pacienteRepository.save(pacienteNew);
		}
		return new Paciente();
	}
	
	@Override
	public String deletePaciente(Long id) {
		if (pacienteRepository.findById(id).isPresent()) {
			pacienteRepository.deleteById(id);
			return "Paciente eliminado correctamente.";
		}
		return "Error! El Paciente no existe";
	}
	
	@Override
	public String updatePaciente(Paciente pacienteUpdated) {
		Long num = pacienteUpdated.getId();
		if (pacienteRepository.findById(num).isPresent()) {
			Paciente pacienteToUpdate = new Paciente();
			pacienteToUpdate.setId(pacienteUpdated.getId());
			pacienteToUpdate.setRutPaciente(pacienteUpdated.getRutPaciente());
			pacienteToUpdate.setNombre(pacienteUpdated.getNombre());
			pacienteToUpdate.setApPaterno(pacienteUpdated.getApPaterno());
			pacienteToUpdate.setApMaterno(pacienteUpdated.getApMaterno());
			pacienteToUpdate.setFechaNacimiento(pacienteUpdated.getFechaNacimiento());
			pacienteToUpdate.setSexo(pacienteUpdated.getSexo());
			pacienteToUpdate.setDireccion(pacienteUpdated.getDireccion());
			pacienteToUpdate.setIdComuna(pacienteUpdated.getIdComuna());
			pacienteToUpdate.setTelefono(pacienteUpdated.getTelefono());
			pacienteToUpdate.setSeguroSalud(pacienteUpdated.getSeguroSalud());
			pacienteToUpdate.setObservación(pacienteUpdated.getObservacion());
			pacienteToUpdate.setIdEstado(pacienteUpdated.getIdEstado());
			pacienteToUpdate.setIdTutor(pacienteUpdated.getIdTutor());
			pacienteToUpdate.setIdTutor(pacienteUpdated.getIdGeriatra());
			pacienteRepository.save(pacienteToUpdate);
			return "Paciente modificado";
		}
		return "Error al modificar el Paciente";
	}
}
