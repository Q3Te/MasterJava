package com.viewnext.ej1.dto;

public class Jugador implements Comparable<Jugador> {
		private String nombre;
		private int gMarcados;
		
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
			return "Jugador [nombre=" + nombre + ", gMarcados=" + gMarcados + "]";
		}

		@Override
		public int compareTo(Jugador j) {
			if (this.gMarcados > j.gMarcados) {
			return -1;
			}else
			return 1;
		}
}
