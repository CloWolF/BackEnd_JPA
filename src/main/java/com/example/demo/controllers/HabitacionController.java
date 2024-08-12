package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Habitacion;
public interface HabitacionController {
	public List<Habitacion> getHabitaciones();
	public Optional<Habitacion> getHabitacionById(Long id);
}
