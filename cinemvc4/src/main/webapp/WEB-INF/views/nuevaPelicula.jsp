<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Nueva Pelicula</title>
</head>
<body>
<h2>Nueva Película</h2>

<form method="POST" action="nuevaPelicula2">

Director: <input type="text" name="director"/></br></br>
Titulo: <input type="text" name="titulo"/></br></br>
Fecha: <input type="text" name="fecha"/> Formato DAY-MONTH-YEAR</br></br>
ID: <input type="text" name="id"/></br></br>
<input type="submit" value="Crear"/></br></br>
<input name="action" value="crearPelicula" style="visibility: hidden; display: none;">

</form>
<p>${men }</p>

<a href="http://localhost:8080/springapp/filmografia/welcome">
<input type="button" value="Volver" />
</a>
</body>
</html>