<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST" >
 <input  type="text" name="username" />
 <input  type="password" name="password" />
<input type="button"  value="save"
/>
</form:form>

</body>
</html>