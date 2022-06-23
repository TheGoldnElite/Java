<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/main.js"></script>
</head>
<body>
	<h1>Register</h1>

	<form:form class="grid" action="/register" method="POST" modelAttribute="newUser">
		<div>
			<form:label path="userName">User Name:</form:label>
			<form:errors path="userName"></form:errors>
			<form:input placeholder="Username" path="userName"></form:input>		
		</div>

		<div>
			<form:label path="email">Email:</form:label>
			<form:errors path="email"></form:errors>
			<form:input placeholder="Email" path="email"></form:input>		
		</div>

		<div>
			<label>Password:</label>
			<form:errors path="password"></form:errors>
			<form:input type="password" placeholder="Password" path="password"></form:input>		
		</div>

		<div>
			<label> Confirm Password:</label>
			<form:errors path="confirm"></form:errors>
			<form:input type="password" placeholder="Password Confirmation" path="confirm"></form:input>		
		</div>
		
		<input type="submit" value="Register"/>		
	</form:form>
	
	<h1>Login</h1>

	<form:form class="grid" action="/login" method="POST" modelAttribute="newLogin">
		<div>
			<form:errors path="email"></form:errors>
			<form:input placeholder="Email" path="email"></form:input>
		
		</div>
		
		<div>
			<form:errors path="password"></form:errors>
			<form:input type="password" placeholder="Password" path="password"></form:input>		
		</div>
		
		<input type="submit" value="Login"/>
	</form:form>
</body>
</html>