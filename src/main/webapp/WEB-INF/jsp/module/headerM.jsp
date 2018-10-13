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
                    <li><!-- Dropdown Trigger -->
                        <a class='dropdown-button ' href='#' data-activates='personasP'> Personas &#9871</a>
                    </li>
                    <li><!-- Dropdown Trigger -->
                        <a class='dropdown-button ' href='#' data-activates='direccionesP'>Direcciones &#9871</a>
                    </li>
                    <li><!-- Dropdown Trigger -->
                        <a class='dropdown-button ' href='#' data-activates='paquetesP'>Paquetes &#9871</a>
                    </li>
                    <li><!-- Dropdown Trigger -->
                        <a class='dropdown-button ' href='#' data-activates='facturaP'>Facturación &#9871</a>
                    </li>
                    <li><a href="logout">Cerrar Sesion</a></li>
                     <li>
                            <a class="btn btn-large waves-effect waves-light blue" href="https://alexisocpruebas.000webhostapp.com/courier/" target="blank"><i class="material-icons">home</i>Sitio Web</a>
                        </li>
                    

                    
                </ul>
                <!-- Dropdown Structure -->
                    <ul id='personasP' class='dropdown-content'>
                        <li><a class="waves-effect  black-text" href="persona"><i class="material-icons">accessibility</i>Persona</a></li>
                        <li><a class="waves-effect  black-text" href="cliente"><i class="material-icons">person_pin</i>Clientes</a></li>
                        <li><a class="waves-effect  black-text" href="usuario"><i class="material-icons">person_outline</i>tipoUsuario</a></li>
                        <li><a class="waves-effect  black-text" href="empleado"><i class="material-icons">contacts</i>Empleados</a></li>
                    </ul>
                    <!-- Dropdown Structure -->
                    <ul id='personasM' class='dropdown-content'>
                        <li><a class="waves-effect  black-text" href="persona"><i class="material-icons">accessibility</i>Persona</a></li>
                        <li><a class="waves-effect  black-text" href="cliente"><i class="material-icons">person_pin</i>Clientes</a></li>
                        <li><a class="waves-effect  black-text" href="usuario"><i class="material-icons">person_outline</i>tipoUsuario</a></li>
                        <li><a class="waves-effect  black-text" href="empleado"><i class="material-icons">contacts</i>Empleados</a></li>
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
                        <li><a class="waves-effect  black-text" href="destinatario"><i class="material-icons">edit_location</i>departamento</a></li>
                        <li><a class="waves-effect  black-text" href="municipio"><i class="material-icons">edit_location</i>municipio</a></li>
                        <li><a class="waves-effect  black-text" href="pais"><i class="material-icons">edit_location</i>  - País - </a></li>
                        <li><a class="waves-effect  black-text" href="direccion"><i class="material-icons">edit_location</i>direccion</a></li>
                    </ul>
                    
                    
                    <!-- Dropdown Structure -->
                    <ul id='paquetesP' class='dropdown-content'>
                        <li><a class="waves-effect  black-text" href="destinatario"><i class="material-icons">person_pin_circle</i>Destinatario</a></li>
                        <li><a class="waves-effect  black-text" href="remitente"><i class="material-icons">transfer_within_a_station</i>Remitente</a></li>
                        <li><a class="waves-effect  black-text" href="estado"><i class="material-icons">info</i>Estado</a></li>
                        <li><a class="waves-effect  black-text" href="servicio"><i class="material-icons">directions_run</i> Servicio </a></li>
                        <li><a class="waves-effect  black-text" href="vehiculo"><i class="material-icons">local_shipping</i>vehiculo</a></li>
                        <li><a class="waves-effect  black-text" href="flotilla"><i class="material-icons">directions_bus</i> Flotilla </a></li>
                    </ul>
                    <ul id='paquetesM' class='dropdown-content'>
                        <li><a class="waves-effect  black-text" href="destinatario"><i class="material-icons">person_pin_circle</i>Destinatario</a></li>
                        <li><a class="waves-effect  black-text" href="remitente"><i class="material-icons">transfer_within_a_station</i>Remitente</a></li>
                        <li><a class="waves-effect  black-text" href="estado"><i class="material-icons">info</i>Estado</a></li>
                        <li><a class="waves-effect  black-text" href="servicio"><i class="material-icons">directions_run</i> Servicio </a></li>
                        <li><a class="waves-effect  black-text" href="vehiculo"><i class="material-icons">local_shipping</i>vehiculo</a></li>
                        <li><a class="waves-effect  black-text" href="flotilla"><i class="material-icons">directions_bus</i> Flotilla </a></li>
                    </ul>
                    
                    <!-- Dropdown Structure -->
                    <ul id='facturaP' class='dropdown-content'>
                        <li><a class="waves-effect  black-text" href="factura"><i class="material-icons">payment</i>Factura</a></li>
                        <li><a class="waves-effect  black-text" href="paquete"><i class="material-icons">transfer_within_a_station</i>paquete</a></li>
                        <li><a class="waves-effect  black-text" href="tracking"><i class="material-icons">gps_fixed</i>tracking</a></li>
                        <li><a class="waves-effect  black-text" href="detalle"><i class="material-icons">list</i>Detalle</a></li>
                    </ul>
                    <ul id='facturaM' class='dropdown-content'>
                        <li><a class="waves-effect  black-text" href="factura"><i class="material-icons">payment</i>Factura</a></li>
                        <li><a class="waves-effect  black-text" href="paquete"><i class="material-icons">transfer_within_a_station</i>paquete</a></li>
                        <li><a class="waves-effect  black-text" href="tracking"><i class="material-icons">gps_fixed</i>tracking</a></li>
                        <li><a class="waves-effect  black-text" href="detalle"><i class="material-icons">list</i>Detalle</a></li>
                    </ul>
                    
                    <ul id="nav-mobile" class="side-nav">   
                        <li><!-- Dropdown Trigger -->
                            <a class='dropdown-button ' href='#' data-activates='personasM'> Personas &#9871</a>
                        </li>
                        <li><!-- Dropdown Trigger -->
                            <a class='dropdown-button ' href='#' data-activates='direccionesM'>Direcciones &#9871</a>
                        </li>
                        <li><!-- Dropdown Trigger -->
                            <a class='dropdown-button ' href='#' data-activates='paquetesM'>Paquetes &#9871</a>
                        </li>
                        <li><!-- Dropdown Trigger -->
                            <a class='dropdown-button ' href='#' data-activates='facturaM'>Facturación &#9871</a>
                        </li>
                        <li><a href="logout">Cerrar Sesion</a></li>
                                                <li>
                            <a class="btn btn-large waves-effect waves-light blue" href="https://alexisocpruebas.000webhostapp.com/courier/" target="blank"><i class="material-icons">home</i>Sitio Web</a>
                        </li>
                    </ul>
                <a href="#" data-activates="nav-mobile" class="button-collapse white-text"><i class="material-icons">menu</i></a>
            </div>
        </nav>
    </header>
