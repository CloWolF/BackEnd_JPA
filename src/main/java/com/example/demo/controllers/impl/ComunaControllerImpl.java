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

import com.example.demo.controllers.ComunaController;
import com.example.demo.entities.Comuna;
import com.example.demo.services.ComunaService;

@RestController
public class ComunaControllerImpl  implements ComunaController {

	@Autowired
	ComunaService comunaService;

	@GetMapping(value = "/comunas", produces = "application/json")
	@Override
	public List<Comuna> getComunas() {
		return comunaService.findAllComunas();
	}

	@Override
	@GetMapping(value = "/comunas/{id}", produces = "application/json")
	public Optional<Comuna> getComunaById(@PathVariable Long id) {
		return comunaService.findComunaById(id);
	}
}
