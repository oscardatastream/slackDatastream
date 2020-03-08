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
		String haySesionUsuario = (String) session.getAttribute("haySesion");

		if (haySesionUsuario != null && haySesionUsuario.equals("si")) {
			response.sendRedirect("bienvenido.jsp");
		}
	%>
    <form action="sesiones" method="GET">
        <input type="hidden" name="iniciar" value="true">
        <label for="usuario">Usuario</label>
        <input id="usuario" type="text" name="usuario">
        <label for="clave">Clave</label> 
        <input id="clave" type="password" name="clave">
        <button>Enviar</button>
    </form>
    <div>
        <h3 style="color: red; text-align: center;">
            <%
 	if (haySesionUsuario != null && haySesionUsuario.equals("no")) {
 		out.print("*Usuario Invalido");
 	}
 %>

        </h3>


    </div>


</body>

</html>