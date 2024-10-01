package com.masterjava.modelosInterfaces;
	import com.masterjava.interfaces.FiguraInterfaz;

/**
*Clase Rectangulo
*@author Manuel Portal
*@version 4.33.0, 27 sept 2024
*/
public class RectanguloI implements FiguraInterfaz{
	protected double l;
	protected double w;

	public RectanguloI( double l,  double w) {
		super();
		this.l=l;
		this.w=w;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

	@Override
	public double area() {
		double  resultado;
		resultado = l*w;
		System.out.println("Area de RectanguloI es "+resultado);
		return resultado;
	}

	@Override
	public double perimetro() {
		double  resultado;
		resultado =2*(l+w);
		System.out.println("Perimetro de RectanguloI es "+resultado);
		return resultado;
	}

}