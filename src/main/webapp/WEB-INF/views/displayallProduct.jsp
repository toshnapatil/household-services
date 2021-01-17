<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>List of products</h1>
<table border="2">
	<tr><th>prodid</th><th>prodname</th><th>price</th></tr>
	<c:forEach var="p" items="${plist}">
		<tr>
			<td>${p.pid}</td><td>${p.pname}</td><td>${p.price}</td>
			<td><a href="deleteproduct/${p.pid}">Delete</a>/<a href="editProduct/${p.pid}">Edit</a></td>
		</tr>
	</c:forEach>
</table>
<a href="showform1">Add Product</a>

</body>
</html>