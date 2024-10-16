package com.masterjava.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
*Clase Equipo
*@author Manuel Portal
*@version 4.33.0, 27 sept 2024
*/
public class Equipo {
	private String nombre;
	private List<Jugador> jugadores;
	private int pGanados;
	
	public Equipo(String nombre) {
		this.nombre=nombre;
		this.jugadores=new ArrayList<>();
		this.pGanados=0;
	}
	public String getNombre() {
		return nombre;
	}

	public int getPGanados() {
		return pGanados;
	}
		
	public void pGanados(int goles){
		this.pGanados++;
	}
		
	public void addJugador(Jugador jugador) {
		jugadores.add(jugador);
	}
	
	public List<Jugador> ordenarGoles(){
		Collections.sort(jugadores);
		return jugadores;
	}
}
