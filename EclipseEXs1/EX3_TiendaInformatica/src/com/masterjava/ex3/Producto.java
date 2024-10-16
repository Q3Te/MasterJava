package com.masterjava.ex3;

public class Producto {
 	protected final int Id;
    protected String modelo;
    protected double precio;
    protected int stock;

    public Producto(int Id, String modelo, double precio, int stock) {
        this.Id = Id;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarInfo() {
        System.out.println("Código: "+Id);
        System.out.println("Modelo: "+modelo);
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad disponible: "+stock);
    }
}