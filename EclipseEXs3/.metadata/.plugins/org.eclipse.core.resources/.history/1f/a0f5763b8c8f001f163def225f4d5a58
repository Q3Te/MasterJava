package com.masterjava.connection;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

/**
* Clase ConnectionBDD
* @author Manuel Portal
* @version 4.3.3, 21 oct 2024
*/
public class ConnectionBDD {
	private static final String URL = "jdbc:mysql://localhost:3306/bdd_ex1_empresa";
	private static final String USER = "root";
	private static final String PWD = "ROOT";
	
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
