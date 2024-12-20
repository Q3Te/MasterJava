package com.masterjava.service;
	import java.util.List;

import com.masterjava.modelos.Curso;

public interface CursoService {
	public void altaCurso(Curso curso);
	public List<Curso> eliminarCurso(int codCurso);
	public void actualizarCurso(Curso curso);
	public Curso buscarCurso(int codCurso);
	public List<Curso> cursosPorPrecio(int precioMin, int precioMax);
	public List<Curso> mostrarCursos();

}
