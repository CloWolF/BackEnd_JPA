package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Habitacion;
import com.example.demo.repository.HabitacionRepository;
import com.example.demo.services.HabitacionService;

@Service
public class HabitacionServiceImpl implements HabitacionService {
	@Autowired
	HabitacionRepository habitacionRepository;


	@Override
	public List<Habitacion> findAllHabitaciones() {
		return habitacionRepository.findAll();
	}


	@Override
	public Optional<Habitacion> findHabitacionById(Long id) {
		Optional<Habitacion> habitacion =habitacionRepository.findById(id);
		return habitacion;
	}
}
