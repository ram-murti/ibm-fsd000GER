<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
your detail:<br>
first name:${student.getFirst_name()}<br>
last name:${student.getLast_name()}
Country:${student.getCountry() }<br>
Favlanguage:${student.getFavoriteLanguage() }<br>
OperatingSystems:
   <c:forEach var="os" items="${student.operatingSystems}">
        ${os}<br>
   </c:forEach>
</body>
</html>