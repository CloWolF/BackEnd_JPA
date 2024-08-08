package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Geriatra;
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
	
	@Override
	public Usuario saveUsuario(Usuario usuarioNew) {
		if (usuarioNew != null) {
			return usuarioRepository.save(usuarioNew);
		}
		return new Usuario();
	}
	
	@Override
	public String deleteUsuario(Long id) {
		if (usuarioRepository.findById(id).isPresent()) {
			usuarioRepository.deleteById(id);
			return "Usuario eliminado correctamente.";
		}
		return "Error! El Usuario no existe";
	}
	
	@Override
	public String updateUsuario(Usuario usuarioUpdated) {
		Long num = usuarioUpdated.getId();
		if (usuarioRepository.findById(num).isPresent()) {
			Usuario usuarioToUpdate = new Usuario();
			usuarioToUpdate.setId(usuarioUpdated.getId());
			usuarioToUpdate.setRutUsuario(usuarioUpdated.getRutUsuario());
			usuarioToUpdate.setNombre(usuarioUpdated.getNombre());
			usuarioToUpdate.setApPaterno(usuarioUpdated.getApPaterno());
			usuarioToUpdate.setApMaterno(usuarioUpdated.getApMaterno());
			usuarioToUpdate.setMail(usuarioUpdated.getMail());
			usuarioToUpdate.setUsuario(usuarioUpdated.getUsuario());
			usuarioToUpdate.setPass(usuarioUpdated.getPass());
			usuarioToUpdate.setFechaIngreso(usuarioUpdated.getFechaIngreso());
			usuarioToUpdate.setUltimoIngreso(usuarioUpdated.getUltimoIngreso());
			usuarioToUpdate.setIdEstado(usuarioUpdated.getIdEstado());
			usuarioToUpdate.setIdRol(usuarioUpdated.getIdRol());
			usuarioRepository.save(usuarioToUpdate);
			return "Usuario modificado";
		}
		return "Error al modificar el Usuario";
	}
}
