package com.masterjava.part2combined;
	import com.masterjava.modelos.Libro;

public class NamedQuery2 {

public static void main(String[] args) {
	Consultas consulta = new Consultas();

	System.out.println("TODOS");
	for(Libro libro : consulta.buscarTodos())
	{
		System.out.println(libro);
	}

	System.out.println("POR ISBN");
	for(Libro libro : consulta.buscarPorIsbn("1A"))
	{
		System.out.println(libro);
	}
	
	System.out.println("POR AUTOR");
	for(Libro libro : consulta.buscarPorAutor("Sebas"))
	{
		System.out.println(libro);
	}
	// BUSCAR POR TITULO
	System.out.println("POR TITULO");
	for(Libro libro : consulta.buscarPorTitulo("Java"))
	{
		System.out.println(libro);
	}
 }
}