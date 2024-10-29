package com.masterjava.principal;
	import java.util.List;
	import com.masterjava.modelos.Libro;
	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.Persistence;
	import jakarta.persistence.TypedQuery;

public class ConsultaLibro {

public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca");
	EntityManager em = emf.createEntityManager();
	
	TypedQuery<Libro> consulta = em.createQuery("SELECT l FROM Libro l WHERE l.categoria.nombre='web'", Libro.class);
	
	List<Libro> libros = consulta.getResultList();
	for(Libro libro : libros)
	{
		System.out.println(libro);
	}	
 }
}