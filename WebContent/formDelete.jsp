<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Sélectionner l'ID du livre à supprimer</h2> <br>
	
	
	
    <form action="Delete" method="POST">
    	ID : <input type="text" value="id" name="id"/>
    	<br><br>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>