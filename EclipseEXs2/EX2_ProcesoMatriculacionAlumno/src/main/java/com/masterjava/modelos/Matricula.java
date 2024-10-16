package com.masterjava.modelos;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
* Clase Matricula
* @author
* @version 4.3.3, 8 oct 2024
*/
public class Matricula {
	private String nombre;
	private String asignatura;
	private static List<String> cursos = new ArrayList<>();

	public Matricula() {
		super();
	}

	public Matricula(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
//------------------------------------------------------------------------------------//
	
	public static  void addCurso(String curso) {
		cursos.add(curso);
	}
	
	public static List<String>getCursos() {
		return cursos;
	}
	
	public static void visualizarListaCursos(PrintWriter out) {  //PRINTING IN SERVLETS IS WITH PrintWriter 
	    List<String> cursos = Matricula.getCursos();
	    for(String curso : cursos)
	    {
	    	out.println(curso);
	    }
	}

}