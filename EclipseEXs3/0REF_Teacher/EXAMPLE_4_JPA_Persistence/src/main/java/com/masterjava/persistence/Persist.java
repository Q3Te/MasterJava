package com.masterjava.persistence;
	import com.masterjava.modelos.Libro;
	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.Persistence;

public class Persist {

public static void main(String[] args) {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Biblioteca");  
	EntityManager em = emf.createEntityManager();
	
	Libro libro = new Libro("1B","La Casa","Miguel",50);
	
	em.getTransaction().begin();
	em.persist(libro);		
	em.getTransaction().commit();
 }
}