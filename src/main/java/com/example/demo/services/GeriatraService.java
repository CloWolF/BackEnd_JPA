package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Geriatra;

public interface GeriatraService {
	public List<Geriatra> findAllGeriatras();
	public Optional<Geriatra> findGeriatraById(Long id);
	public List<Geriatra> findGeriatraByApPaterno(String apPaterno);
	public Geriatra saveGeriatra(Geriatra geriatraNew);
	public String deleteGeriatra(Long id);
	public String updateGeriatra(Geriatra geriatraNew);

}
