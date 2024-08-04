package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIOS")

public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_usuario")
	Long id;


	@Column(name="rut_usuario")
	Long rutUsuario ;
	@Column(name="nombre")
	String nombre ;
	@Column(name="ap_paterno")
	String apPaterno;
	@Column(name="ap_materno")
	String apMaterno;
	@Column(name="usuario")
	String usuario;
	@Column(name="mail")
	String mail;
	@Column(name="pass")
	String pass;
	@Column(name="fecha_ingreso")
	String fechaIngreso;
	@Column(name="ultimo_ingreso")
	String ultimoIngreso;
	@Column(name="id_estado")
	Integer idEstado;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRutUsuario() {
		return rutUsuario;
	}
	public void setRutUsuario(Long rutUsuario) {
		this.rutUsuario = rutUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApPaterno() {
		return apPaterno;
	}
	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}
	public String getApMaterno() {
		return apMaterno;
	}
	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getUltimoIngreso() {
		return ultimoIngreso;
	}
	public void setUltimoIngreso(String ultimoIngreso) {
		this.ultimoIngreso = ultimoIngreso;
	}
	public Integer getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}
}
