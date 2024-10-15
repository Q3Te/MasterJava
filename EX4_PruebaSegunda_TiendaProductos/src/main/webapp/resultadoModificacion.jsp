<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.masterjava.modelos.Producto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado de Modificación</title>
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
	<h1>TABLA DE PRODUCTOS CON MODIFICACION</h1>
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
	}
	else
	{
		out.println("<h2>Producto no encontrado </h2>");
	}
%>
	
</body>
</html>