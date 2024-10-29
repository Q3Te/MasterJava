<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tabla de Multiplicar con Parametro Entrada</title>

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
   <% 
    if(request.getParameter("number") != null) {
        int num = Integer.parseInt(request.getParameter("number"));
    %>
    <h2>Tabla de Multiplicar del: <%=num%></h2>
    <table>
        <% 
        for(int i=1; i<=10; i++) {
        %>
        <tr>
            <th><%= i %></th>
            <% 
            for(int j=1; j<=10; j++) {
            %>
            <td><%=j*num%></td>
            <% 
            }
            %>
        </tr>
        <% 
        }
        %>
    </table>
    <% 
    }
    %>

	<form action="" method="post">
		<label for="number">Introduce un número: </label>
        <input type="number" id="number" name="number">
		<input type="submit" value="Enviar"><br>
	</form>
</body>
</html>

		