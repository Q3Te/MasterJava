package com.masterjava.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.masterjava.modelos.AsignaturaNota;

class AsignaturaNotaTest1 {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

	@Test
	void esMismaAsignaturaTest() {
		//Arrange
		AsignaturaNota nota1 = new AsignaturaNota("Mates",8);
		AsignaturaNota nota2 = new AsignaturaNota("Informática",10);
		AsignaturaNota nota3 = new AsignaturaNota("Tecnología",9);
		
		//Act
		boolean esMisma = nota1.esMismaAsignatura(nota2);
		boolean esDistinta = nota1.esMismaAsignatura(nota3);
	
		//Assert
		assertFalse(esMisma); //Was initially assertTrue giving [ AssertionFailedError: expected: <true> but was: <false>]


		
		// assertTrue (nota1.esMismaAsignatura(nota2)
		assertFalse(esDistinta);
	}
	
	@Test
	void testIgualdadNotasTest() {
		AsignaturaNota nota1 = new AsignaturaNota("Matemáticas",7);
		AsignaturaNota nota2 = new AsignaturaNota("Matemáticas",7);
		
		boolean iguales = nota1.equals(nota2);
		
		assertTrue(iguales);
	}
	
	@Test
	void NoIgualdadNotasTest() {
		AsignaturaNota nota1 = new AsignaturaNota("lengua",8);
		AsignaturaNota nota2 = new AsignaturaNota("lengua",9);
		
		boolean NoIguales = nota1.equals(nota2);
		
		assertFalse(NoIguales);
	}
	
	@Test
	void NotaNoEsMayorOtraTest() {
		AsignaturaNota nota1 = new AsignaturaNota("Lengua",8);
		AsignaturaNota nota2 = new AsignaturaNota("Sociales",8);
		
		assertThrows(RuntimeException.class,()->nota1.esMayor(nota2));
	}
}