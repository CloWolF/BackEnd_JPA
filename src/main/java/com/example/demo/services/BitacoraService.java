package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Bitacora;
import com.example.demo.entities.Customer;

public interface BitacoraService {
	public List<Bitacora> findAllBitacoras();
	public Optional<Bitacora> findBitacoraById(Long id);
	public List<Bitacora> findBitacoraByIdPaciente(Long id);
	public List<Bitacora> findBitacoraByIdEnfermero(Long id);
	public List<Bitacora> findBitacoraByIdGeriatra(Long id);
}
