<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Controller" method="post">
title:<input type="text" name="title"><br/>
Artist:<input type="text" name="artist"><br/>
purchaseDate:<input type="date" name="date"><br/>
cost:<input type="Number" name="cost"><br/>
<select name="CD-Type">
<option value="SpecialCD" >SpecialCD</option>
<option value="InternationalCD" >InternationalCD</option>
</select>
<input type="submit">
</form>
</body>
</html>