package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Geriatra;

public interface GeriatraController {
	public List<Geriatra> getGeriatras();
	public Optional<Geriatra> getGeriatraById(Long id);
	//public Paciente addPaciente(Paciente paciente);
}
