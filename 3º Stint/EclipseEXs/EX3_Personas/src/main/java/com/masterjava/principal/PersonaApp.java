package com.masterjava.principal;

import java.util.List;

import com.masterjava.modelos.Persona;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PersonaApp {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
    
    private static void mostrarTodasLasPersonas(EntityManager em) {
        List<Persona> personas = em.createNamedQuery("Persona.findAll", Persona.class).getResultList();
        System.out.println("Todas las personas:");
        personas.forEach(System.out::println);
    }

    private static void buscarPorId(EntityManager em, Long id) {
        Persona persona = em.createNamedQuery("Persona.findById", Persona.class)
                .setParameter("id", id)
                .getSingleResult();
        System.out.println("Persona con ID " + id + ": " + persona);
    }

    private static void buscarPorApellido1(EntityManager em, String apellido1) {
        List<Persona> personas = em.createNamedQuery("Persona.findByApellido1", Persona.class)
                .setParameter("apellido1", apellido1)
                .getResultList();
        System.out.println("Personas con primer apellido " + apellido1 + ":");
        personas.forEach(System.out::println);
    }

    private static void buscarPorApellido1YApellido2(EntityManager em, String apellido1, String apellido2) {
        List<Persona> personas = em.createNamedQuery("Persona.findByApellido1AndApellido2", Persona.class)
                .setParameter("apellido1", apellido1)
                .setParameter("apellido2", apellido2)
                .getResultList();
        System.out.println("Personas con apellidos " + apellido1 + " y " + apellido2 + ":");
        personas.forEach(System.out::println);
    }

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        // consultas
        mostrarTodasLasPersonas(em);
        buscarPorId(em, 1L);
        buscarPorApellido1(em, "Lopez");
        buscarPorApellido1YApellido2(em, "Lopez", "Martinez");

        em.close();
        emf.close();
    }
}
