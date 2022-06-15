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
	<h1>I'm a Template</h1>
	
	<form:form action="/movie" method="POST" modelAttribute="movie">
		<form:error path="title"></form:errors>
		<input placeholder="Title" path="title"><form:input>
		
		<form:error path="genre"></form:errors>
		<input placeholder="Genre" path="genre"><form:input>
		
		<form:error path="release_date"></form:errors>
		<input placeholder="Release Date" type="number" path="release_date"><form:input>
		
		<form:error path="rating"></form:errors>
		<input placeholder="Rating" type="number" path="rating"><form:input>
	
	
		<input type="submit" value="Create Movie!"/>
	</form:form>
</body>
</html>