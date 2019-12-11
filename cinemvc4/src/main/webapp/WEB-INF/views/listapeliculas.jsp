<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Peliculas del Director</title>
</head>
<body>

<h2>Peliculas del Director:</h2>
	<table id="tabla">
		<tr>		
			<td style="height: 28px; width: 150px;">Nombre</td>
			<td style="height: 28px; width: 150px;">Director</td>
			<td style="height: 28px; width: 150px;">Fecha</td>
			<td style="height: 28px; width: 150px;">ID</td>
		<tr>	
		<c:forEach items="${listaPel}" var="info">
			<tr>
				<td>${info.nombre }</td>
				<td>${info.director }</td>
				<td>${info.fecha }</td>
				<td>${info.id }</td>
			</tr>
		</c:forEach>
	</table>

<a href="consultaDir.jsp"><input type="button" value="Otra consulta"/></a></br></br>

<form method="POST" action="controller">
<input type="submit" value="Finalizar"/></br></br>
<input name="action" value="finalizar" style="visibility: hidden; display: none;">
</form>
</body>
</html>