package com.masterjava.services;

import java.util.ArrayList;
import java.util.List;

import com.masterjava.modelos.Curso;

public class ValidationService {
	 private static List<Curso> listaCursos = new ArrayList<Curso>();
	 
	 static {
	 		Curso c1=new Curso("ComputerScience",10);
	 		Curso c2=new Curso("InformationTechnology",9);
	 		Curso c3=new Curso("Industrial Enginereering",5);
	 		
	 		listaCursos.add(c1);
	 		listaCursos.add(c2);
	 		listaCursos.add(c3);
	 		}
	 		
	 public List<Curso> buscarTodos(){		
		return listaCursos;
	  }
	  
	 public Curso buscarUno(String nombre){
	 	for(Curso c:listaCursos)
	 	{
	 		if(c.getNombre().equals(nombre))
	 		{
	 			return c;
	 		}
	 	}
	 	return null;
	  }
}