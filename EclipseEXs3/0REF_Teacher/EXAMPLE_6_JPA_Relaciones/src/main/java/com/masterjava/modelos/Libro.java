package com.masterjava.modelos;
	import java.io.Serializable;
	import java.util.Objects;
	import jakarta.persistence.CascadeType;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.JoinColumn;
	import jakarta.persistence.ManyToOne;
	import jakarta.persistence.Table;
	
/**
* Clase Libro
* @author Manuel Portal
* @version 4.3.3, 28 oct 2024
*/
@Entity
@Table(name="libros")
public class Libro implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String isbn;
	private String titulo;
	private String autor;
	private int precio;
	
	@ManyToOne (cascade=CascadeType.PERSIST)  //las operaciones de guardado en la base de datos de las entidades padre se propagarán a las entidades relacionadas

	@JoinColumn(name="categorias_nombre")
	private Categoria categoria;
	
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
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
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "Libro [isbn="+isbn+", titulo="+titulo+", autor="+autor+", precio="+precio+", categoria="+categoria+"]";
	}
}