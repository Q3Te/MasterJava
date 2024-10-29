<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buscador de Temática</title>
</head>
<body>
	<form action="ServletValidationBuscador" method="post">
		<label for="tematica">Introduce Temática: </label> 
        <input type="text" id="tematica" name="tematica">   <br>
        <button type="submit">Buscar</button>
	</form>
</body>
</html>