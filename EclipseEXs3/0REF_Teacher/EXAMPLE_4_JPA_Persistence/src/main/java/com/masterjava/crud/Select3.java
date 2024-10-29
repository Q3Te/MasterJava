package com.masterjava.crud;
	import java.util.List;
	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.Persistence;
	import jakarta.persistence.TypedQuery;

public class Select3 {

public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Biblioteca");
	EntityManager em=emf.createEntityManager();
	
	TypedQuery<String> consulta = em.createQuery("SELECT l.autor FROM Libro l",String.class);  //ESCALAR
	
	//TypedQuery<String> consulta = em.createQuery("SELECT UPPER(l.autor) FROM Libro l",String.class);  FUNCION
	
	List<String> autores=consulta.getResultList();
	for(String estring:autores)
	{
		System.out.println(estring);
	}
 }
}