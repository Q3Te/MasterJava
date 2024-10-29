package com.masterjava.servlets;

import java.io.IOException;

import com.masterjava.modelos.Producto;
import com.masterjava.services.ValidationService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletBuscar
 */
@WebServlet("/ServletBuscar") 
public class ServletBuscar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ValidationService proceso = new ValidationService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String nombre = request.getParameter("producto");
	    Producto producto = proceso.buscarUno(nombre);   
		
	    if(producto!=null)
	    {
			request.setAttribute("producto", producto);
			RequestDispatcher despatcher = request.getRequestDispatcher("/resultadoBusqueda.jsp");
			despatcher.forward(request, response);	
	    }
	    else
	    {
	        RequestDispatcher despatcher = request.getRequestDispatcher("/malBusqueda.jsp");
	        despatcher.forward(request, response);
	    }
	}	
}