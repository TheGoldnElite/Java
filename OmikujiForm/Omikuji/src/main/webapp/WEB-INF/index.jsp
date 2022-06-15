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
	<h1>Send an Omikuji</h1>
	
	<form action="/submit" method="POST">
		<label>Pick any number from 5 to 25</label><br>
		<input type="number" name="number"><br>
		
		<label>Enter the name of any city</label><br>
		<input type="text" name="city" placeholder="city"<br>
		
		<label>Enter the name of any real person</label><br>
		<input type="text" name="person" placeholder="person"><br>
		
		<label>Enter professional endeavor or hobby:</label><br>
		<input type="text" name="hobby" placeholder="hobby"><br>
		
		<label>Enter any type of living thing.</label><br>
		<input type="text" name="thing" placeholder="living thing"><br>
		
		<label>Say something nice to someone:</label><br>
		<textarea name="nice" rows="5" cols="50" placeholder="nice"></textarea><br>
	
		<input name="Submit value="Send">
	</form>
</body>
</html>