package com.masterjava.controller;
	import java.util.List;
	import com.masterjava.modelos.Persona;
	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.Persistence;
	import jakarta.persistence.TypedQuery;

/**
* Clase Controller
* @author Manuel Portal
* @version 4.3.3, 4 Nov 2024
*/
public class Controller {
	EntityManagerFactory mf = Persistence.createEntityManagerFactory("Persona");
	EntityManager em = mf.createEntityManager();
	private TypedQuery<Persona> query;
		
	public void personas() {
		query = em.createNamedQuery("Persona.findAll", Persona.class);
		
		List<Persona> personas = query.getResultList();
		for(Persona p : personas)
		{
			System.out.println(p);
		}
	}
	
	public void porId(int id) {
		query = em.createNamedQuery("Persona.findById", Persona.class);
		query.setParameter("id", id);
		
		List<Persona> personas = query.getResultList();
		for(Persona p : personas)
		{
			System.out.println(p);
		}		
	}
	
	public void porUnApellido(String apellido1) {
		query = em.createNamedQuery("Persona.findByApellido1", Persona.class);
		query.setParameter("apellido1", apellido1);
		 
		List<Persona> personas = query.getResultList();
		for(Persona p : personas)
		{
			System.out.println(p);
		}		
	}
	
	public void porDosApellidos(String apellido1, String apellido2) {
		query = em.createNamedQuery("Persona.findByApellido1AndApellido2", Persona.class);
		query.setParameter("apellido1", apellido1); 
	    query.setParameter("apellido2", apellido2); 

		List<Persona> personas = query.getResultList();
		for(Persona p : personas)
		{
			System.out.println(p);
		}		
	}
}