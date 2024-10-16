package com.masterjava.modelos;

import com.masterjava.interfaces.Mascota;

/**
*Clase Gato
*@author Manuel Portal
*@version 4.33.0, 26 sept 2024
*/
public class Gato extends Animal implements Mascota {
 protected String nombre;
 
public Gato() {
	super(4);
}

public Gato(String nombre) {
	super(4);
	this.nombre = nombre;
}

public Gato(int nPatas, String nombre) {
	super(nPatas);
	this.nombre=nombre;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

//@Override
//public int getnPatas() {
//	return super.getnPatas();
//}

@Override
public void andar() {
	super.andar();
}

@Override
public void comer() {
	super.comer();
	System.out.println("A los gatos les gusta comer peces y arañas");
}

@Override
public void jugar() {
	System.out.println("A "+nombre+" le gusta jugar con pelotas");
}

}