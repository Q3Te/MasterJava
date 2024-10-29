package com.masterjava.crud;
	import java.sql.Connection;
	import java.sql.SQLException;
	import java.sql.Statement;
	import com.masterjava.connection.ConnectionBDD;

public class Insert {

public static void main(String[] args) {
	Connection conex = null;
	String query = "INSERT INTO personas (nombre,apellido,edad) VALUES('TestName','TestSurname',21)";
	ConnectionBDD cbd = new ConnectionBDD();
	conex =cbd.conexion();
	if(conex!=null)
	{
		System.out.println("Conectado correctamente");			
		try (Statement sentencia = conex.createStatement()){				
			sentencia.executeUpdate(query);
			System.out.println("Registro insertado");
		}catch(SQLException e){
			e.printStackTrace();
		}						
	}
	else
	{
		System.out.println("No se ha podido conectar");			
	}
	
 }		
}