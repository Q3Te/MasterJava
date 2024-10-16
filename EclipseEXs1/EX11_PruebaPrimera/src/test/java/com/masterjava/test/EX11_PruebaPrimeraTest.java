package com.masterjava.test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.masterjava.modelos.Coche;
import com.masterjava.modelos.Moto;

/**
*JUnitTest EX11_PruebaPrimeraTest
*@author Manuel Portal
*@version 4.33.0, 30 sept 2024
*/
class EX11_PruebaPrimeraTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
//	
	@Test
	void avanzarCocheTest(){
		Coche testCoche1 = new Coche("9462 DFA","Verde");
		double tiempoEnMins = testCoche1.avanzar(350, 120);
		assertEquals(175.0,tiempoEnMins);
	}
	
	@Test
	void avanzarMotoTest(){
		Moto testMoto1 = new Moto("9462 DFA","Verde");
		double tiempoEnMins = testMoto1.avanzar(30, 120);
		assertEquals(15.0,tiempoEnMins);
	}
}