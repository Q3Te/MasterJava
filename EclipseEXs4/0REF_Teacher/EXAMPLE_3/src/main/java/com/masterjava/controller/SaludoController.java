package com.masterjava.controller;
	import org.springframework.http.MediaType;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;
	import com.masterjava.model.Info;

@RestController
public class SaludoController {

	@GetMapping(value = "saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludar() {
		return "Hola desde Spring Boot";
	}

	@GetMapping(value = "saludo/{nombre}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludarPersona(@PathVariable String nombre) {
		return "Hola desde Spring Boot "+nombre;
	}

	@GetMapping(value = "saludo2/{nombre}/{edad}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludar(@PathVariable  String nombre, @PathVariable  int edad) {
		return "Hola "+nombre+" tienes "+edad+" años.";
	}

	@GetMapping(value = "/infoCliente", produces = MediaType.TEXT_PLAIN_VALUE)
	public String informacion() {
	    Info info = new Info("Xxx", 20, "xxyy@mail_provider.com");
	    return "Nombre: " + info.getNombre() + ", Edad: " + info.getEdad() + ", Email: " + info.getEmail();
	}

}