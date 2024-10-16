package com.masterjava.modelos;

/**
* Clase Perfil
* @author
* @version 4.3.3, 14 oct 2024
*/
public class Perfil {
	private String nombre;
	private String password;
	private String correo;
	private int edad;
	
	public Perfil(String nombre, String password) {
		super();
		this.nombre = nombre;
		this.password = password;
	}

	public Perfil(String nombre, String password, String correo, int edad) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.correo = correo;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
