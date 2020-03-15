<%@page import="com.curso.java.entidades.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Sesion de Usuarios</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='css/formularios.css'>
    <script src='main.js'></script>


</head>

<body>

	<%
		Usuario usuario = (Usuario) session.getAttribute("sesionUsuario");

		if (usuario != null) {
			response.sendRedirect("bienvenido.jsp");
		}
	%>
	<form action="sesiones" method="POST">
        <label for="usuario">Usuario</label>
        <input id="usuario" type="text" name="usuario">
        <label for="clave">Clave</label> 
        <input id="clave" type="password" name="clave">
        <button>Enviar</button>
    </form>
    <div>
		<h3 style="color: red; text-align: center;">
			<%
				String error = (String) request.getAttribute("error");
				out.print((error != null ? error : ""));
			%>

		</h3>


	</div>


</body>

</html>