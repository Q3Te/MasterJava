<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.masterjava.services.ValidationService" %>
<%@ page import="com.masterjava.modelos.Curso" %>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Cursos con sus Niveles</title>
</head>
<body>

<%
	ValidationService cs= new ValidationService();
	List<Curso> listaCursos=cs.buscarTodos();
	
	for(Curso curso:listaCursos){ %>
		<p>Nombre del curso: <%=curso.getNombre()%> - Nivel del curso: <%=curso.getNivel()%>
<% 	}%>

</body>
</html>