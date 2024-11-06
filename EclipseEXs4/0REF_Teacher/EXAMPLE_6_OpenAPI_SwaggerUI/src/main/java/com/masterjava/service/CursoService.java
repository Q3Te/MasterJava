package com.masterjava.service;
	import java.util.List;
	import com.masterjava.modelos.Curso;

public interface CursoService {
	public List<Curso> Cursos();
	public Curso buscarCurso(int codCurso);
	public void altaCurso(Curso curso);
	public void actualizarCurso(Curso curso);
	public List<Curso> eliminarCurso(int codCurso);
	public List<Curso> cursosPorPrecio(int precioMin, int precioMax);
	List<Curso> findByNombre (String nombre);//Method found in CursoRepository
	List<Curso> findByPrecioBetween(int precioMin, int precioMax);//Method found in CursoRepository
	
}
