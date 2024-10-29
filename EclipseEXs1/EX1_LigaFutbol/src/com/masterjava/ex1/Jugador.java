package com.masterjava.ex1;
	import java.util.Comparator;
	import java.util.List;

class Jugador {
	private String nombre;
	private int g_Marcados;
	
	public Jugador(String nombre) {
		this.nombre=nombre;
		this.g_Marcados=0;
	}

	public String getNombre() {
		return nombre;
	}


	public int getG_Marcados() {
		return g_Marcados;
	}

	
	public void incrementarGoles(){
		this.g_Marcados++;
	}
	
//	public void incrementarGoles(int goles){  ANOTHER WAY OF INCREMENTING GOALS
//		this.g_Marcados+=goles;
//	}

	@Override
	public String toString() {
		return "Jugador [nombre= "+nombre+", goles marcados="+g_Marcados+"]";
	}

}
