package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Libro;
@Service
public class LibroServiceImpl implements LibroService {
	public List<Libro> libros;
	
	public LibroServiceImpl() {
		libros = new ArrayList<Libro>(List.of(new Libro(1, "Grecia", "guia viaje"),
				new Libro(2, "Italia", "guia viaje"),
				new Libro(3, "Perla negra", "misterio"),
				new Libro(4, "Días de lluvia", "teatro")
				));
	}
		
	@Override
	public List<Libro> libros() {
		return libros;
	}

	@Override
	public Libro buscarLibro(int isbn) {
		return libros.stream()
			.filter(libro -> libro.getIsbn() == isbn)
			.findFirst()
			.orElse(null);
	}

	@Override
	public void altaLibro(Libro libro) {
		if(!libros.contains(libro)) {
			libros.add(libro);
		}
	}

	@Override
	public void actualizarLibro(Libro libro) {
		Libro lib = buscarLibro(libro.getIsbn());
		if (lib!=null) {
			lib.setTitulo(libro.getTitulo());
			lib.setTematica(libro.getTematica());
		}
	}

	@Override
	public List<Libro> eliminarLibro(int isbn) {
		libros.removeIf(lib -> lib.getIsbn()==isbn);
		return libros;
	}

}
