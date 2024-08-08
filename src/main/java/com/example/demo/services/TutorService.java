package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Tutor;

public interface TutorService {
	public List<Tutor> findAllTutores();
	public Optional<Tutor> findTutorById(Long id);
	public Tutor saveTutor(Tutor tutorNew);
	public String deleteTutor(Long id);
	public String updateTutor(Tutor tutorNew);
}
