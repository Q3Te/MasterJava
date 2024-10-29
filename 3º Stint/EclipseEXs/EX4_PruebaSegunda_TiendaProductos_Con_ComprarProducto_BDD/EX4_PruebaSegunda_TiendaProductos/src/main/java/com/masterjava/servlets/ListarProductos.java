package com.masterjava.servlets;

import java.io.IOException;
import java.util.List;

import com.masterjava.modelos.Producto;
import com.masterjava.services.ValidationServiceBDD;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListarProductos
 */
@WebServlet("/ListarProductos")
public class ListarProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  ValidationServiceBDD service = new ValidationServiceBDD();
	 
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    List<Producto> listaProductos = service.visualizarTodo();
    
    request.setAttribute("listaProductos", listaProductos);
	RequestDispatcher despatcher = request.getRequestDispatcher("/listarProductosbdd.jsp"); 
	despatcher.forward(request, response);		
 }
}