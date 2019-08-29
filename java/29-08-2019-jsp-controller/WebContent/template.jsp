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
 <c:if test="${ERROR!=null}" >
        
          ${ERROR}
            
            
        </c:if>
         <c:if test="${SUCCESS!=null}" >
        
           ${SUCCESS}
            
            
        </c:if>
<form name="EMPLOYEE dETAILS" id="form-1" action="controller1" method="post">
		<label for="input-1">Name:</label>
		<input id="input-1" placeholder="Name" name="Name" type="text"/><br>
			<label for="input-2">Password:</label>
		<input id="input-2" placeholder="password" name="Password" type="password"/><br>
			<label for="input-3">Email:</label>
		<input id="input-3" placeholder="email" name="Email" type="email"/><br>
		<label for="input-4">Country:</label>
		<select name="Country">
		<option value="Unknown">Unknown</option>
		<option value="India">India</option>
		<option value="Australia">Australia</option>
		</select><br>
		<input type="submit" value="Submit" id="button-1"/>
	</form>
	<a href="check.html">ViewAllEmployee</a>
	
</body>
</html>