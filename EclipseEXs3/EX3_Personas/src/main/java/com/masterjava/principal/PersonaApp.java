package com.masterjava.principal;
	import com.masterjava.controller.Controller;

public class PersonaApp {
	
public static void main(String[] args) {
	
	Controller consulta = new Controller();
	
	System.out.println("Todas las personas");
	consulta.personas(); System.out.println();
	
	System.out.println("Buscar por id");
	consulta.porId(4);  System.out.println();
	
	System.out.println("Buscar por apellido1");
	consulta.porUnApellido("Garcia");  System.out.println();
	
	System.out.println("Buscar por apellido1 y apellido2");
	consulta.porDosApellidos("Lopez", "Fernandez");	
 }
}