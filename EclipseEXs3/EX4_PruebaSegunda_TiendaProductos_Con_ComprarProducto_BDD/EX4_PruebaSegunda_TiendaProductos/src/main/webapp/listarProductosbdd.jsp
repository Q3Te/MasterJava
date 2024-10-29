<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.masterjava.modelos.Producto" %>
<%@ page import="com.masterjava.services.ValidationServiceBDD" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>LISTADO DE PRODUCTOS</title>
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
	<h1>LISTADO DE PRODUCTOS </h1>
	
<%
    ValidationServiceBDD service = new ValidationServiceBDD();
    List<Producto> listaProductos = service.visualizarTodo();
    request.setAttribute("listaProductos", listaProductos);

    @SuppressWarnings("unchecked")
    List<Producto> listaProductosOutput = (List<Producto>) request.getAttribute("listaProductos");
    
    if(listaProductosOutput==null)
    {
         out.println("Lista producto es null");
    }
    else if(listaProductosOutput.isEmpty()){
        out.println("Lista producto esta vacio");
    }else{
        
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
</body>
</html>