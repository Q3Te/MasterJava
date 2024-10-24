package com.masterjava.modelos;

/**
* Clase Curso
* @author
* @version 4.3.3, 14 oct 2024
*/
public class Curso {
	private String nombre;
	private int nivel;
	 
	public Curso() {
		super();
	}
	 
	public Curso(String nombre, int nivel) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
}