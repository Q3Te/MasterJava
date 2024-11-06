package com.masterjava.principal;
	import com.masterjava.controller.Controller;
	
public class VideoClub {

public static void main(String[] args) {
	
	Controller query = new Controller();
	
	System.out.println("Lista Películas");
	query.peliculas(); System.out.println();
	
	System.out.println("Películas cuyo director es Cosme");
	query.peliculasPorDirectorCosme();  System.out.println();
	
	System.out.println("Películas en las que el nombre del director empieza por M (insensible)");
	query.peliculasCuyoDirectorEmpiezaPorM();  System.out.println();
	
	System.out.println("Películas cuya directora es Ana o Eva");
	query.peliculasCuyoDirectorAnaOOEva();  System.out.println();
	
	System.out.println("Sólo directores de las películas");
	query.directoresSolos();  System.out.println();

	System.out.println("Películas cuyo precio es mayor que 20 y menor que 55");
	query.peliculasCuyoPrecioEntreRango();  System.out.println();
	
	System.out.println("Las películas que hay de cada precio de alquiler");
	query.conteoPeliculasPorPrecioAlquiler();
 }
}