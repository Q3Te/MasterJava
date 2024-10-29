package com.masterjava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"UTF-8\">");
	    out.println("<title>EX1</title>");
	    out.println("</head>");
	    out.println("<body>");
//	    String numStr = request.getParameter("number");	CASE OF STRING
//	    if(numStr!=null)
//	    {
//	        int num = Integer.parseInt(numStr);
//	        for(int i=0; i<num; i++)
//	        {
//	            out.println("Hello<br>");
//	        }
//	    }
	    
	    int num=Integer.parseInt(request.getParameter("number"));
	    for(int i=0; i<num; i++)
	    {
	            out.println("Hello<br>");
	    }
	    
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	}
}
