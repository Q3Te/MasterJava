package com.masterjava.bdd;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

public class Insert {

public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3306/bdd_example_1";
	String user = "root";
	String pwd = "Root";
	String query = "INSERT INTO personas (nombre,apellido,edad) VALUES('Xxx','Yyy','20')";
		
	try{
		Connection conexion	= DriverManager.getConnection(url, user, pwd);
		System.out.println("Conexión con la BD establecida");
		Statement sentencia= conexion.createStatement();
		sentencia.executeUpdate(query);
		System.out.println("Registro insertado");
	}catch(SQLException e){
		e.printStackTrace();
	}
	
 }
}