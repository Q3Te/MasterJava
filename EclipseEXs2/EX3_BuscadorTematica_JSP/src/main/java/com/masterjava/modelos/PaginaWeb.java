package com.masterjava.modelos;

/**
* Clase PaginaWeb
* @author
* @version 4.3.3, 10 oct 2024
*/
public class PaginaWeb {
	 private String direccion;
	 private String tematica;
	 private String descripcion;
	public PaginaWeb(String direccion, String tematica, String descripcion) {
		super();
		this.direccion = direccion;
		this.tematica = tematica;
		this.descripcion = descripcion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTematica() {
		return tematica;
	}
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
