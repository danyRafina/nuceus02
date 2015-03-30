<%@ page import="java.util.*"%>
<%@ page import="fr.noixcoop.nuceus.*"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta http-equiv="Content-Type" charset="utf-8">
<title>Insert title here</title>
<link type="text/css" href="style/css/bootstrap.css" rel="stylesheet">
<%
	String libelle = (String) request.getAttribute("libelle");
	String aoc = (String) request.getAttribute("aoc");
%>
</head>
<body>
	<nav class="navbar navbar-header navbar-fixed-top navbar-inverse">
		<div class="navbar-brand black">Liste des variétés de Noix</div>
		<a class="navbar-right" style="color:white;font:20px Arial bold; margin-top:11px;margin-right:23px!important"href="?action=visualiser">Retourner</a>
	</nav>

	<div class="container" style="margin-top:50px">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h1>Confirmation de l'ajout</h1>
				<% if(libelle != null &&  aoc != null) { %>
				<ul class="list-group-item">
					<li>Libellé : <%=libelle%></li>
					<li>AOC : <%=aoc%></li>
					<li><a href="?action=visualiser">Visualiser</a></li>
				
				</ul>
					<% } else { %>
					<h2> Oups ! La variété n'a pas été ajoutée</h2>
					<% } %>
			</div>
		</div>
	</div>

</body>
</html>
