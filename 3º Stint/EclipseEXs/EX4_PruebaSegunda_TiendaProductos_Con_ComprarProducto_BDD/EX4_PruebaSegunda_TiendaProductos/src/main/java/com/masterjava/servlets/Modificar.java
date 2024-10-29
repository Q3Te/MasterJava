package com.masterjava.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.masterjava.modelos.Producto;
import com.masterjava.services.ValidationServiceBDD;

/**
 * Servlet implementation class Modificar
 */
@WebServlet("/Modificar")
public class Modificar extends HttpServlet {
	private static final long serialVersionUID = 1L;
private ValidationServiceBDD service = new ValidationServiceBDD();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("producto");
	    boolean productoBuscadoExiste = service.buscarProducto(nombre); 
	    Producto producto = service.mostrarProductoBuscado(nombre); 

	    if(productoBuscadoExiste)
	    {
	    	HttpSession session = request.getSession();  //To retrieve in the ServletModificarDatos
	    	session.setAttribute("producto", producto);  //Saves session
			RequestDispatcher despatcher = request.getRequestDispatcher("/modificacionFormulario.jsp");
			despatcher.forward(request, response);	
	    }
	    else
	    {
	        RequestDispatcher despatcher = request.getRequestDispatcher("/malModificarProducto.jsp");
	        despatcher.forward(request, response);
	    }	
	}
}
