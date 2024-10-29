package com.masterjava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.masterjava.modelos.PaginaWeb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServeletBusquedaCorrecto
 */
@WebServlet("/ServeletBusquedaCorrecto")
public class ServeletBusquedaCorrecto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PaginaWeb paginaweb = (PaginaWeb) request.getAttribute("PaginaWeb");	

		String tematica = request.getParameter("tematica");
		
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"UTF-8\">");
	    out.println("<title>Resultado Encontrado</title>");
	    out.println("</head>");
	    out.println("<body>");

	    out.println("<h1>Si existen Página(s) para dicha temática: "+tematica+"</h1>");
	    out.println("<h2>Datos Relevantes</h2>");
	    out.print("<p>Dirrecion : <a href=\"" +paginaweb.getDireccion()+ "\">" +paginaweb.getDireccion()+ "</a></p>");
	    out.println("<p>Tematica :"+paginaweb.getTematica()+"</p>");
	    out.println("<p>Descripción :"+paginaweb.getDescripcion()+"</p>");
	    
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
 }
}
