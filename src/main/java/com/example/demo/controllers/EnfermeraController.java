package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Enfermera;

public interface EnfermeraController {
	public List<Enfermera> getEnfermeras();
	public Optional<Enfermera> getEnfermeraById(Long id);
	public List<Enfermera> getEnfermerasByApPaterno(String apPaterno);
	public Enfermera addEnfermera(Enfermera enfermera);
	public String deleteEnfermera(Long id);
	public String updateEnfermera(Enfermera enfermeraNew);
}
