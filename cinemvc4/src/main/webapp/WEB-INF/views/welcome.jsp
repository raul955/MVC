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

<form method="post" action="controller">
<input type="submit" value="Mantenimiento">
<input name="action" value="mantenimientojsp" style="visibility: hidden; display: none;">
</form>



<a href="newUser.jsp"><input type="submit" value="Nuevo Usuario"></a></br></br>

<a href="login.jsp"><input type="submit" value="Volver" /></a>


</body>
</html>