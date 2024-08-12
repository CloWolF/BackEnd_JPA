package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Camara;
import com.example.demo.repository.CamaraRepository;
import com.example.demo.services.CamaraService;

@Service
public class CamaraServiceImpl  implements CamaraService {
	@Autowired
	CamaraRepository camaraRepository;


	@Override
	public List<Camara> findAllCamaras() {
		return camaraRepository.findAll();
	}


	@Override
	public Optional<Camara> findCamaraById(Long id) {
		Optional<Camara> camara =camaraRepository.findById(id);
		return camara;
	}


}
