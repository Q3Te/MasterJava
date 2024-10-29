package com.masterjava.servlets;
	import java.io.IOException;

import com.masterjava.enums.Categoria;
import com.masterjava.modelos.Producto;
	import com.masterjava.services.ValidationServiceBDD;
	import jakarta.servlet.RequestDispatcher;
	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
	import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ModificarDatos
 */
@WebServlet("/ModificarDatos")
public class ModificarDatos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ValidationServiceBDD service = new ValidationServiceBDD();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession session = request.getSession(); //Retrieve the name of AlreadyMade&StoredProducto
	    Producto producto = (Producto) session.getAttribute("producto");
	    
		String nombreP = request.getParameter("nombre");   	    
	    String categoria = request.getParameter("categoria");
	    Categoria categoriaEnum = Categoria.valueOf(categoria);
	    double precio = Double.parseDouble(request.getParameter("precio"));		    
	    int stock = Integer.parseInt(request.getParameter("stock"));			   
	    
	    service.modificarProducto(nombreP,precio,stock,categoriaEnum,session);
	    Producto productoModificado = service.mostrarProductoBuscado(nombreP); 
	    
	    request.setAttribute("producto", productoModificado);  
	    RequestDispatcher despatcher = request.getRequestDispatcher("/resultadoModificacion.jsp");
	    despatcher.forward(request, response);
	}

}
