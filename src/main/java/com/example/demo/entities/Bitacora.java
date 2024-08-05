package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bitacora")
public class Bitacora {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_bitacora")
	Long id;
	
	@Column(name="observacion")
	String observacion ;
	@Column(name="fecha")
	String fecha ;
	@Column(name="id_paciente")
	Integer idPaciente;
	@Column(name="id_enfermero")
	Integer idEnfermero;
	@Column(name="id_geriatra")
	Integer idGeriatra;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Integer getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	public Integer getIdEnfermero() {
		return idEnfermero;
	}
	public void setIdEnfermero(Integer idEnfermero) {
		this.idEnfermero = idEnfermero;
	}
	public Integer getIdGeriatra() {
		return idGeriatra;
	}
	public void setIdGeriatra(Integer idGeriatra) {
		this.idGeriatra = idGeriatra;
	}
}
