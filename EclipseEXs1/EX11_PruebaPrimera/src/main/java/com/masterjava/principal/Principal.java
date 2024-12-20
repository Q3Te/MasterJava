package com.masterjava.principal;

import com.masterjava.modelos.Barco;
import com.masterjava.modelos.Camion;
import com.masterjava.modelos.Coche;
import com.masterjava.modelos.Moto;

public class Principal {

	public static void main(String[] args) {
		Coche miCoche =new Coche("9462 DFA","Verde");
		Moto miMoto = new Moto("1527 AOQ", "Rojo");
		Camion miCamion = new Camion("1672 SSU", "Blanco");
		Barco miBarco = new Barco("4a-BA-2-814-21", "Beige");
		
		System.out.println(miCoche); System.out.println();
		miCoche.arrancar();
		miCoche.conducir();
		miCoche.avanzar(350,120);
		miCoche.avanzar(30,120);
		miCoche.parar(); 
		
		System.out.println("\n--------------------------------\n");
		
		System.out.println(miMoto); System.out.println();
		miMoto.arrancar();
		miMoto.conducir();
		miMoto.avanzar(350,120);
		miMoto.avanzar(30,120);
		miMoto.parar(); 
		
		System.out.println("\n--------------------------------\n");
		
		miCamion.arrancar();
		miCamion.conducir();
		miCamion.avanzar(350,100);
		miCamion.avanzar(30,60);
		miCamion.parar(); 
		
		System.out.println("\n--------------------------------\n");
		
		System.out.println(miBarco);
	}

}
