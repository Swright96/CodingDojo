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
			<h1><c:out value="${newShow.title}"></c:out></h1>
			<a href="/dashboard">Back to Dashboard</a>
		</div>
		
		
		<div id="postedShow">
			<h2>Posted By: <c:out value="${newShow.user.firstName}"/> <c:out value="${newShow.user.lastName}"/></h2>
		</div><br>
		<div id="title">
			<h3>Title: <c:out value="${newShow.title}"/></h3>
		</div>
		<div id="network">
			<h3>Network: <c:out value="${newShow.network}"/></h3>
		</div>
		<div id="description">
			<h3>Description: <c:out value="${newShow.description}"/></h3>
		</div>
		<a href="/edit/${newShow.id}"><button>Edit</button></a>
	</div>
</body>
</html>