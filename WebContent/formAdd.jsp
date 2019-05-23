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
	<h2>Ajouter un livre</h2>
	<br>
    <form action="add" method="POST">
    	<table cellpadding="5">
    		<tr>
    			<td> Titre :</td>
    			<td><input type="text"  value="titre" name="titre"/></td>
			</tr>
			<tr>
				<td>Auteur :</td>
				<td><input type="text"  value="auteur" name="auteur"/></td>
			</tr>
			<tr>
				<td>Prix :</td>
				<td><input type="number"  value="prix" name="prix"/></td>
			</tr>
		</table>
		<br>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>