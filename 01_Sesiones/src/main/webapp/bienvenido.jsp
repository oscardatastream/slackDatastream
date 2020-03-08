<%@page import="com.curso.java.entidades.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset='utf-8'>
	<meta http-equiv='X-UA-Compatible' content='IE=edge'>
	<title>Bienvenido</title>
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<link rel='stylesheet' type='text/css' media='screen' href='css/formularios.css'>
	<script src='main.js'></script>
</head>

<body>
	<%
		String haySesionUsuario = (String) session.getAttribute("haySesion");

		if (haySesionUsuario != null) {
			Usuario usuario = (Usuario) session.getAttribute("sesionUsuario");
	%>
	<h1 style="color: darkolivegreen;">
		Bienvenido&nbsp;<span style="background-color: darkolivegreen; color: #ffffff; padding: 0 5px;">

			<%
				out.print(usuario.getUsuario());
			%>

		</span>...
	</h1>
	<p></p>
	<p>
		<a href="sesiones?iniciar=false">Cerrar Sesion</a>
	</p>
	<p></p>

	<%
		}
	%>



</body>

</html>