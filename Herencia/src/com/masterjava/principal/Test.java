package com.masterjava.principal;

import com.masterjava.modelo.ClaseHija;
import com.masterjava.modelo.ClasePadre;

public class Test {

	public static void main(String[] args) {
		ClasePadre padre = new ClasePadre();
		ClaseHija hija =new ClaseHija();
		ClaseHija hija2 =new ClaseHija("Saludos", "Desde una clase Hija");
		
		padre.imprimir(); System.out.println();
		hija.imprimir(); System.out.println();
		hija2.imprimir(); System.out.println();
	}

}
