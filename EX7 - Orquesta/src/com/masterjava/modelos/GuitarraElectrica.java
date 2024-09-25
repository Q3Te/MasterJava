package com.masterjava.modelos;

public class GuitarraElectrica extends Guitarra{
protected int potencia;

public GuitarraElectrica() {
	super();
}


public GuitarraElectrica(int potencia) {
	super();
	this.potencia = potencia;
}


public GuitarraElectrica(String nombre, String tipo, int numCuerdas, int potencia) {
	super(nombre, tipo, numCuerdas);
	this.potencia = potencia;
}


public int getPotencia() {
	return potencia;
}

public void setPotencia(int potencia) {
	this.potencia = potencia;
}


@Override
public void tocar() {
	super.tocar();
	System.out.println("Tocando la guitarra eléctrica");
}



}
