package com.masterjava.modelos;
/**
*Clase Flauta
*@author Manuel Portal
*@version 4.33.0, 26 sept 2024
*/
public class Flauta extends Instrumento{
	protected String modelo;

	public Flauta(String modelo) {
		super();
		this.modelo = modelo;
	}

	public Flauta() {
		super();
	}

	public Flauta(String nombre, String tipo, String modelo) {
		super(nombre, tipo);
		this.modelo = modelo;
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public void tocar() {
		super.tocar();
		System.out.println("Soplando");
	}	

}
