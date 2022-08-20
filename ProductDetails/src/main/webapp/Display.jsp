<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=2>
	<tr>
	<th>Product id</th><th>Product Name</th><th>Product Price</th>
	</tr>
	<tr>
	<td><%= session.getAttribute("Product_id") %></td>
	<td><%= session.getAttribute("Product_name")%></td>
	<td><%= session.getAttribute("Product_price")%></td>
	</tr>
	</table>
</body>
</html>