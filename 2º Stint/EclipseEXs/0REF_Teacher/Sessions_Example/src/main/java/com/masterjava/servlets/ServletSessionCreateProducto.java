package com.masterjava.servlets;

import java.io.IOException;

import com.masterjava.modelos.Producto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletSessionCreateProducto
 */
@WebServlet("/ServletSessionCreateProducto")
public class ServletSessionCreateProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		Producto product = new Producto (1,"Phone",800.00);
		session.setAttribute("product", product);
		session.setMaxInactiveInterval(100);
	}
}