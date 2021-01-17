<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <!-- <form action="/HibernateWithSpringBoot/updateProduct">   -->

 <form action="/updateProduct"> 
product id <input type="text" name="pid" value="${prod.pid}">
product name <input type="text" name="pname" value="${prod.pname}">
product price <input type="text" name="price" value="${prod.price}">
<button type="submit" name="btn">Update</button>
</form>
</body>
</html>