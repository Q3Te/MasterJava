package com.masterjava.crud;
	import java.util.List;
	import com.masterjava.modelos.Libro;
	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.Persistence;
	import jakarta.persistence.TypedQuery;

public class Select1 {

public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca");
	EntityManager em = emf.createEntityManager();
	
	TypedQuery<Libro> consulta = em.createQuery("SELECT l FROM Libro l",Libro.class);
	//TypedQuery<Libro> consulta = em.createQuery("SELECT l FROM Libro l WHERE l.precio BETWEEN 20 AND 900",Libro.class);
	//TypedQuery<Libro> consulta = em.createQuery("SELECT l FROM Libro l WHERE l.autor IN ('Bobby','Ires','Yues')",Libro.class);
	//TypedQuery<Libro> consulta = em.createQuery("SELECT l FROM Libro l ORDER BY l.autor",Libro.class);
	//TypedQuery<Libro> consulta = em.createQuery("SELECT l FROM Libro l WHERE l.autor LIKE '%a'",Libro.class);
	
	List<Libro> libros=consulta.getResultList();
	for(Libro libro:libros)
	{
		System.out.println(libro);
	}
 }
}