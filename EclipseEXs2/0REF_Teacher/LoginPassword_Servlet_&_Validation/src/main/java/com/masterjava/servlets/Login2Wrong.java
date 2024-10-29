package com.masterjava.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Login2Wrong
 */
@WebServlet("/Login2Wrong")
public class Login2Wrong extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*	LocalDate date = request.getAttribute("date");
		//out.println("<h1>"+user+" entered on"+date);//This in the body*/
		
		String user = request.getParameter("user");
		String password = request.getParameter("password");
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"UTF-8\">");
	    out.println("<title>S</title>");
	    out.println("</head>");
	    out.println("<body>");

	    out.println("<h1>User: "+user+" and Password: "+password+" Incorrect</h1>");
	    
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	}

}
