<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">

<head>
<meta charset='utf-8'>
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<!--     <link rel='stylesheet' type='text/css' media='screen' href='css/formularios.css'> -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src='main.js'></script>
<title>Clase 02 - Web Services</title>

</head>

<body>

	<div class="jumbotron text-center">
		<h1>Java EE</h1>
		<h2>Mi primer Servicio Web - Cliente</h2>
	</div>

	<%
		String cadena = (String) request.getAttribute("cadena");

		if (cadena != null) {
	%>

	<div class="container">
		<div class="media">
			<div class="media-left">
				<img src="img/Perfil 4 CF.jpeg" class="media-object"
					style="width: 150px">
			</div>
			<div class="media-body">
				<h4 class="media-heading">Cadena Transformada</h4>
				<p><%=cadena%></p>
				<div></div>
			</div>
		</div>
	</div>


	<div class="container">
		<a href="index.jsp" class=" btn btn-link" role="button">volver</a>
	</div>


	<%
		} else {
			response.sendRedirect("index.jsp");
		}
	%>



</body>

</html>