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

import com.example.demo.controllers.TutorController;
import com.example.demo.entities.Tutor;
import com.example.demo.services.TutorService;

@RestController
public class TutorControllerImpl   implements TutorController {

	@Autowired
	TutorService tutorService;

	@GetMapping(value = "/tutores", produces = "application/json")
	@Override
	public List<Tutor> getTutores() {
		return tutorService.findAllTutores();
	}

	@Override
	@GetMapping(value = "/tutores/{id}", produces = "application/json")
	public Optional<Tutor> getTutorById(@PathVariable Long id) {
		return tutorService.findTutorById(id);
	}
	
	@Override
	@PostMapping(value = "/tutores/add", produces = "application/json")
	public Tutor addTutor(@RequestBody Tutor tutor) {
		return tutorService.saveTutor(tutor);
	}
	
	@Override
	@GetMapping(value = "/tutores/delete/{id}", produces = "application/json")
	public String deleteTutor(@PathVariable Long id) {
		return tutorService.deleteTutor(id);
	}
	
	@Override
	@PatchMapping(value = "/tutores/update", produces = "application/json")
	public String updateTutor(@RequestBody Tutor tutorNew) {
		return tutorService.updateTutor(tutorNew);
	}

}
