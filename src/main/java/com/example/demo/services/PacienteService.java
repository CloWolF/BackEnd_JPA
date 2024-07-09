package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Paciente;

public interface PacienteService {
	public List<Paciente> findAllPacientes();
	public Optional<Paciente> findPacienteById(Long id);
	//public Customer saveCustomer(Customer customerNew);
	//public String deleteCustomer(Long id);
	//public String updateCustomer(Customer customerNew);

}
