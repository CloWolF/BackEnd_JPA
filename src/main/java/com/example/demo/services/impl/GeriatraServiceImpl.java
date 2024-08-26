package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Geriatra;
import com.example.demo.repository.GeriatraRepository;
import com.example.demo.services.GeriatraService;

@Service
public class GeriatraServiceImpl implements GeriatraService {
	@Autowired
	GeriatraRepository geriatraRepository;


	@Override
	public List<Geriatra> findAllGeriatras() {
		return geriatraRepository.findAll();
	}


	@Override
	public Optional<Geriatra> findGeriatraById(Long id) {
		Optional<Geriatra> geriatra =geriatraRepository.findById(id);
		return geriatra;
	}
	
	@Override
	public List<Geriatra> findGeriatraByApPaterno(String apPaterno) {
		return geriatraRepository.findByApPaterno(apPaterno);
		 
	}
	
	@Override
	public Geriatra saveGeriatra(Geriatra geriatraNew) {
		if (geriatraNew != null) {
			return geriatraRepository.save(geriatraNew);
		}
		return new Geriatra();
	}
	
	@Override
	public String deleteGeriatra(Long id) {
		if (geriatraRepository.findById(id).isPresent()) {
			geriatraRepository.deleteById(id);
			return "Geriatra eliminado correctamente.";
		}
		return "Error! El Geriatra no existe";
	}
	
	@Override
	public String updateGeriatra(Geriatra geriatraUpdated) {
		Long num = geriatraUpdated.getId();
		if (geriatraRepository.findById(num).isPresent()) {
			Geriatra geriatraToUpdate = new Geriatra();
			geriatraToUpdate.setId(geriatraUpdated.getId());
			geriatraToUpdate.setRutGeriatra(geriatraUpdated.getRutGeriatra());
			geriatraToUpdate.setNombre(geriatraUpdated.getNombre());
			geriatraToUpdate.setApPaterno(geriatraUpdated.getApPaterno());
			geriatraToUpdate.setApMaterno(geriatraUpdated.getApMaterno());
			geriatraToUpdate.setEspecialidad(geriatraUpdated.getEspecialidad());
			geriatraToUpdate.setFechaNacimiento(geriatraUpdated.getFechaNacimiento());
			geriatraToUpdate.setSexo(geriatraUpdated.getSexo());
			geriatraToUpdate.setDireccion(geriatraUpdated.getDireccion());
			geriatraToUpdate.setIdComuna(geriatraUpdated.getIdComuna());
			geriatraToUpdate.setTelefono(geriatraUpdated.getTelefono());
			geriatraToUpdate.setIdEstado(geriatraUpdated.getIdEstado());
			geriatraToUpdate.setIdRol(geriatraUpdated.getIdRol());
			geriatraRepository.save(geriatraToUpdate);
			return "Geriatra modificado";
		}
		return "Error al modificar el Geriatra";
	}
}
