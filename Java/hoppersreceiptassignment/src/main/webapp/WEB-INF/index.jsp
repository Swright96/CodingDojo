<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
<script type="text/javascript" src="js/script.js"></script>
</head>

<body>
	<h1>Thank you for your purchase, <c:out value="${name}"/>!</h1>
	<p>Item name: <c:out value="${itemName}"/></p>
	<p>Price: $<c:out value="${price}"/></p>
	<p>Description: <c:out value="${description}"/></p>
	<p>Vendor: <c:out value="${vendor}"/></p>
</body>
</html>