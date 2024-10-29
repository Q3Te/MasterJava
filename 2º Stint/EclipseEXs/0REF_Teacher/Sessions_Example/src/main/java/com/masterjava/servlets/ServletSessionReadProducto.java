package com.masterjava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.masterjava.modelos.Producto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletSessionReadProducto
 */
@WebServlet("/ServletSessionReadProducto")
public class ServletSessionReadProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		Producto product = (Producto) session.getAttribute("producto");
		
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"UTF-8\">");
	    out.println("<title>Sessions</title>");
	    out.println("</head>");
	    out.println("<body>");

		if(product!=null)
		{
			out.println("<p> id: "+product.getId()+" Producto: "+product.getNombre()+" Precio: "+product.getPrecio());
		}
		else
		{
			out.println("<p> Session Finalized </p>");
		}
	    
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	}
}