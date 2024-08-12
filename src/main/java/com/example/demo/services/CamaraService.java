package com.example.demo.services;
import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Camara;
public interface CamaraService {
	public List<Camara> findAllCamaras();
	public Optional<Camara> findCamaraById(Long id);
}