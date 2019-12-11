<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Mantenimiento</title>
</head>
<body>
	<h2>Mantenimiento</h2>

	<table id="tablaMantenimiento">
		<tr>
			<td style="height: 28px; width: 150px;">Director</td>
			<td style="height: 28px; width: 150px;">Titulo</td>
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
	</br>
	<a href="nuevaPelicula.jsp"><input type="submit" value="Nueva Película" /></a></br></br>
	<a href="modificarPelicula.jsp"><input type="submit" value="Modificar Pelicula" /></a></br></br>
	<a href="borrarPelicula.jsp"><input type="submit" value="Borrar Película" /></a></br></br>
	<a href="welcome.jsp"><input type="submit" value="Volver" /></a></br></br>

</body>
</html>