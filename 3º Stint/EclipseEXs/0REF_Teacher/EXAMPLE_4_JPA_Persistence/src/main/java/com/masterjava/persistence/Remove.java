package com.masterjava.persistence;
	import com.masterjava.modelos.Libro;
	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.Persistence;

public class Remove {

public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca"); 
	EntityManager em = emf.createEntityManager();
	
	Libro libro= em.find(Libro.class,"1B");  
	
	em.getTransaction().begin();
	em.remove(libro);	
	em.getTransaction().commit();
 }
}