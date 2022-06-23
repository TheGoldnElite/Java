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
		<h1>Hello, ${user.userName }</h1>
		<a href="/logout">Logout</a>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Project Title</th>
					<th>Due Date</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="project" items="${projects }">
				<tr>
					<td>${project.id }</td>
					<td><c:out value="${project.title }"></c:out></td>
					<td>${project.teamlead.userName }</td>
					<td>${project.duedate }</td>
					<td>Edit</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/projects/new">Add a new project</a>
	</div>
</body>
</html>