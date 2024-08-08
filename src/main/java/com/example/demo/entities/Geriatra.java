package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GERIATRA")

public class Geriatra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_geriatra")
	Long id;

	@Column(name="rut_geriatra")
	Long rutGeriatra ;
	@Column(name="nombre")
	String nombre ;
	@Column(name="ap_paterno")
	String apPaterno;
	@Column(name="ap_materno")
	String apMaterno;
	@Column(name="especialidad")
	String especialidad;
	@Column(name="fecha_nacimiento")
	String fechaNacimiento;
	@Column(name="telefono")
	String telefono;
	@Column(name="sexo")
	String sexo;
	@Column(name="direccion")
	String direccion;
	@Column(name="id_comuna")
	Integer idComuna;
	@Column(name="id_estado")
	Integer idEstado;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRutGeriatra() {
		return rutGeriatra;
	}
	public void setRutGeriatra(Long rutGeriatra) {
		this.rutGeriatra = rutGeriatra;
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
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getIdComuna() {
		return idComuna;
	}
	public void setIdComuna(Integer idComuna) {
		this.idComuna = idComuna;
	}
	public Integer getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
