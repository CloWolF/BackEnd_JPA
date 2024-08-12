package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Habitacion")
public class Habitacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_habitacion")
	Long id;
	@Column(name="codigo_habitacion")
	String codigoHabitacion ;
	@Column(name="ubicacion")
	String ubicacion ;
	@Column(name="capacidad_camas")
	Integer capacidadCamas;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigoHabitacion() {
		return codigoHabitacion;
	}
	public void setCodigoHabitacion(String codigoHabitacion) {
		this.codigoHabitacion = codigoHabitacion;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Integer getCapacidadCamas() {
		return capacidadCamas;
	}
	public void setCapacidadCamas(Integer capacidadCamas) {
		this.capacidadCamas = capacidadCamas;
	}
}
