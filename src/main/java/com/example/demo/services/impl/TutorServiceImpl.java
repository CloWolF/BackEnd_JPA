package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Tutor;
import com.example.demo.repository.TutorRepository;
import com.example.demo.services.TutorService;

@Service
public class TutorServiceImpl  implements TutorService {
	@Autowired
	TutorRepository tutorRepository;


	@Override
	public List<Tutor> findAllTutores() {
		return tutorRepository.findAll();
	}


	@Override
	public Optional<Tutor> findTutorById(Long id) {
		Optional<Tutor> tutor =tutorRepository.findById(id);
		return tutor;
	}
	
	
	@Override
	public Tutor saveTutor(Tutor tutorNew) {
		if (tutorNew != null) {
			return tutorRepository.save(tutorNew);
		}
		return new Tutor();
	}
	
	@Override
	public String deleteTutor(Long id) {
		if (tutorRepository.findById(id).isPresent()) {
			tutorRepository.deleteById(id);
			return "Tutor eliminado correctamente.";
		}
		return "Error! El Tutor no existe";
	}
	
	@Override
	public String updateTutor(Tutor tutorUpdated) {
		Long num = tutorUpdated.getId();
		if (tutorRepository.findById(num).isPresent()) {
			Tutor tutorToUpdate = new Tutor();
			tutorToUpdate.setId(tutorUpdated.getId());
			tutorToUpdate.setRutTutor(tutorUpdated.getRutTutor());
			tutorToUpdate.setNombre(tutorUpdated.getNombre());
			tutorToUpdate.setApPaterno(tutorUpdated.getApPaterno());
			tutorToUpdate.setApMaterno(tutorUpdated.getApMaterno());
			tutorToUpdate.setFechaNacimiento(tutorUpdated.getFechaNacimiento());
			tutorToUpdate.setSexo(tutorUpdated.getSexo());
			tutorToUpdate.setDireccion(tutorUpdated.getDireccion());
			tutorToUpdate.setIdComuna(tutorUpdated.getIdComuna());
			tutorToUpdate.setTelefono(tutorUpdated.getTelefono());
			tutorToUpdate.setIdEstado(tutorUpdated.getIdEstado());
			tutorRepository.save(tutorToUpdate);
			return "Tutor modificado";
		}
		return "Error al modificar el Tutor";
	}
}
