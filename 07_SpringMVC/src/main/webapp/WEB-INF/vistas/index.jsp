<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ page isELIgnored = "false" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Usuarios</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" type="text/css" media="screen"
	href="<c:url value="resources/css/estilo.css"/>"

	 />
</head>
<body>
	<div class="header">
		<h1>JAVA WEB API</h1>
		<img src="<c:url value="resources/imagenes/logo.png"/>" width="200" height="50" />

		<h2>CRUD con Spring</h2>
		<h2>${mensaje}</h2>
		<div class="topnav">
			<a href="agregar.html">Agregar</a>
		</div>

		<div class="row">
			<div class="container">
				<table id="alumnos">
					<tr>
						<th>TipoDoc</th>
						<th>Documento</th>
						<th>RazonSocial</th>
						<th>Accion</th>
					</tr>
					<c:forEach var="alumno" items="${listaAlumnos}">
					<tr>
						<td>${alumno.TipoDoc}</td>
						<td>${alumno.Documento}</td>
						<td>${alumno.RazonSocial}</td>
						<td><button onclick="window.location.href='editar.html?TipoDoc=${alumno.TipoDoc}&Documento=${alumno.Documento}'" class="button warning">Editar</button>
						<button onclick="window.location.href='eliminar.html?TipoDoc=${alumno.TipoDoc}&Documento=${alumno.Documento}'" class="button danger">Eliminar</button></td>
					</tr>
					</c:forEach>

				</table>
			</div>
		</div>

		<div class="footer1">
			<h3>Pie de Pagina</h3>
		</div>

		<div class="footer2">
			<p>Ing. Octavio Robleto. Copyright 2020-2025</p>
		</div>
	</div>
</body>
</html>
