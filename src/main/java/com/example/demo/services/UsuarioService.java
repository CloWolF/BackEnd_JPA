package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Geriatra;
import com.example.demo.entities.Usuario;

public interface UsuarioService {
	public List<Usuario> findAllUsuarios();
	public Optional<Usuario> findUsuarioById(Long id);
	public Optional<Usuario> findUsuarioByUsuario(String usuario);
	public Optional<Usuario> findUsuarioByUsuarioAndPass(String usuario, String pass);
	public Usuario saveUsuario(Usuario usuarioNew);
	public String deleteUsuario(Long id);
	public String updateUsuario(Usuario usuarioNew);
}
