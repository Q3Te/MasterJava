package com.masterjava.services;

import java.util.List;

import com.masterjava.modelos.Perfil;

public class ValidationService {
	List<Perfil> perfil=List.of(
			new Perfil("admin","validationTestPassword","admin1@eclipseIDE.com",25),
			new Perfil ("Manuel","Qwerty019","mmsqs67@gmail.com",23));
	
	public Perfil autenticar(String nombre, String password ) {
		return perfil.stream()
				.filter(x->x.getNombre().equals(nombre) &&  x.getPassword().equals(password)).findFirst().orElse(null);
	}
}
