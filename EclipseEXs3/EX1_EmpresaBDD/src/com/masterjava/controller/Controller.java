package com.masterjava.controller;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.time.LocalDate;
	import com.masterjava.connection.ConnectionBDD;

/**
* Clase Controller
* @author Manuel Portal
* @version 4.3.3, 21 oct 2024
*/
public class Controller {

	public static void annadirEmpleadoBackend(int idEmpleado, String nombre, String apellido1, String apellido2,LocalDate fechaNacimiento, int salario) {
		Connection conex = null;
		String query = "INSERT INTO empleados (idEmpleado,nombre,apellido1,apellido2,fechaNacimiento,salario) VALUES(?,?,?,?,?,?)";
		ConnectionBDD cbd = new ConnectionBDD();
		conex =cbd.conexion();
		if(conex!=null)
		{			
			try(PreparedStatement sentencia = conex.prepareStatement(query)){				
		        sentencia.setInt(1, idEmpleado);
		        sentencia.setString(2, nombre);
		        sentencia.setString(3, apellido1);
				sentencia.setString(4, apellido2);
		        sentencia.setDate(5, java.sql.Date.valueOf(fechaNacimiento)); //Cambia nuestro input con su formato de Date tipo java a formato de Date tipo sql
		        sentencia.setInt(6, salario);
		        sentencia.executeUpdate();
				System.out.println("Registro insertado");
			}catch(SQLException e){
				e.printStackTrace();
			}						
		}
		else
		{
			System.out.println("No se ha podido conectar");			
		}
		
	//	try(Statement sentencia = conex.createStatement()){				
	//	sentencia.executeUpdate(query);
	//	System.out.println("Registro insertado");
	}
	
	public static boolean buscarEmpleado(int idEmpleado) {
	    Connection conex = null;
	    String query = "SELECT * FROM empleados WHERE idEmpleado = ?";
	    ConnectionBDD cbd = new ConnectionBDD();
	    conex = cbd.conexion();
	    if(conex != null)
	    {
	        try(PreparedStatement sentencia = conex.prepareStatement(query))
	        {
	            sentencia.setInt(1, idEmpleado);
	            ResultSet resultado = sentencia.executeQuery();
	            if(resultado.next())
	            {
	                return true; // Empleado encontrado
	            }
	            else
	            {
	                return false; // Empleado no encontrado
	            }
	        }catch(SQLException e){
	            e.printStackTrace();
	            return false; // Error buscar empleado
	        }
	    }
	    else
	    {
	        System.out.println("No se ha podido conectar");
	        return false; // Error - conectar bdd
	    }
	}
	
	public static void modificarDatosEmpleado(String nombre, String apellido1, String apellido2,LocalDate fechaNacimiento, int salario, int idEmpleado) {
		Connection conex = null;
		String query = "UPDATE empleados SET nombre = ?, apellido1 = ?, apellido2 = ?, fechaNacimiento = ?, salario = ? WHERE idEmpleado = ?";
	
		ConnectionBDD cbd = new ConnectionBDD();
		conex =cbd.conexion();
		if(conex!=null)
		{			
			try(PreparedStatement sentencia = conex.prepareStatement(query)){				
		        sentencia.setString(1, nombre);
		        sentencia.setString(2, apellido1);
		        sentencia.setString(3, apellido2);
				sentencia.setDate(4, java.sql.Date.valueOf(fechaNacimiento));  //Cambia nuestro input con su formato de Date tipo java a formato de Date tipo sql
		        sentencia.setInt(5, salario);
		        sentencia.setInt(6, idEmpleado);
		        sentencia.executeUpdate();
				System.out.println("Empleado Modificado Correctamento");
			}catch(SQLException e){
				e.printStackTrace();
			}						
		}
		else
		{
			System.out.println("No se ha podido conectar");			
		}
	
	}
	
	public static void listEmpleadosConInfo() {
		Connection conex = null;
		String query = "SELECT * FROM empleados";
		ConnectionBDD cbd = new ConnectionBDD();
		conex =cbd.conexion();
		if(conex!=null)
		{		
			try(Statement sentencia	= conex.createStatement()){
				ResultSet rs = sentencia.executeQuery(query);
				while (rs.next())
				{
					System.out.print(rs.getString("idEmpleado") +" ");
					System.out.print(rs.getString("nombre") +" ");
					System.out.print(rs.getString("apellido1") +" ");
					System.out.print(rs.getString("apellido2") +" ");
					System.out.print(rs.getDate("fechaNacimiento") + " ");
					System.out.println(rs.getInt("salario"));					
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

	public static boolean buscarEmpleadosPorApellido1(String apellido1) {
	    Connection conex = null;
	    String query = "SELECT * FROM empleados WHERE apellido1 = ?";
	    ConnectionBDD cbd = new ConnectionBDD();
	    conex = cbd.conexion();
	    if(conex != null)
	    {
	        try(PreparedStatement sentencia = conex.prepareStatement(query))
	        {
	            sentencia.setString(1, apellido1);
	            ResultSet resultado = sentencia.executeQuery();
	            if(resultado.next())
	            {
	                return true; // Empleado encontrado
	            }
	            else
	            {
	                return false; // Empleado no encontrado
	            }
	        }catch(SQLException e){
	            e.printStackTrace();
	            return false; // Error buscar empleado
	        }
	    }
	    else
	    {
	        System.out.println("No se ha podido conectar");
	        return false; // Error - conectar bdd
	    }
	}
	
	public static void mostrarEmpleadoPorPrimerApellido(String apellido1) {
		Connection conex = null;
		String query = "SELECT * FROM empleados WHERE apellido1 = ? ";
		ConnectionBDD cbd = new ConnectionBDD();
		conex =cbd.conexion();
		if(conex!=null)
		{		
			try(PreparedStatement  sentencia	= conex.prepareStatement(query)){
				sentencia.setString(1, apellido1);
	            ResultSet rs = sentencia.executeQuery();
	            while (rs.next()) {
	                System.out.print(rs.getString("idEmpleado") + "       ");
	                System.out.print(rs.getString("nombre") + "        ");
	                System.out.print(rs.getString("apellido1") + "        ");
	                System.out.print(rs.getString("apellido2") + "        ");
	                System.out.print(rs.getDate("fechaNacimiento") + "        ");
	                System.out.println(rs.getInt("salario"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }						
		}
		else
		{
			System.out.println("No se ha podido conectar");			
		}
	}
	
	public static void eliminarEmpleado(int idEmpleado) {
		Connection conex = null;
		String query = "DELETE FROM empleados WHERE idEmpleado = ?";
		ConnectionBDD cbd = new ConnectionBDD();
		conex = cbd.conexion();
		if(conex!=null)
		{
		    try(PreparedStatement sentencia = conex.prepareStatement(query)){
		        sentencia.setInt(1, idEmpleado);
		        if(sentencia.executeUpdate() > 0)
		        {
		            System.out.println("Empleado eliminado");
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
	
	public static void calcularSalarioMedio() {
		Connection conex = null;
		String query = "SELECT AVG(salario) FROM empleados ";
		ConnectionBDD cbd = new ConnectionBDD();
		conex =cbd.conexion();
		if(conex!=null)
		{			
			try(Statement sentencia = conex.createStatement()){				
				ResultSet resultado = sentencia.executeQuery(query);
		        if(resultado.next())
		        {
		            double salarioMedio = resultado.getDouble(1); // recoge la primera column del resultset que es el salrioMedio
		            System.out.println("Salario promedio: " + salarioMedio);
		        }
		        else
		        {
		            System.out.println("No se encontraron registros");
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