package com.masterjava.modelos;

/**
*Clase Barco
*@author Manuel Portal
*@version 4.33.0, 30 sept 2024
*/
public class Barco extends Vehiculo {

	public Barco(String matricula, String color) {
		super(matricula, color);
	}

	@Override
	public String toString() {
		return "Barco con Matrícula ["+getMatricula()+"] de Color ["+getColor()+"]";
	}
}