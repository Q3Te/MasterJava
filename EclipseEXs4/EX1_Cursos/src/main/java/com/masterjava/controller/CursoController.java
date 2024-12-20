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
	import org.springframework.web.bind.annotation.RestController;
	import com.masterjava.modelos.Curso;
	import com.masterjava.service.CursoService;

@RestController
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	
	@GetMapping(value="cursos", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> getAllCursos() {
	    return cursoService.mostrarCursos();
	}

	
	@GetMapping(value="cursos/precio/{precioMin}/{precioMax}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> cursosPorPrecio(@PathVariable int precioMin, @PathVariable int precioMax) {
	    return cursoService.cursosPorPrecio(precioMin, precioMax);
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
}