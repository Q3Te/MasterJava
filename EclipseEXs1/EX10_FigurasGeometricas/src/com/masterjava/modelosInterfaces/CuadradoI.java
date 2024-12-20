package com.masterjava.modelosInterfaces;
	import com.masterjava.interfaces.FiguraInterfaz;

/**
*Clase Cuadrado
*@author Manuel Portal
*@version 4.33.0, 27 sept 2024
*/
public class CuadradoI implements FiguraInterfaz{
	protected double lado;
	
	public CuadradoI(double lado) {
		super();
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
		System.out.println("Area de cuadradoI es "+resultado);
		return resultado;
	}

	@Override
	public double perimetro() {
		double resultado;
		resultado = 4*lado;
		System.out.println("Perimetro de cuadradoI es "+resultado);
		return resultado;
	}
	
}