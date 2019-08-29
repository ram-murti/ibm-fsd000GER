<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form name="JSP" id="form-1" method="get">
	<label for="user">Username:</label>
	<input id="user" name="Username" placeholder="username" autofocus="true" required="true" type="text"/><br>
<label for="user">Password:</label>
	
	<input id="user" name="Password" placeholder="Password" autofocus="true" required="true" type="text"/><br>
	<input type="submit" value="Submit" id="button-1"/>
</form>

  <c:if test="${fn:length(param.Username) > 0}" >
        
           
            <jsp:include page="response.jsp"/>
            <%@include file="response.jsp" %>
            
        </c:if>

</body>
</html>