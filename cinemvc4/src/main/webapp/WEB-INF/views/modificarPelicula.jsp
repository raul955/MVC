<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Modificar Película</title>
</head>
<body>
<h2>Modificar Película</h2>

<form method="POST" action="controller">

ID: <input type="text" name="id"/></br></br>
<p>----------------------------</p>
Director: <input type="text" name="director"/></br></br>
Titulo: <input type="text" name="titulo"/></br></br>
Fecha: <input type="text" name="fecha"/> Formato DAY-MONTH-YEAR</br></br>

<input type="submit" value="Modificar"/></br></br>
<input name="action" value="modificarPelicula" style="visibility: hidden; display: none;">

</form>
<p>${men }</p>

<a href="mantenimiento.jsp"><input type="submit" value="Volver" /></a>
</body>
</html>