<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.masterjava.services.ValidationService" %>
<%@ page import="com.masterjava.modelos.Curso" %> 
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Ver Session</title>
</head>
<body>
	
<%
	Curso c= (Curso)session.getAttribute("cursoelegido");
%>
<h2>El cusrso elegido por el usuario</h2>
<p>Nombre: <%=c.getNombre() %></p>
<p>Nivel: <%=c.getNivel() %></p>


</body>
</html>