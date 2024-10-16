package com.masterjava.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Login2
 */
@WebServlet("/Login2")
public class Login2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		
		if(user.equals("Admin") && password.equals("qwerty"))
		{
			/*//Sets the date on the HTML if login is successful
			LocalDate date= LocalDate.now();
			request.setAttribute("date",date);*/			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/ValidationCorrect");
			dispatcher.forward(request, response);
		}
		else
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/ServletValidationLogin2Wrong");
			dispatcher.forward(request,  response);
		}
	}

}
