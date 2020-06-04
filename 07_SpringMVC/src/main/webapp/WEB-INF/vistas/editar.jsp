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
		<div class="topnav">
				<a href="index.html">Inicio</a>
			<a href="agregar.html">Agregar</a>
		</div>
		<div class="row">
			<div class="container">
				<form action="actualizar.html" method="POST">
					<input type="hidden" value="${alumno[0].TipoDoc}" name="TipoDoc"/>
							<input type="hidden" value="${alumno[0].Documento}" name="Documento"/>
					<div class="row">
						<div class="col-25">
							<label for="razonSocial">Razon Social:</label>
						</div>
						<div class="col-75">
							<input type="text" id="razonSocial" name="razonSocial" value="${alumno[0].RazonSocial}" required />
						</div>
					</div>
					<div class="row">
						<div class="col-25"></div>
						<div class="col-75"></div>
					</div>
					<div class="row">
						<div class="col-100">

							<input type="submit" value="Agregar" /> 
							<button onclick="window.location.href='index.html'" class="button warning">Cancelar</button>
						</div>
					</div>
				</form>
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
