package com.masterjava.servlets;

import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletSessionRead
 */
@WebServlet("/ServletSessionRead")
public class ServletSessionRead extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
//		ClassName name= (ClassName) session.getAttribute("name");
		String nombre= (String) session.getAttribute("Name_defining_session");
		
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"UTF-8\">");
	    out.println("<title>Sessions</title>");
	    out.println("</head>");
	    out.println("<body>");

//	    out.println("<h1>RESULT SESSION</h1>");
//	    out.println("<p>"+nombre+"</p>");
	    
	    out.println("</body>");
	    out.println("</html>");
	    out.close();

	}
}