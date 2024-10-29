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
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletModificar
 */
@WebServlet("/ServletModificar")
public class ServletModificar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ValidationService proceso = new ValidationService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {   
		String nombre = request.getParameter("producto");
	    Producto producto = proceso.buscarParaModificar(nombre);
	    
	    if(producto!=null)
	    {
            request.setAttribute("producto", producto);
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