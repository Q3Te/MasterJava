package com.masterjava.repository;
	import java.util.List;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.Query;
	import org.springframework.data.repository.query.Param;
	import com.masterjava.modelos.Empleado;


public interface EmpleadosRepository extends JpaRepository<Empleado, Integer>{
//	@Query("SELECT e from Empleado e WHERE e.nombre = :nombre")
//	List<Empleado> findByNombre (String nombre);
	
	@Query("SELECT e from Empleado e WHERE e.idEmpleado BETWEEN :idEmpleado1 AND :idEmpleado2")
//	List<Empleado> findByIdEmpleadoBetween(int precioMin, int precioMax);
	List<Empleado> findByIdEmpleadoBetween(@Param("idEmpleado1")int idEmpleado1, @Param("idEmpleado2")int idEmpleado2);
}
