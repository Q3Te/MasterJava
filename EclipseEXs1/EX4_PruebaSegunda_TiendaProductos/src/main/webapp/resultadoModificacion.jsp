<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.masterjava.modelos.Producto" %>
<%@ page import="com.masterjava.modelos.Producto" %>
<%@ page import="com.masterjava.services.ValidationService" %>
<%@ page import="java.util.List" %>
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
	<h1>PRODUCTO MODIFICADO</h1>
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
        out.println("<br>");    out.println("<br>");   out.println("<br>"); 
	}
%>
<%
	ValidationService service = new ValidationService();
	List<Producto> listaProductos = service.getListaProductos();
	request.setAttribute("listaProductos", listaProductos);

	@SuppressWarnings("unchecked")
	List<Producto> listaProductosOutput = (List<Producto>) request.getAttribute("listaProductos");
	
%> <h2> LISTADO COMPLETO DE PRODUCTOS DESPUES DE MODIFICACION</h2> <%
	
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
        out.println("<br>");   out.println("<a href='index.html'>Menu opciones usuario [Tienda de Productos]</a>"); 
	}
%>
	
</body>
</html>