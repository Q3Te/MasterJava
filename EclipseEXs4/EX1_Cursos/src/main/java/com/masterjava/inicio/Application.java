package com.masterjava.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages={ "com.masterjava.controller", "com.masterjava.service"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	// http://localhost:8080/
//	{
//	    "codCurso": 6,
//	    "nombre": "Historia",
//	    "duracionCurso": 300,
//	    "precio": 150
//	}




}
