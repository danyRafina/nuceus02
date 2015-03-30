<%@ page import="java.util.*"%>
<%@ page import="fr.noixcoop.nuceus.*"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta http-equiv="Content-Type" charset="utf-8">
<title>Insert title here</title>
<link type="text/css" href="style/css/bootstrap.css" rel="stylesheet">

</head>
<body>
	<%
		List<Variete> varietes = (List<Variete>)request.getAttribute("varietes");
	%>
	<nav class="navbar navbar-header navbar-fixed-top navbar-inverse">
		<div class="navbar-brand black">Liste des variétés de Noix</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="?action=renseignerAjout">Ajouter</a></li>
		</ul>

	</nav>

	<div class="container" style="margin-top: 70px">
		
			<div class="col-md-12">
			
				<table
					class="table-responsive table-hover table-condensed col-md-12 text-center"
					border="1" style="boder-collapse: collapse">
					<thead>
						<tr>
							<th class="col-md-5 text-center bg-primary">Libéllé</th>
							<th class="col-md-5 text-center bg-primary">AOC</th>
							<th class="col-md-2 text-center bg-primary ">Supprimer ?</th>
						</tr>

					</thead>
					<tbody>
						<%
						int i=0;
						
							for (Variete variete : varietes) {
						%>
						<tr>
							<td><%=variete.getLibelle()%></td>

							<td>
								<%
									if (variete.isAoc() == true) {
								%> Oui <%
									} else {
								%> Non <%
									}
								%>
							</td>
							<td>
								<div class="glyphicon glyphicon-remove" data-toggle="modal" data-target="<%= "#myModal"+i %>"  id="remove" ></div>
						<span id='variete' style="display:none"><%=variete.getLibelle()%></span>
							<div class="modal fade" id="<%= "myModal"+i %>" tabindex="-1" role="dialog"
					aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="myModal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
								<h4 class="modal-title" id="myModalLabel">Suppression </h4>
							</div>
							<div class="modal-body">Voulez-vous supprimer la variété : <%=variete.getLibelle()%></div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Non</button>
								<button type="button" id="button" class="btn btn-primary" onClick="location.href='?action=Supprimer&variete=<%=variete.getLibelle()%>'">Oui
									</button>
							</div>
						</div>
					</div>
				</div>
							</td>
							
							
						</tr>
						
						<%
						i++;
							}
						%>
					</tbody>

				</table>
				
			</div>
		</div>
				
		<script src="style/js/jQuery.js"></script>
<script src="style/js/bootstrap.js"></script>

		

</body>
</html>