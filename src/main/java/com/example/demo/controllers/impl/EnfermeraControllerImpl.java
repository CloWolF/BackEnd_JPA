package com.example.demo.controllers.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controllers.EnfermeraController;
import com.example.demo.entities.Enfermera;
import com.example.demo.services.EnfermeraService;

@RestController
public class EnfermeraControllerImpl implements EnfermeraController {

	@Autowired
	EnfermeraService enfermeraService;

	@GetMapping(value = "/enfermeras", produces = "application/json")
	@Override
	public List<Enfermera> getEnfermeras() {
		return enfermeraService.findAllEnfermeras();
	}

	@Override
	@GetMapping(value = "/enfermeras/{id}", produces = "application/json")
	public Optional<Enfermera> getEnfermeraById(@PathVariable Long id) {
		return enfermeraService.findEnfermeraById(id);
	}
	
	@GetMapping(value = "/enfermeras/apPaterno/{apPaterno}", produces = "application/json")
	public List<Enfermera> getEnfermerasByApPaterno(@PathVariable String apPaterno) {
		return enfermeraService.findEnfermeraByApPaterno(apPaterno);
	}
	
	@Override
	@PostMapping(value = "/enfermeras/add", produces = "application/json")
	public Enfermera addEnfermera(@RequestBody Enfermera enfermera) {
		return enfermeraService.saveEnfermera(enfermera);
	}
	
	@Override
	@GetMapping(value = "/enfermeras/delete/{id}", produces = "application/json")
	public String deleteEnfermera(@PathVariable Long id) {
		return enfermeraService.deleteEnfermera(id);
	}
	
	@Override
	@PatchMapping(value = "/enfermeras/update", produces = "application/json")
	public String updateEnfermera(@RequestBody Enfermera enfermeraNew) {
		return enfermeraService.updateEnfermera(enfermeraNew);
	}
}
