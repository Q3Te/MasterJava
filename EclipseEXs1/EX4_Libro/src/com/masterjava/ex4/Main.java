package com.masterjava.ex4;

public class Main {

	public static void main(String[] args) {
		Libro l1 = new Libro(1234);
		
		l1.setTitulo("JAVA");
		l1.setAutor("Juan");
		l1.setnPaginas(100);
		
		System.out.println("Libro 1 - "+l1.getTitulo());
		
		Libro l2 = new Libro(4321);
		l2.setAutor("Juan");
		l2.setnPaginas(26);
		
		System.out.println("Libro 2 - "+l2.getTitulo());
		System.out.println("Libro 2 Autor - "+l2.getAutor());
		
		System.out.println();
		System.out.println(l2);
		
		System.out.println(l1.proceso_Resultado(l1, l2));
	}
}