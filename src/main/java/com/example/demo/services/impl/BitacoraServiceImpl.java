package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Bitacora;
import com.example.demo.entities.Tutor;
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
	

	@Override
	public Bitacora saveBitacora(Bitacora bitacoraNew) {
		if (bitacoraNew != null) {
			return bitacoraRepository.save(bitacoraNew);
		}
		return new Bitacora();
	}
	
	@Override
	public String deleteBitacora(Long id) {
		if (bitacoraRepository.findById(id).isPresent()) {
			bitacoraRepository.deleteById(id);
			return "Bitacora eliminado correctamente.";
		}
		return "Error! El Bitacora no existe";
	}
	
	@Override
	public String updateBitacora(Bitacora bitacoraUpdated) {
		Long num = bitacoraUpdated.getId();
		if (bitacoraRepository.findById(num).isPresent()) {
			Bitacora bitacoraToUpdate = new Bitacora();
			bitacoraToUpdate.setId(bitacoraUpdated.getId());
			bitacoraToUpdate.setObservacion(bitacoraUpdated.getObservacion());
			bitacoraToUpdate.setFecha(bitacoraUpdated.getFecha());
			bitacoraToUpdate.setIdPaciente(bitacoraUpdated.getIdPaciente());
			bitacoraToUpdate.setIdEnfermero(bitacoraUpdated.getIdEnfermero());
			bitacoraToUpdate.setIdGeriatra(bitacoraUpdated.getIdGeriatra());

			bitacoraRepository.save(bitacoraToUpdate);
			return "Tutor modificado";
		}
		return "Error al modificar el Tutor";
	}
}
