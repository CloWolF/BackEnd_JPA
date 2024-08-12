package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Camara;

public interface CamaraController {
	public List<Camara> getCamaras();
	public Optional<Camara> getCamaraById(Long id);
}
