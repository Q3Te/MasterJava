package com.masterjava.modelos;
	import java.util.Objects;
	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

@Entity
@Table(name="cursos")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_curso")
	private int codCurso;
	
	private String nombre;
	@Column(name = "duracion_curso")
	private int duracionCurso;
	private int precio;
	
	public Curso() {
		super();
	}

	public Curso(int codCurso, String nombre, int duracionCurso, int precio) {
		super();
		this.codCurso = codCurso;
		this.nombre = nombre;
		this.duracionCurso = duracionCurso;
		this.precio = precio;
	}

	public int getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracionCurso() {
		return duracionCurso;
	}

	public void setDuracionCurso(int duracionCurso) {
		this.duracionCurso = duracionCurso;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codCurso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return codCurso == other.codCurso;
	}

	@Override
	public String toString() {
		return "Curso [codCurso=" + codCurso + ", nombre=" + nombre + ", duracionCurso=" + duracionCurso + ", precio="	+ precio + "]";
	}	
}
