package com.masterjava.principal;

import java.util.Arrays;
import java.util.List;

import com.masterjava.modelos.Pelicula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class VideoClub {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoClubPU");
	private static void insertarDatos(EntityManager em) {
	    em.getTransaction().begin();
	    em.persist(new Pelicula("Película 1", "Cosme", 25.0));
	    em.persist(new Pelicula("Película 2", "Maria", 30.0));
	    em.persist(new Pelicula("Película 3", "Ana", 40.0));
	    em.persist(new Pelicula("Película 4", "Eva", 35.0));
	    em.persist(new Pelicula("Película 5", "Miguel", 50.0));
	    em.getTransaction().commit();
	}

    private static void mostrarTodasLasPeliculas(EntityManager em) {
        List<Pelicula> peliculas = em.createQuery("SELECT p FROM Pelicula p", Pelicula.class).getResultList();
        System.out.println("Todas las películas:");
        peliculas.forEach(System.out::println);
    }

    private static void mostrarPeliculasPorDirector(EntityManager em, String director) {
        List<Pelicula> peliculas = em.createQuery("SELECT p FROM Pelicula p WHERE p.director = :director", Pelicula.class)
                .setParameter("director", director)
                .getResultList();
        System.out.println("Películas dirigidas por " + director + ":");
        peliculas.forEach(System.out::println);
    }

    private static void mostrarPeliculasDirectorIniciaCon(EntityManager em, String prefix) {
        List<Pelicula> peliculas = em.createQuery("SELECT p FROM Pelicula p WHERE p.director LIKE :prefix", Pelicula.class)
                .setParameter("prefix", prefix + "%")
                .getResultList();
        System.out.println("Películas con director que comienza con '" + prefix + "':");
        peliculas.forEach(System.out::println);
    }

    private static void mostrarPeliculasDirectorasEspecificas(EntityManager em, List<String> directoras) {
        List<Pelicula> peliculas = em.createQuery("SELECT p FROM Pelicula p WHERE p.director IN :directoras", Pelicula.class)
                .setParameter("directoras", directoras)
                .getResultList();
        System.out.println("Películas con directoras Ana o Eva:");
        peliculas.forEach(System.out::println);
    }

    private static void mostrarDirectoresUnicos(EntityManager em) {
        List<String> directores = em.createQuery("SELECT DISTINCT p.director FROM Pelicula p", String.class)
                .getResultList();
        System.out.println("Directores únicos:");
        directores.forEach(System.out::println);
    }

    private static void mostrarPeliculasPorRangoPrecio(EntityManager em, double min, double max) {
        List<Pelicula> peliculas = em.createQuery("SELECT p FROM Pelicula p WHERE p.precioAlquiler > :min AND p.precioAlquiler < :max", Pelicula.class)
                .setParameter("min", min)
                .setParameter("max", max)
                .getResultList();
        System.out.println("Películas con precio entre " + min + " y " + max + ":");
        peliculas.forEach(System.out::println);
    }

    private static void contarPeliculasPorPrecioAlquiler(EntityManager em) {
        List<Object[]> result = em.createQuery("SELECT p.precioAlquiler, COUNT(p) FROM Pelicula p GROUP BY p.precioAlquiler")
                .getResultList();
        System.out.println("Cantidad de películas por precio de alquiler:");
        result.forEach(row -> System.out.println("Precio: " + row[0] + " - Cantidad: " + row[1]));
    }
	public static void main(String[] args) {
		EntityManager em = emf.createEntityManager();
        
        insertarDatos(em);	// Inserción de datos

        //consultas solicitadas
        mostrarTodasLasPeliculas(em);
        mostrarPeliculasPorDirector(em, "Cosme");
        mostrarPeliculasDirectorIniciaCon(em, "M");
        mostrarPeliculasDirectorasEspecificas(em, Arrays.asList("Ana", "Eva"));
        mostrarDirectoresUnicos(em);
        mostrarPeliculasPorRangoPrecio(em, 20.0, 55.0);
        contarPeliculasPorPrecioAlquiler(em);

        em.close();
        emf.close();
    }
}