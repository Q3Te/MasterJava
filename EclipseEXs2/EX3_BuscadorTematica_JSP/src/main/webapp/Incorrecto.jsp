<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado No Encontrado</title>
</head>
<body>
<%
String tematica = (String) request.getAttribute("tematica");
tematica = request.getParameter("tematica");
%>

<h1>No existen Página(s) para dicha temática:<%= tematica %></h1> 
</body>
</html>