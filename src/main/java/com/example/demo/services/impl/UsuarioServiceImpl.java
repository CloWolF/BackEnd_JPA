package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Usuario;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;


	@Override
	public List<Usuario> findAllUsuarios() {
		return usuarioRepository.findAll();
	}


	@Override
	public Optional<Usuario> findUsuarioById(Long id) {
		Optional<Usuario> usuario =usuarioRepository.findById(id);
		return usuario;
	}
	
	@Override
	public Optional<Usuario> findUsuarioByUsuario(String usuario) {
		Optional<Usuario> usuarioBuscar =usuarioRepository.findByUsuario(usuario);
		return usuarioBuscar;
	}
	
	@Override
	public Optional<Usuario> findUsuarioByUsuarioAndPass(String usuario, String pass) {
		Optional<Usuario> usuarioBuscar =usuarioRepository.findByUsuarioAndPass(usuario, pass);
		return usuarioBuscar;
	}
}
