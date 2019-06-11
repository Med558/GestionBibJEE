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
<h1 style="margin:15px">Ajout Livre</h1>
		<c:if test="${!empty message}" >
			<div class="alert alert-success">
			  <h2 style="margin:10px"><c:out value="${message}"/> </h2>
			</div>
		</c:if>
		<form method="post" action="AjoutLivre">
			 <div class="form-row">
			    <div class="form-group col-md-6">
				    <label for="idLivre">idLivre</label>
					<input type="text" class="form-control" name="idLivre" id="idLivre"/>
			    </div>
			    			  <div class="form-group">
			 	 <label for="titre">titre</label>
				<input type="text" class="form-control" name="titre" id="titre"/>
			  </div>
			    <div class="form-group col-md-6">
				    <label for="nbreTotalCopies">nbreTotalCopies</label>
					<input type="text" class="form-control" name="nbreTotalCopies" id="nbreTotalCopies"/>
			    </div>
			  </div>
			  
				 
			  <button type="submit">Ajouter le livre </button>
			  <button type="reset">supprimer les champs </button>
		</form>
	

</body>
</html>