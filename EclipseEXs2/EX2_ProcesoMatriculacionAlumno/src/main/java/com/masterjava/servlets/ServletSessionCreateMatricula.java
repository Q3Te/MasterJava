package com.masterjava.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


/**
 * Servlet implementation class ServletSessionCreateMatricula
 */
@WebServlet("/ServletSessionCreateMatricula")
public class ServletSessionCreateMatricula extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();

		
		resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"UTF-8\">");
	    out.println("<title>Sessions</title>");
	    out.println("</head>");
	    out.println("<body>");

	    out.println("<h1>Persona registrada en el sistema</h1>");
	    String nombre = req.getParameter("nombre");
	    out.println("<p>Nombre de la persona registrada: " + nombre + "</p>");
	    session.setAttribute("nombre", nombre); //Guadar Nombre pasar usarlo en otros servlets
	    out.println("<a href='Curso.html'>Formulario del curso</a>"); //ALSO VALID --> response.sendRedirect("Curso.html");
	    
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	}
	
	
}