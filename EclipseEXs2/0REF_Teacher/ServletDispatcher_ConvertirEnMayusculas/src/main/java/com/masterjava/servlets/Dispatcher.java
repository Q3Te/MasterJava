package com.masterjava.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Dispatcher
 */
@WebServlet("/Dispatcher")
public class Dispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String word=request.getParameter("word");
		request.setAttribute("word", word.toUpperCase());
		
		//Dispatcher
		RequestDispatcher despatcher = request.getRequestDispatcher("ServletDispatcherExtender");
		despatcher.forward(request, response);
	}

}
