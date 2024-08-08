package com.example.demo.controllers.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controllers.UsuarioController;
import com.example.demo.entities.Geriatra;
import com.example.demo.entities.Usuario;
import com.example.demo.services.UsuarioService;

@RestController
public class UsuarioControllerImpl  implements UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping(value = "/usuarios", produces = "application/json")
	@Override
	public List<Usuario> getUsuarios() {
		return usuarioService.findAllUsuarios();
	}

	@Override
	@GetMapping(value = "/usuarios/{id}", produces = "application/json")
	public Optional<Usuario> getUsuarioById(@PathVariable Long id) {
		return usuarioService.findUsuarioById(id);
	}
	
	@Override
	@GetMapping(value = "/usuarios/user/{usuario}", produces = "application/json")
	public Optional<Usuario> getUsuarioByUsuario(@PathVariable String usuario) {
		return usuarioService.findUsuarioByUsuario(usuario);
	}
	
	@Override
	@GetMapping(value = "/usuarios/userpass", produces = "application/json")
	public Optional<Usuario> getUsuarioByUsuarioAndPass(@RequestParam String usuario,@RequestParam String pass) {
		System.out.println("usuario:" + usuario + ", pass:" + pass + ";");
		return usuarioService.findUsuarioByUsuarioAndPass(usuario,pass);
	}
	
	@Override
	@PostMapping(value = "/usuarios/add", produces = "application/json")
	public Usuario addUsuario(@RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}
	
	@Override
	@GetMapping(value = "/usuarios/delete/{id}", produces = "application/json")
	public String deleteUsuario(@PathVariable Long id) {
		return usuarioService.deleteUsuario(id);
	}
	
	@Override
	@PatchMapping(value = "/usuarios/update", produces = "application/json")
	public String updateUsuario(@RequestBody Usuario usuarioNew) {
		return usuarioService.updateUsuario(usuarioNew);
	}
}
