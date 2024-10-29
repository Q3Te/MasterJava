package com.masterjava.generator;
	import jakarta.persistence.Persistence;

public class Generator {

public static void main(String[] args) {
		Persistence.generateSchema("Biblioteca", null);
 }
}