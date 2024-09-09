<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">NetProphets Cyberworks</h1>
	<!-- ModelAttribute : Students -->
	<div align="center">
	<form action="/student-management/showAddStudentPage">
	<input type="submit" value="ADD">
	</form>
		<table border="1">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Mobile</th>
					<th>Country</th>
				</tr>
			</thead>

			<c:forEach var="student" items="${Students}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.country}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>