<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>2 step verification</title>
</head>
<body>
 <jsp:useBean id="u" class="usebeans.ValidateBean" scope="request">


  <jsp:setProperty name="u" property="*" />
  
  </jsp:useBean>
  You entered user name as <jsp:getProperty name="u" property="user" /> <br>

  You entered user password as <jsp:getProperty name="u" property="pass" /> <br>

  <br>

  You are a <%= u.validate(u.getUser(), u.getPass()) %> user.  <br>

  <b>Thank You</b>
</body>
</html>