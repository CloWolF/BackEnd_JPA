package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Geriatra;
import com.example.demo.entities.Paciente;

public interface GeriatraController {
	public List<Geriatra> getGeriatras();
	public Optional<Geriatra> getGeriatraById(Long id);
	public Geriatra addGeriatra(Geriatra geriatra);
	public String deleteGeriatra(Long id);
	public String updateGeriatra(Geriatra geriatraNew);
}
