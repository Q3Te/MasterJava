<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.masterjava.modelos.Producto" %>
<%@ page import="com.masterjava.services.ValidationService" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Tabla Alta Producto</title>
<style>
	table, th, td {
	    border: 1px solid black;
	    border-collapse: collapse;
	    text-align: center;
	    padding: 5px;
	}
</style>
</head>

<body>

<h1> LISTADO DE PRODUCTOS </h1>

<%
	ValidationService service = new ValidationService();
	List<Producto> listaProductos = service.getListaProductos();
	request.setAttribute("listaProductos", listaProductos);

	@SuppressWarnings("unchecked")
	List<Producto> listaProductosOutput = (List<Producto>) request.getAttribute("listaProductos");
	
%>	<h1> PRODUCTO CREADO</h1> <%
	Producto nuevoProducto = listaProductosOutput.get(listaProductosOutput.size() - 1);

	out.println("Nombre: " + nuevoProducto.getNombre());
	out.println("Precio: " + nuevoProducto.getPrecio());
	out.println("Stock: " + nuevoProducto.getStock());
	out.println("Categoria: " + nuevoProducto.getCategoria());
	

%>	<h2> LISTADO DE PRODUCTOS</h2> <%
	if(listaProductosOutput!=null)
	{		
        out.println("<table>");
        out.println("<tr>");
        out.println("<th>Nombre</th>");
        out.println("<th>Precio</th>");
        out.println("<th>Stock</th>");
        out.println("<th>Categoria</th>");
        out.println("</tr>");
        
        for (Producto p : listaProductosOutput)
        {
            out.println("<tr>");
            out.println("<td>" + p.getNombre() + "</td>");
            out.println("<td>" + p.getPrecio() + "</td>");
            out.println("<td>" + p.getStock() + "</td>");
            out.println("<td>" + p.getCategoria() + "</td>");
            out.println("</tr>");
        }
        
        out.println("</table>");
        out.println("<br>");   out.println("<a href='index.html'>Menu opciones usuario [Tienda de Productos]</a>"); 
	}
	
%>

</body>
</html>

