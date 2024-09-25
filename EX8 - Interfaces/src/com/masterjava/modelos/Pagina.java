package com.masterjava.modelos;

import com.masterjava.interfaces.Imprimible;

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
	System.out.println("Número de páginas-"+nPagina+" con- "+nLineas+" número de lineas");
}

@Override
public void informeCorto() {
	System.out.println("Número de páginas-"+nPagina);
}

}
