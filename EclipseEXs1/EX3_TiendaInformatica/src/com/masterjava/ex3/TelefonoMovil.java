package com.masterjava.ex3;

public class TelefonoMovil  extends Producto {
    private String operador;

    public TelefonoMovil(int Id, String modelo, double precio, int stock, String operador) {
        super(Id, modelo, precio, stock);
        this.operador = operador;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Operador: "+operador);
    }
}