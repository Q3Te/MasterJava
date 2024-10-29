package com.masterjava.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DispatcherExtender
 */
@WebServlet("/DispatcherExtender")
public class DispatcherExtender extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"UTF-8\">");
	    out.println("<title>Dispatcher</title>");
	    out.println("</head>");
	    out.println("<body>");

	    out.println("Valor almacendao Como Parámetro en request.getParameter: "+request.getParameter("word"));
	    out.println("<br>");
	    out.println("Valor almacendao Como Atributo en request.getAttribure despues de poner [Parámetro] como [set to upperCase] y pasandolo por un {dispatcher} : "+request.getAttribute("word"));

	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	}

}
