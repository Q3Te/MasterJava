package com.masterjava.service;
	import java.util.List;

import com.masterjava.modelos.Empleado;

public interface EmpleadoService {
	public List<Empleado> Empleados();
	public Empleado buscarEmpleado(int idEmpleado);
	public void altaEmpleado(Empleado empleado);
	public void actualizarEmpleado(Empleado empleado);
	public List<Empleado> eliminarEmpleado(int idEmpleado);
	public List<Empleado> empleadosPorCorreo(String email);
	List<Empleado> findByNombre (String nombre);//Method found in EmpleadoRepository
	List<Empleado> findByIdEmpleadoBetween(int idEmpleado1, int idEmpleado2);//Method found in EmpleadoRepository
}
