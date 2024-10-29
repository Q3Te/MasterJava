package com.masterjava.principal;
	import com.masterjava.modelos.Categoria;
	import com.masterjava.modelos.Libro;
	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.Persistence;

public class Persist {

public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca");
	EntityManager em = emf.createEntityManager();
	
	em.getTransaction().begin();
	Libro libro= new Libro("001", "Rayos y rallas", "Polo", 20);
	Categoria categoria = em.find(Categoria.class, "web");
	libro.setCategoria(categoria);
	em.persist(libro);
	em.getTransaction().commit();
	
//	em.getTransaction().begin();
//	Libro libro= new Libro("002", "Rayos y rallas", "Polo", 20);
//	Categoria categoria = new Categoria("Python", "Desarrolo de aplicaciones para python");
//	libro.setCategoria(categoria);
//	em.persist(categoria);
//	em.persist(libro);
//	em.getTransaction().commit();
	
 }
}