<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CRM</title>
</head>
<body>
<h2>CRM-Customer Relationship Management</h2><br/>
<form:form action="view" modelAttribute="customer">
first name<form:input path="firstName"/><br/>
last name<form:input path="lastName" /><br/>
email<form:input path="email"/><br>
<input type="submit"><br>

<a href="viewAll">ViewAll</a>
</form:form>

<table border="1">

<tr><td>Id</td>
<td>FirstName</td>
<td>LastName</td>
<td>Email</td>
</tr>
<c:forEach var="a" items="${allCustomer}">
<tr><td>  ${a.id}</td>
<td>  ${a.firstName}</td>
<td>  ${a.lastName}</td>
<td>  ${a.email}</td>
<td><a href="delete?id=${a.id}">Delete</a>
 </td>
 <td><a href="firstfind?id=${a.id}">Update</a>
 </td>
   </tr>
</c:forEach>
</table>
</body>
</html>