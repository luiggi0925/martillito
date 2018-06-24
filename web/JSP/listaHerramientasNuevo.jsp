<%-- 
    Document   : listaHerramientas
    Created on : 23/04/2018, 07:19:07 PM
    Author     : LAB-USR-AQ265-A1005
--%>
<%@page import="Martillito.modelo.adm.UsuarioRepositorio"%>
<%@page import="Martillito.modelo.vo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ferreteria</title>
        <link href="../css/presentacion.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/css/estilo_ferreteria.css" rel="stylesheet" type="text/css"/>
    </head>
        <h1>Bienvenido ${usuario.nombres}</h1>
        <center>
    <body>
    
        
        <img class="banner" src="${pageContext.request.contextPath}/Img/bannerferreteria.jpg" alt=""/>
        
        
        <nav>
            <a href="${pageContext.request.contextPath}/JSP/Inicio.jsp" class="nav-link">Inicio</a>
            <a href="${pageContext.request.contextPath}/JSP/Portal.jsp" class="nav-link">Portal</a>                                    
        </nav>
        <h1><p>Productos de Ferreteria TODO</p> </h1>
<div>
    <c:forEach items="${listaProducto}" var="producto" varStatus="contador">
        <div style="float:left;">
            <a href="${pageContext.request.contextPath}/HerramientaServlet?cod_prod=${producto.codProd}">
            <img src="${pageContext.request.contextPath}/Img/${producto.img}"/>
            </a><br>
            Codigo: ${producto.codProd}<br>
            Producto: ${producto.nomProd}<br>
            Precio: ${producto.precio}<br>
            Stock: ${producto.stock}<br>              
        </div>
            <c:if test="${contador.count %3==0}">
                </div>
                <div>
            </c:if> 
    </c:forEach>
                    
                    
                    


    <%--
        ${anything} == expression language
        <%(codigo java) %> == scriplet
    --%>
</div>
             




    </body>
    </center>
