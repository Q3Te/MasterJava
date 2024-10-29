package com.masterjava.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.masterjava.modelos.Matricula;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletSessionReadMatricula
 */
@WebServlet("/ServletSessionReadMatricula")
public class ServletSessionReadMatricula extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Retrieve data from another Servlet
		HttpSession session = request.getSession();
		String nombre = (String) session.getAttribute("nombre");
		
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"UTF-8\">");
	    out.println("<title>Sessions</title>");
	    out.println("</head>");
	    out.println("<body>");

	    out.println("<h1>"+nombre+" estas matriculado en los cursos siguientes:</h1>");		
	    String curso = request.getParameter("curso"); //  out.println("<p>"+curso+"</p>");
	    Matricula.addCurso(curso);
	    Matricula.visualizarListaCursos(out);
	    //out.println(Matricula.getCursos());
	    
	    /*
	     * 	Matricula matricula = new Matricula();
			matricula.setNombre("John Doe");
			matricula.setAsignatura("Math");
			
			Matricula.addCurso("Math");
			Matricula.addCurso("Science");
			
			Matricula.visualizarListaCursos(out);
	     */


	    
	    out.println("<a href='Curso.html'>Matricularse de otro curso</a>"); //response.sendRedirect("Curso.html");
	    
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	}
}
