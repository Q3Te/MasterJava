package com.masterjava.junittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.masterjava.enums.Categoria;
import com.masterjava.modelos.Producto;

class ProductoJUnitTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void esMismoNombreProductoTest() {
		//Arrange 
		 Producto p1=new Producto("Chocolate",3.41,100,Categoria.DULCES);
		 Producto p2=new Producto("Camiseta",39.99,100,Categoria.ROPA);
		 Producto p3=new Producto("Cafe",1.00,100,Categoria.BEBIDAS);
		 Producto p4=new Producto("ProductoACambiar",10.00,100,Categoria.MUEBLES);
		 
		 //Act
		boolean nombreProductoEsIgual1 = p1.esMismoNombreProducto(p1);
		boolean nombreProductoEsIgual2 = p1.esMismoNombreProducto(p2);
			
		//Assert
		assertTrue(nombreProductoEsIgual1);
		assertFalse(nombreProductoEsIgual2); 
	}
	
	@Test
	void esMismoStockProductoTest() {
		//Arrange 
		 Producto p1=new Producto("Chocolate",3.41,100,Categoria.DULCES);
		 Producto p2=new Producto("Camiseta",39.99,100,Categoria.ROPA);
		 Producto p3=new Producto("Cafe",1.00,99,Categoria.BEBIDAS);
		 Producto p4=new Producto("ProductoACambiar",10.00,100,Categoria.MUEBLES);
		 
		 //Act
		boolean stockProductoEsIgual1 = p1.esMismoStockProducto(p1);
		boolean stockProductoEsIgual2 = p1.esMismoStockProducto(p3);
		boolean stockProductoNoEsIgual = p1.esMismoStockProducto(p2);
			
		//Assert
		assertTrue(stockProductoEsIgual1);
		assertTrue(stockProductoNoEsIgual); 
		assertFalse(stockProductoEsIgual2);
	}
	
	@Test
	void esCantidadVentaTotalUnSoloProductoEsperadoTest() {
		//Arrange 
		 Producto p1=new Producto("Chocolate",3.41,42,Categoria.DULCES);
		 Producto p2=new Producto("Camiseta",39.99,12,Categoria.ROPA);
		 Producto p3=new Producto("Cafe",1.00,99,Categoria.BEBIDAS);
		 Producto p4=new Producto("ProductoACambiar",10.00,100,Categoria.MUEBLES);
		 
		//Act
		double operacion1=p1.esCantidadVentaTotalUnSoloProductoEsperado(3.41,42);
		double operacion2=p3.esCantidadVentaTotalUnSoloProductoEsperado(1.00,99);
		
		double operacion3=p2.esCantidadVentaTotalUnSoloProductoEsperado(39.99,12);
		double operacion4=p2.esCantidadVentaTotalUnSoloProductoEsperado(39.98,12);
			
		//Assert
		assertEquals(143.22,operacion1);
		assertEquals(99.00,operacion2);
		
		assertEquals(479.88,operacion3); //XQ queremos que sea estrictamente €479.88, NO se  acepta no +-0.01
		assertEquals(479.88, operacion4,0.121); //XQ no queremos que sea estrictamente €479.88, se acepta no +-0.12 y como da €479.760 pues estaría bien
	}
}