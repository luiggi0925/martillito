<%-- 
    Document   : PortalAdmin
    Created on : 02/06/2018, 12:50:28 AM
    Author     : Renato
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
        
        <title>Portal administrador</title>
        <link href="css/portal.css" rel="stylesheet" type="text/css"/>
             <nav>
            <a href="${pageContext.request.contextPath}/JSP/Inicio.jsp" class="nav-link">Inicio</a>
            <a href="${pageContext.request.contextPath}/ListaHerramientas" class="nav-link"> Productos</a>                                     
        </nav>
        
</head>
    
    
<center>
<body>
        
        
        
        
        
        <h2>Bienvenido administrador: <%= usuario.getNombres() + ", " + usuario.getApePaterno()+" " + usuario.getApeMaterno() %></h2>
                         
                  
                    
                    
                    

                    
                    


    <%--
        ${anything} == expression language
        <%(codigo java) %> == scriplet
    --%>


  <%if (usuario.getPerfil().getIdPerfil()==1) { %>  
    <nav class="container" role="form">
        
        <form method="POST" action="ServletControler">
            <input type="hidden" name="accion" value ="goregistrarproducto">
            <input id="btn1" type="submit" value="registrar" class="boton">
        </form>
        
        
        
         <form method="POST" action="ServletControler">
            <input type="hidden" name="accion" value = "goregistrar">
            <input id="btn2" type="submit" value="Registrar Usuario" class="boton">
        </form>
    </nav>    
    <%} %>  
        
</body>
</center>
</html>
