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

import com.example.demo.controllers.HabitacionController;
import com.example.demo.entities.Habitacion;
import com.example.demo.services.HabitacionService;

@RestController
public class HabitacionControllerImpl  implements HabitacionController {

	@Autowired
	HabitacionService habitacionService;


	@GetMapping(value = "/habitaciones", produces = "application/json")
	@Override
	public List<Habitacion> getHabitaciones() {
		return habitacionService.findAllHabitaciones();
	}


	@Override
	@GetMapping(value = "/habitaciones/{id}", produces = "application/json")
	public Optional<Habitacion> getHabitacionById(@PathVariable Long id) {
		return habitacionService.findHabitacionById(id);
	}

}
