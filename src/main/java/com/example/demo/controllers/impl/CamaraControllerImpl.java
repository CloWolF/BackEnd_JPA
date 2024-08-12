package com.example.demo.controllers.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controllers.CamaraController;
import com.example.demo.entities.Camara;
import com.example.demo.services.CamaraService;

@RestController
public class CamaraControllerImpl   implements CamaraController {

	@Autowired
	CamaraService camaraService;

	@GetMapping(value = "/camaras", produces = "application/json")
	@Override
	public List<Camara> getCamaras() {
		return camaraService.findAllCamaras();
	}

	@Override
	@GetMapping(value = "/camaras/{id}", produces = "application/json")
	public Optional<Camara> getCamaraById(@PathVariable Long id) {
		return camaraService.findCamaraById(id);
	}

}
