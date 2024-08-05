package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Bitacora;
import com.example.demo.repository.BitacoraRepository;
import com.example.demo.services.BitacoraService;

@Service
public class BitacoraServiceImpl implements BitacoraService {
	@Autowired
	BitacoraRepository bitacoraRepository;


	@Override
	public List<Bitacora> findAllBitacoras() {
		return bitacoraRepository.findAll();
	}


	@Override
	public Optional<Bitacora> findBitacoraById(Long id) {
		Optional<Bitacora> bitacora =bitacoraRepository.findById(id);
		return bitacora;
	}
	
	@Override
	public List<Bitacora> findBitacoraByIdPaciente(Long id) {
		//Optional<Bitacora> bitacoraBuscar =bitacoraRepository.findByIdPaciente(id);
		return bitacoraRepository.findByIdPaciente(id);
	}
	
	@Override
	public List<Bitacora> findBitacoraByIdGeriatra(Long id) {
		//Optional<Bitacora> bitacoraBuscar =bitacoraRepository.findByIdPaciente(id);
		return bitacoraRepository.findByIdGeriatra(id);
	}
	
	@Override
	public List<Bitacora> findBitacoraByIdEnfermero(Long id) {
		//Optional<Bitacora> bitacoraBuscar =bitacoraRepository.findByIdPaciente(id);
		return bitacoraRepository.findByIdEnfermero(id);
	}
}
