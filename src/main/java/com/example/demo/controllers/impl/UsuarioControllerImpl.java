package com.example.demo.controllers.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controllers.UsuarioController;
import com.example.demo.entities.Usuario;
import com.example.demo.services.UsuarioService;

@RestController
public class UsuarioControllerImpl  implements UsuarioController {

	@Autowired
	UsuarioService usuarioService;


	// http://localhost:8888/customers (GET)
	@GetMapping(value = "/usuarios", produces = "application/json")
	@Override
	public List<Usuario> getUsuarios() {
		return usuarioService.findAllUsuarios();
	}


	// http://localhost:8888/customers/1 (GET)
	@Override
	//@RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = "application/json")
	@GetMapping(value = "/usuarios/{id}", produces = "application/json")
	public Optional<Usuario> getUsuarioById(@PathVariable Long id) {
		return usuarioService.findUsuarioById(id);
	}
	
	@Override
	//@RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = "application/json")
	@GetMapping(value = "/usuarios/user/{usuario}", produces = "application/json")
	public Optional<Usuario> getUsuarioByUsuario(@PathVariable String usuario) {
		return usuarioService.findUsuarioByUsuario(usuario);
	}
	
	@Override
	//@RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = "application/json")
	//@GetMapping(value = "/usuarios/userpass/{usuario}{pass}", produces = "application/json")
	//public Optional<Usuario> getUsuarioByUsuarioAndPass(@PathVariable String usuario,@PathVariable String pass) {
	@GetMapping(value = "/usuarios/userpass", produces = "application/json")
	public Optional<Usuario> getUsuarioByUsuarioAndPass(@RequestParam String usuario,@RequestParam String pass) {
		System.out.println("usuario:" + usuario + ", pass:" + pass + ";");
		return usuarioService.findUsuarioByUsuarioAndPass(usuario,pass);
	}
}
