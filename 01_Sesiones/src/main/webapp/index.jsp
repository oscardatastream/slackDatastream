<%@page import="com.curso.java.entidades.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">

<head>
	<meta charset='utf-8'>
	<meta http-equiv='X-UA-Compatible' content='IE=edge'>
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<!--     <link rel='stylesheet' type='text/css' media='screen' href='css/formularios.css'> -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script src='main.js'></script>
	<title>Clase 01 - Sesiones JSP</title>

</head>

<body>

	<div class="jumbotron text-center">
		<h1>Java EE</h1>
		<p>Mi primera pagina con sesiones</p>
	</div>

	<%
		Usuario usuario = (Usuario) session.getAttribute("sesionUsuario");

		if (usuario != null) {
			response.sendRedirect("bienvenido.jsp");
		}
	%>
	<%
		String error = (String) request.getAttribute("error");
		if (error != null) {
	%>

	<div class="container">
		<div class="alert alert-danger alert-dismissible">
			<a class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>ERROR! </strong> <%=error%>
		</div>
	</div>
	<%
		}
	%>

	<div class="container">

		<form action="sesiones" method="POST">

			<div class="input-group">

				<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
				<input type="text" class="form-control" name="usuario" id="usuario" placeholder="usuario">
			</div>
			<p></p>
			<div class="input-group">
				<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span> <input type="password"
					class="form-control" name="clave" id="clave" placeholder="clave">
			</div>
			<p></p>
			<p></p>
			<p></p>
			<p></p>
			<div>
				<button type="submit" class="btn btn-primary btn-block">Enviar</button>
			</div>
		</form>
	</div>
	<div></div>


</body>

</html>