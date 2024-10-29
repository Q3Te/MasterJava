package com.masterjava.crud;
	import java.sql.Connection;
	import java.sql.SQLException;
	import java.sql.Statement;
	import com.masterjava.connection.ConnectionBDD;

public class Delete {

public static void main(String[] args) {
	Connection conex = null;
	String query = "DELETE FROM personas WHERE nombre='TestName'";
	ConnectionBDD cbd = new ConnectionBDD();
	conex =cbd.conexion();
	if(conex!=null)
	{
		System.out.println("Conectado correctamente");			
		try(Statement sentencia = conex.createStatement()){				
			if(sentencia.executeUpdate(query)>0)
			{
				System.out.println("Registro eliminado");
			}
			else
			{
				System.out.println("Ningún registro cumple la condición");
			}		
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