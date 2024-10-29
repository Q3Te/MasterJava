package com.masterjava.modelos;
	import java.util.Objects;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.NamedQueries;
	import jakarta.persistence.NamedQuery;
	import jakarta.persistence.Table;

/**
* Clase Libro
* @author Manuel Portal
* @version 4.3.3, 28 oct 2024
*/

@Entity
@Table(name="libros")
@NamedQueries({
		@NamedQuery(name="buscarTodos",query="SELECT l from Libro l"),
		@NamedQuery(name="buscarPorIsbn",query="SELECT l from Libro l WHERE isbn = :isbn"),
		@NamedQuery(name="buscarPorAutor",query="SELECT l from Libro l WHERE autor LIKE : autor"),
		@NamedQuery(name="buscarPorTitulo",query="SELECT l from Libro l WHERE titulo LIKE : titulo"),
})
public class Libro {
	@Id
	private String isbn;
	
	private String titulo;
	private String autor;
	private int precio;
	
	public Libro() {
		super();
	}
	
	public Libro(String isbn) {
		super();
		this.isbn = isbn;
	}
	
	public Libro(String isbn, String titulo, String autor, int precio) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(autor, isbn, precio, titulo);
//	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
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
		return Objects.equals(autor, other.autor) && Objects.equals(isbn, other.isbn) && precio == other.precio
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}	
}