<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="fr.noixcoop.nuceus.*"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta http-equiv="Content-Type" charset="utf-8">
<link type="text/css" href="style/css/bootstrap.css" rel="stylesheet">
<title>Ajouter une variété</title>
</head>
<body>

	<nav class="navbar navbar-header navbar-fixed-top navbar-inverse">
		<div class="navbar-brand black">Ajouter une variété</div>
		<ul class="nav navbar-nav navbar-right" style="margin-right: 15px">
			<li class="active"><a href="?action=annulerAjout">Annuler</a></li>
		</ul>
	</nav>
	<div class="container" style="margin-top: 70px !important">
		<div class="row">
			<div class="col-md-12">
				<form class="form-group" method="get">
					<label for="libelle">Libellé : </label> <input class="input"
						type="text" id="libelle" name="libelle" value="" size="20" /> <label
						for="aoc">AOC : </label> <input type="checkbox" id="aoc"
						name="aoc" value="aoc" /> <input type="hidden" name="action"
						value="ajouter" /> <input class="input" type="submit"
						value="Ajouter" />

				</form>
			</div>
		</div>
	</div>

</body>
</html>