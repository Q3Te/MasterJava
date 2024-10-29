<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.masterjava.modelos.Producto" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Resultado de Busqueda</title>
<style>
	body{
		margin-left: 470px;
	    margin-top: 50px;
	}
	
	table {
	   border-collapse: collapse;
	   width: 38%;
	}
	
	th, td {
	    border: 1px solid #ddd;
	    padding: 8px;
	    text-align: center;
	}
	th {
	    background-color: #f2f2f2;
	}
	
	a {
	    text-decoration: none;
	    color: green; 
	}
	
	a:hover {
	    color: red; 
	    font-weight: bold;
	}
</style>
</head>

<body>
	<a href='index.html'>Menu opciones usuario [Tienda de Productos]</a>
	<h1>RESULTADO DE BUSQUEDA</h1>
<%
	Producto producto = (Producto) request.getAttribute("producto");
	
	if(producto!=null)
	{
		out.println("<table>");
        out.println("<tr>");
        out.println("<th>Nombre</th>");
        out.println("<th>Precio</th>");
        out.println("<th>Stock</th>");
        out.println("<th>Categoria</th>");
        out.println("</tr>");
			out.println("<tr>");
	        out.println("<td>" + producto.getNombre() + "</td>");
	        out.println("<td>" + producto.getPrecio() + "</td>");
	        out.println("<td>" + producto.getStock() + "</td>");
	        out.println("<td>" + producto.getCategoria() + "</td>");
	        out.println("</tr>");
        out.println("</table>"); 
        out.println("<br>");
	}
%>
	
</body>
</html>