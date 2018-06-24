<%-- 
    Document   : Portal
    Created on : 30/05/2018, 04:47:50 PM
    Author     : LAB-USR-AQ265-A0805
--%>

<%@page import="Martillito.modelo.vo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
Usuario usuario = session.getAttribute("usuario")!=null?(Usuario)session.getAttribute("usuario"):new Usuario();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ferreteria Martillito</title>
        <link href="css/presentacion.css" rel="stylesheet" type="text/css"/>
        <link href="https://fonts.googleapis.com/css?family=Pacifico" rel="stylesheet">
    </head>
   
    <body  >
         
             <header class="main-header" style="text-align: center">
        
        <h1 >Bienvenido a nuestra pagina web</h1>
          <p>Bienvenido usuario: <%= usuario.getNombres() + ", " + usuario.getApePaterno()+" " + usuario.getApeMaterno() %></p>
        <nav>
            <a href="${pageContext.request.contextPath}/JSP/Portal.jsp" class="nav-link">Portal</a>
            <a href="${pageContext.request.contextPath}/ListaHerramientas" class="nav-link"> Productos</a>
                                                          
        </nav>
        </header>
         
    <article>
        
        <header style="text-align: center">
            
            <img src="${pageContext.request.contextPath}/Img/LOGO.png" alt="logo" height="400"/>
            <h1 class="red-text pacifico"> Un lugar para todas las herramientas </h1>
        </header>
    </article>
                
        
        
       
    </body>
    
</html>
