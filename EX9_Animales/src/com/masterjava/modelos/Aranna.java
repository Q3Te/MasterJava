package com.masterjava.modelos;

/**
*Clase Aranna
*@author Manuel Portal
*@version 4.33.0, 26 sept 2024
*/
public class Aranna extends Animal {

	public Aranna() {
		super(8);
	}

	@Override
	public void andar() {
		super.andar();
	}

	@Override
	public void comer() {
		super.comer();
		System.out.println("Las arañas comen mosquitos");
	}

}