<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tabla de Multiplicar</title>
</head>

<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
	padding: 5px;
}
</style>
<body>
   <!-- CAN BE MADE SIMPLY BY COMBINING HTML & JS; WHICH IS NOT BEING DONE HERE -->
 <%
out.println("<table>"); 
	for(int i=1; i<11; i++)
	{
		out.println("<tr>");
		out.println("<th>"+i+"</th>");
	
		for(int j=2;j<11;j++)
		{
			out.println("<td>"+j*i+"</td>");
		}
		out.println("</tr>");
	}
out.println("</table>"); 

%>
</body>
</html>