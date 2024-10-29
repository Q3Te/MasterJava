package com.masterjava.servlets;

import java.io.IOException;

import com.masterjava.modelos.PaginaWeb;
import com.masterjava.services.ValidacionServicioWeb;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletValidationBuscador
 */
@WebServlet("/ServletValidationBuscador")
public class ServletValidationBuscador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ValidacionServicioWeb service;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tematica= request.getParameter("tematica"); 
		service = new ValidacionServicioWeb();
		
		PaginaWeb validado=service.autenticar(tematica);
		if(validado!=null)
		{
			request.setAttribute("PaginaWeb",validado);
			RequestDispatcher despatcher = request.getRequestDispatcher("/ServeletBusquedaCorrecto");
			despatcher.forward(request, response);
		}
		else 
		{
				RequestDispatcher dispatcher = request.getRequestDispatcher("/ServletBusquedaIncorrecta");
				dispatcher.forward(request,  response);
		}
	}	
}