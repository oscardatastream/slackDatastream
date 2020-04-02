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
    <title>Clase 02 - Web Services</title>



</head>

<body>

    <div class="jumbotron text-center">
        <h1>Java EE</h1>
        <h2>Mi primer Servicio Web - Cliente</h2>
    </div>

    <div class="container">

        <div class="col-sm-3"></div>
        <div class="col-sm-6">

            <form action="transformar" method="GET">

                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                    <input type="text" class="form-control" name="cadena" id="cadena" placeholder="Escriba el Texto a Transformar">
                </div>
                <p></p>
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
                    <select class="form-control" name="opcion" id="opcion">
                        <option value="1">Convertir toda la cadena en Mayusculas</option>
                        <option value="2">Convertir toda la cadena en Minusculas</option>
                        <option value="3">Convertir cada palabra de la cadena en Mayusculas</option>
                        <option value="4">Convertir cada palabra de la cadena en Minusculas</option>
                        <option value="5">Convertir primera letra de la Cadena en Mayuscula</option>
                        <option value="6">Convertir primera letra de la Cadena en Minusculas</option>
                    </select>   
                </div>
                <p></p>


                <div>

                    <button type="submit" class="btn btn-primary btn-block">Transformar</button>
                </div>
            </form>
            <div class="col-sm-3"></div>
        </div>

    </div>
</body>

</html>