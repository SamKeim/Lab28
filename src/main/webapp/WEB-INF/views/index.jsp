<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>Weather ${weather.productionCenter}</title>
</head>
<body>
	<div class="container-fluid">
		<h1>U.S. Weather Search</h1>
		<h5>Enter a Location</h5>
	</div>
	<div class="container-fluid">
		<form method="post">
			<label>Location: </label> <input type="text" name="location">
			<button type="submit">Weather?! I hardly know her!</button>
		</form>
	</div>
	<c:if test="${message ne null}">
		<div class="alert alert-danger" role="alert">
			<h4>${message}</h4>
		</div>
	</c:if>
	<c:if test="${locations ne null}">
		<h3>Please Select a Location</h3>
		<h4><i>Results from the nearest weather station will display.</i></h4>
		<ul>
			<c:forEach var="location" items="${locations}">
				<li><a href="/weather?lat=${location.lat}&lon=${location.lon}">${location.displayName}</a></li>
			</c:forEach>
		</ul>
	</c:if>
</body>
</html>