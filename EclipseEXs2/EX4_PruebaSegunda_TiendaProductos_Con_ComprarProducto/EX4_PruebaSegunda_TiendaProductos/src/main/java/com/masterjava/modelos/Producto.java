package com.masterjava.modelos;

import java.math.BigDecimal;
import java.util.Objects;

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

	public void setStockActualizado(int nuevoStock) {  //Nº2  //Para Actualizar stock a stock despues de compra
	    this.stock = nuevoStock;
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

 /*----------------------------------------------------------------------------------------------------------------------*/	
	//PARA JUnit Testing
	@Override
	public int hashCode() {
		return Objects.hash(categoria, nombre, precio, stock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return categoria == other.categoria && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio) && stock == other.stock;
	}
	
	public boolean esMismoNombreProducto(Producto otra) {
		if(this.getNombre().equals(otra.getNombre()))
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	public boolean esMismoStockProducto(Producto otra) {
		if(this.getStock()==(otra.getStock()))
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	public double esCantidadVentaTotalUnSoloProductoEsperado(double precio, int stock) {
		double resultado=0.00;		
			resultado=precio*stock;
		return BigDecimal.valueOf(resultado).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();//Depende mucho de valor de parámetros, pero sirve para el puntos decimales con precisión
	}
}