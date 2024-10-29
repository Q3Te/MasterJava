package com.masterjava.modelos;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
/**
* Clase Pelicula
* @author Manuel Portal
* @version 4.3.3, 28 Oct 2024
*/


@Entity
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    private String titulo;
    private String director;
    private Double precioAlquiler;

    // Constructor sin argumentos
    public Pelicula() {}

    // Constructor con argumentos
    public Pelicula(String titulo, String director, Double precioAlquiler) {
        this.titulo = titulo;
        this.director = director;
        this.precioAlquiler = precioAlquiler;
    }

    // Getters y Setters
    public  int getCodigo() { return codigo; }
    public void setCodigo( int codigo){ 
    	this.codigo = codigo;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public Double getPrecioAlquiler() { return precioAlquiler; }
    public void setPrecioAlquiler(Double precioAlquiler) { this.precioAlquiler = precioAlquiler; }

    @Override
    public String toString() {
        return "Pelicula{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", precioAlquiler=" + precioAlquiler +
                '}';
    }
}
