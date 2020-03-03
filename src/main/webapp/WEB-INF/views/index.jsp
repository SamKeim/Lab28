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
	<div class="alert alert-danger" role="alert">
	<h2>${message}</h2>
	</div>
	<div class="container-fluid">
		<form method="post">
			<label>Location: </label> <input type="text"
				name="location">
			<button type="submit">Weather! I hardly know her!</button>
		</form>
	
	</div>

 <div class="container-fluid">
<h1>${weather.productionCenter}</h1>
</div>

<table class="table">
<tr>
<c:forEach var="data" items="${weather.data.iconLink}">
<td>
<img src="${data}">
</td>
</c:forEach>
</tr>
<tr>
<c:forEach var="data" items="${weather.time.startPeriodName}">
<td>
${data}
</td>
</c:forEach>
</tr>
<tr>
<c:forEach var="data" items="${weather.time.tempLabel}">
<td>
${data}
</td>
</c:forEach>
</tr>
<tr>
<c:forEach var="data" items="${weather.data.temperature}">
<td>
${data}
</td>
</c:forEach>
</tr>
<tr>
<c:forEach var="data" items="${weather.data.weather}">
<td>
${data}
</td>
</c:forEach>
</tr>
		<tr>
<c:forEach var="data" items="${weather.data.text}">
<td>
${data}
</td>
</c:forEach>
</tr>
</table>
</body>
</html>