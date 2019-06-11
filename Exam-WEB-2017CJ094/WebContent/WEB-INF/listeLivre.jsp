<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="margin:15px" >Listes des livres</h1>
<h1>Le nombre total des livre est <c:out value="${ nbr }"></c:out></h1>
	<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">idLivre</th>
		      <th scope="col">titre</th>
		      <th scope="col">nbreTotalCopies</th>
		      <th scope="col">nbrCopiesDisponible</th>
		      <th scope="col">impactLivre</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach var="Livre" items="${ l }"> 
		    <tr>
		      <th scope="row"><c:out value="${ Livre.idLivre }" /> </th>
		      <td><c:out value="${ Livre.titre }" /></td>
		      <td><c:out value="${ Livre.nbreTotalCopies }" /></td>
		      <td><c:out value="${ Livre.nbrCopiesDisponible }" /></td>
  			  <td><c:out value="${ Livre.impactLivre }" /></td>
  			  <c:if test="${ Livre.impactLivre } > 10">
  			  <td>Livre interessant</td></c:if>
		    </tr>
		    
		  </c:forEach>
		  
		  </tbody>
		</table>
</body>
</html>