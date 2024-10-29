package com.masterjava.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Login1Correct
 */
@WebServlet("/Login1Correct")
public class Login1Correct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*	LocalDate date = request.getAttribute("date");
		//out.println("<h1>"+user+" entered on"+date);//This in the body*/
		
		String user = request.getParameter("user");
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"UTF-8\">");
	    out.println("<title></title>");
	    out.println("</head>");
	    out.println("<body>");

	    out.println("<h1>"+user+" Login Successful</h1>");
	    
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	}
}