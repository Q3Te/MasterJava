package com.masterjava.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.masterjava.modelos.Producto;
import com.masterjava.services.ValidationServiceBDD;

/**
 * Servlet implementation class Eliminar
 */
@WebServlet("/Eliminar")
public class Eliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  ValidationServiceBDD service = new ValidationServiceBDD();       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("producto");
	    boolean productoBuscadoExiste = service.buscarProducto(nombre);
	    
	    if(productoBuscadoExiste)
	    {
	    	service.eliminarProducto(nombre);
	    	request.setAttribute("nombre", nombre);
			RequestDispatcher despatcher = request.getRequestDispatcher("/resultadoEliminarProducto.jsp");
			despatcher.forward(request, response);	
	    }
	    else
	    {
	        RequestDispatcher despatcher = request.getRequestDispatcher("/malEliminarProducto.jsp");
	        despatcher.forward(request, response);
	    }
	}

}
