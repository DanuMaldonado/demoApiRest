package com.apirest.demo.ApiRest.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class Persona {

	private Long id;
	private String nombre;
	private String apellido;
	
	public Persona(String nombre, String apellido, Long id) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + "]";
	}
	
	


}
