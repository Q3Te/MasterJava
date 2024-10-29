<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.masterjava.modelos.PaginaWeb" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado Encontrado</title>
</head>
<body>
<%
PaginaWeb paginaweb = (PaginaWeb) request.getAttribute("PaginaWeb"); 
String tematica = (String) request.getAttribute("tematica");
tematica = request.getParameter("tematica");
%>

<h1>Si existen Página(s) para dicha temática:<%= tematica %></h1>
<h2>Datos Relevantes</h2>
<p>Dirrecion : <a href="<%=paginaweb.getDireccion()%>"><%=paginaweb.getDireccion()%></a></p>
<p>Tematica : <%= paginaweb.getTematica() %></p>
<p>Descripción : <%= paginaweb.getDescripcion() %></p> 
</body>
</html>