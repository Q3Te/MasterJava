package com.masterjava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCookieRead
 */
@WebServlet("/ServletCookieRead")
public class ServletCookieRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] listCookies = request.getCookies();
		String responseC="";
		
		if(listCookies!=null)
		{
			for(Cookie c: listCookies)
			{
				responseC+=c.getName()+": "+c.getValue();
			}
		}
		else
		{
			responseC="No cookies found";
		}
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"UTF-8\">");
	    out.println("<title>Cookies</title>");
	    out.println("</head>");
	    out.println("<body>");

	    out.println("<h1>RESULT COOKIE</h1>");
	    out.println("<p>"+responseC+"</p>");
	    
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	}
}
