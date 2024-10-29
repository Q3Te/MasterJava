package com.masterjava.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ServletCookieCreate
 */
@WebServlet("/ServletCookieCreate")
public class ServletCookieCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie c1 = new Cookie("Xxx","Value");
		c1.setMaxAge(60); //OPTIONAL - Set duration of Cookie, although once user leaves page, cookie is reset
		response.addCookie(c1);
	}
}