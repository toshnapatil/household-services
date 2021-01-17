<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="addProduct1" method="post">
product id: <form:input path="pid"/>
product name:<form:input path="pname"/>
product price:<form:input path="price"/>
<form:button type="submit" value="submit" name="btn">Add</form:button>
</form:form>

</body>
</html>