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
}
