package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Comuna;

public interface ComunaController {
	public List<Comuna> getComunas();
	public Optional<Comuna> getComunaById(Long id);
}
