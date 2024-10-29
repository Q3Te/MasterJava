package com.masterjava.modelos;

import java.util.Objects;

/**
*Clase AsignaturaNota
*@author Manuel Portal
*@version 4.33.0, 2 oct 2024
*/
public class AsignaturaNota {
	private String asignatura;
	private double nota;

	public AsignaturaNota() {
		super();
	}
	
	public AsignaturaNota(String asignatura, double nota) {
		super();
		this.asignatura = asignatura;
		this.nota = nota;
	}
	
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	public String getAsignatura() {
		return asignatura;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public double getNota() {
		return nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(asignatura, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AsignaturaNota other = (AsignaturaNota) obj;
		return Objects.equals(asignatura, other.asignatura)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}

	public boolean esMismaAsignatura(AsignaturaNota otra) {
		if(this.getAsignatura().equals(otra.getAsignatura()))
		{
			return true;
		}
		else
		{
			return false;
		}	
	}

	public boolean esMayor(AsignaturaNota otra) {
		if(this.esMismaAsignatura(otra))
		{
			if(this.getAsignatura().equals(otra.getAsignatura()))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			throw new RuntimeException("Las notas no son comparables porque no son de la misma asignatura");
		}
	}
}