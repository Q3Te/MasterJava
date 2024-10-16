<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.masterjava.enums.Categoria" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modificar Producto</title>
</head>
<body>
    <h1>Modificar Producto</h1>
    <form action="ServletModificarDatos" method="post">
        <label for="nombre">Nombre producto: </label><br>
        <input type="text" id="nombre" name="nombre" value="${producto.nombre}"><br>
        <label for="categoria">Categoria producto: </label><br>
        <select id="categoria" name="categoria">
		    <option value="${producto.categoria}">${producto.categoria}</option>
		    <option value="DULCES">DULCES</option>
		    <option value="ROPA">ROPA</option>
		    <option value="BEBIDAS">BEBIDAS</option>
		</select><br>
        <label for="precio">Precio: </label><br>
        <input type="number" id="precio" name="precio" value="${producto.precio}"><br>
        <label for="stock">Stock: </label><br>
        <input type="number" id="stock" name="stock" value="${producto.stock}"><br>
        <input type="submit" value="Modificar">
    </form>
</body>
</html>