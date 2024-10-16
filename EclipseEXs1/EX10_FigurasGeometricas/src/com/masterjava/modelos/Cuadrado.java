package com.masterjava.modelos;

/**
*Clase Cuadrado
*@author Manuel Portal
*@version 4.33.0, 27 sept 2024
*/
public class Cuadrado extends Rectangulo{
	protected double lado;
	
	public Cuadrado(double l, double w, double lado) {
		super(l, w);
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double  area() {
		double resultado;
		resultado = lado*lado;
		System.out.println("Area de cuadrado es "+resultado);
		return resultado;
		
	}

	@Override
	public double perimetro() {
		double resultado;
		resultado = 4*lado;
		System.out.println("Perimetro de cuadrado es "+resultado);
		return resultado;
	}
	
}