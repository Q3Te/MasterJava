package com.masterjava.crud;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

public class Insert {

public static void main(String[] args) {
	// private static final String URL = "jdbc:mysql://localhost:3306/bdd_example_2"; // Pensar si esto sería mejor
	
	String url = "jdbc:mysql://localhost:3306/bdd_example_2";
	String user = "root";
	String pwd = "Root";
	String query = "INSERT INTO personas (nombre,apellido,edad) VALUES('Xxx','Yyy',20)";
	
	try(Connection conexion = DriverManager.getConnection(url, user, pwd);
		Statement sentencia = conexion.createStatement();){
		sentencia.executeUpdate(query);
		// System.out.println("Eco de sentencia.executeUpdate(query)= " +
		// sentencia.executeUpdate(query));
		System.out.println("Registro insertado");
	}catch(SQLException e){
		e.printStackTrace();
	}
		
 }
}