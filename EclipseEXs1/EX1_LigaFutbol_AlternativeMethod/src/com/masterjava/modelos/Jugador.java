package com.masterjava.modelos;

/**
*Clase Jugador
*@author Manuel Portal
*@version 4.33.0, 27 sept 2024
*/
public class Jugador implements Comparable<Jugador> {
	private String nombre;
	private int gMarcados;
	private Equipo equipo;


	public Jugador(String nombre) {
		this.nombre=nombre;
		this.gMarcados=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getGMarcados() {
		return gMarcados;
	}

	public void setGMarcados(int gMarcados) {
		this.gMarcados = gMarcados;
	}
	
	public void masGoles(int goles){
		this.gMarcados+=goles;
	}
	

	@Override
	public String toString() {
		return ""+nombre+" Goles ["+gMarcados+"]";
	}

	@Override
	public int compareTo(Jugador j) { // Compares jugador at that momento to another jugador
		if(this.gMarcados>j.gMarcados)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}
