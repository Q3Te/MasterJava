package com.masterjava.repository;
	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.masterjava.modelos.Curso;

public interface CursosRepository extends JpaRepository<Curso, Integer>{
//	@Query("SELECT c from Curso c WHERE c.nombre = :nombre")
//	List<Curso> findByNombre (String nombre);
	
	@Query("SELECT c from Curso c WHERE c.precio BETWEEN :precioMin AND :precioMax")
//	List<Curso> findByPrecioBetween(int precioMin, int precioMax);
	List<Curso> findByPrecioBetween(@Param("precioMin")int precioMin, @Param("precioMax")int precioMax);
}