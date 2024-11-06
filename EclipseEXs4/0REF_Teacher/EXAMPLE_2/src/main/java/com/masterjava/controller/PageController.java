package com.masterjava.controller;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;


/**
* Clase PageController
* @author Manuel Portal
* @version 4.3.3, 30 oct 2024
*/

@Controller
public class PageController {

	@GetMapping("/")
	public String mostrarIndex(){
		return "index";
	}

	@GetMapping("/pg2")
	public String mostrarPagina2(){
		return "page2";
	}
}