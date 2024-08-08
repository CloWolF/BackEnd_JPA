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

import com.example.demo.controllers.GeriatraController;
import com.example.demo.entities.Geriatra;
import com.example.demo.entities.Paciente;
import com.example.demo.services.GeriatraService;

@RestController
public class GeriatraControllerImpl implements GeriatraController {

	@Autowired
	GeriatraService geriatraService;


	// http://localhost:8888/customers (GET)
	@GetMapping(value = "/geriatras", produces = "application/json")
	@Override
	public List<Geriatra> getGeriatras() {
		return geriatraService.findAllGeriatras();
	}


	// http://localhost:8888/customers/1 (GET)
	@Override
	//@RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = "application/json")
	@GetMapping(value = "/geriatras/{id}", produces = "application/json")
	public Optional<Geriatra> getGeriatraById(@PathVariable Long id) {
		return geriatraService.findGeriatraById(id);
	}
	
	
	@Override
	@PostMapping(value = "/geriatras/add", produces = "application/json")
	public Geriatra addGeriatra(@RequestBody Geriatra geriatra) {
		return geriatraService.saveGeriatra(geriatra);
	}
	
	@Override
	@GetMapping(value = "/geriatras/delete/{id}", produces = "application/json")
	public String deleteGeriatra(@PathVariable Long id) {
		return geriatraService.deleteGeriatra(id);
	}
	
	@Override
	@PatchMapping(value = "/geriatras/update", produces = "application/json")
	public String updateGeriatra(@RequestBody Geriatra geriatraNew) {
		return geriatraService.updateGeriatra(geriatraNew);
	}
}
