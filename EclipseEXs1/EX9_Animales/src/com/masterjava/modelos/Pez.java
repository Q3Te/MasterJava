package com.masterjava.modelos;

import com.masterjava.interfaces.Mascota;

/**
*Clase Pez
*@author Manuel Portal
*@version 4.33.0, 26 sept 2024
*/
public class Pez extends Animal implements Mascota{
protected String nombre;

	public Pez() {
	super(0);
}
	
	public Pez(String nombre) {
		super(0);
		this.nombre = nombre;
	}

	public Pez(int nPatas, String nombre) {
		super(nPatas);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

//	@Override
//	public int getnPatas() {
//		return super.getnPatas();
//	}

	@Override
	public void andar() {
		super.andar();
		System.out.println("En realidad no ando, nado");
	}

	@Override
	public void comer() {
		super.comer();
		System.out.println("Los peces comen plancton");
	}

	@Override
	public void jugar() {
		System.out.println("estoy nadando");
	}
}
