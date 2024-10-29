package com.masterjava.part2combined;
	import java.util.List;
	import com.masterjava.modelos.Libro;
	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.Persistence;
	import jakarta.persistence.TypedQuery;

/**
* Clase Consultas
* @author Manuel Portal
* @version 4.3.3, 28 oct 2024
*/
public class Consultas {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca");
	private EntityManager em;
	private TypedQuery<Libro> libro;
	
	public List<Libro>buscarTodos(){
		em = emf.createEntityManager();
		libro = em.createNamedQuery("Libro.buscarTodos", Libro.class);
		return libro.getResultList();
	}
	
	public List<Libro> buscarPorIsbn(String isbn) {
		em = emf.createEntityManager();
		em.createNamedQuery("Libro.buscarPorIsbn", Libro.class);
		libro.setParameter("isbn", isbn);
		return libro.getResultList();
	}
	
	public List<Libro> buscarPorAutor(String autor) {
		em = emf.createEntityManager();
		em.createNamedQuery("Libro.buscarPorAutor", Libro.class);
		libro.setParameter("autor", autor);
		return libro.getResultList();
	}
	
	public List<Libro> buscarPorTitulo(String titulo) {
		em = emf.createEntityManager();
		em.createNamedQuery("Libro.buscarPorTitulo", Libro.class);
		libro.setParameter("titulo", titulo);
		return libro.getResultList();
	}
}
