package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Enfermera;
public interface EnfermeraService {
	public List<Enfermera> findAllEnfermeras();
	public Optional<Enfermera> findEnfermeraById(Long id);
	public List<Enfermera> findEnfermeraByApPaterno(String apPaterno);
	public Enfermera saveEnfermera(Enfermera enfermeraNew);
	public String deleteEnfermera(Long id);
	public String updateEnfermera(Enfermera enfermeraNew);

}
