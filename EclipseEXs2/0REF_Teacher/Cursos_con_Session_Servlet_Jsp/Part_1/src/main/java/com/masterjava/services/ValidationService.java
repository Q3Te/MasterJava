package com.masterjava.services;

import java.util.ArrayList;
import java.util.List;

import com.masterjava.modelos.Curso;

public class ValidationService {
	public List<Curso> buscarTodos(){
		Curso c1= new Curso("Mates", 1);
		Curso c2= new Curso("Lengua", 2);
		Curso c3= new Curso("Literatura", 3);
		
		List<Curso> listaCursos = new ArrayList <Curso>();
		listaCursos.add(c1);
		listaCursos.add(c2);
		listaCursos.add(c3);
		
		return listaCursos;
	}
}
