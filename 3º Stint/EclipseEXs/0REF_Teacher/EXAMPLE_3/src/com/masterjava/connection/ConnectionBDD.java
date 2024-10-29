package com.masterjava.connection;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

/**
* Clase ConnectionBDD
* @author Manuel Portal
* @version 4.3.3, 21 Oct 2024
*/
public class ConnectionBDD {
	private static final String URL = "jdbc:mysql://localhost:3306/bdd_example_3";
	private static final String USER = "root";
	private static final String PWD = "Root";
	
	public Connection conexion() {
		Connection conex = null;		
		try{
			conex = DriverManager.getConnection(URL, USER, PWD);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return conex;		
	}
}