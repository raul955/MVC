<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Borrar Película</title>
</head>
<body>
<h2>Borrar Película</h2>
<form method="POST" action="controller">

ID: <input type="text" name="id"/></br></br>
<p>----------------------------</p>

<input type="submit" value="Borrar"/></br></br>
<input name="action" value="borrarPelicula" style="visibility: hidden; display: none;">

</form>
<p>${men }</p>


<a href="mantenimiento.jsp"><input type="submit" value="Volver" /></a>
</body>
</html>