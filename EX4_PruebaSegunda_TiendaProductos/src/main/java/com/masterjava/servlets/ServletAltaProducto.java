package com.masterjava.servlets;
	import java.io.IOException;
	import com.masterjava.enums.Categoria;
	import com.masterjava.modelos.Producto;
	import com.masterjava.services.ValidationService;
	import jakarta.servlet.RequestDispatcher;
	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class ServletAltaProducto
 */
@WebServlet("/ServletAltaProducto")
public class ServletAltaProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ValidationService proceso = new ValidationService();
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");   	    
	    String categoria = request.getParameter("categoria");			    
	    double precio = Double.parseDouble(request.getParameter("precio"));		    
	    int stock = Integer.parseInt(request.getParameter("stock"));

	    Categoria categoriaEnum = Categoria.valueOf(categoria);
		Producto producto = new Producto(nombre, precio, stock, categoriaEnum);
	    producto.setNombre(nombre);
	    producto.setCategoria(categoria);
	    producto.setPrecio(precio);
	    producto.setStock(stock);
	    
	    proceso.annadirProducto(producto);
	    
	    request.setAttribute("producto", producto);
	    RequestDispatcher despatcher = request.getRequestDispatcher("/resultadoAltaProducto.jsp");
	    despatcher.forward(request, response);
	}
}