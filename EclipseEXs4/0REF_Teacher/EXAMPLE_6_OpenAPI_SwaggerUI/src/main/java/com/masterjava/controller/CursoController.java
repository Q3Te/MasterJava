package com.masterjava.controller;
	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masterjava.modelos.Curso;
import com.masterjava.service.CursoService;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Cursos", description = "La API de cursos")
@RestController
@RequestMapping("/api/recursos") 
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	
	@GetMapping(value="cursos", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> Cursos() {
	    return cursoService.Cursos();
	}

	@GetMapping(value="cursos/{codCurso}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Curso buscarCurso(@PathVariable int codCurso) {
		return cursoService.buscarCurso(codCurso);
	}
	
	@PostMapping(value="cursos", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void altaCurso(@RequestBody Curso curso) {
		cursoService.altaCurso(curso);
	}
	
	
	@PutMapping(value="cursos", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizarCurso(@RequestBody Curso curso) {
		cursoService.actualizarCurso(curso);
	}
	
	@DeleteMapping(value="cursos/{codCurso}", produces=MediaType.APPLICATION_JSON_VALUE)
		public List<Curso> eliminarCurso(@PathVariable int codCurso){
			return cursoService.eliminarCurso(codCurso);
	}
	
	@GetMapping(value="cursos/precio/{precioMin}/{precioMax}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> cursosPorPrecio(@PathVariable int precioMin, @PathVariable int precioMax) {
	    return cursoService.cursosPorPrecio(precioMin, precioMax);
	}
	
	// BELONGS TO CursosRepository
	@GetMapping(value="cursosnombre/{nombre}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> findByNombre (@PathVariable String nombre){
		return cursoService.findByNombre(nombre);
	}
	
	// BELONGS TO CursosRepository
	@GetMapping(value="cursosprecio/{precioMin}/{precioMax}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> findByPrecioBetween(@PathVariable int precioMin,  @PathVariable int precioMax){
		return cursoService.findByPrecioBetween(precioMin,precioMax);
	}
}