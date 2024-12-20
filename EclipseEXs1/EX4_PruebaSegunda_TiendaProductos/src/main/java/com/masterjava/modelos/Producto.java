package com.masterjava.modelos;

import com.masterjava.enums.Categoria;

/**
* Clase Producto
* @author Manuel Portal
* @version 4.3.3, 14 oct 2024
*/
public class Producto {
	private String nombre;
	private double precio;
	private int stock;
	protected Categoria categoria;
	
	public Producto(String nombre, double precio, int stock, Categoria categoria) {
		super();
		this.nombre = nombre;
		this.precio=precio;
		this.stock=stock;
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	// DOS FORMAS QUE RECOGER EL VALUE DE CATEGORIA
//	public void setCategoria(Categoria categoria) {
//		this.categoria = categoria;
//	}
	
//	public void setCategoria(String categoria) {
//	    this.categoria = Categoria.valueOf(categoria);
//	}

	public void setCategoria(String categoria) {
	    switch (categoria) {
	        case "DULCES":
	            this.categoria = Categoria.DULCES;
	            break;
	        case "ROPA":
	            this.categoria = Categoria.ROPA;
	            break;
	        case "BEBIDAS":
	            this.categoria = Categoria.BEBIDAS;
	            break;
	        default:
	            throw new IllegalArgumentException("Categoria Invalida");
	    }
	}

	@Override
	public String toString() {
		return "Producto con nombre: "+nombre+", precio: €"+precio+", stock ["+stock+"], categoria: "+categoria;
	}

}