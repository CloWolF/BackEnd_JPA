package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Tutor;

public interface TutorController {
	public List<Tutor> getTutores();
	public Optional<Tutor> getTutorById(Long id);

}
