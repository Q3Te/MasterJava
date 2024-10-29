package com.masterjava.persistence;
	import com.masterjava.modelos.Libro;
	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.Persistence;

public class Merge {

public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca");
	EntityManager em = emf.createEntityManager();
	
	Libro libro = em.find(Libro.class,"1A");  
	
	em.getTransaction().begin();
	libro.setAutor("De Rosi");
	libro.setPrecio(22);
	em.merge(libro);
	em.getTransaction().commit();
 }
}