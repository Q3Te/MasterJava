package com.masterjava.principal;

import com.masterjava.modelos.Cuadrado;
import com.masterjava.modelos.Circulo;
import com.masterjava.modelos.Rectangulo;
import com.masterjava.modelosInterfaces.CuadradoI;
import com.masterjava.modelosInterfaces.CirculoI;
import com.masterjava.modelosInterfaces.RectanguloI;

public class Principal {

	public static void main(String[] args) {
		Cuadrado sq1 = new Cuadrado(0, 0, 4);
		Circulo c1 = new Circulo(5);
		Rectangulo r1 = new Rectangulo(18,3);
		
		CuadradoI sq2 = new CuadradoI(4);
		CirculoI c2 = new CirculoI(5);
		RectanguloI r2 = new RectanguloI(18,3);
		
		sq1.area();
		sq1.perimetro(); System.out.println();
		c1.area();
		c1.perimetro(); System.out.println();
		r1.area();
		r1.perimetro(); System.out.println();

		sq2.area();
		sq2.perimetro(); System.out.println();
		c2.area();
		c2.perimetro(); System.out.println();
		r2.area();
		r2.perimetro(); System.out.println();
	}

}
