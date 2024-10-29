package com.masterjava.ex3;

public class Main {

	public static void main(String[] args) {
		Ordenador ordenador = new Ordenador(1, "MSI MAG Infinite S3 14NUC7-1852ES", 1230.00, 13, "Intel i7", 16, 512);
	    TelefonoMovil telefono = new TelefonoMovil(2, "iPhone 15", 1000.00, 25, "Movistar");

		System.out.println("Información del ordenador:");
		ordenador.mostrarInfo();
		
		System.out.println("\nInformación del teléfono móvil:");
		telefono.mostrarInfo();

	}

}