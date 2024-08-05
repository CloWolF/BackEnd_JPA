package com.example.demo.controllers.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controllers.TutorController;
import com.example.demo.entities.Tutor;
import com.example.demo.services.TutorService;

@RestController
public class TutorControllerImpl   implements TutorController {

	@Autowired
	TutorService tutorService;


	// http://localhost:8888/customers (GET)
	@GetMapping(value = "/tutores", produces = "application/json")
	@Override
	public List<Tutor> getTutores() {
		return tutorService.findAllTutores();
	}


	// http://localhost:8888/customers/1 (GET)
	@Override
	//@RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = "application/json")
	@GetMapping(value = "/tutores/{id}", produces = "application/json")
	public Optional<Tutor> getTutorById(@PathVariable Long id) {
		return tutorService.findTutorById(id);
	}

}
