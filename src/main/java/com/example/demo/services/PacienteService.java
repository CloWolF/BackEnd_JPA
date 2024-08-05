package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Paciente;

public interface PacienteService {
	public List<Paciente> findAllPacientes();
	public Optional<Paciente> findPacienteById(Long id);
	//public List<Paciente> findPacienteByApPaterno(String apPaterno);
	//public List<Paciente> findPacienteLikeApPaterno(String apPaterno);
	//public Customer saveCustomer(Customer customerNew);
	//public String deleteCustomer(Long id);
	//public String updateCustomer(Customer customerNew);

}
