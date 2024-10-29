package com.masterjava.modelos;

/**
*Clase Circulo
*@author Manuel Portal
*@version 4.33.0, 27 sept 2024
*/
public class Circulo extends Figura {
	private static final double PI = Math.PI;
	protected double radius;

	public Circulo(double radius) {
		super();
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		double  resultado;
		resultado = PI*(2*radius);
		System.out.println("Area de circulo es "+resultado);
		return resultado;
	}

	@Override
	public double perimetro() {
		double  resultado;
		resultado = 2*PI*radius;
		System.out.println("Perimetro de circulo es "+resultado);
		return resultado;
	}
}