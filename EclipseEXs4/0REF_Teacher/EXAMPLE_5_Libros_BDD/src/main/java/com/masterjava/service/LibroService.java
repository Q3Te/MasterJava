package com.masterjava.service;
	import java.util.List;
	import com.masterjava.modelos.Libro;

public interface LibroService {
	public List<Libro> libros();
	public Libro buscarLibro(int isbn);
	public void altaLibro(Libro libro);
	public void actualizarLibro(Libro libro);
	public List<Libro> eliminarLibro(int isbn);
	List<Libro> buscarPorTitulo(String titulo);//Method found in LibroRepository
}
