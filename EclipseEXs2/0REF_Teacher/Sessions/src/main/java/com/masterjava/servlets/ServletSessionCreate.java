package com.masterjava.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletSessionCreate
 */
@WebServlet("/ServletSessionCreate")
public class ServletSessionCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		session.setAttribute("Name_defining_session", "Values of the name of the session");
		session.setMaxInactiveInterval(0); //OPTIONAL Set the Max Time allowed to be inactive
	}

}
