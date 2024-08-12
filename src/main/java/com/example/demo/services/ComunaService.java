package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import com.example.demo.entities.Comuna;

public interface ComunaService {
	public List<Comuna> findAllComunas();
	public Optional<Comuna> findComunaById(Long id);
}
