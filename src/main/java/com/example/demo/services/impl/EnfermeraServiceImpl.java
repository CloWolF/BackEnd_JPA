package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Enfermera;
import com.example.demo.repository.EnfermeraRepository;
import com.example.demo.services.EnfermeraService;

@Service
public class EnfermeraServiceImpl  implements EnfermeraService {
	@Autowired
	EnfermeraRepository enfermeraRepository;


	@Override
	public List<Enfermera> findAllEnfermeras() {
		return enfermeraRepository.findAll();
	}


	@Override
	public Optional<Enfermera> findEnfermeraById(Long id) {
		Optional<Enfermera> enfermera =enfermeraRepository.findById(id);
		return enfermera;
	}
	
	@Override
	public List<Enfermera> findEnfermeraByApPaterno(String apPaterno) {
		return enfermeraRepository.findByApPaterno(apPaterno);
		 
	}
	
	@Override
	public Enfermera saveEnfermera(Enfermera enfermeraNew) {
		if (enfermeraNew != null) {
			return enfermeraRepository.save(enfermeraNew);
		}
		return new Enfermera();
	}
	
	@Override
	public String deleteEnfermera(Long id) {
		if (enfermeraRepository.findById(id).isPresent()) {
			enfermeraRepository.deleteById(id);
			return "Enfermera eliminada correctamente.";
		}
		return "Error! Enfermero(a) no existe";
	}
	
	@Override
	public String updateEnfermera(Enfermera enfermeraUpdated) {
		Long num = enfermeraUpdated.getId();
		if (enfermeraRepository.findById(num).isPresent()) {
			Enfermera enfermeraToUpdate = new Enfermera();
			enfermeraToUpdate.setId(enfermeraUpdated.getId());
			enfermeraToUpdate.setRutEnfermera(enfermeraUpdated.getRutEnfermera());
			enfermeraToUpdate.setNombre(enfermeraUpdated.getNombre());
			enfermeraToUpdate.setApPaterno(enfermeraUpdated.getApPaterno());
			enfermeraToUpdate.setApMaterno(enfermeraUpdated.getApMaterno());
			enfermeraToUpdate.setEspecialidad(enfermeraUpdated.getEspecialidad());
			enfermeraToUpdate.setFechaNacimiento(enfermeraUpdated.getFechaNacimiento());
			enfermeraToUpdate.setSexo(enfermeraUpdated.getSexo());
			enfermeraToUpdate.setDireccion(enfermeraUpdated.getDireccion());
			enfermeraToUpdate.setIdComuna(enfermeraUpdated.getIdComuna());
			enfermeraToUpdate.setTelefono(enfermeraUpdated.getTelefono());
			enfermeraToUpdate.setIdEstado(enfermeraUpdated.getIdEstado());
			enfermeraRepository.save(enfermeraToUpdate);
			return "Enfermero(a) modificado";
		}
		return "Error al modificar Enfermero(a)";
	}

}
