<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h3>Add Student</h3>
	<!-- create a spring form where the user can enter data -->
	<form:form action="save-student" modelAttribute="student" method="POST">
		<label>Name : </label>
		<form:input path="name" />
		<br/>
		<label>Mobile : </label>
		<form:input path="mobile" />
		<br/>
		<label>Country : </label>
		<form:input path="country" />
		<br/>
		<input type="submit" value="Submit">

	</form:form>
	</div>

</body>
</html>