package com.masterjava.ex3;

public class Ordenador extends Producto {
	private String procesador;
    private int memoria; 
    private int discoDuro;

    public Ordenador(int Id, String modelo, double precio, int stock, String procesador, int memoria, int discoDuro) {
        super(Id, modelo, precio, stock);
        this.procesador = procesador;
        this.memoria = memoria;
        this.discoDuro = discoDuro;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Procesador: "+procesador);
        System.out.println("Memoria RAM: "+memoria+" GB");
        System.out.println("Disco duro: "+discoDuro+" GB");
    }
}