<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.masterjava.services.ValidationService" %>
<%@ page import="com.masterjava.modelos.Curso" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Almacenar en session el curso seleccionado</title>
</head>
<body>
<%
	ValidationService cs=new ValidationService();
	Curso c= cs.buscarUno(request.getParameter("nombrecurso"));
	session.setAttribute("cursoelegido",c);
%> 

<p>Se ha almacenado un objeto en un session.</p>
<a href="VerSession.jsp">Mostrar el curso elegido</a>
</body>
</html>