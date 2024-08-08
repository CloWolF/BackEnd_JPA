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

import com.example.demo.controllers.BitacoraController;
import com.example.demo.entities.Bitacora;
import com.example.demo.services.BitacoraService;

@RestController
public class BitacoraControllerImpl implements BitacoraController {

	@Autowired
	BitacoraService bitacoraService;


	@GetMapping(value = "/bitacoras", produces = "application/json")
	@Override
	public List<Bitacora> getBitacoras() {
		return bitacoraService.findAllBitacoras();
	}


	@Override
	@GetMapping(value = "/bitacoras/{id}", produces = "application/json")
	public Optional<Bitacora> getBitacoraById(@PathVariable Long id) {
		return bitacoraService.findBitacoraById(id);
	}


	@Override
	@GetMapping(value = "/bitacoras/paciente/{id}", produces = "application/json")
	public List<Bitacora> getBitacoraByIdPaciente(@PathVariable Long id) {
		return bitacoraService.findBitacoraByIdPaciente(id);
	}
	

	@Override
	@GetMapping(value = "/bitacoras/geriatra/{id}", produces = "application/json")
	public List<Bitacora> getBitacoraByIdGeriatra(@PathVariable Long id) {
		return bitacoraService.findBitacoraByIdGeriatra(id);
	}
	
	@Override
	@GetMapping(value = "/bitacoras/enfermero/{id}", produces = "application/json")
	public List<Bitacora> getBitacoraByIdEnfermero(@PathVariable Long id) {
		return bitacoraService.findBitacoraByIdEnfermero(id);
	}
	
	@Override
	@PostMapping(value = "/bitacoras/add", produces = "application/json")
	public Bitacora addBitacorar(@RequestBody Bitacora bitacora) {
		return bitacoraService.saveBitacora(bitacora);
	}
	
	@Override
	@GetMapping(value = "/bitacoras/delete/{id}", produces = "application/json")
	public String deleteBitacora(@PathVariable Long id) {
		return bitacoraService.deleteBitacora(id);
	}
	
	@Override
	@PatchMapping(value = "/bitacoras/update", produces = "application/json")
	public String updateBitacora(@RequestBody Bitacora bitacoraNew) {
		return bitacoraService.updateBitacora(bitacoraNew);
	}
}
