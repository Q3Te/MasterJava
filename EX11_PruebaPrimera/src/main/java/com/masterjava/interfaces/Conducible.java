	package com.masterjava.interfaces;
	
	/**
	*Interfaz Conducible
	*@author Manuel Portal
	*@version 4.33.0, 30 sept 2024
	*/
	public interface Conducible {
		void arrancar();
		double avanzar(int km, double velocidad);
		void conducir();
		void retroceder();
		void parar();
	}
