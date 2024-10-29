package com.masterjava.principal;

import com.masterjava.modelos.Aranna;
import com.masterjava.modelos.Gato;
import com.masterjava.modelos.Pez;


public class Principal {

	public static void main(String[] args) {
		Aranna a1 = new Aranna();
		Gato g1 = new Gato("Welcome");
		Pez p1 = new Pez("Qwery");

		a1.andar();
		a1.comer(); System.out.println();
		g1.andar();
		g1.jugar();
		g1.comer(); System.out.println();
		p1.andar();
		p1.jugar();
		p1.comer();
	}

}