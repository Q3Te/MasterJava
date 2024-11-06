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

import com.masterjava.modelos.Empleado;
import com.masterjava.service.EmpleadoService;

import io.swagger.v3.oas.annotations.tags.Tag;

/**
* Clase EmpleadoController
* @author Manuel Portal
* @version 4.3.3, 4 Nov 2024
*/

@Tag(name = "Empleados", description = "La API de empleados")
@RestController
@RequestMapping("/api/recursos") 
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping(value="empleados", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Empleado> Empleados() {
	    return empleadoService.Empleados();
	}

	@GetMapping(value="empleados/{idEmpleado}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Empleado buscarEmpleado(@PathVariable int idEmpleado) {
		return empleadoService.buscarEmpleado(idEmpleado);
	}
	
//	@PostMapping(value="empleados", consumes=MediaType.APPLICATION_JSON_VALUE) //Wrong
//	public void altaEmpleado(@RequestBody Empleado empleado) {
//		empleadoService.altaEmpleado(empleado);
//	}
	
	
//	@PutMapping(value="empleados", consumes=MediaType.APPLICATION_JSON_VALUE)	//Wrong
//	public void actualizarEmpleado(@RequestBody Empleado empleado) {
//		empleadoService.actualizarEmpleado(empleado);
//	}
	
	@DeleteMapping(value="empleados/{idEmpleado}", produces=MediaType.APPLICATION_JSON_VALUE)
		public List<Empleado> eliminarEmpleado(@PathVariable int idEmpleado){
			return empleadoService.eliminarEmpleado(idEmpleado);
	}
	
	@GetMapping(value="empleados/correo/{email}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Empleado> empleadosPorCorreo(@PathVariable String email) {
	    return empleadoService.empleadosPorCorreo(email);
	}
	
//	// BELONGS TO CursosRepository
//	@GetMapping(value="empleadospornombre/{nombre}", produces=MediaType.APPLICATION_JSON_VALUE)		//Wrong
//	public List<Empleado> findByNombre (@PathVariable String nombre){
//		return empleadoService.findByNombre(nombre);
//	}
	
	// BELONGS TO CursosRepository
	@GetMapping(value="empleadosfindbyid/{idEmpleado1}/{idEmpleado2}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Empleado> findByIdEmpleadoBetween(@PathVariable int idEmpleado1,  @PathVariable int idEmpleado2){
		return empleadoService.findByIdEmpleadoBetween(idEmpleado1,idEmpleado2);
	}
}
