package com.masterjava.modelo;

public class ClasePadre {
	private String mensaje;
	
//	public ClasePadre() {
//		super();
//	}
//	
//	public ClasePadre(String mensaje) {
//		super();
//		this.mensaje=mensaje
//	}
	
//	public ClasePadre(String s) { //Parametro de valor(propiedad) que quieres iniciar que sería lo mismoo
//		super();
//		mensgaje=s;
//	}
	
//	public ClasePadre(String , numero22) {  pero esto esta mal Where private int numero;
//	super();
//	mensgaje=s;
//	this.numero=numero22;
//}
	
	public ClasePadre() {
	super();
	this.mensaje="Salduo 1 desde Clase Padre";
}
	public ClasePadre(String s) { 
	super();
	this.mensaje=s;
}
	public void imprimir() {
		System.out.println("Saludo2 desde Clase Padre");
		System.out.println(mensaje);
	}
}
