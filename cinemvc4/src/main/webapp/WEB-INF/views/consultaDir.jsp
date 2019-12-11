<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<h2>Consultar</h2>


<form method="POST" action="controller">
Director: <input type="text" name="director">
<input type="submit" value="consultar">
<input name="action" value="mostrarInformacion" style="visibility: hidden; display: none;">
</form>


<a href="index.jsp"><input type="button" value="Volver"/></a>

</body>
</html>
