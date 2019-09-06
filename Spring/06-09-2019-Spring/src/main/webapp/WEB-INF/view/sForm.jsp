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
<title>Form Page</title>
</head>
<body>
<form:form action="Show" modelAttribute="student">
first name:<form:input path="first_name"/><br>
last name:<form:input path="last_name"/><br>
Country:<form:select path="country">
<form:options items="${student.countryOptions}" />	
</form:select><br><br>
		Favorite Language:
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
		<br><br>
		Operating Systems:
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Mac OS<form:checkbox path="operatingSystems" value="MAC OS"/>
		MS Windows <form:checkbox path="OperatingSystems" value="MS Windows"/>
		<br><br>
<input type="submit"><br>

<table border="1">
<tr><td>FirstName</td>
<td>LastName</td>
<td>Language</td>
</tr>
<c:forEach var="a" items="${list}">
<tr><td>  ${a.first_name}</td>
<td>  ${a.last_name}</td>
<td>  ${a.favoriteLanguage}</td>
   </tr>
 

</c:forEach>
</table>
</form:form>
</body>
</html>