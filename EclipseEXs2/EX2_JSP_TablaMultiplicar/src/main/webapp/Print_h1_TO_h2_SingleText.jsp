<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Iteration Headers Single Text</title>
</head>
<body>
<p>Iteration Headers [ h1:h6 ] using a  Single Text</p>
<%
    String text = "Testing";
	for (int i = 1; i <= 6; i++) 
	{
		%>
    		<h<%= i %>> <%= text %> </h<%= i %>>
		<%
	}
%>
</body>
</html>