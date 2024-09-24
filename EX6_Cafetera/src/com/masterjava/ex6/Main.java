package com.masterjava.ex6;

public class Main {

	public static void main(String[] args) {
		Cafetera c1 = new Cafetera();
		c1.rellenarCafetera(17); System.out.println();
		c1.servirTaza(15); System.out.println();
		c1.llenarCafetera(); System.out.println();
		c1.servirTaza(15); System.out.println();
		c1.vaciarCafetera(); System.out.println();
	}

}
