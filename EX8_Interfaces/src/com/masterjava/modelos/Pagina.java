package com.masterjava.modelos;

import com.masterjava.interfaces.Imprimible;
/**
*Clase Pagina
*@author Manuel Portal
*@version 4.33.0, 26 sept 2024
*/
public class Pagina implements Imprimible{
 private  int nPagina;
 private  int nLineas;

public Pagina() {
	super();
}

public Pagina(int nPagina, int nLineas) {
	super();
	this.nPagina = nPagina;
	this.nLineas = nLineas;
}

public int getnPagina() {
	return nPagina;
}

public void setnPagina(int nPagina) {
	this.nPagina = nPagina;
}

public int getnLineas() {
	return nLineas;
}

public void setnLineas(int nLineas) {
	this.nLineas = nLineas;
}

@Override
public void informeLargo() {
	System.out.println("Número de páginas ("+nPagina+") con "+nLineas+" lineas");
}

@Override
public void informeCorto() {
	System.out.println("Número de páginas-"+nPagina);
}

}
