package com.masterjava.service;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import com.masterjava.modelos.Libro;
	import com.masterjava.repository.LibrosRepository;

@Service
public class LibroServiceImpl implements LibroService{

	@Autowired
	LibrosRepository repository;
	
	@Override
	public List<Libro> libros() {
		return repository.findAll();
	}

	@Override
	public Libro buscarLibro(int isbn) {
		return repository.findById(isbn).orElse(null);
	}

	@Override
	public void altaLibro(Libro libro) {
		repository.save(libro);
	}

	@Override
	public void actualizarLibro(Libro libro) {
		repository.save(libro);
	}

	@Override
	public List<Libro> eliminarLibro(int isbn) {
		repository.delete(null);
		return repository.findAll();
	}

	// BELONGS TO LibrosRepository
	@Override
	public List<Libro> buscarPorTitulo(String titulo) {
		return repository.buscarPorTitulo(titulo);
	}	
}