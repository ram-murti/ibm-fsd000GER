<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
StudentName:   ${M}<br>
StudentEmail:  ${param.StudentEmail}<br>
StudentName:   <%=request.getParameter("StudentName") %><br>
StudentEmail:  <%=request.getParameter("StudentEmail") %>
</div>
</body>
</html>