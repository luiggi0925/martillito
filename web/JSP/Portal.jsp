<%-- 
    Document   : Inicio
    Created on : 30/05/2018, 06:01:17 PM
    Author     : LAB-USR-AQ265-A0805
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Portal</title>
        <link href="../css/presentacion.css" rel="stylesheet" type="text/css"/>
        <link href="https://fonts.googleapis.com/css?family=Anton|Bowlby+One+SC|Pacifico" rel="stylesheet">

        
    </head>
    <body bgcolor="#819FF7" >
        <nav>
            <a href="${pageContext.request.contextPath}/JSP/Inicio.jsp" class="nav-link">Inicio</a>
            <a href="${pageContext.request.contextPath}/ListaHerramientas" class="nav-link"> Productos</a>                                     
        </nav>
        <h1 class="anton"  style="text-align: center" >Ferreteria Martillito</h1>
        <h2 class="one"> Mision</h2>
        
        <p style="text-align: center">
            Somos una empresa comercializadora de productos de ferretería liviana que satisfacen las 
            necesidades de nuestros clientes, con asesoría, calidad y respaldo.
            Actuamos basados en nuestros valores corporativos, preservando el sano equilibrio entre los
            intereses de clientes, colaboradores, proveedores, accionistas y comunidad donde operamos.</p>
        
        <h2 class="one">Visión</h2>
        
        <p style="text-align: center">
            En el año 2020 seremos la empresa ferretera preferida por nuestros clientes, 
            brindándoles soluciones, desarrollando el talento humano de nuestros colaboradores y 
            generando beneficios para los accionistas.</p>
        
         <img src="../Img/banner2.jpg" alt="banner" height="290"/>
    </body>
</html>
