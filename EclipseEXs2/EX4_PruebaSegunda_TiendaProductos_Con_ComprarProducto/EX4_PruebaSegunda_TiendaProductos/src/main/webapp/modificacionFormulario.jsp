<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.masterjava.enums.Categoria" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modificar Producto</title>
<script>
function validacionCampos(){
	const formulario = document.querySelector('form');
	const nombreInput = document.querySelector('#nombre');
	const categoriaSelect = document.querySelector('#categoria');
	const precioInput = document.querySelector('#precio');
	const stockInput = document.querySelector('#stock');
	
	let isValid = true;
	
	if((nombreInput.value.trim() === '') || (!esTexto(nombreInput.value)))
	{
	  alert('Nombre no puede estar vacío o contener número(s)');
	  isValid = false;
	}
	
	if(categoriaSelect.value === '')
	{
	  alert('Debe seleccionar una categoría');
	  isValid = false;
	}
	
	if(isNaN(precioInput.value) || precioInput.value <= 0)
	{
	  alert('Precio debe ser un número mayor que 0');
	  isValid = false;
	}
	
	if(isNaN(stockInput.value) || stockInput.value <= 0)
	{
	  alert('Stock debe ser un número mayor que 0');
	  isValid = false;
	}
	
	return isValid;
}

function esTexto(inputValue) {
	return /^[a-zA-Z]+$/.test(inputValue.trim());
}

function enviarFormulario(){
  	if(validacionCampos())
  	{
  		alert('TODO BIEN');
   		document.getElementById('datosFormulario').submit();
	    document.getElementById('datosFormulario').reset(); 
  	}
}

</script>
<style>
	table {
	    margin-left: 470px;
	    margin-top: 150px;
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
	
	#btnEnviar{
		border-radius: 15px;
		background-color: white; 
		color: black; 
		border: 2px solid #04AA6D;
		font-weight: bold;
	}
	
		#btnEnviar:hover {
		border-radius: 15px;
		background-color: white; 
		color: red; 
		border: 2px solid red;
		font-weight: bold;
	}
</style>
</head>
<body>
	<a href='index.html'>Menu opciones usuario [Tienda de Productos]</a> <!--  NO REDIRIGE A MAL.jsp XQ Hay validaciones de Tipo JS -->
	<table>
	    <tr>
	        <th>Formulario para Modificar Productos</th>
	    </tr>
	 	<form id="datosFormulario" action="ServletModificarDatos" method="post">  
	    <tr>
	        <td>
	        	<label for="nombre">Nombre producto:</label>
	            <input type="text" id="nombre" name="nombre">
	        </td>
	    </tr>
	    <tr>
	        <td>
	            <label for="categoria">Categoria producto:</label>
	            <select id="categoria" name="categoria">
	                <option value="">Seleccione una categoría</option>
	                <option value="DULCES">DULCES</option>
	                <option value="ROPA">ROPA</option>
	                <option value="BEBIDAS">BEBIDAS</option>
	            </select>
	        </td>
	    </tr>
	    <tr>
	        <td>
	            <label for="precio">Precio:</label>
	            <input type="number" id="precio" name="precio">
	        </td>
	    </tr>
	    <tr>
	        <td>
	            <label for="stock">Stock:</label>
	            <input type="number" id="stock" name="stock">
	        </td>
	    </tr>
	    <tr>
	        <td>
	            <button type="button" id="btnEnviar" onclick="enviarFormulario()">MODIFICAR PRODUCTO</button>
	        </td>
	    </tr>
	    </form>
	    
	</table>

<%--     <h1>Modificar Producto</h1>
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
    </form> --%>
</body>
</html>