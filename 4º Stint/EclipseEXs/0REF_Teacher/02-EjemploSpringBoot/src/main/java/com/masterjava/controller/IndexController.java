package com.masterjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/pag2")
	public String mostrarPagina2() {
		return "pagina2";
	}
}
