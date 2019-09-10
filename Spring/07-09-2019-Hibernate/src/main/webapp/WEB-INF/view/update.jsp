<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="update?id=${customer.id}" modelAttribute="customer">
first name<form:input path="firstName" /><br/>
last name<form:input path="lastName" /><br/>
email<form:input path="email"/><br>
<input type="submit"><br>

<a href="viewAll">ViewAll</a>
</form:form>
</body>
</html>