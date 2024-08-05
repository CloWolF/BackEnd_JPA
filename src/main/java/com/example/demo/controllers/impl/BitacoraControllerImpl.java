package com.example.demo.controllers.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controllers.BitacoraController;
import com.example.demo.entities.Bitacora;
import com.example.demo.services.BitacoraService;

@RestController
public class BitacoraControllerImpl implements BitacoraController {

	@Autowired
	BitacoraService bitacoraService;


	// http://localhost:8888/customers (GET)
	@GetMapping(value = "/bitacoras", produces = "application/json")
	@Override
	public List<Bitacora> getBitacoras() {
		return bitacoraService.findAllBitacoras();
	}


	// http://localhost:8888/customers/1 (GET)
	@Override
	//@RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = "application/json")
	@GetMapping(value = "/bitacoras/{id}", produces = "application/json")
	public Optional<Bitacora> getBitacoraById(@PathVariable Long id) {
		return bitacoraService.findBitacoraById(id);
	}
	
	// http://localhost:8888/customers (GET)
	@GetMapping(value = "/bitacoras/paciente/{id}", produces = "application/json")
	@Override
	public List<Bitacora> getBitacoraByIdPaciente(@PathVariable Long id) {
		return bitacoraService.findBitacoraByIdPaciente(id);
	}
	
	
	// http://localhost:8888/customers (GET)
	@GetMapping(value = "/bitacoras/geriatra/{id}", produces = "application/json")
	@Override
	public List<Bitacora> getBitacoraByIdGeriatra(@PathVariable Long id) {
		return bitacoraService.findBitacoraByIdGeriatra(id);
	}
	
	// http://localhost:8888/customers (GET)
	@GetMapping(value = "/bitacoras/enfermero/{id}", produces = "application/json")
	@Override
	public List<Bitacora> getBitacoraByIdEnfermero(@PathVariable Long id) {
		return bitacoraService.findBitacoraByIdEnfermero(id);
	}
}
