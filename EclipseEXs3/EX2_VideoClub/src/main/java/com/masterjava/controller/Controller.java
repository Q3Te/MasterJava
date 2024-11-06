package com.masterjava.controller;
	import java.util.List;
	import com.masterjava.modelos.Pelicula;
	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.Persistence;
	import jakarta.persistence.TypedQuery;

public class Controller {
	EntityManagerFactory mf = Persistence.createEntityManagerFactory("Peliculas");
	EntityManager em = mf.createEntityManager();

	public void peliculas() {
		TypedQuery<Pelicula> consulta = em.createQuery("select p from Pelicula p", Pelicula.class);
		List<Pelicula> peliculas = consulta.getResultList();
		
		for(Pelicula p : peliculas)
		{
			System.out.println(p);
		}
	}
	
	public void peliculasPorDirectorCosme() {
		TypedQuery<Pelicula> consulta = em.createQuery("select p from Pelicula p where p.director = 'Cosme'", Pelicula.class);
		List<Pelicula> peliculas = consulta.getResultList();

		for(Pelicula p : peliculas)
		{
			System.out.println(p);
		}
	}
	
	public void peliculasCuyoDirectorEmpiezaPorM() {
		TypedQuery<Pelicula> consulta = em.createQuery("select p from Pelicula p where p.director like 'M%'", Pelicula.class);
		List<Pelicula> peliculas = consulta.getResultList();

		for(Pelicula p : peliculas)
		{
			System.out.println(p);
		}
	}
	
	public void peliculasCuyoDirectorAnaOOEva() {
		TypedQuery<Pelicula> consulta = em.createQuery("select p from Pelicula p where p.director = 'Ana' or p.director = 'Eva' ", Pelicula.class); //Strictamente Ana O Eva
		//select p from Pelicula p where p.director like '%Ana%' or p.director like '%Eva%  Si es nombre Completo que contenga Ana o Eva
		List<Pelicula> peliculas = consulta.getResultList();

		for(Pelicula p : peliculas)
		{
			System.out.println(p);
		}
	}
	
	public void directoresSolos() {
		TypedQuery<String> consulta = em.createQuery("select p.director from Pelicula p", String.class);
		List<String> directores = consulta.getResultList();

		for(String p : directores)
		{
			System.out.println(p);
		}
	}
	
	public void peliculasCuyoPrecioEntreRango() {
		TypedQuery<Pelicula> consulta = em.createQuery("select p from Pelicula p where p.precioAlquiler > 20 and p.precioAlquiler < 50 ", Pelicula.class);
		List<Pelicula> peliculas = consulta.getResultList();

		for(Pelicula p : peliculas)
		{
			System.out.println(p);
		}
	}
	
	public void conteoPeliculasPorPrecioAlquiler() {
	    TypedQuery<Object[]> consulta = em.createQuery("select p.precioAlquiler, count(p) from Pelicula p group by p.precioAlquiler", Object[].class);
	    List<Object[]> peliculasPorPrecioAlquiler = consulta.getResultList();

	    for(Object[] resultadoIndividual : peliculasPorPrecioAlquiler)
	    {
	    	//Java MySQL = BIGINT, Java JPQL = Long;		Results are a different set of Objects [0] = Precio Alquiler, [1]  = contador
	        double precioAlquiler = (double) resultadoIndividual[0];
	        long contador = (long) resultadoIndividual[1];
	        System.out.println("Precio Alquiler €"+precioAlquiler+",  Nº Películas ["+contador+"]");
	    }
	}
}