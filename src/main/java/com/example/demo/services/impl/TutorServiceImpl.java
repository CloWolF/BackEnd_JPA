package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Tutor;
import com.example.demo.repository.TutorRepository;
import com.example.demo.services.TutorService;

@Service
public class TutorServiceImpl  implements TutorService {
	@Autowired
	TutorRepository tutorRepository;


	@Override
	public List<Tutor> findAllTutores() {
		return tutorRepository.findAll();
	}


	@Override
	public Optional<Tutor> findTutorById(Long id) {
		Optional<Tutor> tutor =tutorRepository.findById(id);
		return tutor;
	}
	

}
