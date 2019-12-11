<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Alta Usuarios</title>
</head>
<body>
<h2>Alta Usuarios</h2>

<form method="POST" action="alta">

Usuario: <input type="text" name="usuario"/></br></br>
Password: <input type="text" name="password"/></br></br>


<input type="submit" value="Alta"/></br></br>
<input name="action" value="altaUsuario" style="visibility: hidden; display: none;">

</form>
<p>${men }</p>


<a href="http://localhost:8080/springapp/filmografia/welcome">
<input type="button" value="Volver" />
</a>

</body>
</html>