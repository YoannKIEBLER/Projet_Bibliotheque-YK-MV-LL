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
	<div align="center">
		<table border="1" cellpadding="5">
			<caption><h2>La bibliotheque du bonheur</h2></caption>
			<tr align="center">
				<th>
					id
					<td><b>Titre</b></td>
					<td><b>Auteur</b></td>
					<td><b>Prix</b></td>
					
				</th>
			</tr>
			<c:forEach var="element" items="${liste}">
				<tr>
					<td><c:out value="${element.getId()}" /></td>
					<td><c:out value="${element.getTitre()}" /></td>
					<td><c:out value="${element.getAuteur()}" /></td>
					<td><c:out value="${element.getPrix()}" /></td>
					
				</tr>
			</c:forEach>
		</table>
	</div>
	<br>
	<br>
	<div align="center">
		<table >
			<tr> 
      			<td><form action="formAdd.jsp" method ="POST">
       					<input type="submit"  value="Ajouter" />
       			</form></td>
        		<td><form action="formDelete.jsp" method ="POST">
       					<input type="submit"  value="Supprimer" "/>
       			 </form></td>
        		<td><form action="formUpdate.jsp" method ="POST">
       				<input type="submit"  value="Modifier" "/>
       			</form></td>
       		</tr>
		</table>
		
	</div>
	
	
</body>
</html>