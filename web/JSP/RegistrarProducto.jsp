<%-- 
    Document   : Registrarproducto
    Created on : 03/06/2018, 05:20:36 PM
    Author     : FAMILIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/nuevo.css" rel="stylesheet" type="text/css"/>
        <title>Registrar producto</title>
    </head>
    <body>
        
        
        <form method="POST" action="ServletControler" >
            <input type="hidden" name="accion" value="registrar">
            
            <h2>Registrar producto</h2>
            <table>
                <tr><td>Codigo:</td>
                    <td><input type="text" name="txt_codigo"></td>
                </tr>
                <tr><td>Tipo:</td>
                    <td><select name="tipo">
                    <option value="1">Herramienta manual</option>
                    <option value="2">Herramienta electrica</option>
                    </select></td>
                </tr>

                </tr>
                <tr><td>Nombre de producto:</td>
                    <td><input type="text" name="txt_nom_prod"></td>
                </tr>
                <tr><td>Precio:</td>
                    <td><input type="text" name="txt_precio"></td>
                </tr>
                <tr><td>Stock:</td>
                    <td><input type="text" name="txt_stock"></td>
                </tr>
                <tr><td>Imagen:</td>
                    <td><input type="text" name="txt_imagen"></td>
                </tr>
                 <tr><td>DNI de administrador:</td>
                    <td><input type="text" name="txt_dni"></td>
                </tr>
                <tr><td></td>
                    <td><input type="submit" value="Registrar"> </td>
                </tr>                
            </table>   
        </form>    



    </body>
</html>
