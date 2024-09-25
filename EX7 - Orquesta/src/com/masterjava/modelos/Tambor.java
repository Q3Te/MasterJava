package com.masterjava.modelos;

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
