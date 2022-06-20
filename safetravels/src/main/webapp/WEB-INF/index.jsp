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
	<h1>Safe Travels</h1>
	
	<table>
		<thead>
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="safetravel" items="{safetravels}">
			<tr>
				<td><a href="/expense/show/${safetravel.id }">${safetravel.expense}</a> </td>
				<td>${safetravel.vendor} </td>
				<td>${safetravel.amount} </td>
				<td> 
					<a href="/expense/edit/${safetravel.id}">Edit</a>
					<form action="/expense/delete/${safetravel.id }" method="POST">
						<input type="submit" value="Delete">
					</form>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<form:form action="/expense" method="POST" modelAttribute="safetravel">

		
		<label>Expense Name:</label>
		<form:errors path="expense"></form:errors>
		<form:input path="expense" placeholder="Expense"></form:input>
	
		<label>Vendor:</label>
		<form:errors path="vendor"></form:errors>
		<form:input path="vendor" placeholder="Vendor"></form:input>
		
		
		<label>Amount:</label>
		<form:errors path="amount"></form:errors>
		<form:input path="amount" type="number" placeholder="Amount"></form:input>
		
		<label>Description:</label>
		<form:errors path="description"></form:errors>
		<form:input path="description"  placeholder="Description"></form:input>
	
		<input type="submit" value="Submit">
	
	
	</form:form>
	
</body>
</html>
