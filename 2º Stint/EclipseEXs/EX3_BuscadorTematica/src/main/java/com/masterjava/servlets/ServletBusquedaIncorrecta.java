package com.masterjava.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletBusquedaIncorrecta
 */
@WebServlet("/ServletBusquedaIncorrecta")
public class ServletBusquedaIncorrecta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tematica = request.getParameter("tematica");
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"UTF-8\">");
	    out.println("<title>Resultado No Encontrado</title>");
	    out.println("</head>");
	    out.println("<body>");

	    out.println("<h1>No existen Página(s) para dicha temática: "+tematica+"</h1>");
	    
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	}
}