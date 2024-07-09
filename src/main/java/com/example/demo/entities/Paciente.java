package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PACIENTE")

public class Paciente 	{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="ID")
Long id;
@Column(name="rutPaciente")
Long rutPaciente ;
@Column(name="nombre")
String nombre ;
@Column(name="apPaterno")
String apPaterno;
@Column(name="apMaterno")
String apMaterno;
@Column(name="fechaNacimiento")
String fechaNacimiento;
@Column(name="sexo")
String sexo;
@Column(name="direccion")
String direccion;
@Column(name="idComuna")
Integer idComuna;
@Column(name="telefono")
Integer telefono;
@Column(name="seguroSalud")
Integer seguroSalud;
@Column(name="observación")
Integer observación;
@Column(name="idEstado")
Integer idEstado;
@Column(name="idTutor")
Integer idTutor;
@Column(name="idGeriatra")
Integer idGeriatra;
//GETTERS & SETTERS
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Long getRutPaciente() {
	return rutPaciente;
}
public void setRutPaciente(Long rutPaciente) {
	this.rutPaciente = rutPaciente;
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
public String getFechaNacimiento() {
	return fechaNacimiento;
}
public void setFechaNacimiento(String fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
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
public Integer getTelefono() {
	return telefono;
}
public void setTelefono(Integer telefono) {
	this.telefono = telefono;
}
public Integer getSeguroSalud() {
	return seguroSalud;
}
public void setSeguroSalud(Integer seguroSalud) {
	this.seguroSalud = seguroSalud;
}
public Integer getObservación() {
	return observación;
}
public void setObservación(Integer observación) {
	this.observación = observación;
}
public Integer getIdEstado() {
	return idEstado;
}
public void setIdEstado(Integer idEstado) {
	this.idEstado = idEstado;
}
public Integer getIdTutor() {
	return idTutor;
}
public void setIdTutor(Integer idTutor) {
	this.idTutor = idTutor;
}
public Integer getIdGeriatra() {
	return idGeriatra;
}
public void setIdGeriatra(Integer idGeriatra) {
	this.idGeriatra = idGeriatra;
}

}
