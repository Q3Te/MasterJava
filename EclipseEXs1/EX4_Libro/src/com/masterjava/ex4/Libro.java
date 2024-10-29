package com.masterjava.ex4;

import java.util.Objects;

public class Libro {
	private int isbn;
	private String titulo;
	private String autor;
	private int nPaginas;
	
	public Libro(int isbn) {		//Inicializa el objeto
		this.isbn=isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getnPaginas() {
		return nPaginas;
	}

	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}
	
	@Override
	public String toString() {
		return "El libro con isbn "+isbn+" escrito por el autor "+autor+" tiene "+nPaginas+" páginas";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(autor, isbn, nPaginas, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && isbn == other.isbn && nPaginas == other.nPaginas
				&& Objects.equals(titulo, other.titulo);
	}

	public void proceso_Resultado(int nPaginas) {
		this.nPaginas=nPaginas;
		
	}
	
	public String proceso_Resultado(Libro l1,Libro l2) {
		String libroMasLargo;
		if (l1.getnPaginas() > l2.getnPaginas())
		{
			libroMasLargo="el libro mas largo es el 1";
		}
		else
		{
			libroMasLargo="el libro mas largo es el 2";
		}
		return libroMasLargo;
	}
}