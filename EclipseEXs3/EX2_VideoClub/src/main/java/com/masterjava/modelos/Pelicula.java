package com.masterjava.modelos;
	import jakarta.persistence.Column;
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
    
    @Column(name="precio_alquiler")
    private double precioAlquiler;

    public Pelicula() {
    	super();
    }

    public Pelicula(String titulo, String director, double precioAlquiler) {
        this.titulo = titulo;
        this.director = director;
        this.precioAlquiler = precioAlquiler;
    }

    public  int getCodigo(){ 
    	return codigo;
    }
    
    public void setCodigo(int codigo){ 
    	this.codigo = codigo;
    }

    public String getTitulo(){ 
    	return titulo; 
    }
    
    public void setTitulo(String titulo){ 
    	this.titulo = titulo; 
    }

    public String getDirector(){ 
    	return director; 
    }
    
    public void setDirector(String director){ 
    	this.director = director;
    }

    public Double getPrecioAlquiler(){ 
    	return precioAlquiler;
    }
    public void setPrecioAlquiler(double precioAlquiler){
    	this.precioAlquiler = precioAlquiler;
    }

	@Override
	public String toString() {
		return "Pelicula - Código ["+codigo+"], Titulo= "+titulo+",	Director="+director+",	Precio alquiler €"+precioAlquiler;
	}
}