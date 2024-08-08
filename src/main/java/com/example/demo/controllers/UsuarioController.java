package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Usuario;

public interface UsuarioController  {
	public List<Usuario> getUsuarios();
	public Optional<Usuario> getUsuarioById(Long id);
	public Optional<Usuario> getUsuarioByUsuario(String usuario);
	public Optional<Usuario> getUsuarioByUsuarioAndPass(String usuario, String pass);
	public Usuario addUsuario(Usuario usuario);
	public String deleteUsuario(Long id);
	public String updateUsuario(Usuario usuarioNew);
}
