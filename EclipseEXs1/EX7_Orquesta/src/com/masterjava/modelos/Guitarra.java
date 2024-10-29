package com.masterjava.modelos;
/**
*Clase Guitarra
*@author Manuel Portal
*@version 4.33.0, 26 sept 2024
*/
public class Guitarra extends Instrumento{
	protected int numCuerdas;

	public Guitarra() {
		super();
	}

	public Guitarra(int numCuerdas) {
		super();
		this.numCuerdas = numCuerdas;
	}

	public Guitarra(String nombre, String tipo, int numCuerdas) {
		super(nombre, tipo);
		this.numCuerdas = numCuerdas;
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}
	
	
}
