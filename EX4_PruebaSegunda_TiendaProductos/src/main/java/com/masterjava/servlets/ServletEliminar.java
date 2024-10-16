package com.masterjava.servlets;
	import jakarta.servlet.RequestDispatcher;
	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
	import jakarta.servlet.http.HttpSession;
	import java.io.IOException;
	import com.masterjava.modelos.Producto;
	import com.masterjava.services.ValidationService;

/**
 * Servlet implementation class ServletEliminar
 */
@WebServlet("/ServletEliminar")
public class ServletEliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ValidationService proceso = new ValidationService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("producto");
	    Producto producto = proceso.buscarParaEliminar(nombre);
	    
	    if(producto!=null)
	    {
	    	proceso.eliminarProducto(producto);
	    	request.setAttribute("nombre", nombre);
			RequestDispatcher despatcher = request.getRequestDispatcher("/resultadoEliminarProducto.jsp");
			despatcher.forward(request, response);	
	    }
	    else
	    {
	        RequestDispatcher despatcher = request.getRequestDispatcher("/malEliminarProducto.jsp");
	        despatcher.forward(request, response);
	    }
	}

}
