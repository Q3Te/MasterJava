package com.masterjava.modelos;
	import java.util.Objects;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.NamedQueries;
	import jakarta.persistence.NamedQuery;
/**
* Clase Persona
* @author Manuel Portal
* @version 4.3.3, 28 Oct 2024
*/


@Entity
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findById", query = "SELECT p FROM Persona p WHERE p.id = :id"),
    @NamedQuery(name = "Persona.findByApellido1", query = "SELECT p FROM Persona p WHERE p.apellido1 = :apellido1"),
    @NamedQuery(name = "Persona.findByApellido1AndApellido2", query = "SELECT p FROM Persona p WHERE p.apellido1 = :apellido1 AND p.apellido2 = :apellido2") 
})
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;

    public Persona() {
    	super();
    }

    public Persona(String nombre, String apellido1, String apellido2, String telefono) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
    }

    public int getId(){ 
    	return id;
    }
    
    public void setId(int id){
    	this.id = id; 
    }

    public String getNombre(){
    	return nombre;
    }
    
    public void setNombre(String nombre){ 
    	this.nombre = nombre;
    }

    public String getApellido1(){ 
    	return apellido1;
    }
    
    public void setApellido1(String apellido1){
    	this.apellido1 = apellido1;
    }

    public String getApellido2(){ 
    	return apellido2;
    }
    
    public void setApellido2(String apellido2){
    	this.apellido2 = apellido2;
    }

    public String getTelefono(){ 
    	return telefono;
    }
    
    public void setTelefono(String telefono){
    	this.telefono = telefono;
    }
   
    @Override
	public int hashCode() {
		return Objects.hash(telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(telefono, other.telefono);
	}
	
	//Manual HashCode & Equals de Telefono
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + telefono;
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Persona other = (Persona) obj;
//		if (telefono != other.telefono)
//			return false;
//		return true;
//	}

	@Override
    public String toString() {
        return "Persona con nombre ["+nombre+"], apellido1 ["+apellido1+"], apellido2 ["+apellido2+"]  y telefono ["+telefono+"]";
    }
}