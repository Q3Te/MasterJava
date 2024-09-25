package com.masterjava.principal;

import com.masterjava.modelos.Flauta;
import com.masterjava.modelos.Guitarra;
import com.masterjava.modelos.GuitarraElectrica;
import com.masterjava.modelos.Tambor;

public class Principal {

	public static void main(String[] args) {
		Flauta f1 = new Flauta("Flauta_W","TipoA","ModeloXS");
		Guitarra g1 = new Guitarra("Classica","TipoB",6);
		GuitarraElectrica ge1 = new GuitarraElectrica("Elite","TipoA",6,44);
		Tambor t1 = new Tambor("Tambor_M","TipoB",5);
		
		f1.getNombre();
		f1.getTipo();
		f1.getModelo();
		f1.tocar();
		g1.tocar();
		ge1.tocar();
		t1.aporrear();

	}

}
