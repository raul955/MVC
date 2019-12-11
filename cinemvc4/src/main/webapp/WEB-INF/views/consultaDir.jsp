<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<h2>Consultar</h2>


<form method="POST" action="consultaDir">
Director: <input type="text" name="director">
<input type="submit" value="consultar">
<input name="action" value="mostrarInformacion" style="visibility: hidden; display: none;">
</form>

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

<a href="index.jsp"><input type="button" value="Volver"/></a>

</body>
</html>
