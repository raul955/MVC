<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Bienvenido</title>
</head>
<body>
<h2>Bienvenido ${user }</h2>


</br></br>

<form method="post" action="welcome">
<input type="submit" value="Mantenimiento">
<input name="action" value="mantenimientojsp" style="visibility: hidden; display: none;">
</form>


<a href="http://localhost:8080/springapp/filmografia/newUser">
<input type="button" value="newUser"></br></br>
</a>

<a href="http://localhost:8080/springapp/filmografia/login">
<input type="button" value="Volver" />
</a>


</body>
</html>