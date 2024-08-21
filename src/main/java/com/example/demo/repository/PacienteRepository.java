package com.example.demo.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Paciente;


public interface PacienteRepository  extends JpaRepository<Paciente, Long> {
	Void save(Optional<Paciente> pacienteToUpdate);
	
	List<Paciente> findByApPaterno(String paciente);
	
	List<Paciente> findByNombre(String paciente);
	
	List<Paciente> findByIdTutor(Long paciente);
	
	List<Paciente> findByIdGeriatra(Long paciente);
}
