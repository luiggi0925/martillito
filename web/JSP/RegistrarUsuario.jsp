<%-- 
    Document   : Registrarusuario
    Created on : 03/06/2018, 06:19:22 PM
    Author     : FAMILIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Usuario</title>
        <link href="../css/nuevo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
     
        <form method="POST" action="ServletControler" >
            <input type="hidden" name="accion" value="registrar">
            
            <h2>Registrar Usuario</h2>
            <table>
                
                <tr><td>DNI:</td>
                    <td><input type="text" name="txt_dni"></td>
                </tr>
                <tr><td>IdPerfil :</td>
                    
                    <td><select name="cars">
                    <option value="1">Administrador</option>
                    <option value="2">Cliente</option>
                    </select></td>
                </tr>
                <tr><td>Apellido Paterno:</td>
                    <td><input type="text" name="txt_apepater"></td>
                </tr>
                <tr><td>Apellido Materno:</td>
                    <td><input type="text" name="txt_apemater"></td>
                </tr>
                <tr><td>Nombres:</td>
                    <td><input type="text" name="txt_nom"></td>
                </tr>
                 <tr><td>Clave</td>
                    <td><input type="password" name="txt_clave"></td>
                </tr>
                <tr><td>Telefono</td>
                    <td><input type="text" name="txt_telef"></td>
                </tr>
                <tr><td>Distrito</td>
                    <td><input type="text" name="txt_distrito"></td>
                </tr>
                
                
                <tr><td></td>
                    <td><input type="submit" value="Registrar"> </td>
                </tr>                
            </table>   
        </form>    
  
    </body>
</html>
