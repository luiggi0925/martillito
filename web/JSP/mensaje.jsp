<%-- 
    Document   : mensaje
    Created on : 23/04/2018, 07:24:25 PM
    Author     : LAB-USR-AQ265-A1005
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mensaje del Sistema</title>
        
        <link href="../css/estiloRegistro.css" rel="stylesheet" type="text/css"/>
    </head>
    <center>
    <body >
        
        <div>   
        <h1>Mensaje</h1>
            <h2> <p>Estimado usuario: <%=request.getParameter("userName")%></p>
        <p> <%=request.getParameter("mensaje")%></p></h2>
        <img src="../ImgRegistro/exclamación.png" alt=""/>
        
        </div>
    </body>
    </center>
</html>
