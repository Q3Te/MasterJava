package com.masterjava.principal;
	import java.util.List;
	import com.masterjava.modelos.Categoria;
	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.Persistence;
	import jakarta.persistence.TypedQuery;

public class ConsultaCategoria {

public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca");
	EntityManager em = emf.createEntityManager();
	
	TypedQuery<Categoria> consulta = em.createQuery("SELECT c FROM Categoria c", Categoria.class);
	List<Categoria> categorias = consulta.getResultList();
	
//	TypedQuery<Categoria> consulta = em.createQuery("SELECT c FROM Categoria c WHERE SIZE(c.libros) < 3", Categoria.class);
//	List<Categoria> categorias = consulta.getResultList();
	
	for(Categoria categoria : categorias)
	{
		System.out.println(categoria);
	}
 }
}