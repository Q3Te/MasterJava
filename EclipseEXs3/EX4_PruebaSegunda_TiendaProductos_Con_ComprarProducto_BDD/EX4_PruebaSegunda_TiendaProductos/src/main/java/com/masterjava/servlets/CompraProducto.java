package com.masterjava.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.masterjava.enums.Categoria;
import com.masterjava.modelos.Producto;
import com.masterjava.services.ValidationService;

/**
 * Servlet implementation class CompraProducto
 */
@WebServlet("/CompraProducto")
public class CompraProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ValidationService proceso = new ValidationService();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Producto> listaProductos = proceso.getListaProductos(); // OR getListaProductosActualizadoFinal(); 
		
		String nombre = request.getParameter("nombre");   	    	    
	    int cantidad_A_Comprar = Integer.parseInt(request.getParameter("stock"));	
	    int stock=proceso.getStockByNombre(nombre);   System.out.println("Stock para producto deseado es [ "+stock+" ]	 Si  Stock = -1, entoces nombreProducto a comprar mal"); // Return stock of product if product name matches
	    
	    boolean nombreProductoBuscadoExiste = proceso.buscarNombreParaComprar(nombre);
	    
	    if((nombreProductoBuscadoExiste) && (cantidad_A_Comprar<=stock))
	    {
	    	int nuevoStock = stock-cantidad_A_Comprar;			// Recuerda llamar el nuevo stock a la lista de ( listaProductosActualizado )
		    double precio = proceso.getPrecioByNombre(nombre);  // Return precio of product if product name matches
		    Categoria categoria = proceso.getCategoriaByNombre(nombre);  // Return categoria of product if product name matches, to be able to use in visualization in jsp
		    Producto producto = new Producto(nombre, precio, stock, categoria); //Para pasar lo al jsp = Producto con nombre: Cafe, precio: €1.0, stock [100], categoria: BEBIDAS
		    
		    double ticketCompra = proceso.procesoComprarProducto(precio, cantidad_A_Comprar);
		    		    
		    System.out.println(listaProductos);
		    for (Producto p : listaProductos)
		    {
		        if(p.getNombre().equalsIgnoreCase(nombre))
		        {
		            p.setStock(stock);
		        }
		    }
		    System.out.println(listaProductos);;
		    request.setAttribute("producto", producto);		//Un Solo Producto
		    request.setAttribute("ticketCompra", ticketCompra);
		    request.setAttribute("nuevoStock", nuevoStock);
		    request.setAttribute("cantidad_A_Comprar", cantidad_A_Comprar);
		    request.setAttribute("listaProductos", listaProductos); //Lista Productos
		    RequestDispatcher despatcher = request.getRequestDispatcher("/resultadoCompraProducto.jsp");
		    despatcher.forward(request, response);
	    }
	    else
	    {
	        RequestDispatcher despatcher = request.getRequestDispatcher("/malComprarProducto.jsp");
	        despatcher.forward(request, response);
	    }
	}
}