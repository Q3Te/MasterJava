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
			RequestDispatcher despatcher = request.getRequestDispatcher("Correcto.jsp");
			despatcher.forward(request, response);
//			response.sendRedirect("correcto.jsp");
		}
		else 
		{
			RequestDispatcher despatcher = request.getRequestDispatcher("Incorrecto.jsp");
			despatcher.forward(request, response);
//			response.sendRedirect("Incorrecto.jsp");
		}
	}

}
