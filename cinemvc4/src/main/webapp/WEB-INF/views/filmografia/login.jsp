<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<h2 align="center">Login</h2>
	<form method="POST" action="http://localhost:8080/cinemvc4/filmografia/login">
		</br> </br>
		<div align="center">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Usuario: <input type="text"
				name="usuario" /></br> </br> Contraseña: <input type="text" name="password" /></br>
			</br> <input type="submit" value="Iniciar" /></br> <input name="action"
				value="loginValidate" style="visibility: hidden; display: none;">
	</form>
	</div>
	
	<table id="tablaLogin" align="center">

		<c:forEach items="${listaUsr}" var="info">
			<tr>
				<td>${info.usuario }</td>
			</tr>
		</c:forEach>
	</table>
	
	<div align="center">
		<a href="index.jsp"><input type="submit" value="Inicio" /></a>
	</div>
</body>
</html>