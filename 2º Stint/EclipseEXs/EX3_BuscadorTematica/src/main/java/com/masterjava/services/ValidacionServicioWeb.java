package com.masterjava.services;

import java.util.List;

import com.masterjava.modelos.PaginaWeb;

/**
* Clase ValidacionServicioWeb
* @author
* @version 4.3.3, 9 oct 2024
*/
public class ValidacionServicioWeb {
	List<PaginaWeb> paginaweb=List.of(
			new PaginaWeb("https://www.google.com","Busqueda","Google es un motor de búsqueda en línea que permite a los usuarios buscar información en la web mediante palabras clave o frases"),
			new PaginaWeb("https://www.youtube.com","Videos", "YouTube es una plataforma de videos en línea que permite a los usuarios ver, compartir y subir videos de varios de temas Ej. Vlogs, Tutoriales, Música"));	
	public PaginaWeb autenticar(String tematica) {
		return paginaweb.stream()
				.filter(x->x.getTematica().equalsIgnoreCase(tematica))
				.findFirst()
				.orElse(null);
	}
}