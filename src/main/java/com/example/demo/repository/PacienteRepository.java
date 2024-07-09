package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Paciente;


public interface PacienteRepository  extends JpaRepository<Paciente, Long> {
	Void save(Optional<Paciente> pacienteToUpdate);

}
