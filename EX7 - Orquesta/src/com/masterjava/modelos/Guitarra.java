package com.masterjava.modelos;

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
