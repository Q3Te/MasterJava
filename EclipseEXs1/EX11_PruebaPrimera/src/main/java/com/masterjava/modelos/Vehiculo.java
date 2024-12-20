package com.masterjava.modelos;

/**
*Clase Vehiculo
*@author Manuel Portal
*@version 4.33.0, 30 sept 2024
*/
public abstract class Vehiculo {
	protected final String Matricula ;
	protected String color;
	protected int velocidad;
	
	public Vehiculo(String matricula, String color) {
		super();
		Matricula = matricula;
		this.color = color;
		this.velocidad=0;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getMatricula() {
		return Matricula;
	}
}