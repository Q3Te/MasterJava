<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.masterjava.modelos.Producto" %>
<%@ page import="com.masterjava.services.ValidationServiceBDD" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Ticket Compra</title>
<style>
	body{
		margin-left: 470px;
	    margin-top: 15px;
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
	
	h2{
		font-size: medium;
		color: red;
	}
	
	h4{
		color: orange; 
	}
</style>
</head>
<body>
<a href='index.html'>Menu opciones usuario [Tienda de Productos]</a> <br>
<%
	ValidationServiceBDD service = new ValidationServiceBDD();
	List<Producto> listaProductos = service.visualizarTodo();
	request.setAttribute("listaProductos", listaProductos); 

	@SuppressWarnings("unchecked")
	List<Producto> listaProductosOutput = (List<Producto>) request.getAttribute("listaProductos");
%>	

	<h3>LISTA DE PRODUCTOS CON SUS PRECIOS</h3>  <%
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
	}
%>

<br><br><h1> PRODUCTO COMPRADO</h1> <%

	Producto productoComprado = (Producto) request.getAttribute("producto");
 	out.println("Nombre: " + productoComprado.getNombre());
	out.println("Precio: " + productoComprado.getPrecio());
	out.println("Stock: " + productoComprado.getStock());
	out.println("Categoria: " + productoComprado.getCategoria()); 	%> 
	
	<p>Se ha comprado [ ${cantidad_A_Comprar} ] del producto <%out.println(productoComprado.getNombre());%> y quedan en Stock ${nuevoStock}
	<h2> TOTAL TICKET COMPRA -->  €${ticketCompra} </h2> 
	
</body>
</html>