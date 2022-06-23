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
	<div class="container mt-5">
		<form:form action="/projects/new" method="post" modelAttribute="project" class="form-control">
		<form:hidden path="teamlead" value="${userId }"/>
		<div>
			<form:label path="title" class="form-label">Project Title</form:label>
			<form:input path="title" type="text" class="form-control"/>
			<form:errors path="title" class="text-danger"/>
		</div>
		<div>
			<form:label path="description" class="form-label">Project Description</form:label>
			<form:input path="description" type="text" class="form-control"/>
			<form:errors path="description" class="text-danger"/>
		</div>
		<div>
			<form:label path="duedate" class="form-label">Project Due Date</form:label>
			<form:input path="duedate" type="date" class="form-control"/>
			<form:errors path="duedate" class="text-danger"/>
		</div>
		<button class="btn btn-primary">Create a new project</button>
		<a href="/dashboard" class="btn btn-default">Cancel</a>
		
		</form:form>
	
	
</body>
</html>