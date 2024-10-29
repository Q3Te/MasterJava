package com.masterjava.services;	
	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.masterjava.connection.ConnectionBDD;
import com.masterjava.enums.Categoria;
import com.masterjava.modelos.Producto;

import jakarta.servlet.http.HttpSession;



/**
* Clase ValidationServiceBDD
* @author Manuel Portal
* @version 4.3.3, 22 oct 2024
*/
public class ValidationServiceBDD {
	private DataSource ds;
	
	public ValidationServiceBDD() {		
		try{
			Context initContext = new InitialContext();
			Context envContext  = (Context) initContext.lookup("java:/comp/env");
			ds = (DataSource) envContext.lookup("jdbc/MiDataSource");
		}catch(NamingException e){
	
			e.printStackTrace();
		}
	}

	public void insertarDatos(String nombre, double precio, int stock, Categoria categoria) {
		Connection conex = null;
		String query = "INSERT INTO productos (nombre,precio,stock,categoria) VALUES(?,?,?,?)";
		ConnectionBDD cbd = new ConnectionBDD();
		conex =cbd.conexion();
		if(conex!=null)
		{			
			try(PreparedStatement sentencia = conex.prepareStatement(query)){				
		        sentencia.setString(1, nombre);
		        sentencia.setDouble(2, precio);
				sentencia.setInt(3, stock);
		        sentencia.setString(4, categoria.toString());
		        sentencia.executeUpdate();
				System.out.println("Producto Añadido Correctamente");
			}catch(SQLException e){
				e.printStackTrace();
			}						
		}
		else
		{
			System.out.println("No se ha podido conectar");			
		}		
	}
	
	public void eliminarProducto(String nombre) {
		Connection conex = null;
		String query = "DELETE FROM productos WHERE nombre = ?";
		ConnectionBDD cbd = new ConnectionBDD();
		conex = cbd.conexion();
		if(conex!=null)
		{
		    try(PreparedStatement sentencia = conex.prepareStatement(query)){
		        sentencia.setString(1, nombre);
		        if(sentencia.executeUpdate() > 0)
		        {
		            System.out.println("Producto eliminado");
		        }
		        else
		        {
		            System.out.println("Ningún Producto cumple la condición");
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

	public void modificarProducto(String nombre, double precio, int stock, Categoria categoria, HttpSession session){
		Producto producto = (Producto) session.getAttribute("producto");
		Connection conex = null;
		String query = "UPDATE productos SET nombre=?, precio=?, stock=?, categoria=? WHERE nombre=?";		
		ConnectionBDD cbd = new ConnectionBDD();
		conex =cbd.conexion();
		if(conex!=null)
		{	
			String nombreSession = producto.getNombre();
			try(PreparedStatement sentencia = conex.prepareStatement(query)){				
		        sentencia.setString(1, nombre);		
		        sentencia.setDouble(2, precio);		
				sentencia.setInt(3, stock);			
		        sentencia.setString(4, categoria.toString());
		        
		        sentencia.setString(5, nombreSession);
		        sentencia.executeUpdate();
				System.out.println("Producto Modificado Correctamente");
			}catch(SQLException e){
				e.printStackTrace();
			}						
		}
		else
		{
			System.out.println("No se ha podido conectar");			
		}		
	}
	
	public boolean buscarProducto(String nombre) {
	    Connection conex = null;
	    String query = "SELECT * FROM productos WHERE nombre = ?";
	    ConnectionBDD cbd = new ConnectionBDD();
	    conex = cbd.conexion();
	    if(conex != null)
	    {
	        try(PreparedStatement sentencia = conex.prepareStatement(query))
	        {
	            sentencia.setString(1, nombre);
	            ResultSet resultado = sentencia.executeQuery();
	            if(resultado.next())
	            {
	                return true; // Producto encontrado
	            }
	            else
	            {
	                return false; // Producto no encontrado
	            }
	        }catch(SQLException e){
	            e.printStackTrace();
	            return false; // Error buscar Producto
	        }
	    }
	    else
	    {
	        System.out.println("No se ha podido conectar");
	        return false; // Error - conectar bdd
	    }
	}
	
	public Producto mostrarProductoBuscado(String nombre) {
		Producto p = new Producto();
	    Connection conex = null;
	    String query = "SELECT * FROM productos WHERE nombre = ?";
	    ConnectionBDD cbd = new ConnectionBDD();
	    conex = cbd.conexion();  
	    if(conex != null)
	    {
	        try(PreparedStatement statement = conex.prepareStatement(query)){
	            statement.setString(1, nombre);
	            ResultSet rs = statement.executeQuery();
	            while (rs.next())
	            {	 
	                p.setNombre(rs.getString("nombre"));
	                p.setPrecio(rs.getDouble("precio"));
	                p.setStock(rs.getInt("stock"));
	                p.setCategoria(rs.getString("categoria"));
	            }
	        }catch(SQLException e){
	            e.printStackTrace();
	        }
	    }
	    return p;
	}
			
	public List<Producto> visualizarTodo() {
	    List<Producto> listaProductos = new ArrayList<>();
	    Connection conex = null;
	    String query = "SELECT * FROM productos";  
	    ConnectionBDD cbd = new ConnectionBDD();
	    conex = cbd.conexion();
	    if(conex != null)
	    {
	        try(Statement statement = conex.createStatement();
	            ResultSet rs = statement.executeQuery(query)){  
	            while (rs.next())
	            {
	                Producto p = new Producto();
	                p.setNombre(rs.getString("nombre"));
	                p.setPrecio(rs.getDouble("precio"));
	                p.setStock(rs.getInt("stock"));
	                p.setCategoria(rs.getString("categoria"));
	                listaProductos.add(p);
	            }
	        }catch(SQLException e){
	            e.printStackTrace();
	        }
	    }
	    return listaProductos;
	}
	
}