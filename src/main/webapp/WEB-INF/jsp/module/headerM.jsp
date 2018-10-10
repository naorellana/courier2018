<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
    <title>Welcome</title>

    <!-- CSS  -->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <link href="/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
</head>
<body>
    <header>
        <nav class="black lighten-1" role="navigation">
            <div class="nav-wrapper container"><a id="logo-container" href="/" class="brand-logo">App</a>
                <ul class="right hide-on-med-and-down">
                    <li><a href="estado">ESTADO</a></li>
                    <li><!-- Dropdown Trigger -->
                        <a class='dropdown-button ' href='#' data-activates='personasP'> Personas &#9871</a>
                    </li>
                    <li><!-- Dropdown Trigger -->
                        <a class='dropdown-button ' href='#' data-activates='direccionesP'>Direcciones &#9871</a>
                    </li>
                    <li><a href="logout">Cerrar Sesion</a></li>
                    

                    
                </ul>
                <!-- Dropdown Structure -->
                    <ul id='personasP' class='dropdown-content'>
                        <li><a class="waves-effect  black-text" href="persona"><i class="material-icons">person</i>Persona</a></li>
                        <li><a class="waves-effect  black-text" href="cliente"><i class="material-icons">person</i>Clientes</a></li>
                        <li><a class="waves-effect  black-text" href="usuario"><i class="material-icons">person</i>tipoUsuario</a></li>
                        <li><a class="waves-effect  black-text" href="empleado"><i class="material-icons">person</i>Empleados</a></li>
                    </ul>
                    <!-- Dropdown Structure -->
                    <ul id='personasM' class='dropdown-content'>
                        <li><a class="waves-effect  black-text" href="persona"><i class="material-icons">person</i>Persona</a></li>
                        <li><a class="waves-effect  black-text" href="cliente"><i class="material-icons">person</i>Clientes</a></li>
                        <li><a class="waves-effect  black-text" href="usuario"><i class="material-icons">person</i>tipoUsuario</a></li>
                        <li><a class="waves-effect  black-text" href="empleado"><i class="material-icons">person</i>Empleados</a></li>
                    </ul>
                    
                    <!-- Dropdown Structure -->
                    <ul id='direccionesP' class='dropdown-content'>
                        <li><a class="waves-effect  black-text" href="departamento"><i class="material-icons">edit_location</i>departamento</a></li>
                        <li><a class="waves-effect  black-text" href="municipio"><i class="material-icons">edit_location</i>municipio</a></li>
                        <li><a class="waves-effect  black-text" href="pais"><i class="material-icons">edit_location</i>  - País - </a></li>
                        <li><a class="waves-effect  black-text" href="direccion"><i class="material-icons">edit_location</i>direccion</a></li>
                    </ul>
                    <!-- Dropdown Structure -->
                    <ul id='direccionesM' class='dropdown-content'>
                        <li><a class="waves-effect  black-text" href="departamento"><i class="material-icons">edit_location</i>departamento</a></li>
                        <li><a class="waves-effect  black-text" href="municipio"><i class="material-icons">edit_location</i>municipio</a></li>
                        <li><a class="waves-effect  black-text" href="pais"><i class="material-icons">edit_location</i>  - País - </a></li>
                        <li><a class="waves-effect  black-text" href="direccion"><i class="material-icons">edit_location</i>direccion</a></li>
                    </ul>
                    

                <ul id="nav-mobile" class="side-nav">                 
                    <li><a href="estado">ESTADO</a></li>
                    <li><!-- Dropdown Trigger -->
                        <a class='dropdown-button ' href='#' data-activates='personasM'> Personas +</a>
                    </li>
                    <li><!-- Dropdown Trigger -->
                        <a class='dropdown-button ' href='#' data-activates='direccionesM'><i class="material-icons">arrow_drop_down</i>Direcciones</a>
                    </li>
                    <li><a href="logout">Cerrar Sesion</a></li>
                    
                </ul>
                <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
            </div>
        </nav>
    </header>
