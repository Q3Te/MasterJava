package com.masterjava.service;
	import java.util.List;
	import java.util.stream.Collectors;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import com.masterjava.modelos.Empleado;
	import com.masterjava.repository.EmpleadosRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	@Autowired
	EmpleadosRepository repository;
	
	@Override
	public List<Empleado> Empleados() {
		return repository.findAll();
	}

	@Override
	public Empleado buscarEmpleado(int idEmpleado) {
		return repository.findById(idEmpleado).orElse(null);
	}

	@Override
	public void altaEmpleado(Empleado empleado) {
		repository.save(empleado);	
	}

	@Override
	public void actualizarEmpleado(Empleado empleado) {
		repository.save(empleado);
	}

	@Override
	public List<Empleado> eliminarEmpleado(int idEmpleado) {
		repository.deleteById(idEmpleado);  	
		return repository.findAll();
	}

	@Override
	public List<Empleado> empleadosPorCorreo(String email) {
	    return repository.findAll().stream()
	            .filter(empleado -> empleado.getEmail().equalsIgnoreCase(email))
	            .collect(Collectors.toList());
	}

	//BELONGS TO EmpleadosRepository
//	@Override
//	public List<Empleado> findByNombre (String nombre) {
//		
//		return repository.findByNombre(nombre);
//	}
	@Override
	public List<Empleado> findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	//BELONGS TO EmpleadosRepository
	@Override
	public List<Empleado> findByIdEmpleadoBetween(int idEmpleado1, int idEmpleado2) {
		return repository.findByIdEmpleadoBetween(idEmpleado1, idEmpleado2);
	}

	

}
