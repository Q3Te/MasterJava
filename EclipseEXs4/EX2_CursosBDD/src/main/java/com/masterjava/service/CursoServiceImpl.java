package com.masterjava.service;
	import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masterjava.modelos.Curso;
import com.masterjava.repository.CursosRepository;

@Service
public class CursoServiceImpl implements CursoService{

	@Autowired
	CursosRepository repository;

	@Override
	public List<Curso> Cursos() {
		return repository.findAll();
	}
	
	@Override
	public Curso buscarCurso(int codCurso) {
		return repository.findById(codCurso).orElse(null);
	}
	
	@Override
	public void altaCurso(Curso curso) {
		repository.save(curso);
	}
	
	@Override
	public void actualizarCurso(Curso curso) {
		repository.save(curso);
	}
	
	@Override
	public List<Curso> eliminarCurso(int codCurso) {
		repository.deleteById(codCurso);  	
		return repository.findAll();
	}

	@Override
	public List<Curso> cursosPorPrecio(int precioMin, int precioMax) {
	    return repository.findAll().stream()
	            .filter(curso -> curso.getPrecio() >= precioMin && curso.getPrecio() <= precioMax)
	            .collect(Collectors.toList());
	}
	
	//BELONGS TO CursosRepository
//	@Override
//	public List<Curso> findByNombre (String nombre) {
//		
//		return repository.findByNombre(nombre);
//	}
	@Override
	public List<Curso> findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	//BELONGS TO CursosRepository
	@Override
	public List<Curso> findByPrecioBetween(int precioMin, int precioMax) {
		return repository.findByPrecioBetween(precioMin, precioMax);
	}


}
