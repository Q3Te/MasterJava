package com.masterjava.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

	public static void main(String[] args) {

		// CREAR UN CONTEXTO
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext();
		// REGISTRAR LOS FICHEROS DE ANOTACIONES
		contexto.register(SpringConfigurador.class);
		// REFRESCAR EL CONTEXTO
		contexto.refresh();

		Servicio servicio = contexto.getBean(Servicio.class);
		System.out.println(servicio.mensaje());

		contexto.close();

	}

}
