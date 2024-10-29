package com.masterjava.namedquery;
	import java.util.List;
	import com.masterjava.modelos.Libro;
	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.Persistence;
	import jakarta.persistence.TypedQuery;

public class NamedQuery1 {

public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca");
	EntityManager em = emf.createEntityManager();
	
	// NamedQuery 1
	TypedQuery<Libro> consulta =  em.createNamedQuery("buscarTodos", Libro.class); // Libros.buscarTodos hace refencia al java por defecto que es [	TypedQuery<Libro> consulta =  em.createNamedQuery("buscarTodos", Libro.class); ]
	List<Libro> libros=consulta.getResultList();
	System.out.println("TODOS LOS LIBROS");
	for(Libro libro:libros)
	{
		System.out.println(libro);
	}
	
	// NamedQuery 2
	TypedQuery<Libro> consulta2 =  em.createNamedQuery("buscarTodos", Libro.class);
	consulta2.setParameter("isbn", "1A");
	List<Libro> libros2=consulta2.getResultList();
	System.out.println("TODOS LOS LIBROS");
	for(Libro libro:libros2)
	{
		System.out.println(libro);
	}
 }
}