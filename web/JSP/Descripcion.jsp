<%@page import="Martillito.modelo.Herramienta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ferreteria</title>
        
    </head>
    <center>
    <body>
        <h1>Descripcion del Producto</h1>
        <h2>${producto.nomProd}</h2>  
        <h2>Precio: ${producto.precio}</h2>
        <h2>Stock: ${producto.stock}</h2>
        <img src="${pageContext.request.contextPath}/Img/${producto.img}"/><br><br>
        <a href="javascript:history.go(-1)">Regresar</a>
    </body>
    </center>
</html>
