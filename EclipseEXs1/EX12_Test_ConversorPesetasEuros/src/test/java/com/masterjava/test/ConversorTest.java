package com.masterjava.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.masterjava.modelos.Conversor;

class ConversorTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

	@Test
	void cambioMonedaPesetaEuro() {
		//Arrange
		Conversor operacion = new Conversor();
		
		//Act
		double pesetaEuro=operacion.pesetasEuros(33277.20);
		
		//Assert
		assertEquals(200.00,pesetaEuro);
		assertEquals(200.00,pesetaEuro,3.50);
	}	
	
	@Test
	void cambioMonedaEuroPeseta() {
		//Arrange
		Conversor operacion = new Conversor();
		
		//Act
		double euroPeseta=operacion.eurosPesetas(200.00);
		
		//Assert
		assertEquals(33277200.00,euroPeseta);
		assertEquals(33277200.00,euroPeseta,3.50);
	}
}