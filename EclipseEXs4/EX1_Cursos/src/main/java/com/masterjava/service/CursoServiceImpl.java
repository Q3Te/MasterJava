package com.masterjava.service;
	import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.masterjava.modelos.Curso;

@Service
public class CursoServiceImpl implements CursoService{	
	private List<Curso> cursos;
	
    public CursoServiceImpl() {
    	cursos = new ArrayList<>(List.of(
                new Curso(1, "Informática", 250, 196),
                new Curso(2, "Lengua", 400, 120),
                new Curso(3, "Matemáticas", 500, 110),
                new Curso(4, "Ciencias", 475, 90),
                new Curso(5, "Artes", 180, 180)
        ));
    }
    
	@Override
	public List<Curso> mostrarCursos() {
	    return cursos;
	}
    
	@Override
	public void altaCurso(Curso curso) {
		if(!cursos.contains(curso))
		{
			cursos.add(curso);
		}		
	}
	
//    @Override
//    public void altaCurso(Curso curso) {
//        cursos.add(curso);
//    }
//    

	@Override
	public List<Curso> eliminarCurso(int codCurso) {
		cursos.removeIf(curso -> curso.getCodCurso()==codCurso);
		return cursos;
	}

	@Override
	public void actualizarCurso(Curso curso) {
		Curso cur = buscarCurso(curso.getCodCurso());
		if(cur!=null)
		{
			cur.setDuracionCurso(curso.getDuracionCurso());
		}
	}
	
	@Override
	public Curso buscarCurso(int codCurso) {
		return cursos.stream()
		.filter(curso -> curso.getCodCurso() == codCurso)
		.findFirst()
		.orElse(null);
	}
	
//    @Override
//    public Curso buscarCurso(int codCurso) {
//        for(Curso curso : cursos)
//        {
//            if(curso.getCodCurso() == codCurso)
//            {
//                return curso;
//            }
//        }
//        return null;
//    }
    

	@Override
	public List<Curso> cursosPorPrecio(int precioMin, int precioMax) {
	    return cursos.stream()
	            .filter(curso -> curso.getPrecio() >= precioMin && curso.getPrecio() <= precioMax)
	            .collect(Collectors.toList());
	}

	
//	@Override
//	public List<Curso> cursosPorPrecio(int precioMin, int precioMax) {
//	    List<Curso> cursosFiltrados = new ArrayList<>();
//	    for(Curso curso : cursos)
//	    {
//	        if(curso.getPrecio() >= precioMin && curso.getPrecio() <= precioMax)
//	        {
//	            cursosFiltrados.add(curso);
//	        }
//	    }
//	    return cursosFiltrados;
//	}


}
