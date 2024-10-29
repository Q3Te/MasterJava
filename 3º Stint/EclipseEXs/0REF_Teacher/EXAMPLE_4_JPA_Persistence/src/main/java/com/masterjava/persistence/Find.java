package com.masterjava.persistence;
	import com.masterjava.modelos.Libro;
	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.Persistence;

public class Find {

public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca");
	EntityManager em = emf.createEntityManager();
	Libro libro = em.find(Libro.class, "1A");
	
	if(libro!=null)
	{
		System.out.println(libro.getIsbn());
		System.out.println(libro.getTitulo());
		System.out.println(libro.getAutor());
		System.out.println(libro.getPrecio());
	}
	else
	{
		System.out.println("Libro no encontrado");
	}
 }
}