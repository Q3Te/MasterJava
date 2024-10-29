package com.masterjava.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.masterjava.modelos.AsignaturaNota;

class AsignaturaNotaTest2 {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	AsignaturaNota nota1 = null;
	AsignaturaNota nota2 = null;
	AsignaturaNota nota3  = null;
	AsignaturaNota nota4 = null;
	AsignaturaNota nota5 = null;

	@BeforeEach
	public void setup() {
	 nota1 = new AsignaturaNota("lengua",8);
	 nota2 = new AsignaturaNota("lengua",7);
	 nota3 = new AsignaturaNota("Sociales",9);
	 nota4 = new AsignaturaNota("lengua",8);
	 nota5 = new AsignaturaNota("sociales",8);
	
	}
	@Test
	void esMismaAsignaturaTest() {
		assertTrue(nota1.esMismaAsignatura(nota4));
		assertFalse(nota3.esMismaAsignatura(nota4));
	}
	
	@Test
	void testIgualdadNotasTest() {
		assertTrue( nota1.equals(nota5));	
	}
	
	@Test
	void NoIgualdadNotasTest() {
		assertFalse(nota1.equals(nota2));	
	}
	
	@Test
	void NotaNoEsMayorOtraTest() {
		assertThrows(RuntimeException.class,()->nota1.esMayor(nota3));
	}
}