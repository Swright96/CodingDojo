<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="header">
			<h1>Create a New Tv Show</h1>
			<a href="/dashboard">go back</a>
		</div>
		<div class="form">
		<p>
			<form:form action="/shows/new" method="post" modelAttribute="newShow">
				<form:input type="hidden" path="user" value="${user.id}"/>
			<p>
				<form:label path="title">Title:</form:label>
				<form:errors path="title"/>
				<form:input path="title"/>
			</p><br>
			<p>
				<form:label path="network">Network:</form:label>
				<form:errors path="network"/>
				<form:input path="network"/>
			</p><br>
			<p>
				<form:label path="description">Description:</form:label>
				<form:errors path="description"/>
				<form:input path="description"/>
			</p><br>
			
			<input type="submit" value="Submit"/>
			
			
			</form:form>
		</div>
	</div>
</body>
</html>