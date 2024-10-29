package com.masterjava.servlets;

import java.io.IOException;

import com.masterjava.modelos.Producto;
import com.masterjava.services.ValidationService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletModificarDatos
 */
@WebServlet("/ServletModificarDatos")
public class ServletModificarDatos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ValidationService proceso = new ValidationService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession session = request.getSession(); //Retrieve the name of AlreadyMade&StoredProducto
	    Producto producto = (Producto) session.getAttribute("producto");
	    String nombreBuscar = producto.getNombre(); 
	    
		String nombreP = request.getParameter("nombre");   	    
	    String categoria = request.getParameter("categoria");			  
	    double precio = Double.parseDouble(request.getParameter("precio"));		    
	    int stock = Integer.parseInt(request.getParameter("stock"));			    

	    producto.setNombre(nombreP);
	    producto.setCategoria(categoria);
	    producto.setPrecio(precio);
	    producto.setStock(stock);
	    
	    proceso.modificarProducto(producto);
	    
	    request.setAttribute("producto", producto);
	    RequestDispatcher despatcher = request.getRequestDispatcher("/resultadoModificacion.jsp");
	    despatcher.forward(request, response);
	}
}