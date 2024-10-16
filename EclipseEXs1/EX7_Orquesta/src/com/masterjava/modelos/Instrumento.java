package com.masterjava.modelos;
/**
*Clase Instrumento
*@author Manuel Portal
*@version 4.33.0, 26 sept 2024
*/
public class Instrumento {
	protected String nombre;
	protected String tipo;

	public Instrumento() {
		super();
	}
	
	public Instrumento(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void tocar() {
		System.out.println("Tocando el instrumento "+nombre);
	}
		
	
	public void afinar() {
		System.out.println("Afinando el instrumento "+nombre);
	}
}
