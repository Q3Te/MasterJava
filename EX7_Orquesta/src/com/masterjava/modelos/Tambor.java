package com.masterjava.modelos;
/**
*Clase Tambor
*@author Manuel Portal
*@version 4.33.0, 26 sept 2024
*/
public class Tambor extends Instrumento {
	protected int tamanno;

	public Tambor() {
		super();
	}

	public Tambor(int tamanno) {
		super();
		this.tamanno = tamanno;
	}

	public Tambor(String nombre, String tipo, int tamanno) {
		super(nombre, tipo);
		this.tamanno = tamanno;
	}

	public int getTamanno() {
		return tamanno;
	}

	public void setTamanno(int tamanno) {
		this.tamanno = tamanno;
	}
	
	public void aporrear() {
		System.out.println("Aporreando tambor "+nombre);
	}
	
}
