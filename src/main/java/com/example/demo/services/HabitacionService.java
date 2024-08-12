package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Habitacion;

public interface HabitacionService {
	public List<Habitacion> findAllHabitaciones();
	public Optional<Habitacion> findHabitacionById(Long id);
}
