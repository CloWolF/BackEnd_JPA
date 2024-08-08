package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Bitacora;

public interface BitacoraController {
	public List<Bitacora> getBitacoras();
	public Optional<Bitacora> getBitacoraById(Long id);
	public List<Bitacora> getBitacoraByIdPaciente(Long id);
	public List<Bitacora> getBitacoraByIdEnfermero(Long id);
	public List<Bitacora> getBitacoraByIdGeriatra(Long id);
	public Bitacora addBitacorar(Bitacora bitacora);
	public String deleteBitacora(Long id);
	public String updateBitacora(Bitacora bitacoraNew);
}
