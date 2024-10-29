package com.masterjava.crud;
	import java.util.List;
	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.Persistence;
	import jakarta.persistence.TypedQuery;

public class Select4 {

public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca");
	EntityManager em = emf.createEntityManager();
	
	TypedQuery<Object[]> consulta = em.createQuery("SELECT COUNT(l.precio), l.precio from LIBRO l GROUP BY l.precio",Object [].class);
	
	List<Object[]> lista=consulta.getResultList();
	for(Object[] objeto:lista)
	{
		System.out.println("De "+objeto[1] +"euros hay"+objeto[0] +" libros");
	}
 }
}