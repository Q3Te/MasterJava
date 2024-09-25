package com.masterjava.modelo;

public class ClaseHija extends ClasePadre{
	protected String otroMensaje;

	public ClaseHija() {
		super("Saludo desde clase hija");
	}

//	public ClaseHija(String otroMensaje) {
//		super();
//		this.otroMensaje = otroMensaje;
//	}
	
	public ClaseHija(String s, String otro) {
		super(s);
		this.otroMensaje = otro;
	}

	@Override
	public void imprimir() { //Hereda metodo imprir de la Clase Padre
		System.out.println("Clase Hija en override/implement de metodo imprime de la Clase Padre");
		super.imprimir();
		System.out.println("Finished --> el Clase Hija en override/implement de metodo imprime de la Clase Padre");
	}
	
}
