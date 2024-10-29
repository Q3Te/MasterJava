package com.masterjava.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.masterjava.enums.Categoria;
import com.masterjava.modelos.Producto;
import com.masterjava.services.ValidationServiceBDD;

/**
 * Servlet implementation class AltaProducto
 */
@WebServlet("/AltaProducto")
public class AltaProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  ValidationServiceBDD service = new ValidationServiceBDD();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");   	    
	    String categoria = request.getParameter("categoria");			    
	    double precio = Double.parseDouble(request.getParameter("precio"));		    
	    int stock = Integer.parseInt(request.getParameter("stock"));

	    Categoria categoriaEnum = Categoria.valueOf(categoria);
		Producto producto = new Producto(nombre, precio, stock, categoriaEnum);
	    service.insertarDatos(nombre, precio, stock, categoriaEnum);
	    
	    request.setAttribute("producto", producto);
	    RequestDispatcher despatcher = request.getRequestDispatcher("/resultadoAltaProducto.jsp");
	    despatcher.forward(request, response);
	}

}
