package com.masterjava.crud;
	import java.util.List;
	import com.masterjava.modelos.Libro;
	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.Persistence;
	import jakarta.persistence.TypedQuery;

public class Select2 {

public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca");
	EntityManager em = emf.createEntityManager();
	
	TypedQuery<Libro> consulta = em.createQuery("SELECT l FROM Libro l WHERE l.autor = :autor",Libro.class);
	consulta.setParameter("autor", "Maria");

//	TypedQuery<Libro> consulta = em.createQuery("SELECT l FROM Libro l WHERE l.autor = :autor AND l.isbn= :isbn ",Libro.class);
//	consulta.setParameter("autor", "Maria");	
//	consulta.setParameter("isbn", "1C");
	
	List<Libro> libros=consulta.getResultList();
	for(Libro libro:libros)
	{
		System.out.println(libro);
	}
 }
}